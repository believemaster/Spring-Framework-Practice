package com.yanik.specs;

import com.yanik.interfaces.Engine;

public class EngineType implements Engine {

	String type;
	
	public EngineType() {
		type = "Unknown";
	}

	public EngineType(String type) {
		this.type = type;
	}

	@Override
	public String type() {
		return type;
	}

}
