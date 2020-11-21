package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.packsendme.roadbrewa.component.RoadwayManagerConstants;
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
	public String initials;
	public String transport_type;

	
	public TransportDto(String id, String name_transport,String initials, String transport_type) {
		super();
		this.id = id;
		this.name_transport = name_transport;
		this.initials = initials;
		this.transport_type = transport_type;
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
		entity.initials = tranportDTO.initials;
		entity.transport_type = tranportDTO.transport_type;
		return entity;
	}

	public List<TransportDto> entityTOdto(List<Transport> tranport_l) {
		List<TransportDto> transportDto_L = new ArrayList<TransportDto>();
		TransportDto transportDto = new TransportDto();
		for(Transport transport : tranport_l) {
			transportDto = new TransportDto();
			transportDto.id = transport.id;
			transportDto.name_transport = transport.name_transport;
			transportDto.initials = transport.initials;
			transportDto.transport_type = transport.transport_type;
			transportDto_L.add(transportDto);
		}
		return transportDto_L;
	}
	
}
