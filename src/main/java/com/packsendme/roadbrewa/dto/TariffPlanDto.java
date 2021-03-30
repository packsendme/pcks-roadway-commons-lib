package com.packsendme.roadbrewa.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class TariffPlanDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public boolean weight_plan;
	public boolean distance_plan;
	public boolean worktime_plan;
	public boolean fuelconsumption_plan;
	public boolean tolls_plan;
	public boolean dimension_plan;
	public boolean antt_plan;
	public boolean fragile_plan;
	public boolean persishable_plan;
	public boolean reshipping_plan;
	
	
	public TariffPlanDto(boolean weight_plan, boolean distance_plan, boolean worktime_plan,
			boolean fuelconsumption_plan, boolean tolls_plan, boolean dimension_plan, boolean antt_plan,
			boolean fragile_plan, boolean persishable_plan, boolean reshipping_plan) {
		super();
		this.weight_plan = weight_plan;
		this.distance_plan = distance_plan;
		this.worktime_plan = worktime_plan;
		this.fuelconsumption_plan = fuelconsumption_plan;
		this.tolls_plan = tolls_plan;
		this.dimension_plan = dimension_plan;
		this.antt_plan = antt_plan;
		this.fragile_plan = fragile_plan;
		this.persishable_plan = persishable_plan;
		this.reshipping_plan = reshipping_plan;
	}


	public TariffPlanDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
