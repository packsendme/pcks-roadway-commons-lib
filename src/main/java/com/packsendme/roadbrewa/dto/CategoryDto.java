package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.util.ArrayList;
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


	public CategoryDto(String name_category, String transport, Double weight_max, Integer people_max, 
			Map<Integer, String> unity_weight, List<VehicleDto> vehicles) {
		super();
		this.name_category = name_category;
		this.transport = transport;
		this.weight_max = weight_max;
		this.people_max = people_max;
		this.unity_weight = unity_weight;
		this.vehicles = vehicles;
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
 
			// Category-Vehicle
			List<VehicleDto> vehiclesDTO_L = new ArrayList<VehicleDto>();
			if(categoryEntity.vehicles.size() >= 1) {
				for(Vehicle v : categoryEntity.vehicles) {
					VehicleDto vehicleDto = new VehicleDto(v.vehicle_type, v.bodywork_vehicle, v.weight_max, v.axis_total, v.unity_weight, v.transport_type, v.people_max);
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

		// Category-Vehicle
		List<Vehicle> vehicleL = new ArrayList<Vehicle>();
		Vehicle vehicle = null;
		if(categoryDto.vehicles.size() >= 1) {
			for(VehicleDto v : categoryDto.vehicles) {
				vehicle = new Vehicle(v.vehicle_type, v.bodywork_vehicle, v.weight_max, v.axis_total, v.unity_weight, v.transport_type, v.people_max);
				vehicleL.add(vehicle);
				vehicle = null;
			}
			category.vehicles = vehicleL;
		}
		return category;
	}

	
	
}
