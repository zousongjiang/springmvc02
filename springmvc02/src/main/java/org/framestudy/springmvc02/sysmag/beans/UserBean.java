package org.framestudy.springmvc02.sysmag.beans;

public class UserBean {

	private String userName;
	
	private String pwd;

	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserBean(String userName, String pwd) {
		super();
		this.userName = userName;
		this.pwd = pwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "UserBean [userName=" + userName + ", pwd=" + pwd + "]";
	}
	
	
	
}
