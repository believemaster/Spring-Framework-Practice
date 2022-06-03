package com.yanik.specs;

import org.springframework.stereotype.Component;

import com.yanik.interfaces.Engine;

@Component("V8Engine")
public class V8 implements Engine {

	@Override
	public String type() {
		return "V-8 Engine";
	}

}
