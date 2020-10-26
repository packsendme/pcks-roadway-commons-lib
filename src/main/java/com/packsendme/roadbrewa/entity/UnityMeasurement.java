package com.packsendme.roadbrewa.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Document(collection = "pcks_roadbrewa_unitymeasurement")
public class UnityMeasurement implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;	
	public String unitMeasurement;
	public String origin_country;
	
	public UnityMeasurement(String unitMeasurement, String origin_country) {
		super();
		this.unitMeasurement = unitMeasurement;
		this.origin_country = origin_country;
	}

	public UnityMeasurement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
 
	
	
		
}
