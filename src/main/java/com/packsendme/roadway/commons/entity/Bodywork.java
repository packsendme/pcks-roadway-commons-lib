package com.packsendme.roadway.commons.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
@Document(collection = "pcks_roadbrewa_bodywork")
public class Bodywork  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;
	public String bodyWork;
	public String type;
	
	
	public Bodywork(String bodyWork, String type) {
		super();
		this.bodyWork = bodyWork;
		this.type = type;
	}


	public Bodywork() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
