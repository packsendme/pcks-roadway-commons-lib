package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public String unityType;
	public List<String> unityArea = new ArrayList<String>();
	public List<String> unityVolume = new ArrayList<String>();
	public Map<Integer, String> unityWeight = new HashMap<Integer, String>();
	public List<String> unityTemperature = new ArrayList<String>();
	public List<String> unityCurrency = new ArrayList<String>();
		
	
 	


	public UnityMeasurementDto(String unityType, List<String> unityArea, List<String> unityVolume, Map<Integer, String> unityWeight,
			List<String> unityTemperature, List<String> unityCurrency) {
		super();
		this.unityType = unityType;
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
		entity.unityType =  unityDto.unityType;
		entity.unityArea = unityDto.unityArea;
		entity.unityVolume = unityDto.unityVolume;
		entity.unityWeight = unityDto.unityWeight;
		entity.unityTemperature = unityDto.unityTemperature;
		entity.unityCurrency = unityDto.unityCurrency;
		return entity;
	}
	
	public List<UnityMeasurementDto> entityTOdto_L(List<UnityMeasurement> unityMeasurement_L) {

		List<UnityMeasurementDto> unityMeasurementDto_L = new ArrayList<UnityMeasurementDto>();
		UnityMeasurementDto unityDto = null;
		
		for(UnityMeasurement entity :  unityMeasurement_L) {
			unityDto = new UnityMeasurementDto();  
			unityDto.id = entity.id;
			unityDto.unityType =  entity.unityType;
			unityDto.unityArea = entity.unityArea;
			unityDto.unityVolume = entity.unityVolume;
			unityDto.unityWeight = entity.unityWeight;
			unityDto.unityTemperature = entity.unityTemperature;
			unityDto.unityCurrency = entity.unityCurrency;
			unityMeasurementDto_L.add(unityDto);
		}
		return unityMeasurementDto_L;
	}
	
	public UnityMeasurementDto entityTOdto(UnityMeasurement entity) {
		UnityMeasurementDto unityDto = new UnityMeasurementDto();  
		unityDto.id = entity.id;
		unityDto.unityType =  entity.unityType;
		unityDto.unityArea = entity.unityArea;
		unityDto.unityVolume = entity.unityVolume;
		unityDto.unityWeight = entity.unityWeight;
		unityDto.unityTemperature = entity.unityTemperature;
		unityDto.unityCurrency = entity.unityCurrency;
		return unityDto;
	}
	
 
	
	
		
}
