package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.text.ParseException;

import com.packsendme.roadbrewa.component.RoadwayManagerConstants;
import com.packsendme.roadbrewa.entity.TollsFuel;

import lombok.Getter;
import lombok.Setter;


@Getter 
@Setter 
public class TollsFuelDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String id;
	public String country;
	public Double tolls_price;
	public Double fuelGasoline_price;
	public Double fuelDiesel_price;
	public String current;
	
	public TollsFuelDto(String country, Double tolls_price, Double fuelGasoline_price, Double fuelDiesel_price,
			String current) {
		super();
		this.country = country;
		this.tolls_price = tolls_price;
		this.fuelGasoline_price = fuelGasoline_price;
		this.fuelDiesel_price = fuelDiesel_price;
		this.current = current;
	}

	public TollsFuelDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/* ==============================================
	 *  T O L L S  - F U E L   
	 * ==============================================
	 */
	
	public TollsFuel dtoTOentity(TollsFuelDto tollsfuelDto, TollsFuel tollsFuel, String operationType) throws ParseException {
		if(operationType.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			tollsFuel = new TollsFuel();
		}
		else if(operationType.equals(RoadwayManagerConstants.UPDATE_OP_ROADWAY)) {
			tollsFuel = new TollsFuel();
			tollsFuel.id = tollsfuelDto.id;
		}
		
		tollsFuel.country = tollsfuelDto.country;
		tollsFuel.tolls_price = tollsfuelDto.tolls_price;
		tollsFuel.fuelGasoline_price = tollsfuelDto.fuelGasoline_price;
		tollsFuel.fuelDiesel_price = tollsfuelDto.fuelDiesel_price;
		tollsFuel.current = tollsfuelDto.current;
		return tollsFuel;
	}
	
	public TollsFuelDto entityTOdto(TollsFuel entity) throws ParseException {
		TollsFuelDto tollsFuel_Dto = new TollsFuelDto();
		tollsFuel_Dto.country = entity.country;
		tollsFuel_Dto.tolls_price = entity.tolls_price;
		tollsFuel_Dto.fuelGasoline_price = entity.fuelGasoline_price;
		tollsFuel_Dto.fuelDiesel_price = entity.fuelDiesel_price;
		tollsFuel_Dto.current = entity.current;
		return tollsFuel_Dto;
	}

	
	
}


