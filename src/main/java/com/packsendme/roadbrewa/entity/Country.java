package com.packsendme.roadbrewa.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
	public String idcountry;
	public String codcountry;
	public String namecountry;
	public String nameimagecountry;
	public String formatnumbercountry;
	public List<String> unityMeasurementL = new ArrayList<String>();
	
	public Country(String idcountry, String codcountry, String namecountry, String nameimagecountry,
			String formatnumbercountry, List<String> unityMeasurementL) {
		super();
		this.idcountry = idcountry;
		this.codcountry = codcountry;
		this.namecountry = namecountry;
		this.nameimagecountry = nameimagecountry;
		this.formatnumbercountry = formatnumbercountry;
		this.unityMeasurementL = unityMeasurementL;
	}








	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
