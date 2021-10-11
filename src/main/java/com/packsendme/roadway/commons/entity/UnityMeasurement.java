package com.packsendme.roadway.commons.entity;

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
@Document(collection = "pcks_roadbrewa_unitymeasurement")
public class UnityMeasurement implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;	
	public String unityType;
	public List<String> unityArea = new ArrayList<String>();
	public List<String> unityVolume = new ArrayList<String>();
	public Map<Integer, String> unityWeight = new HashMap<Integer, String>();
	public List<String> unityTemperature = new ArrayList<String>();
	public List<String> unityCurrency = new ArrayList<String>();
	
 

	public UnityMeasurement(String unityType, List<String> unityArea, List<String> unityVolume,
			Map<Integer, String> unityWeight, List<String> unityTemperature, List<String> unityCurrency) {
		super();
		this.unityType = unityType;
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
