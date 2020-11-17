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
	public String codCountry;
	public String countryName;
	public boolean citySpecify;
	public List<String> cities;
	
	


	public LocationDto(String codCountry, String countryName, boolean citySpecify, List<String> cities) {
		super();
		this.codCountry = codCountry;
		this.countryName = countryName;
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
		entity.countryName = locationDto.countryName;
		entity.citySpecify = locationDto.citySpecify;
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
		if(location_L != null) {
			for(Location l : location_L) {
				locationDto.codCountry = l.codCountry;
				locationDto = new LocationDto();
				locationDto.id = l.id;
				locationDto.countryName = l.countryName;
				locationDto.citySpecify = l.citySpecify;
				if(locationDto.citySpecify == true) {
					for(String city : l.cities) {
						locationDto.cities.add(city);
					}
				}
				locationDto_L.add(locationDto);
			}
		}
		return locationDto_L;
	}
	
	
	

}
