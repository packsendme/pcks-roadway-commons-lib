package com.packsendme.roadbrewa.dto;

import java.util.ArrayList;
import java.util.List;

import com.packsendme.roadbrewa.component.RoadwayManagerConstants;
import com.packsendme.roadbrewa.entity.VehicleType;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class VehicleTypeDto {

	public String id;
	public String type_vehicle;

	
	
	public VehicleTypeDto(String type_vehicle) {
		super();
		this.type_vehicle = type_vehicle;
	}
	

	public VehicleTypeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/* ==============================================
	 *  V E H I C L E - TYPE  - P A R S E R  
	 * ==============================================
	 */


	public VehicleType Dto_TO_Entity(VehicleTypeDto vehicleTypeDto, VehicleType entity, String typeOperation) {
		if(typeOperation.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			entity = new VehicleType();
		}
		entity.type_vehicle = vehicleTypeDto.type_vehicle;
		return entity;
	}
	
	public List<VehicleTypeDto> Entity_TO_Entity(List<VehicleType> vehicleType_L) {
		List<VehicleTypeDto> vehicleTypeDto_L = new ArrayList<VehicleTypeDto>();
		VehicleTypeDto vehicleTypeDto = null;
		
		for(VehicleType vehicleType : vehicleType_L) {
			vehicleTypeDto = new VehicleTypeDto();
			vehicleTypeDto.type_vehicle = vehicleType.type_vehicle;
			vehicleTypeDto_L.add(vehicleTypeDto);
		}
		return vehicleTypeDto_L;
	}
}
