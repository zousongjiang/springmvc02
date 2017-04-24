package org.framestudy.springmvc02.sysmag.beans;

public class Wife {

	private String wifeName;

	public Wife() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wife(String wifeName) {
		super();
		this.wifeName = wifeName;
	}

	public String getWifeName() {
		return wifeName;
	}

	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}

	@Override
	public String toString() {
		return "Wife [wifeName=" + wifeName + "]";
	}
	
	
}
