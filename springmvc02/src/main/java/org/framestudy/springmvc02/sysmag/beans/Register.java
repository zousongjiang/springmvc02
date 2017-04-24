package org.framestudy.springmvc02.sysmag.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Register {

	private String userName;
	private int age;
	private boolean marry;
	private double income;
	private String[] hobby;
	//List作为参数属性时，需要与对象进行绑定
	private List<Address> adds = new ArrayList<Address>();
	//Set作为参数属性时，需要与对象进行绑定,并且必须提前规定大小
	private Set<Wife> wifes = new HashSet<Wife>();
	
	//Map作为参数属性时，需要与对象进行绑定
	private Map<String, String> maps = new HashMap<String, String>();
	
	//复合对象
	private Role role;
	
	public Register() {
		super();
		wifes.add(new Wife());
		wifes.add(new Wife());
		wifes.add(new Wife());
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMarry() {
		return marry;
	}
	public void setMarry(boolean marry) {
		this.marry = marry;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public Set<Wife> getWifes() {
		return wifes;
	}
	public void setWifes(Set<Wife> wifes) {
		this.wifes = wifes;
	}
	public List<Address> getAdds() {
		return adds;
	}
	public void setAdds(List<Address> adds) {
		this.adds = adds;
	}
	public Map<String, String> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Register [userName=" + userName + ", age=" + age + ", marry=" + marry + ", income=" + income
				+ ", hobby=" + Arrays.toString(hobby) + ", adds=" + adds + ", wifes=" + wifes + ", maps=" + maps
				+ ", role=" + role + "]";
	}
}
