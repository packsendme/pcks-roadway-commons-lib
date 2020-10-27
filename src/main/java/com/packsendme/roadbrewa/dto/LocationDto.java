package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.packsendme.roadbrewa.component.RoadwayManagerConstants;
import com.packsendme.roadbrewa.entity.Location;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class LocationDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	public String id;
	public String countryName;
	public String cityName;
	public String stateName;
	public String codCountry;
	
	
	public LocationDto(String countryName, String cityName, String stateName, String codCountry) {
		super();
		this.countryName = countryName;
		this.cityName = cityName;
		this.stateName = stateName;
		this.codCountry = codCountry;
	}


	public LocationDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/* ==============================================
	 *  L O C A T I O N  - P A R S E R  
	 * ==============================================
	 */
	public Location Dto_TO_Entity(LocationDto locationDto, Location entity, String operationType) {
		
		if(operationType.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			entity = new Location();
		}
		entity.countryName = locationDto.countryName;
		entity.cityName = locationDto.cityName;
		entity.stateName = locationDto.stateName;
		entity.codCountry = locationDto.codCountry;
		return entity;
	}
	
	public List<LocationDto> Entity_To_Dto(List<Location> location_L) {
		List<LocationDto> locationDto_L = new ArrayList<LocationDto>();
		LocationDto locationDto = null;
		for(Location l : location_L) {
			locationDto = new LocationDto();
			locationDto.id = l.id;
			locationDto.countryName = l.countryName;
			locationDto.cityName = l.cityName;
			locationDto.stateName = l.stateName;
			locationDto.codCountry = l.codCountry;
			locationDto_L.add(locationDto);
		}
		return locationDto_L;
	}
	
	
	

}
