package com.packsendme.roadbrewa.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.packsendme.roadbrewa.component.RoadwayManagerConstants;
import com.packsendme.roadbrewa.entity.UnityMeasurement;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class UnityMeasurementDto {

	@Id
	public String id;	
	public String unitMeasurement;
	public String origin_country;
	
	public UnityMeasurementDto(String unitMeasurement, String origin_country) {
		super();
		this.unitMeasurement = unitMeasurement;
		this.origin_country = origin_country;
	}

	public UnityMeasurementDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	 
	/* ==============================================
	 * U N I T Y  - P A R S E R  
	 * ==============================================
	 */
	
	public UnityMeasurement Dto_TO_Entity(UnityMeasurementDto unityDto, UnityMeasurement entity, String typeOperation) {

		if(typeOperation.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			entity = new UnityMeasurement();
		}
		entity.unitMeasurement = unityDto.unitMeasurement;
		entity.origin_country = unityDto.origin_country;
		return entity;
	}
	
	public List<UnityMeasurementDto> Entity_TO_Dto(List<UnityMeasurement> unityMeasurement_L) {

		List<UnityMeasurementDto> unityMeasurementDto_L = new ArrayList<UnityMeasurementDto>();
		UnityMeasurementDto unityMeasurementDto = null;
		
		for(UnityMeasurement unityMeasurement :  unityMeasurement_L) {
			unityMeasurementDto = new UnityMeasurementDto();  
			unityMeasurementDto.unitMeasurement = unityMeasurement.unitMeasurement;
			unityMeasurementDto.origin_country = unityMeasurement.origin_country;
			unityMeasurementDto_L.add(unityMeasurementDto);
		}
		return unityMeasurementDto_L;
	}
	
 
	
	
		
}
