package org.framestudy.springmvc02.sysmag.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Register {

	@NotEmpty(message="用户名不能为空！")
	@Size(min=6,max=12,message="用户名长度必须在6-12位之间！")
	private String userName;
	
	@Min(value=18,message="未满18岁，请自动离开！")
	@Max(value=60,message="本站属于刺激性网站，为了您的健康，请自动离开！")
	private int age;
	
	@Past(message="你不能穿越回来！")
	private Date birthday;
	
	@AssertTrue(message="单身狗，请离开！")
	private boolean marry;
	
	@Digits(integer=6,fraction=2,message="工资收入必须控制在100万之内！")
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
	
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Register [userName=" + userName + ", age=" + age + ", birthday=" + birthday + ", marry=" + marry
				+ ", income=" + income + ", hobby=" + Arrays.toString(hobby) + ", adds=" + adds + ", wifes=" + wifes
				+ ", maps=" + maps + ", role=" + role + "]";
	}
}
