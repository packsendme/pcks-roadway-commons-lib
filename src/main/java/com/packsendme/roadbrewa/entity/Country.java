package com.packsendme.roadbrewa.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

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
	public String identifier;
	public Map<String,String> unityWeightL = new HashMap<String,String>();
	public Map<String,String> unityDistanceL = new HashMap<String,String>();
	
 	public Country(String codcountry, String namecountry, String nameimagecountry, String identifier,
			Map<String, String> unityWeightL, Map<String, String> unityDistanceL) {
		super();
		this.codcountry = codcountry;
		this.namecountry = namecountry;
		this.nameimagecountry = nameimagecountry;
		this.identifier = identifier;
		this.unityWeightL = unityWeightL;
		this.unityDistanceL = unityDistanceL;
	}










	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
