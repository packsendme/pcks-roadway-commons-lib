package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
	public TariffPlanDto tariffPlan = new TariffPlanDto();




	public TransportDto(String id, String name_transport, String identifier, String initials, String transport_type,
			TariffPlanDto tariffPlan) {
		super();
		this.id = id;
		this.name_transport = name_transport;
		this.identifier = identifier;
		this.initials = initials;
		this.transport_type = transport_type;
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
	
	public Transport dtoTOentity(TransportDto tranportDTO, Transport entity, String typeOperation) {
		if(typeOperation.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			entity = new Transport();
		}
		entity.name_transport = tranportDTO.name_transport;
		entity.identifier = tranportDTO.identifier;
		entity.initials = tranportDTO.initials;
		entity.transport_type = tranportDTO.transport_type;

		// TariffPlan-Entity
		TariffPlan tariffPlan = new TariffPlan(tranportDTO.tariffPlan.weight_plan, tranportDTO.tariffPlan.distance_plan, tranportDTO.tariffPlan.worktime_plan, 
				tranportDTO.tariffPlan.fuelconsumption_plan, tranportDTO.tariffPlan.tolls_plan, tranportDTO.tariffPlan.dimension_plan, tranportDTO.tariffPlan.antt_plan, 
				tranportDTO.tariffPlan.fragile_plan, tranportDTO.tariffPlan.persishable_plan, tranportDTO.tariffPlan.reshipping_plan); 
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
