package com.packsendme.roadbrewa.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class Country implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String idcountry;
	public String codcountry;
	public String namecountry;
	public String nameimagecountry;
	public String formatnumbercountry;
	
	
	public Country(String idcountry, String codcountry, String namecountry, String nameimagecountry,
			String formatnumbercountry) {
		super();
		this.idcountry = idcountry;
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
