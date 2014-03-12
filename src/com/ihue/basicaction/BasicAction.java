package com.ihue.basicaction;

import com.opensymphony.xwork2.Action;

public abstract class BasicAction implements Action {
	// 动作 v - view s - submit
	protected String a = "v";

	@Override
	public abstract String execute() throws Exception;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = (a == null || !a.matches("[vs]")) ? "v" : a;
	}
}
