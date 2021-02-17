package com.packsendme.roadbrewa.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Document(collection = "pcks_roadbrewa_vehiclecategory")
public class VehicleCategory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;	
	public String type_vehicle;
	public List<String> category_vehicle = new ArrayList<String>();
	public List<String> subcategory_vehicle = new ArrayList<String>();
	
	public VehicleCategory(String type_vehicle, List<String> category_vehicle, List<String> subcategory_vehicle) {
		super();
		this.type_vehicle = type_vehicle;
		this.category_vehicle = category_vehicle;
		this.subcategory_vehicle = subcategory_vehicle;
		
	}

	public VehicleCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
	