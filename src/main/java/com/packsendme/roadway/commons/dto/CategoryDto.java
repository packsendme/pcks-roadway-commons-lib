package com.packsendme.roadway.commons.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.packsendme.roadway.commons.constants.RoadwayManagerConstants;
import com.packsendme.roadway.commons.entity.Category;
import com.packsendme.roadway.commons.entity.TariffPlan;
import com.packsendme.roadway.commons.entity.Transport;
import com.packsendme.roadway.commons.entity.Vehicle;

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
	public String initials;
	public String transport_name;
	public TransportDto transport = new TransportDto();
	public String weightUnityVehicle_max;
	public String weightUnityTransport_max;
	public Integer people_max;
	public Map<Integer, String> unity_weight = new HashMap<Integer, String>();
	public List<VehicleDto> vehicles = new ArrayList<VehicleDto>(); 
	public Date dt_inc;
	public Date dt_update;


 


	public CategoryDto(String name_category, String initials, String transport_name, TransportDto transport, String weightUnityVehicle_max,
			String weightUnityTransport_max, Integer people_max, Map<Integer, String> unity_weight,
			List<VehicleDto> vehicles, Date dt_inc, Date dt_update) {
		super();
		this.name_category = name_category;
		this.initials = initials;
		this.transport_name = transport_name;
		this.transport = transport;
		this.weightUnityVehicle_max = weightUnityVehicle_max;
		this.weightUnityTransport_max = weightUnityTransport_max;
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
			categoryDTO.transport_name = categoryEntity.transport_name;
			categoryDTO.initials = categoryEntity.initials;
			categoryDTO.weightUnityVehicle_max = categoryEntity.weightUnityVehicle_max;
			categoryDTO.weightUnityTransport_max = categoryEntity.weightUnityTransport_max;
			categoryDTO.people_max = categoryEntity.people_max;
			categoryDTO.unity_weight = categoryEntity.unity_weight;
			categoryDTO.dt_inc = categoryEntity.dt_inc;
			categoryDTO.dt_update = categoryEntity.dt_update;
			
			TariffPlanDto tariffPlanDto = new TariffPlanDto(categoryEntity.transport.tariffPlan.weight_plan, categoryEntity.transport.tariffPlan.distance_plan, 
					categoryEntity.transport.tariffPlan.worktime_plan, categoryEntity.transport.tariffPlan.fuelconsumption_plan, categoryEntity.transport.tariffPlan.tolls_plan, 
					categoryEntity.transport.tariffPlan.dimension_plan, categoryEntity.transport.tariffPlan.antt_plan, categoryEntity.transport.tariffPlan.fragile_plan, 
					categoryEntity.transport.tariffPlan.persishable_plan, categoryEntity.transport.tariffPlan.reshipping_plan);
			
			TransportDto transportDto = new TransportDto(categoryEntity.transport.name_transport, categoryEntity.transport.identifier, categoryEntity.transport.initials,
					categoryEntity.transport.transport_type, categoryEntity.transport.restriction, categoryEntity.transport.coditions, categoryEntity.transport.weight_max,
					categoryEntity.transport.unity_weight, categoryEntity.transport.heightDimension_max, categoryEntity.transport.widthDimension_max, 
					categoryEntity.transport.lengthDimension_max, tariffPlanDto);

			categoryDTO.transport = transportDto; 
			
 
			// Category-Vehicle
			List<VehicleDto> vehiclesDTO_L = new ArrayList<VehicleDto>();
			if(categoryEntity.vehicles.size() >= 1) {
				for(Vehicle v : categoryEntity.vehicles) {
				VehicleDto vehicleDto = new VehicleDto(v.category_vehicle, v.type_vehicle, v.classification_vehicle, v.subclassification_vehicle,
				v.transport_type, v.restriction, v.distance_max, v.weight_max, v.unity_weight, v.axis_total, v.people_max, v.height_dimension_max, v.width_dimension_max, 
				v.length_dimension_max, v.fuel_type, v.fuel_consumption,v.bodywork_vehicle);
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
		category.initials = categoryDto.initials;
		category.transport_name = categoryDto.transport_name;
		category.weightUnityVehicle_max = categoryDto.weightUnityVehicle_max;
		category.weightUnityTransport_max = categoryDto.weightUnityTransport_max;
		category.people_max = categoryDto.people_max;
		category.unity_weight = categoryDto.unity_weight;
		category.dt_inc = categoryDto.dt_inc;
		category.dt_update = categoryDto.dt_update;
		
		TariffPlan tariffPlan = new TariffPlan(categoryDto.transport.tariffPlan.weight_plan, categoryDto.transport.tariffPlan.distance_plan, 
				categoryDto.transport.tariffPlan.worktime_plan, categoryDto.transport.tariffPlan.fuelconsumption_plan, categoryDto.transport.tariffPlan.tolls_plan, 
				categoryDto.transport.tariffPlan.dimension_plan, categoryDto.transport.tariffPlan.antt_plan, categoryDto.transport.tariffPlan.fragile_plan, 
				categoryDto.transport.tariffPlan.persishable_plan, categoryDto.transport.tariffPlan.reshipping_plan);
		
		Transport transport = new Transport(categoryDto.transport.name_transport, categoryDto.transport.identifier, categoryDto.transport.initials,
				categoryDto.transport.transport_type, categoryDto.transport.restriction, categoryDto.transport.coditions, categoryDto.transport.weight_max,
				categoryDto.transport.unity_weight, categoryDto.transport.heightDimension_max, categoryDto.transport.widthDimension_max, 
				categoryDto.transport.lengthDimension_max, tariffPlan);

		category.transport = transport; 

		
		// Category-Vehicle
		List<Vehicle> vehicleL = new ArrayList<Vehicle>();
		Vehicle vehicle = null;
		if(categoryDto.vehicles.size() >= 1) {
			for(VehicleDto v : categoryDto.vehicles) {
				vehicle = new Vehicle(v.category_vehicle, v.type_vehicle, v.classification_vehicle, v.subclassification_vehicle,
				v.transport_type, v.restriction, v.distance_max, v.weight_max, v.unity_weight, v.axis_total, v.people_max, v.height_dimension_max, v.width_dimension_max, 
				v.length_dimension_max, v.fuel_type, v.fuel_consumption,v.bodywork_vehicle);
				vehicleL.add(vehicle);
				vehicle = null;
			}
			category.vehicles = vehicleL;
		}
		return category;
	}

	
	
}
