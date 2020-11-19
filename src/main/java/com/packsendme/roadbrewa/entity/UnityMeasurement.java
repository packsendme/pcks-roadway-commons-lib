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
	public String typeUnity;
	public String unityArea;
	public String unityVolume;
	public String unityWeight;
	public String unityTemperature;
	public String unityCurrency;
	
	
 

	public UnityMeasurement(String typeUnity, String unityArea, String unityVolume, String unityWeight,
			String unityTemperature, String unityCurrency) {
		super();
		this.typeUnity = typeUnity;
		this.unityArea = unityArea;
		this.unityVolume = unityVolume;
		this.unityWeight = unityWeight;
		this.unityTemperature = unityTemperature;
		this.unityCurrency = unityCurrency;
	}




	public UnityMeasurement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
 
	
	
		
}
