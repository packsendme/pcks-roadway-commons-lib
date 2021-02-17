package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.packsendme.roadbrewa.component.RoadwayManagerConstants;
import com.packsendme.roadbrewa.entity.VehicleType;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class VehicleTypeDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String id;
	public String type_vehicle;
	public String vehicle_model;
	public String vehicle_category;
	public List<String> vehicle_subcategory = new ArrayList<String>();


	
	public VehicleTypeDto(String type_vehicle, String vehicle_model, String vehicle_category, List<String> vehicle_subcategory) {
		super();
		this.type_vehicle = type_vehicle;
		this.vehicle_model = vehicle_model;
		this.vehicle_category = vehicle_category;
		this.vehicle_subcategory = vehicle_subcategory;
	}


	public VehicleTypeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/* ==============================================
	 *  V E H I C L E CATEGORY - TYPE  - P A R S E R  
	 * ==============================================
	 */


	public VehicleType dtoTOentity(VehicleTypeDto vehicleTypeDto, VehicleType entity, String typeOperation) {
		if(typeOperation.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			entity = new VehicleType();
		}
		entity.type_vehicle = vehicleTypeDto.type_vehicle;
		entity.vehicle_model = vehicleTypeDto.vehicle_model;
		entity.vehicle_category = vehicleTypeDto.vehicle_category;
		return entity;
	}
	
	public List<VehicleTypeDto> entityTOdto(List<VehicleType> vehicleType_L) {
		List<VehicleTypeDto> vehicleTypeDto_L = new ArrayList<VehicleTypeDto>();
		VehicleTypeDto vehicleTypeDto = null;
		
		for(VehicleType vehicleType : vehicleType_L) {
			vehicleTypeDto = new VehicleTypeDto();
			vehicleTypeDto.id = vehicleType.id;
			vehicleTypeDto.type_vehicle = vehicleType.type_vehicle;
			vehicleTypeDto.vehicle_model = vehicleType.vehicle_model;
			vehicleTypeDto.vehicle_category = vehicleType.vehicle_category;
			vehicleTypeDto_L.add(vehicleTypeDto);
		}
		return vehicleTypeDto_L;
	}
}
