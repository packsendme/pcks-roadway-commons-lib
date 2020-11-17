package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.packsendme.roadbrewa.component.RoadwayManagerConstants;
import com.packsendme.roadbrewa.entity.Country;
import com.packsendme.roadbrewa.entity.Initials;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class CountryDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String idcountry;
	public String codcountry;
	public String namecountry;
	public String nameimagecountry;
	public String formatnumbercountry;
	
	
	public CountryDto(String idcountry, String codcountry, String namecountry, String nameimagecountry,
			String formatnumbercountry) {
		super();
		this.idcountry = idcountry;
		this.codcountry = codcountry;
		this.namecountry = namecountry;
		this.nameimagecountry = nameimagecountry;
		this.formatnumbercountry = formatnumbercountry;
	}
	

	public CountryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/* ==============================================
	 * C O U N T R Y  - P A R S E R  
	 * ==============================================
	 */
	
	public Country dtoTOentity(CountryDto country, Country entity, String typeOperation) {
		if(typeOperation.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			entity = new Country();
		}
		entity.codcountry = country.codcountry;
		entity.namecountry = country.namecountry;
		entity.nameimagecountry = country.nameimagecountry;
		entity.formatnumbercountry = country.formatnumbercountry;
		return entity;
	}
	
	public List<CountryDto> entityTOdto(List<Country> country_L) {
		List<CountryDto> countryDto_L = new ArrayList<CountryDto>();

		for(Country country : country_L) {
			CountryDto countryDto = new CountryDto();
			countryDto.codcountry = country.codcountry;
			countryDto.namecountry = country.namecountry;
			countryDto.nameimagecountry = country.nameimagecountry;
			countryDto.formatnumbercountry = country.formatnumbercountry;
			countryDto_L.add(countryDto);
		}
		return countryDto_L;
	}	
	
	

}
