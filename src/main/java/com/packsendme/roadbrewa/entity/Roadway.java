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
@Document(collection = "pcks_roadbrewa_roadwaybre")
public class Roadway implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;
	public String name_bre;
	public String transport_name;
	public String blocked_id;
	public String date_creation;
	public String date_change;
	public Double fragile_cost;
	public Double persishable_cost;
	public Double reshipping_cost;
	public Double operation_cost;
	public Double employeer_cost;
	public Double vlr_exchange;
	public Transport transport = new Transport();
	public TariffPlan tariffPlan = new TariffPlan();
	public List<Category> categories = new ArrayList<Category>();
	public Map<String, List<Costs>> costs = new HashMap<String, List<Costs>>(); 
	public List<Location> locations = new ArrayList<Location>();
	public String version;
	public String status;



	public Roadway(String name_bre, String transport_name, String blocked_id, String date_creation, String date_change,
			Double fragile_cost, Double persishable_cost, Double operation_cost, Double employeer_cost, Double vlr_exchange,
			Transport transport, TariffPlan tariffPlan, List<Category> categories, Map<String, List<Costs>> costs, 
			List<Location> locations, String version, String status) {
		super();
		this.name_bre = name_bre;
		this.transport_name = transport_name;
		this.blocked_id = blocked_id;
		this.date_creation = date_creation;
		this.date_change = date_change;
		this.fragile_cost = fragile_cost;
		this.persishable_cost = persishable_cost;
		this.operation_cost = operation_cost;
		this.employeer_cost = employeer_cost;
		this.vlr_exchange = vlr_exchange;
		this.transport = transport;
		this.tariffPlan = tariffPlan;
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
