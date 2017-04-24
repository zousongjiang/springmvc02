package org.framestudy.springmvc02.sysmag.beans;

public class Role {

	private Long id;
	private String name;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
