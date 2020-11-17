package com.packsendme.roadbrewa.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class Country implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;
	public String codcountry;
	public String namecountry;
	public String nameimagecountry;
	public String formatnumbercountry;
	
	
	public Country(String codcountry, String namecountry, String nameimagecountry,
			String formatnumbercountry) {
		super();
		this.codcountry = codcountry;
		this.namecountry = namecountry;
		this.nameimagecountry = nameimagecountry;
		this.formatnumbercountry = formatnumbercountry;
	}


	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
