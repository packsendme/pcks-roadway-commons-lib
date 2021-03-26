package com.packsendme.roadbrewa.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Document(collection = "pcks_roadbrewa_transport")
public class Transport implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;
	public String name_transport;
	public String identifier;
	public String initials;
	public String transport_type;

	
	public Transport(String name_transport,String identifier,String initials,String transport_type) {
		super();
		this.name_transport = name_transport;
		this.identifier = identifier;
		this.initials = initials;
		this.transport_type = transport_type;
	}


	public Transport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
