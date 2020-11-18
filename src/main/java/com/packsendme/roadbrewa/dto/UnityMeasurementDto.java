package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.packsendme.roadbrewa.component.RoadwayManagerConstants;
import com.packsendme.roadbrewa.entity.UnityMeasurement;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class UnityMeasurementDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	public String id;	
	public String unitMeasurement;
	public String region;
	public String identifier;
	
	
	
	public UnityMeasurementDto(String unitMeasurement, String region, String identifier) {
		super();
		this.unitMeasurement = unitMeasurement;
		this.region = region;
		this.identifier = identifier;
	}



	public UnityMeasurementDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	 
	/* ==============================================
	 * U N I T Y  - P A R S E R  
	 * ==============================================
	 */
	
	public UnityMeasurement dtoTOentity(UnityMeasurementDto unityDto, UnityMeasurement entity, String typeOperation) {

		if(typeOperation.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			entity = new UnityMeasurement();
		}
		entity.unitMeasurement = unityDto.unitMeasurement;
		entity.region = unityDto.region;
		entity.identifier = unityDto.identifier;
		return entity;
	}
	
	public List<UnityMeasurementDto> entityTOdto(List<UnityMeasurement> unityMeasurement_L) {

		List<UnityMeasurementDto> unityMeasurementDto_L = new ArrayList<UnityMeasurementDto>();
		UnityMeasurementDto unityMeasurementDto = null;
		
		for(UnityMeasurement unityMeasurement :  unityMeasurement_L) {
			unityMeasurementDto = new UnityMeasurementDto();  
			unityMeasurementDto.id = unityMeasurement.id;
			unityMeasurementDto.unitMeasurement = unityMeasurement.unitMeasurement;
			unityMeasurementDto.region = unityMeasurement.region;
			unityMeasurementDto.identifier = unityMeasurement.identifier;
			unityMeasurementDto_L.add(unityMeasurementDto);
		}
		return unityMeasurementDto_L;
	}
	
 
	
	
		
}
