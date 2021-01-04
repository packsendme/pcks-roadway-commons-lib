package com.packsendme.roadbrewa.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;


@Getter 
@Setter 
public class TollsFuel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String country;
	public Double tolls_price;
	public Double fuelGasoline_price;
	public Double fuelDiesel_price;
	public String current;
	public String date_creation;
	public String date_change;

	
}
