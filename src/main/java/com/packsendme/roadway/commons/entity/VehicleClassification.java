package com.packsendme.roadway.commons.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Document(collection = "pcks_roadbrewa_vehicleclassification")
public class VehicleClassification implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;	
	public String type_vehicle;
	public List<String> classification_vehicle = new ArrayList<String>();
	public List<String> subclassification_vehicle = new ArrayList<String>();
	
	public VehicleClassification(String type_vehicle, List<String> classification_vehicle, List<String> subclassification_vehicle) {
		super();
		this.type_vehicle = type_vehicle;
		this.classification_vehicle = classification_vehicle;
		this.subclassification_vehicle = subclassification_vehicle;
		
	}

	public VehicleClassification() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
	