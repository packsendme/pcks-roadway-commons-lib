package com.packsendme.roadway.commons.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class CostsRoadwayDto implements Serializable {
	
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	public String vehicle;
	// Base Costs 
	public String vlr_weight;
	public String vlr_dimension;
	public String vlr_distance;
	public String vlr_worktime;
	public String vlr_tolls;
	public String vlr_fuelconsumption;
	public String cost_total_base;
	// Risk Costs 
	public String vlr_fragile;
	public String vlr_persishable;
	public String cost_total_risk;
	
	// Total
	public String vlr_reshipping;
	public String vlr_operationOwner;
	public String vlr_employeer;
	public String exchange_currency;
	public String cost_total_US;
	public String cost_total_EX;
	
	
	
	public CostsRoadwayDto(String vehicle, String vlr_weight, String vlr_dimension, String vlr_distance,
			String vlr_worktime, String vlr_tolls, String vlr_fuelconsumption, String cost_total_base,
			String vlr_fragile, String vlr_persishable, String cost_total_risk, String vlr_reshipping,
			String vlr_operationOwner, String vlr_employeer, String exchange_currency, String cost_total_US,
			String cost_total_EX) {
		super();
		this.vehicle = vehicle;
		this.vlr_weight = vlr_weight;
		this.vlr_dimension = vlr_dimension;
		this.vlr_distance = vlr_distance;
		this.vlr_worktime = vlr_worktime;
		this.vlr_tolls = vlr_tolls;
		this.vlr_fuelconsumption = vlr_fuelconsumption;
		this.cost_total_base = cost_total_base;
		this.vlr_fragile = vlr_fragile;
		this.vlr_persishable = vlr_persishable;
		this.cost_total_risk = cost_total_risk;
		this.vlr_reshipping = vlr_reshipping;
		this.vlr_operationOwner = vlr_operationOwner;
		this.vlr_employeer = vlr_employeer;
		this.exchange_currency = exchange_currency;
		this.cost_total_US = cost_total_US;
		this.cost_total_EX = cost_total_EX;
	}








	public CostsRoadwayDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

	
}
