package com.packsendme.roadbrewa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.packsendme.roadbrewa.component.RoadwayManagerConstants;
import com.packsendme.roadbrewa.entity.Initials;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class InitialsDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	
	public Initials dtoTOentity(InitialsDto initials, Initials entity, String typeOperation) {
		if(typeOperation.equals(RoadwayManagerConstants.ADD_OP_ROADWAY)) {
			entity = new Initials();
		}
		entity.name = initials.name;
		return entity;
	}
	
	public List<InitialsDto> entityTOdto(List<Initials> initials_L) {

		List<InitialsDto> initialsDto_L = new ArrayList<InitialsDto>();
		InitialsDto initialsDto = null;
		
		for(Initials initials : initials_L) {
			initialsDto = new InitialsDto();
			initialsDto.id = initials.id;
			initialsDto.name = initials.name;
			initialsDto_L.add(initialsDto);
		}
		return initialsDto_L;
	}	


}