package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.packsendme.roadbrewa.component.RoadwayManagerConstants;
import com.packsendme.roadbrewa.entity.Category;
import com.packsendme.roadbrewa.entity.Costs;
import com.packsendme.roadbrewa.entity.Location;
import com.packsendme.roadbrewa.entity.Roadway;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class RoadwayDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String id;
	public String name_bre;
	public String transport;
	public String blocked_id;
	public String date_creation;
	public String date_change;
	public Double fragile_cost;
	public Double persishable_cost;
	public Double operation_cost;
	public Double employeer_cost;
	public List<CategoryDto> categories = new ArrayList<CategoryDto>();
	public List<CostsDto> costs = new ArrayList<CostsDto>();
	public List<LocationDto> locations = new ArrayList<LocationDto>();
	public String version;
	public String status;
	



	public RoadwayDto(String id, String name_bre, String transport, String blocked_id, String date_creation,
			String date_change, Double fragile_cost, Double persishable_cost, Double operation_cost,
			Double employeer_cost, List<CategoryDto> categories, List<CostsDto> costs, List<LocationDto> locations,
			String version, String status) {
		super();
		this.id = id;
		this.name_bre = name_bre;
		this.transport = transport;
		this.blocked_id = blocked_id;
		this.date_creation = date_creation;
		this.date_change = date_change;
		this.fragile_cost = fragile_cost;
		this.persishable_cost = persishable_cost;
		this.operation_cost = operation_cost;
		this.employeer_cost = employeer_cost;
		this.categories = categories;
		this.costs = costs;
		this.locations = locations;
		this.version = version;
		this.status = status;
	}

	public RoadwayDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/* ==============================================
	 *  R O A D W A Y - BRE - P A R S E R  
	 * ==============================================
	 */
	
	public Roadway dtoTOentity(RoadwayDto roadwayDto, Roadway roadway, String operationType) throws ParseException {
		CategoryDto categoryObj = new CategoryDto();
		LocationDto locationObj = new LocationDto();
		
		if(operationType.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			roadway = new Roadway();
		}
		
		roadway.name_bre = roadwayDto.name_bre;
		roadway.transport = roadwayDto.transport;
		roadway.blocked_id = roadwayDto.blocked_id;
		roadway.date_creation = roadwayDto.date_creation; //dateFormat.parse(roadwayBRE.date_creation);
		roadway.date_change = roadwayDto.date_change; //dateFormat.parse(roadwayBRE.date_change);
		roadway.fragile_cost = roadwayDto.fragile_cost; 
		roadway.persishable_cost = roadwayDto.persishable_cost;  
		roadway.operation_cost = roadwayDto.operation_cost; 
		roadway.employeer_cost = roadwayDto.employeer_cost;
		roadway.status = roadwayDto.status;
		roadway.version = roadwayDto.version;

		// CATEGORY-Entity
		List<Category> categoriesL = new ArrayList<Category>();
		Category categoryNew = null;
		if(roadwayDto.categories.size() >= 1) {
			for(CategoryDto categoryDto :  roadwayDto.categories) {
				categoryNew = new Category(); 
				Category category = categoryObj.dtoTOentity(categoryDto, categoryNew, operationType);
				categoriesL.add(category);
			}
			roadway.categories = categoriesL;
		}
		
		// LOCATION-Entity
		if(roadwayDto.locations.size() >= 1) {
			List<Location> location_L = new ArrayList<Location>();
			
			for(LocationDto locationDto : roadwayDto.locations) {
				Location locationNew = new Location();
				Location locationModel_Obj = locationObj.dtoTOentity(locationDto, locationNew, operationType);
				location_L.add(locationModel_Obj);
			}
			roadway.locations = location_L;
		}
		
		
		// COSTS-Entity
		Costs costs = new Costs();
		List<Costs> costs_L = new ArrayList<Costs>();
		Map<String, List<Costs>> costs_Map = new HashMap<String, List<Costs>>();
		if(roadwayDto.costs.size() >= 1) {
			for(LocationDto locationDto : roadwayDto.locations) {
				for(CostsDto costsDto : roadwayDto.costs){
					costs = new Costs();
					if(locationDto.countryName.equals(costsDto.countryName)) {
						costs.countryName = costsDto.countryName;
						costs.vehicle = costsDto.vehicle;
						costs.weight_cost = costsDto.weight_cost;
						costs.distance_cost = costsDto.distance_cost;
						costs.worktime_cost = costsDto.worktime_cost;
						costs.heightDimension_cost = costsDto.heightDimension_cost;
						costs.widthDimension_cost = costsDto.heightDimension_cost;
						costs.lengthDimension_cost = costsDto.heightDimension_cost;
						costs.average_consumption_cost = costsDto.average_consumption_cost;
						costs.currency_symbol = costsDto.currency_symbol;
						costs.currency = costsDto.currency;
						costs.statusChange = costsDto.statusChange;
						costs_L.add(costs);
					}
				}
				costs_Map.put(locationDto.countryName, costs_L);
				costs_L = new ArrayList<Costs>();
			}
			roadway.costs = costs_Map;
		}
		return roadway;
	}
	
	public List<RoadwayDto> entityTOdto(List<Roadway> roadway_L) throws ParseException {
		List<RoadwayDto> roadwayDto_L = new ArrayList<RoadwayDto>(); 
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		CategoryDto categoryObj = new CategoryDto();
		LocationDto locationObj = new LocationDto();
		RoadwayDto roadwayDto = null;
		for(Roadway roadway : roadway_L) {
			roadwayDto = new RoadwayDto(); 
			roadwayDto.id = roadway.id;
			roadwayDto.name_bre = roadway.name_bre;
			roadwayDto.transport = roadway.transport;
			roadwayDto.blocked_id = roadway.blocked_id;
			roadwayDto.date_creation = roadway.date_creation; //dateFormat.format(roadwayModel_Obj.date_creation);
			roadwayDto.date_change = roadway.date_change;// dateFormat.format(roadwayModel_Obj.date_change);
			roadwayDto.fragile_cost = roadway.fragile_cost; 
			roadwayDto.persishable_cost = roadway.persishable_cost; 
			roadwayDto.operation_cost = roadway.operation_cost;
			roadwayDto.employeer_cost = roadway.employeer_cost;
			roadwayDto.status = roadway.status;
			roadwayDto.version = roadway.version;
			
			// CATEGORY-Entity
			List<CategoryDto> categoriesDto_L = new ArrayList<CategoryDto>();
			if(roadway.categories.size() >= 1) {
				categoriesDto_L = categoryObj.entityTOdto(roadway.categories);
			}
			roadwayDto.categories = categoriesDto_L;
	
			
			// LOCATION-Entity
			List<LocationDto> locationDto_L = new ArrayList<LocationDto>();
			if(roadway.locations.size() >= 1) {
				locationDto_L = locationObj.entityTOdto(roadway.locations);
			}
			roadwayDto.locations = locationDto_L;
			
					
			// COSTS-Entity
			CostsDto costsDto = new CostsDto();
			List<CostsDto> costsDto_L = new ArrayList<CostsDto>();
			if(roadway.costs.size() >= 1) {
				for(Map.Entry<String, List<Costs>> entryCosts : roadway.costs.entrySet()) {
					List<Costs> costs_L = entryCosts.getValue();
					for(Costs costs: costs_L){
						costsDto = new CostsDto();
						costsDto.countryName = costs.countryName;
						costsDto.vehicle = costs.vehicle;
						costsDto.weight_cost = costs.weight_cost;
						costsDto.distance_cost = costs.distance_cost;
						costsDto.worktime_cost = costs.worktime_cost;
						costsDto.heightDimension_cost = costs.heightDimension_cost;
						costsDto.widthDimension_cost = costs.heightDimension_cost;
						costsDto.lengthDimension_cost = costs.heightDimension_cost;
						costsDto.average_consumption_cost = costs.average_consumption_cost;
						costsDto.currency_symbol = costs.currency_symbol;
						costsDto.currency = costs.currency;
						costsDto.statusChange = costs.statusChange;
						costsDto_L.add(costsDto);
					}
				}
			}
			roadwayDto.costs = costsDto_L;
			roadwayDto_L.add(roadwayDto);
		}
		return roadwayDto_L;
	}

	
	
	
}
