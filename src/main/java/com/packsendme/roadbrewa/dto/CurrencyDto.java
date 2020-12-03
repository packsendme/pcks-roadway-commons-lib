package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.packsendme.roadbrewa.component.RoadwayManagerConstants;
import com.packsendme.roadbrewa.entity.Currency;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class CurrencyDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String id;
	public String name;
	public String symbol;
	public List<CountryDto> country = new ArrayList<CountryDto>();



	public CurrencyDto(String name, String symbol, List<CountryDto> country) {
		super();
		this.name = name;
		this.symbol = symbol;
		this.country = country;
	}

	public CurrencyDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/* ==============================================
	 * C O U N T R Y  - P A R S E R  
	 * ==============================================
	 */
	
	public Currency dtoTOentity(CurrencyDto currencyDto, Currency entity, String typeOperation) {
		if(typeOperation.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			entity = new Currency();
		}
		entity.name = currencyDto.name;
		entity.symbol = currencyDto.symbol;
		entity.country = currencyDto.country;
		return entity;
	}
	
	public List<CurrencyDto> entityTOdto(List<Currency> currency_L) {
		List<CurrencyDto> currencyDto_L = new ArrayList<CurrencyDto>();

		for(Currency entity : currency_L) {
			CurrencyDto currencyDto = new CurrencyDto();
			currencyDto.name = entity.name;
			currencyDto.symbol = entity.symbol;
			currencyDto.country = entity.country;
			currencyDto_L.add(currencyDto);
		}
		return currencyDto_L;
	}	
	
	

}
