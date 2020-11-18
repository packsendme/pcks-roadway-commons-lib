package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.packsendme.roadbrewa.component.RoadwayManagerConstants;
import com.packsendme.roadbrewa.entity.Country;

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
	public String idcountry;
	public String codcountry;
	public String namecountry;
	public String nameimagecountry;
	public String formatnumbercountry;
	public List<String> unityMeasurementL = new ArrayList<String>();
	

	public CountryDto(String idcountry, String codcountry, String namecountry, String nameimagecountry,
			String formatnumbercountry, List<String> unityMeasurementL) {
		super();
		this.idcountry = idcountry;
		this.codcountry = codcountry;
		this.namecountry = namecountry;
		this.nameimagecountry = nameimagecountry;
		this.formatnumbercountry = formatnumbercountry;
		this.unityMeasurementL = unityMeasurementL;
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
		entity.idcountry = countryDto.idcountry;
		entity.codcountry = countryDto.codcountry;
		entity.namecountry = countryDto.namecountry;
		entity.nameimagecountry = countryDto.nameimagecountry;
		entity.formatnumbercountry = countryDto.formatnumbercountry;
		if(countryDto.unityMeasurementL != null) {
			entity.unityMeasurementL = countryDto.unityMeasurementL;
		}
		return entity;
	}
	
	public List<CountryDto> entityTOdto(List<Country> country_L) {
		List<CountryDto> countryDto_L = new ArrayList<CountryDto>();

		for(Country entity : country_L) {
			CountryDto countryDto = new CountryDto();
			countryDto.idcountry = entity.idcountry;
			countryDto.codcountry = entity.codcountry;
			countryDto.namecountry = entity.namecountry;
			countryDto.nameimagecountry = entity.nameimagecountry;
			countryDto.formatnumbercountry = entity.formatnumbercountry;
			if(entity.unityMeasurementL != null) {
				countryDto.unityMeasurementL = entity.unityMeasurementL;
			}
			countryDto_L.add(countryDto);
		}
		return countryDto_L;
	}	
	
	

}
