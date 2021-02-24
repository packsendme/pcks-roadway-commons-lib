package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.packsendme.roadbrewa.component.RoadwayManagerConstants;
import com.packsendme.roadbrewa.entity.Category;
import com.packsendme.roadbrewa.entity.Vehicle;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class CategoryDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String id;
	public String name_category;
	public String transport;
	public Double weight_max;
	public Integer people_max;
	public Map<Integer, String> unity_weight = new HashMap<Integer, String>();
	public List<VehicleDto> vehicles = new ArrayList<VehicleDto>(); 
	public Date dt_inc;
	public Date dt_update;


	public CategoryDto(String name_category, String transport, Double weight_max, Integer people_max, 
			Map<Integer, String> unity_weight, List<VehicleDto> vehicles, Date dt_inc, Date dt_update) {
		super();
		this.name_category = name_category;
		this.transport = transport;
		this.weight_max = weight_max;
		this.people_max = people_max;
		this.unity_weight = unity_weight;
		this.vehicles = vehicles;
		this.dt_inc = dt_inc;
		this.dt_update = dt_update;
	}


	public CategoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/* ==============================================
	 *  C A T E  O R Y  - P A R S E R  
	 * ==============================================
	 */
	
	public List<CategoryDto> entityTOdto(List<Category> categories_L) {
		List<CategoryDto> categoryDto_L = new ArrayList<CategoryDto>();
		CategoryDto categoryDTO = null;
		
		for(Category categoryEntity : categories_L) {
			categoryDTO = new CategoryDto(); 
			categoryDTO.id = categoryEntity.id;
			categoryDTO.name_category = categoryEntity.name_category;
			categoryDTO.transport = categoryEntity.transport;
			categoryDTO.weight_max = categoryEntity.weight_max;
			categoryDTO.people_max = categoryEntity.people_max;
			categoryDTO.unity_weight = categoryEntity.unity_weight;
			categoryDTO.dt_inc = categoryEntity.dt_inc;
			categoryDTO.dt_update = categoryEntity.dt_update;
			
			// Category-Vehicle
			List<VehicleDto> vehiclesDTO_L = new ArrayList<VehicleDto>();
			if(categoryEntity.vehicles.size() >= 1) {
				for(Vehicle v : categoryEntity.vehicles) {
				VehicleDto vehicleDto = new VehicleDto(v.category_vehicle, v.type_vehicle, v.classification_vehicle, v.subclassification_vehicle,
				v.transport_type, v.weight_max, v.unity_weight, v.axis_total, v.people_max, v.height_dimension_max, v.width_dimension_max, 
				v.length_dimension_max, v.fuel_consumption,v.bodywork_vehicle);
				vehiclesDTO_L.add(vehicleDto);
				vehicleDto = null;
				}
			}
			categoryDTO.vehicles = vehiclesDTO_L;
			categoryDto_L.add(categoryDTO);
		}
		return categoryDto_L;
	}
	
	public Category dtoTOentity(CategoryDto categoryDto, Category category, String operationType) {
		
		if(operationType.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			category = new Category();
		}
		
		// Category-Head
		category.name_category = categoryDto.name_category;
		category.transport = categoryDto.transport;
		category.weight_max = categoryDto.weight_max;
		category.people_max = categoryDto.people_max;
		category.unity_weight = categoryDto.unity_weight;
		category.dt_inc = categoryDto.dt_inc;
		category.dt_update = categoryDto.dt_update;
		
		// Category-Vehicle
		List<Vehicle> vehicleL = new ArrayList<Vehicle>();
		Vehicle vehicle = null;
		if(categoryDto.vehicles.size() >= 1) {
			for(VehicleDto v : categoryDto.vehicles) {
				vehicle = new Vehicle(v.category_vehicle, v.type_vehicle, v.classification_vehicle, v.subclassification_vehicle,
				v.transport_type, v.weight_max, v.unity_weight, v.axis_total, v.people_max, v.height_dimension_max, v.width_dimension_max, 
				v.length_dimension_max,v.fuel_consumption,v.bodywork_vehicle);
				vehicleL.add(vehicle);
				vehicle = null;
			}
			category.vehicles = vehicleL;
		}
		return category;
	}

	
	
}
