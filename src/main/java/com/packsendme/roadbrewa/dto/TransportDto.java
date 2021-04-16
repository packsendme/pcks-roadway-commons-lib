package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.packsendme.roadbrewa.component.RoadwayManagerConstants;
import com.packsendme.roadbrewa.entity.TariffPlan;
import com.packsendme.roadbrewa.entity.Transport;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class TransportDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String id;
	public String name_transport;
	public String identifier;
	public String initials;
	public String transport_type;
	public Boolean restriction;
	public String coditions;
	public Double weight_max;
	public Map<Integer, String> unity_weight = new HashMap<Integer, String>();
	public Double heightDimension_max;
	public Double widthDimension_max;
	public Double lengthDimension_max;
	public TariffPlanDto tariffPlan = new TariffPlanDto();

 

 

	public TransportDto(String name_transport, String identifier, String initials, String transport_type,
			Boolean restriction, String coditions, Double weight_max, Map<Integer, String> unity_weight,
			Double heightDimension_max, Double widthDimension_max, Double lengthDimension_max,
			TariffPlanDto tariffPlan) {
		super();
		this.name_transport = name_transport;
		this.identifier = identifier;
		this.initials = initials;
		this.transport_type = transport_type;
		this.restriction = restriction;
		this.coditions = coditions;
		this.weight_max = weight_max;
		this.unity_weight = unity_weight;
		this.heightDimension_max = heightDimension_max;
		this.widthDimension_max = widthDimension_max;
		this.lengthDimension_max = lengthDimension_max;
		this.tariffPlan = tariffPlan;
	}

	public TransportDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/* ==============================================
	 * T R A N S P O R T  - P A R S E R  
	 * ==============================================
	 */
	
	public Transport dtoTOentity(TransportDto transportDTO, Transport entity, String typeOperation) {
		if(typeOperation.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			entity = new Transport();
		}
		entity.name_transport = transportDTO.name_transport;
		entity.identifier = transportDTO.identifier;
		entity.initials = transportDTO.initials;
		entity.transport_type = transportDTO.transport_type;
		entity.restriction = transportDTO.restriction;
		entity.coditions = transportDTO.coditions;
		entity.weight_max = transportDTO.weight_max;
		
		if(transportDTO.unity_weight.get(0) == "0") {
			entity.unity_weight = null;
		}
		
		entity.heightDimension_max = transportDTO.heightDimension_max;
		entity.widthDimension_max = transportDTO.widthDimension_max;
		entity.lengthDimension_max = transportDTO.lengthDimension_max;

		// TariffPlan-Entity
		TariffPlan tariffPlan = new TariffPlan(transportDTO.tariffPlan.weight_plan, transportDTO.tariffPlan.distance_plan, transportDTO.tariffPlan.worktime_plan, 
				transportDTO.tariffPlan.fuelconsumption_plan, transportDTO.tariffPlan.tolls_plan, transportDTO.tariffPlan.dimension_plan, transportDTO.tariffPlan.antt_plan, 
				transportDTO.tariffPlan.fragile_plan, transportDTO.tariffPlan.persishable_plan, transportDTO.tariffPlan.reshipping_plan); 
		entity.tariffPlan = tariffPlan;
		
		return entity;
	}

	public List<TransportDto> entityTOdto(List<Transport> tranport_l) {
		List<TransportDto> transportDto_L = new ArrayList<TransportDto>();
		TransportDto transportDto = new TransportDto();
		for(Transport transport : tranport_l) {
			transportDto = new TransportDto();
			transportDto.id = transport.id;
			transportDto.name_transport = transport.name_transport;
			transportDto.identifier = transport.identifier;
			transportDto.initials = transport.initials;
			transportDto.transport_type = transport.transport_type;
			transportDto.restriction = transport.restriction;
			transportDto.coditions = transport.coditions;
			transportDto.weight_max = transport.weight_max;
			transportDto.unity_weight = transport.unity_weight;
			transportDto.heightDimension_max = transport.heightDimension_max;
			transportDto.widthDimension_max = transport.widthDimension_max;
			transportDto.lengthDimension_max = transport.lengthDimension_max;

			// TariffPlan-Entity
			TariffPlanDto tariffPlanDto = new TariffPlanDto(transport.tariffPlan.weight_plan, transport.tariffPlan.distance_plan, transport.tariffPlan.worktime_plan, 
					transport.tariffPlan.fuelconsumption_plan, transport.tariffPlan.tolls_plan, transport.tariffPlan.dimension_plan, transport.tariffPlan.antt_plan, 
					transport.tariffPlan.fragile_plan, transport.tariffPlan.persishable_plan, transport.tariffPlan.reshipping_plan); 
			transportDto.tariffPlan = tariffPlanDto; 
			transportDto_L.add(transportDto);
		}
		return transportDto_L;
	}
	
}
