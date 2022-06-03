package com.yanik.specs;

import org.springframework.stereotype.Component;

import com.yanik.interfaces.Engine;

@Component("V6Engine")
public class V6 implements Engine {

	@Override
	public String type() {
		return "V-6 Engine";
	}

}
