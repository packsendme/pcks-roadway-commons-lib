package com.packsendme.roadbrewa.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.packsendme.roadbrewa.component.RoadwayManagerConstants;
import com.packsendme.roadbrewa.entity.Initials;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class InitialsDto{

	@Id
	public String id;
	public String name;
	
	public InitialsDto(String name) {
		super();
		this.name = name;
	}

	public InitialsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/* ==============================================
	 * I N I T I A L E S  - P A R S E R  
	 * ==============================================
	 */
	
	public Initials Dto_TO_Entity(InitialsDto initials, Initials entity, String typeOperation) {
		if(typeOperation.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			entity = new Initials();
		}
		entity.name = initials.name;
		return entity;
	}
	
	public List<InitialsDto> Entity_TO_Entity(List<Initials> initials_L) {

		List<InitialsDto> initialsDto_L = new ArrayList<InitialsDto>();
		InitialsDto initialsDto = new InitialsDto();
		
		for(Initials initials : initials_L) {
			initialsDto.id = initials.id;
			initialsDto.name = initials.name;
			initialsDto_L.add(initialsDto);
		}
		return initialsDto_L;
	}	


}