package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.packsendme.roadbrewa.component.RoadwayManagerConstants;
import com.packsendme.roadbrewa.entity.Vehicle;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class VehicleDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String id;
	public String category_vehicle;

	// Category Vehicle
	public String type_vehicle;
	public String classification_vehicle;
	public String subclassification_vehicle;
	public String transport_type;

	// Weight
	public Double weight_max;
	public Map<Integer, String> unity_weight = new HashMap<Integer, String>();
	public Integer axis_total;
	

	//People
	public Integer people_max;
	
	// Dimension
	public Double height_dimension_max;
	public Double width_dimension_max;
	public Double length_dimension_max;

	//Fuel Consumption
	public String fuel_type;
	public Double fuel_consumption;
	
	public String bodywork_vehicle;
	

	public VehicleDto(String category_vehicle, String type_vehicle, String classification_vehicle, String subclassification_vehicle,
			String transport_type, Double weight_max, Map<Integer, String> unity_weight, Integer axis_total,
			Integer people_max, Double height_dimension_max, Double width_dimension_max, Double length_dimension_max,
			String fuel_type, Double fuel_consumption, String bodywork_vehicle) {
		super();
		this.category_vehicle = category_vehicle;
		this.type_vehicle = type_vehicle;
		this.classification_vehicle = classification_vehicle;
		this.subclassification_vehicle = subclassification_vehicle;
		this.transport_type = transport_type;
		this.weight_max = weight_max;
		this.unity_weight = unity_weight;
		this.axis_total = axis_total;
		this.people_max = people_max;
		this.height_dimension_max = height_dimension_max;
		this.width_dimension_max = width_dimension_max;
		this.length_dimension_max = length_dimension_max;
		this.fuel_type = fuel_type;
		this.fuel_consumption = fuel_consumption;
		this.bodywork_vehicle = bodywork_vehicle;
	}


	public VehicleDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/* ==============================================
	 *  V E H I C L E  - P A R S E R  
	 * ==============================================
	 */
	
	public Vehicle dtoTOentity(VehicleDto vehicle, Vehicle entity, String typeOperation) {
		if(typeOperation.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			entity = new Vehicle();
		}
		entity.category_vehicle = vehicle.category_vehicle;
		entity.type_vehicle = vehicle.type_vehicle;
		entity.classification_vehicle = vehicle.classification_vehicle;
		entity.subclassification_vehicle = vehicle.subclassification_vehicle;
		entity.transport_type = vehicle.transport_type;
		entity.weight_max = vehicle.weight_max;
		entity.unity_weight = vehicle.unity_weight;
		entity.axis_total = vehicle.axis_total;
		entity.people_max = vehicle.people_max;
		entity.height_dimension_max = vehicle.height_dimension_max;
		entity.width_dimension_max = vehicle.width_dimension_max;
		entity.length_dimension_max = vehicle.length_dimension_max;
		entity.type_vehicle = vehicle.type_vehicle;
		entity.fuel_consumption = vehicle.fuel_consumption;
		entity.bodywork_vehicle = vehicle.bodywork_vehicle;
		return entity;
	}
	
	
	public List<VehicleDto> entityTOdto(List<Vehicle> vehicle_L) {

		List<VehicleDto> vehicleDto_L = new ArrayList<VehicleDto>();
		VehicleDto vehicleDto = null;
		
		for(Vehicle vehicle : vehicle_L) {
			vehicleDto = new VehicleDto();
			vehicleDto.id = vehicle.id;
			vehicleDto.category_vehicle = vehicle.category_vehicle;
			vehicleDto.type_vehicle = vehicle.type_vehicle;
			vehicleDto.classification_vehicle = vehicle.classification_vehicle;
			vehicleDto.subclassification_vehicle = vehicle.subclassification_vehicle;
			vehicleDto.transport_type = vehicle.transport_type;
			vehicleDto.weight_max = vehicle.weight_max;
			vehicleDto.unity_weight = vehicle.unity_weight;
			vehicleDto.axis_total = vehicle.axis_total;
			vehicleDto.people_max = vehicle.people_max;
			vehicleDto.height_dimension_max = vehicle.height_dimension_max;
			vehicleDto.width_dimension_max = vehicle.width_dimension_max;
			vehicleDto.length_dimension_max = vehicle.length_dimension_max;
			vehicleDto.type_vehicle = vehicle.type_vehicle;
			vehicleDto.fuel_consumption = vehicle.fuel_consumption;
			vehicleDto.bodywork_vehicle = vehicle.bodywork_vehicle;
			vehicleDto_L.add(vehicleDto);
		}
		return vehicleDto_L;
	}
	
}
