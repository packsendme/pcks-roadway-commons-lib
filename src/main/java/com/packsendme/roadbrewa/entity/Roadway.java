package com.packsendme.roadbrewa.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
@Document(collection = "pcks_roadbrewa_roadway")
public class Roadway implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;
	public String name_bre;
	public String transport;
	public String blocked_id;
	public String date_creation;
	public String date_change;
	public Double fragile;
	public Double persishable;
	public Double gain_transportation;
	public Boolean antt;
	public List<Category> categories = new ArrayList<Category>();
	public Map<String, List<Costs>> costs = new HashMap<String, List<Costs>>(); 
	public List<Location> locations = new ArrayList<Location>();
	public String version;
	public String status;

	public Roadway(String name_bre, String transport,  String blocked_id, String date_creation, String date_change,
			Double fragile, Double persishable, Double gain_transportation, List<Category> categories, Map<String, List<Costs>> costs, List<Location> locations, String version,
			String status) {
		super();
		this.name_bre = name_bre;
		this.transport = transport;
		this.blocked_id = blocked_id;
		this.date_creation = date_creation;
		this.date_change = date_change;
		this.fragile = fragile; 
		this.persishable = persishable;  
		this.gain_transportation = gain_transportation; 
		this.categories = categories;
		this.costs = costs;
		this.locations = locations;
		this.version = version;
		this.status = status;
	}

	public Roadway() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
