package org.framestudy.springmvc02.sysmag.controller;

import javax.validation.Valid;

import org.framestudy.springmvc02.sysmag.beans.Register;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/validates")
@Controller
public class ValidateController {
	
	/**
	 * 
	 * @param register
	 * @param br 固定参数，用于放置验证后的结果
	 * @return
	 * @ModelAttribute === request.setAttribute("errs",br.errors())
	 */
	@RequestMapping(value = "/rule")
	public String validate(@ModelAttribute("errs") @Valid Register register,BindingResult br) {

		if(br.hasErrors()){
			return "/validate";
		}
		
		return "/index";
	}

}
