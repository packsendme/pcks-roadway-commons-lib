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
	public String model_vehicle;
	public List<String> category_vehicle = new ArrayList<String>();
	public List<String> subcategory_vehicle = new ArrayList<String>();


	
	public VehicleTypeDto(String type_vehicle, List<String> category_vehicle, List<String> subcategory_vehicle) {
		super();
		this.type_vehicle = type_vehicle;
		this.category_vehicle = category_vehicle;
		this.subcategory_vehicle = subcategory_vehicle;
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
		entity.category_vehicle = vehicleTypeDto.category_vehicle;
		entity.subcategory_vehicle = vehicleTypeDto.subcategory_vehicle;
		return entity;
	}
	
	public List<VehicleTypeDto> entityTOdto(List<VehicleType> vehicleType_L) {
		List<VehicleTypeDto> vehicleTypeDto_L = new ArrayList<VehicleTypeDto>();
		VehicleTypeDto vehicleTypeDto = null;
		
		for(VehicleType vehicleType : vehicleType_L) {
			vehicleTypeDto = new VehicleTypeDto();
			vehicleTypeDto.id = vehicleType.id;
			vehicleTypeDto.type_vehicle = vehicleType.type_vehicle;
			vehicleTypeDto.category_vehicle = vehicleType.category_vehicle;
			vehicleTypeDto.subcategory_vehicle = vehicleType.subcategory_vehicle;
			vehicleTypeDto_L.add(vehicleTypeDto);
		}
		return vehicleTypeDto_L;
	}
}
