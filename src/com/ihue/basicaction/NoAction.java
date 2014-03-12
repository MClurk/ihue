package com.ihue.basicaction;

import com.opensymphony.xwork2.Action;

public class NoAction implements Action {

	@Override
	public String execute() throws Exception {
		return Action.SUCCESS;
	}

}
