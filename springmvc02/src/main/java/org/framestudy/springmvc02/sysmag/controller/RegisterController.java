package org.framestudy.springmvc02.sysmag.controller;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.framestudy.springmvc02.sysmag.beans.Register;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/registers")
@Controller
public class RegisterController {

	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 自动类型转换
	 * @param register
	 * @return
	 */
	@RequestMapping(value="/register")
	public String regist(Register register){
		
		System.out.println(register);
		
		return "/index";
	}
	
	
	/*
	@RequestMapping(value="/register",params={"userName","marry=true"})
	public String regist(String userName,int age,boolean marry,double income,String[] hobby){
		
		
		try {
			System.out.println(new String(userName.getBytes("ISO8859-1"),"utf-8"));
			
			
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println(age);
		System.out.println(marry);
		System.out.println(income);
		System.out.println(Arrays.toString(hobby));
		
		return "/index";
	}
	*/
	
}
