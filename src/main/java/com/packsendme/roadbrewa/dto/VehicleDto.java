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
	public String vehicle_type;
	public List<String> bodywork_vehicle = new ArrayList<String>();
	public Double weight_max;
	public Integer axis_total;
	public Integer people_max;
	public Map<Integer, String> unity_weight = new HashMap<Integer, String>();
	public String transport_type;
	

	public VehicleDto(String vehicle_type, List<String> bodywork_vehicle, Double weight_max, Integer axis_total,
			Map<Integer, String> unity_weight, String transport_type, Integer people_max) {
		super();
		this.vehicle_type = vehicle_type;
		this.bodywork_vehicle = bodywork_vehicle;
		this.weight_max = weight_max;
		this.axis_total = axis_total;
		this.unity_weight = unity_weight;
		this.transport_type = transport_type;
		this.people_max = people_max;
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
		entity.vehicle_type = vehicle.vehicle_type;
		entity.bodywork_vehicle = vehicle.bodywork_vehicle;
		entity.weight_max = vehicle.weight_max;
		entity.axis_total = vehicle.axis_total;
		entity.unity_weight = vehicle.unity_weight;
		entity.transport_type = vehicle.transport_type; 
		entity.people_max = people_max;
		return entity;
	}
	
	
	public List<VehicleDto> entityTOdto(List<Vehicle> vehicle_L) {

		List<VehicleDto> vehicleDto_L = new ArrayList<VehicleDto>();
		VehicleDto vehicleDto = null;
		
		for(Vehicle vehicle : vehicle_L) {
			vehicleDto = new VehicleDto();
			vehicleDto.id = vehicle.id;
			vehicleDto.vehicle_type = vehicle.vehicle_type;
			vehicleDto.bodywork_vehicle = vehicle.bodywork_vehicle;
			vehicleDto.weight_max = vehicle.weight_max;
			vehicleDto.axis_total = vehicle.axis_total;
			vehicleDto.unity_weight = vehicle.unity_weight;
			vehicleDto.transport_type = vehicle.transport_type; 
			vehicleDto.people_max = vehicle.people_max;
			vehicleDto_L.add(vehicleDto);
		}
		return vehicleDto_L;
	}
	
}
