package com.ihue.basicaction;

import com.ihue.util.Session;
import com.opensymphony.xwork2.Action;

public class HomeAction implements Action {
	private Boolean loginstatus;

	@Override
	public String execute() throws Exception {
		loginstatus = Session.getUser();
		return Action.SUCCESS;
	}

	public Boolean getLoginstatus() {
		return loginstatus;
	}

	public void setLoginstatus(Boolean loginstatus) {
		this.loginstatus = loginstatus;
	}

}
