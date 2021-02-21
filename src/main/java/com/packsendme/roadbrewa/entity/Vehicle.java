package com.packsendme.roadbrewa.entity;

import java.io.Serializable;
import java.util.HashMap;
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
	 * 1820218650765
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;
	public String category_vehicle;

	// Category Vehicle
	public String type_vehicle;
	public String classification_vehicle;
	public String subclassification_vehicle;
	public String transport_type;

	// Weight
	public Double weight_max;
	public Map<Integer, String> unity_weight = new HashMap<Integer, String>();
	public Integer axis_total;

	//People
	public Integer people_max;
	
	// Dimension
	public Double height_dimension_max;
	public Double width_dimension_max;
	public Double length_dimension_max;

	public String bodywork_vehicle;
	


	public Vehicle(String category_vehicle, String type_vehicle, String classification_vehicle, String subclassification_vehicle,
			String transport_type, Double weight_max, Map<Integer, String> unity_weight, Integer axis_total,
			Integer people_max, Double height_dimension_max, Double width_dimension_max, Double length_dimension_max,
			String bodywork_vehicle) {
		super();
		this.category_vehicle = category_vehicle;
		this.type_vehicle = type_vehicle;
		this.classification_vehicle = classification_vehicle;
		this.subclassification_vehicle = subclassification_vehicle;
		this.transport_type = transport_type;
		this.weight_max = weight_max;
		this.unity_weight = unity_weight;
		this.axis_total = axis_total;
		this.people_max = people_max;
		this.height_dimension_max = height_dimension_max;
		this.width_dimension_max = width_dimension_max;
		this.length_dimension_max = length_dimension_max;
		this.bodywork_vehicle = bodywork_vehicle;
	}





	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
