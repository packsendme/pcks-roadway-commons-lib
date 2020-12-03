package com.packsendme.roadbrewa.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.packsendme.roadbrewa.dto.CountryDto;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
@Document(collection = "pcks_roadbrewa_currency")
public class Currency implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;
	public String name;
	public String symbol;
	public List<CountryDto> country = new ArrayList<CountryDto>();


	

	public Currency(String name, String symbol, List<CountryDto> country) {
		super();
		this.name = name;
		this.symbol = symbol;
		this.country = country;
	}




	public Currency() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
