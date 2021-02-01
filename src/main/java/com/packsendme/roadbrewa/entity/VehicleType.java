package com.packsendme.roadbrewa.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Document(collection = "pcks_roadbrewa_vehicletype")
public class VehicleType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;	
	public String name_category;
	public String type_vehicle;
	 
	public VehicleType(String type_vehicle) {
		super();
		this.type_vehicle = type_vehicle;
	}


	public VehicleType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
	