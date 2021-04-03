package com.packsendme.roadbrewa.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class CostsDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Fixed based cost (weight, distance...)
	public String countryName;
	public String vehicle;
	public String fuel_type;
	public Double weight_cost;
	public Double distance_cost;
	public Double worktime_cost;
	public Double heightDimension_cost;
	public Double widthDimension_cost;
	public Double lengthDimension_cost;
	public Double average_consumption_cost;
	public Boolean statusChange;

	
	public CostsDto(String countryName, String vehicle, Double weight_cost, Double distance_cost, Double worktime_cost,
			Double heightDimension_cost, Double widthDimension_cost, Double lengthDimension_cost,
			String fuel_type, Double average_consumption_cost, Boolean statusChange) {
		super();
		this.countryName = countryName;
		this.vehicle = vehicle;
		this.weight_cost = weight_cost;
		this.distance_cost = distance_cost;
		this.worktime_cost = worktime_cost;
		this.heightDimension_cost = heightDimension_cost;
		this.widthDimension_cost = widthDimension_cost;
		this.lengthDimension_cost = lengthDimension_cost;
		this.fuel_type = fuel_type; 
		this.average_consumption_cost = average_consumption_cost;
		this.statusChange = statusChange;
	}





	public CostsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
