package com.packsendme.roadbrewa.dto;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class CostsDto {
	

	// Fixed based cost (weight, distance...)
	public String countryName;
	public String vehicle;
	public Double weight_cost;
	public Double distance_cost;
	public Double worktime_cost;
	public Double average_consumption_cost;
	public Double rate_exchange;
	public String current_exchange;
	public Boolean statusChange;

	
	public CostsDto(String countryName, String vehicle, Double weight_cost, Double distance_cost,
			Double worktime_cost, Double average_consumption_cost, Double rate_exchange, 
			String current_exchange, Boolean statusChange) {
		super();
		this.countryName = countryName;
		this.vehicle = vehicle;
		this.weight_cost = weight_cost;
		this.distance_cost = distance_cost;
		this.worktime_cost = worktime_cost;
		this.average_consumption_cost = average_consumption_cost;
		this.rate_exchange = rate_exchange;
		this.current_exchange = current_exchange;
		this.statusChange = statusChange;
	}

	public CostsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
