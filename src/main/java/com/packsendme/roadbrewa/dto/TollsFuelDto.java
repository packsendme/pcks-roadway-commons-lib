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
	
	public String country;
	public Double tolls_price;
	public Double fuelGasoline_price;
	public Double fuelDiesel_price;
	public String current;
	public String dt_inc;
	public String dt_update;

	
	public TollsFuelDto(String country, Double tolls_price, Double fuelGasoline_price, Double fuelDiesel_price,
			String current, String dt_inc, String dt_update) {
		super();
		this.country = country;
		this.tolls_price = tolls_price;
		this.fuelGasoline_price = fuelGasoline_price;
		this.fuelDiesel_price = fuelDiesel_price;
		this.current = current;
		this.dt_inc = dt_inc;
		this.dt_update = dt_update;

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
		}
		
		tollsFuel.country = tollsfuelDto.country;
		tollsFuel.tolls_price = tollsfuelDto.tolls_price;
		tollsFuel.fuelGasoline_price = tollsfuelDto.fuelGasoline_price;
		tollsFuel.fuelDiesel_price = tollsfuelDto.fuelDiesel_price;
		tollsFuel.current = tollsfuelDto.current;
		tollsFuel.dt_inc = tollsfuelDto.dt_inc;
		tollsFuel.dt_update = tollsfuelDto.dt_update;
		return tollsFuel;
	}
	
	public TollsFuelDto entityTOdto(TollsFuel entity) throws ParseException {
		TollsFuelDto tollsFuel_Dto = new TollsFuelDto();
		tollsFuel_Dto.country = entity.country;
		tollsFuel_Dto.tolls_price = entity.tolls_price;
		tollsFuel_Dto.fuelGasoline_price = entity.fuelGasoline_price;
		tollsFuel_Dto.fuelDiesel_price = entity.fuelDiesel_price;
		tollsFuel_Dto.current = entity.current;
		tollsFuel_Dto.dt_inc = entity.dt_inc;
		tollsFuel_Dto.dt_update = entity.dt_update;
		return tollsFuel_Dto;
	}

	
	
}


