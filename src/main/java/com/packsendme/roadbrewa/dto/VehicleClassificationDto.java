package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.packsendme.roadbrewa.entity.VehicleClassification;
import com.packsendme.roadway.constants.RoadwayManagerConstants;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class VehicleClassificationDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String id;
	public String type_vehicle;
	public List<String> classification_vehicle = new ArrayList<String>();
	public List<String> subclassification_vehicle = new ArrayList<String>();


	
	public VehicleClassificationDto(String id, String type_vehicle, List<String> classification_vehicle, List<String> subclassification_vehicle) {
		super();
		this.id = id;
		this.type_vehicle = type_vehicle;
		this.classification_vehicle = classification_vehicle;
		this.subclassification_vehicle = subclassification_vehicle;
	}


	public VehicleClassificationDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/* ==============================================
	 *  V E H I C L E CATEGORY - TYPE  - P A R S E R  
	 * ==============================================
	 */


	public VehicleClassification dtoTOentity(VehicleClassificationDto vehicleCategoryDto, VehicleClassification entity, String typeOperation) {
		if(typeOperation.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			entity = new VehicleClassification();
		}
		entity.type_vehicle = vehicleCategoryDto.type_vehicle;
		entity.classification_vehicle = vehicleCategoryDto.classification_vehicle;
		entity.subclassification_vehicle = vehicleCategoryDto.subclassification_vehicle;
		return entity;
	}
	
	public List<VehicleClassificationDto> entityTOdto(List<VehicleClassification> vehicle_L) {
		List<VehicleClassificationDto> vehicleTypeDto_L = new ArrayList<VehicleClassificationDto>();
		VehicleClassificationDto vehicleTypeDto = null;
		
		for(VehicleClassification vehicle : vehicle_L) {
			vehicleTypeDto = new VehicleClassificationDto();
			vehicleTypeDto.id = vehicle.id;
			vehicleTypeDto.type_vehicle = vehicle.type_vehicle;
			vehicleTypeDto.classification_vehicle = vehicle.classification_vehicle;
			vehicleTypeDto.subclassification_vehicle = vehicle.subclassification_vehicle;
			vehicleTypeDto_L.add(vehicleTypeDto);
		}
		return vehicleTypeDto_L;
	}
	
	
	public VehicleClassificationDto entityTOdtoObj(VehicleClassification vehicle) {
		VehicleClassificationDto vehicleTypeDto = new VehicleClassificationDto(vehicle.id, vehicle.type_vehicle, vehicle.classification_vehicle, vehicle.subclassification_vehicle);
		return vehicleTypeDto;
	}

}
