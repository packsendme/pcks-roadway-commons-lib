package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.packsendme.roadbrewa.entity.Country;
import com.packsendme.roadway.constants.RoadwayManagerConstants;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class CountryDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String id;
	public String codcountry;
	public String namecountry;
	public String nameimagecountry;
	public String identifier;
	public Map<String,String> unityWeightL = new HashMap<String,String>();
	public Map<String,String> unityDistanceL = new HashMap<String,String>();

	
 

	public CountryDto(String codcountry, String namecountry, String nameimagecountry, String identifier,
			Map<String, String> unityWeightL, Map<String, String> unityDistanceL) {
		super();
		this.codcountry = codcountry;
		this.namecountry = namecountry;
		this.nameimagecountry = nameimagecountry;
		this.identifier = identifier;
		this.unityWeightL = unityWeightL;
		this.unityDistanceL = unityDistanceL;
	}

	public CountryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/* ==============================================
	 * C O U N T R Y  - P A R S E R  
	 * ==============================================
	 */
	
	public Country dtoTOentity(CountryDto countryDto, Country entity, String typeOperation) {
		if(typeOperation.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			entity = new Country();
		}
		entity.identifier = countryDto.identifier;
		entity.codcountry = countryDto.codcountry;
		entity.namecountry = countryDto.namecountry;
		entity.nameimagecountry = countryDto.nameimagecountry;
		if(countryDto.unityWeightL != null) {
			entity.unityWeightL = countryDto.unityWeightL;
		}
		if(countryDto.unityDistanceL != null) {
			entity.unityDistanceL = countryDto.unityDistanceL;
		}
		return entity;
	}
	
	public List<CountryDto> entityTOdto(List<Country> country_L) {
		List<CountryDto> countryDto_L = new ArrayList<CountryDto>();

		for(Country entity : country_L) {
			CountryDto countryDto = new CountryDto();
			countryDto.identifier = entity.identifier;
			countryDto.codcountry = entity.codcountry;
			countryDto.namecountry = entity.namecountry;
			countryDto.nameimagecountry = entity.nameimagecountry;
			if(entity.unityWeightL != null) {
				countryDto.unityWeightL = entity.unityWeightL;
			}
			if(entity.unityDistanceL != null) {
				countryDto.unityDistanceL = entity.unityDistanceL;
			}
			countryDto_L.add(countryDto);
		}
		return countryDto_L;
	}	
	
	

}
