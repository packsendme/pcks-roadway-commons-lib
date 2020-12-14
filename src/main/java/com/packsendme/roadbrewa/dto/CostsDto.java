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
	public Double weight_cost;
	public Double distance_cost;
	public Double worktime_cost;
	public Double average_consumption_cost;
	public String currency_symbol;
	public String currency;
	public Boolean statusChange;

	
	public CostsDto(String countryName, String vehicle, Double weight_cost, Double distance_cost, Double worktime_cost,
			Double average_consumption_cost, String currency_symbol, String currency, Boolean statusChange) {
		super();
		this.countryName = countryName;
		this.vehicle = vehicle;
		this.weight_cost = weight_cost;
		this.distance_cost = distance_cost;
		this.worktime_cost = worktime_cost;
		this.average_consumption_cost = average_consumption_cost;
		this.currency_symbol = currency_symbol;
		this.currency = currency;
		this.statusChange = statusChange;
	}



	public CostsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
