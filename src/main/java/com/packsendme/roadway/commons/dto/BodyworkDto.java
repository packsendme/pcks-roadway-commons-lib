package com.packsendme.roadway.commons.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.packsendme.roadway.commons.constants.RoadwayManagerConstants;
import com.packsendme.roadway.commons.entity.Bodywork;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class BodyworkDto  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String id;
	public String bodyWork;
	public String type;
	

	

	public BodyworkDto(String bodyWork, String type) {
		super();
		this.bodyWork = bodyWork;
		this.type = type;
	}

	public BodyworkDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/* ==============================================
	 *  B O D Y  W O R K   - P A R S E R  
	 * ==============================================
	 */

	public Bodywork dtoTOentity(BodyworkDto bodyworkDto, Bodywork entity, String operationType) {
		if(operationType.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			entity = new Bodywork();
		}
		entity.bodyWork = bodyworkDto.bodyWork;
		entity.type = bodyworkDto.type;
		return entity;
	}
	
	public List<BodyworkDto> entityTOdto(List<Bodywork> bodywork_L) {
		BodyworkDto bodyworkDto = null;
		List<BodyworkDto> bodyworkDto_L = new ArrayList<BodyworkDto>();
		
		for(Bodywork bodywork : bodywork_L) {
			bodyworkDto = new BodyworkDto();
			bodyworkDto.id = bodywork.id;
			bodyworkDto.bodyWork = bodywork.bodyWork;
			bodyworkDto.type = bodywork.type;
			bodyworkDto_L.add(bodyworkDto);
		}
		return bodyworkDto_L;
	}
	
}
