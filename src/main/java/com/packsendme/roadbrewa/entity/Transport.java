package com.packsendme.roadbrewa.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Document(collection = "pcks_roadbrewa_transport")
public class Transport implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;
	public String name_transport;
	public String identifier;
	public String initials;
	//@DBRef(lazy = true)
	public String transport_type;
	public Boolean restriction;
	public String coditions;
	public Double weight_max;
	public Map<Integer, String> unity_weight = new HashMap<Integer, String>();
	public Double heightDimension_max;
	public Double widthDimension_max;
	public Double lengthDimension_max;

	public TariffPlan tariffPlan = new TariffPlan();





	public Transport(String name_transport, String identifier, String initials, String transport_type,
			Boolean restriction, String coditions, Double weight_max, Map<Integer, String> unity_weight,
			Double heightDimension_max, Double widthDimension_max, Double lengthDimension_max, TariffPlan tariffPlan) {
		super();
		this.name_transport = name_transport;
		this.identifier = identifier;
		this.initials = initials;
		this.transport_type = transport_type;
		this.restriction = restriction;
		this.coditions = coditions;
		this.weight_max = weight_max;
		this.unity_weight = unity_weight;
		this.heightDimension_max = heightDimension_max;
		this.widthDimension_max = widthDimension_max;
		this.lengthDimension_max = lengthDimension_max;
		this.tariffPlan = tariffPlan;
	}





	public Transport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
