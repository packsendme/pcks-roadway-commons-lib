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
	public String date_creation;
	public String date_change;
	public List<Category> categories = new ArrayList<Category>();
	public Map<String, List<Costs>> costs = new HashMap<String, List<Costs>>(); 
	public List<Location> locations = new ArrayList<Location>();
	public String version;
	public String status;

	public Roadway(String name_bre, String transport, String date_creation, String date_change,
			List<Category> categories, Map<String, List<Costs>> costs, List<Location> locations, String version,
			String status) {
		super();
		this.name_bre = name_bre;
		this.transport = transport;
		this.date_creation = date_creation;
		this.date_change = date_change;
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
