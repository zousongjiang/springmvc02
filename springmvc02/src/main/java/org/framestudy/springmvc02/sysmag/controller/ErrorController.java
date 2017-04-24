package org.framestudy.springmvc02.sysmag.controller;

import org.framestudy.springmvc02.sysmag.beans.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/errors")
@Controller
public class ErrorController {

	/**
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("/loginError")
	public ModelAndView toErrorPage(UserBean user){
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		mv.addObject("err", "这是一个错误信息！");
		mv.setViewName("/layout/error");
		return mv;
	}
	
	
	
}
