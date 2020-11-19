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
	public String typeUnity;
	public String unityArea;
	public String unityVolume;
	public String unityWeight;
	public String unityTemperature;
	public String unityCurrency;
		
	
 	public UnityMeasurementDto(String typeUnity, String unityArea, String unityVolume, String unityWeight,
			String unityTemperature, String unityCurrency) {
		super();
		this.typeUnity = typeUnity;
		this.unityArea = unityArea;
		this.unityVolume = unityVolume;
		this.unityWeight = unityWeight;
		this.unityTemperature = unityTemperature;
		this.unityCurrency = unityCurrency;
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
		entity.typeUnity =  unityDto.typeUnity;
		entity.unityArea = unityDto.unityArea;
		entity.unityVolume = unityDto.unityVolume;
		entity.unityWeight = unityDto.unityWeight;
		entity.unityTemperature = unityDto.unityTemperature;
		entity.unityCurrency = unityDto.unityCurrency;
		return entity;
	}
	
	public List<UnityMeasurementDto> entityTOdto(List<UnityMeasurement> unityMeasurement_L) {

		List<UnityMeasurementDto> unityMeasurementDto_L = new ArrayList<UnityMeasurementDto>();
		UnityMeasurementDto unityDto = null;
		
		for(UnityMeasurement entity :  unityMeasurement_L) {
			unityDto = new UnityMeasurementDto();  
			unityDto.id = entity.id;
			unityDto.typeUnity =  entity.typeUnity;
			unityDto.unityArea = entity.unityArea;
			unityDto.unityVolume = entity.unityVolume;
			unityDto.unityWeight = entity.unityWeight;
			unityDto.unityTemperature = entity.unityTemperature;
			unityDto.unityCurrency = entity.unityCurrency;
			unityMeasurementDto_L.add(unityDto);
		}
		return unityMeasurementDto_L;
	}
	
 
	
	
		
}
