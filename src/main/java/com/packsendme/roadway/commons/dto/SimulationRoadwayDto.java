package com.packsendme.roadway.commons.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.packsendme.cross.common.exchange.Exchange;
import com.packsendme.cross.common.response.dto.api.GoogleAPITrackingResponse_Dto;
import com.packsendme.roadway.commons.entity.Roadway;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SimulationRoadwayDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String address_origin;
	public String address_destination;
	public String type_transport;
	public String product_transport;
	public int people;
	public Double weight_max;
	public Map<Integer, String> unity_weight = new HashMap<Integer, String>();
	public String unityWeightS;
	public Double height_max;
	public Double width_max;
	public Double length_max;
	public String delivery_type;
	public String language_locale;
	public String country_locale;
	public Exchange exchangeObj;
	public GoogleAPITrackingResponse_Dto googleTracking;
	public Roadway roadwayRule;
	
	public SimulationRoadwayDto(String address_origin, String address_destination, String type_transport,
			String product_transport, int people, Double weight_max, Map<Integer, String> unity_weight, Double height_max,
			Double width_max, Double length_max, String delivery_type, String language_locale, String country_locale,
			Exchange exchangeObj, GoogleAPITrackingResponse_Dto googleTracking, Roadway roadwayRule) {
		super();
		this.address_origin = address_origin;
		this.address_destination = address_destination;
		this.type_transport = type_transport;
		this.product_transport = product_transport;
		this.people = people;
		this.weight_max = weight_max;
		this.unity_weight = unity_weight;
		this.height_max = height_max;
		this.width_max = width_max;
		this.length_max = length_max;
		this.delivery_type = delivery_type;
		this.language_locale = language_locale;
		this.country_locale = country_locale;
		this.exchangeObj = exchangeObj;
		this.googleTracking = googleTracking;
		this.roadwayRule = roadwayRule;
	}
	
	
	
	

}
