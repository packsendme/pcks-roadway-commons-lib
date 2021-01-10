package com.packsendme.roadbrewa.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
@Document(collection = "pcks_roadbrewa_vehicle")
public class Vehicle implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;
	public String vehicle_name;
	public String vehicle_type;
	public List<String> bodywork_vehicle = new ArrayList<String>();
	public Double weight_max;
	public Integer axis_total;
	public Integer people_max;
	public Map<Integer, String> unity_weight = new HashMap<Integer, String>();
	public String transport_type;
	
	public Vehicle(String vehicle_name, String vehicle_type, List<String> bodywork_vehicle, Double weight_max, Integer axis_total,
			Map<Integer, String> unity_weight, String transport_type, Integer people_max) {
		super();
		this.vehicle_name = vehicle_name;
		this.vehicle_type = vehicle_type;
		this.bodywork_vehicle = bodywork_vehicle;
		this.weight_max = weight_max;
		this.axis_total = axis_total;
		this.unity_weight = unity_weight;
		this.transport_type = transport_type;
		this.people_max = people_max;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
