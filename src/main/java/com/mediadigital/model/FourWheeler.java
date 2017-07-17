package com.mediadigital.model;

import org.springframework.data.annotation.Id;

public class FourWheeler extends Vehicle{

	@Id
	private String id;
	private FourWheelerType type;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public FourWheelerType getType() {
		return type;
	}
	public void setType(FourWheelerType type) {
		this.type = type;
	}
}
