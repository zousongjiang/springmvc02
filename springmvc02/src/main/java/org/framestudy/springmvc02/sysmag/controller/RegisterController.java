package org.framestudy.springmvc02.sysmag.controller;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Date;

import org.framestudy.springmvc02.sysmag.beans.Register;
import org.framestudy.springmvc02.sysmag.converter.UtilDateConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/registers")
@Controller
public class RegisterController {

	
	
	/**
	 * 声明一个属性编辑器，用于类型转换
	 * 只针对本控制器有效
	 * registerCustomEditor中的第一个参数是指：转换的目标类型
	 * 第二个参数是指自己定义的转换规则
	 * @param binder
	 */
/*	@InitBinder
	protected void converter(WebDataBinder binder){
		binder.registerCustomEditor(Date.class, new UtilDateConverter());
	}*/
	
	
	/**
	 * 自动类型转换
	 * @param register
	 * @return
	 */
/*	@RequestMapping(value="/register")
	public String regist(Register register){
		
		System.out.println(register);
		
		return "/index";
	}*/
	
	
	@RequestMapping(value="/register",params={"userName","marry=true"})
	public String regist(String userName,Date birthday,int age,boolean marry,double income,String[] hobby){
		
		
		System.out.println(birthday);
//		try {
//			System.out.println(new String(userName.getBytes("ISO8859-1"),"utf-8"));
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		System.out.println(userName);
		System.out.println(age);
		System.out.println(marry);
		System.out.println(income);
		System.out.println(Arrays.toString(hobby));
		
		return "/index";
	}
	
}
