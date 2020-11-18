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
	public String region;
	
	public UnityMeasurement(String unitMeasurement, String region) {
		super();
		this.unitMeasurement = unitMeasurement;
		this.region = region;
	}

	public UnityMeasurement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
 
	
	
		
}
