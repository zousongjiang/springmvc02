package org.framestudy.springmvc02.sysmag.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.framestudy.springmvc02.sysmag.beans.UserBean;
import org.framestudy.springmvc02.sysmag.pojos.Messager;
import org.framestudy.springmvc02.sysmag.pojos.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller
//@RestController === @ResponseBody +  @Controller


@RequestMapping("/jsons")
@RestController 
public class JacksonController {

	//如果直接返回"";需要修改application/json为text/html
	@RequestMapping(value="/one",produces={"application/json;charset=utf-8"})
	public Messager one(@RequestBody UserInfo user){
		
		System.out.println(user);
		
		return new Messager(true, "操作成功");
	}
	
	
	@RequestMapping(value="/two",produces={"application/json;charset=utf-8"})
	public Messager two(@RequestBody List<UserInfo> users){
		
		System.out.println(users);
		
		return new Messager(true, "操作成功");
	}
	
	
	@RequestMapping(value="/three",produces={"application/json;charset=utf-8"})
	public Messager three(@RequestBody Long id){
		
		System.out.println(id);
		
		return new Messager(true, "操作成功");
	}
	
	
	@RequestMapping(value="/four",produces={"application/json;charset=utf-8"})
	public Messager four(@RequestBody Long[] ids){
		
		System.out.println(Arrays.toString(ids));
		return new Messager(true, "操作成功");
	}
	
/*
	@RequestMapping(value="/five",produces={"application/json;charset=utf-8"})
	public UserBean five(@RequestBody String name){
		
		System.out.println(name);
		return new UserBean("老张", "123456");
	}
	*/
	

	@RequestMapping(value="/five",produces={"application/json;charset=utf-8"})
	public List<UserBean> five(@RequestBody String name){
		
		System.out.println(name);
		List<UserBean> users = new ArrayList<UserBean>();
		users.add(new UserBean("老张", "123456"));
		users.add(new UserBean("老张的老婆", "芝麻开门"));
		
		return users;
	}
	
	
	@RequestMapping(value="/six",produces={"application/json;charset=utf-8"})
	public Map six(@RequestBody String name){
		
		System.out.println(name);
		Map map = new HashMap<>();
		map.put("status", true);
		map.put("msg", "操作成功");
		
		return map;
	}
	
	
	
	
	
	
	
	
	
	
}
