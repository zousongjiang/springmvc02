package org.framestudy.springmvc02.sysmag.beans;

import java.util.Date;

public class UserBean {

	private String userName;
	
	private String pwd;
	
	private Date birthday;
	

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
	
	

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "UserBean [userName=" + userName + ", pwd=" + pwd + ", birthday=" + birthday + "]";
	}
	
	
	
}
