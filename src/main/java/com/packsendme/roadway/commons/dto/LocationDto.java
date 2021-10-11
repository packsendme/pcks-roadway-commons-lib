package com.packsendme.roadway.commons.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.packsendme.roadway.commons.constants.RoadwayManagerConstants;
import com.packsendme.roadway.commons.entity.Location;

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
	public String codCountry;
	public String countryName;
	public String countryShortName;
	public String identifier;
	public boolean citySpecify;
	public List<String> cities = new ArrayList<String>(); 
	
	


	public LocationDto(String codCountry, String countryShortName, String countryName, String identifier, boolean citySpecify, List<String> cities) {
		super();
		this.codCountry = codCountry;
		this.countryShortName = countryShortName;
		this.countryName = countryName;
		this.identifier = identifier;
		this.citySpecify = citySpecify;
		this.cities = cities;
	}


	public LocationDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/* ==============================================
	 *  L O C A T I O N  - P A R S E R  
	 * ==============================================
	 */
	public Location dtoTOentity(LocationDto locationDto, Location entity, String operationType) {
		
		if(operationType.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			entity = new Location();
		}
		entity.codCountry = locationDto.codCountry;
		entity.countryShortName = locationDto.countryShortName;
		entity.countryName = locationDto.countryName;
		entity.identifier = locationDto.identifier;
		entity.citySpecify = locationDto.citySpecify;
		entity.cities = new ArrayList<String>();
		if(locationDto.citySpecify == true) {
			for(String city : locationDto.cities) {
				entity.cities.add(city);
			}
		}
		return entity;
	}
	
	public List<LocationDto> entityTOdto(List<Location> location_L) {
		List<LocationDto> locationDto_L = new ArrayList<LocationDto>();
		LocationDto locationDto = null;
		
		for(Location l : location_L) {
			locationDto = new LocationDto();
			locationDto.id = l.id;
			locationDto.codCountry = l.codCountry;
			locationDto.countryShortName = l.countryShortName;
			locationDto.countryName = l.countryName;
			locationDto.identifier = l.identifier;
			locationDto.citySpecify = l.citySpecify;
			if(locationDto.citySpecify == true) {
				for(String city : l.cities) {
					locationDto.cities.add(city);
				}
			}
			locationDto_L.add(locationDto);
		}
		return locationDto_L;
	}
	
	
	

}
