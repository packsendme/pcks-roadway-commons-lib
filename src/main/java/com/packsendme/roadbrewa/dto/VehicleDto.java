package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
	public Double cargo_max;
	public Integer axis_total;
	public String unity_measurement_weight;
	public boolean people_transport;
	public String people;
	


	public VehicleDto(String vehicle_type, List<String> bodywork_vehicle, Double cargo_max, Integer axis_total,
			String unity_measurement_weight, boolean people_transport, String people) {
		super();
		this.vehicle_type = vehicle_type;
		this.bodywork_vehicle = bodywork_vehicle;
		this.cargo_max = cargo_max;
		this.axis_total = axis_total;
		this.unity_measurement_weight = unity_measurement_weight;
		this.people_transport = people_transport;
		this.people = people;
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
		entity.cargo_max = vehicle.cargo_max;
		entity.axis_total = vehicle.axis_total;
		entity.unity_measurement_weight = vehicle.unity_measurement_weight;
		entity.people_transport = vehicle.people_transport; 
		entity.people = vehicle.people;
		return entity;
	}
	
	
	public List<VehicleDto> Entity_TO_Dto(List<Vehicle> vehicle_L) {

		List<VehicleDto> vehicleDto_L = new ArrayList<VehicleDto>();
		VehicleDto vehicleDto = null;
		
		for(Vehicle vehicle : vehicle_L) {
			vehicleDto = new VehicleDto();
			vehicleDto.id = vehicle.id;
			vehicleDto.vehicle_type = vehicle.vehicle_type;
			vehicleDto.bodywork_vehicle = vehicle.bodywork_vehicle;
			vehicleDto.cargo_max = vehicle.cargo_max;
			vehicleDto.axis_total = vehicle.axis_total;
			vehicleDto.unity_measurement_weight = vehicle.unity_measurement_weight;
			vehicleDto.people_transport = vehicle.people_transport; 
			vehicleDto.people = vehicle.people;
			vehicleDto_L.add(vehicleDto);
		}
		return vehicleDto_L;
	}
	
}
