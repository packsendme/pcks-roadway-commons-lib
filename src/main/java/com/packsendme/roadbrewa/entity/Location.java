package com.packsendme.roadbrewa.entity;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Document(collection = "pcks_roadbrewa_location")
public class Location implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;
	public String codCountry;
	public String countryName;
	public boolean citySpecify;
	public List<String> cities;
	

 
	public Location(String codCountry, String countryName, boolean citySpecify, List<String> cities) {
		super();
		this.codCountry = codCountry;
		this.countryName = countryName;
		this.citySpecify = citySpecify;
		this.cities = cities;
	}





	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
