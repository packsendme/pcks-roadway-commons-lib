package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.packsendme.roadbrewa.component.RoadwayManagerConstants;
import com.packsendme.roadbrewa.entity.VehicleCategory;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class VehicleCategoryDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String id;
	public String type_vehicle;
	public String model_vehicle;
	public List<String> category_vehicle = new ArrayList<String>();
	public List<String> subcategory_vehicle = new ArrayList<String>();


	
	public VehicleCategoryDto(String type_vehicle, List<String> category_vehicle, List<String> subcategory_vehicle) {
		super();
		this.type_vehicle = type_vehicle;
		this.category_vehicle = category_vehicle;
		this.subcategory_vehicle = subcategory_vehicle;
	}


	public VehicleCategoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/* ==============================================
	 *  V E H I C L E CATEGORY - TYPE  - P A R S E R  
	 * ==============================================
	 */


	public VehicleCategory dtoTOentity(VehicleCategoryDto vehicleTypeDto, VehicleCategory entity, String typeOperation) {
		if(typeOperation.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			entity = new VehicleCategory();
		}
		entity.type_vehicle = vehicleTypeDto.type_vehicle;
		entity.category_vehicle = vehicleTypeDto.category_vehicle;
		entity.subcategory_vehicle = vehicleTypeDto.subcategory_vehicle;
		return entity;
	}
	
	public List<VehicleCategoryDto> entityTOdto(List<VehicleCategory> vehicle_L) {
		List<VehicleCategoryDto> vehicleTypeDto_L = new ArrayList<VehicleCategoryDto>();
		VehicleCategoryDto vehicleTypeDto = null;
		
		for(VehicleCategory vehicle : vehicle_L) {
			vehicleTypeDto = new VehicleCategoryDto();
			vehicleTypeDto.id = vehicle.id;
			vehicleTypeDto.type_vehicle = vehicle.type_vehicle;
			vehicleTypeDto.category_vehicle = vehicle.category_vehicle;
			vehicleTypeDto.subcategory_vehicle = vehicle.subcategory_vehicle;
			vehicleTypeDto_L.add(vehicleTypeDto);
		}
		return vehicleTypeDto_L;
	}
}
