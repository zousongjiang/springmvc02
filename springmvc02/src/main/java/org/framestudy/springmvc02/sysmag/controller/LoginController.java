package org.framestudy.springmvc02.sysmag.controller;

import java.util.HashMap;
import java.util.Map;

import org.framestudy.springmvc02.sysmag.beans.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value="/sys")
@Controller
public class LoginController {
	
	
	
	
	
	
	
	/**
	 * Map作为返回类型的时候，
	 * 是将请求路径来作为即将跳转的页面路径
	 * 并且向其中进行设值等同于向Request中进行设值
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/login")
	public Map loginForward(UserBean user){
		
		System.out.println(user);
		Map map = new HashMap();
		map.put("user", user);
		return map;
		
	}
	
	
	
/*	@RequestMapping(value="/login")
	public String loginForward(UserBean user){
		
		
		
		System.out.println(user);
		
		
//		return "forward:/errors/loginError";
//		return "redirect:/errors/loginError";
		//重定向:forward修改成redirect
		
		//如果要重定向到其他服务器，也是可以的：
		//例如：
		return "redirect:http://www.baidu.com";
		
	}*/
	
	
	
	
	
	/**
	 * String作为返回类型时，返回的数据就是逻辑视图的名称
	 * @param user
	 * @param map
	 * @return
	 */
	/*@RequestMapping(value="/login")
	public String login(UserBean user,Map map){
		
		System.out.println(user);
		
		map.put("user", user);
		
		return "/layout/main";
	}*/
	
	
	
	/**
	 * 能作为参数的第七种：请求头作为参数，我们可以获取来至于HTTP请求头中的内容
	 * @param user
	 * @param acceptLanguage
	 * @param userAgent
	 * @return
	 */
	/*@RequestMapping(value="/login")
	public ModelAndView login(UserBean user,
			@RequestHeader(value="Accept-Language")
	String acceptLanguage,@RequestHeader("User-Agent") String userAgent){
		
		
		
		
		System.out.println(user);
		System.out.println(acceptLanguage);
		System.out.println(userAgent);
		ModelAndView mv = new ModelAndView("/layout/main");
		mv.addObject("user", user);
		return mv;
	}*/
	
	
	/**
	 * 能作为参数的第六种：Cookie 
	 * 可以获取来至于浏览器的Cookie数据
	 * @param user
	 * @param jsessionid
	 * @return
	 */
	/*@RequestMapping(value="/login")
	public ModelAndView login(UserBean user,@CookieValue(value="JSESSIONID") String jsessionid){
		
		System.out.println(user);
		System.out.println(jsessionid);
		
		ModelAndView mv = new ModelAndView("/layout/main");
		mv.addObject("user", user);
		return mv;
	}*/
	
	
	
	/**
	 * 能作为参数的第五种：PrintWriter
	 * PrintWriter 既可以处理字节流，也可以处理字符流，
	 * 通常与Ajax配合使用，返回类型Void
	 * @param user 通过Ajax传递的数据
	 * @param out 输出流
	 * @param res
	 */
	/*@RequestMapping(value="/login")
	public void login(UserBean user,PrintWriter out,HttpServletResponse res){
		res.setCharacterEncoding("UTF-8");
		System.out.println(user);
		
		//Ajax实现页面缓存，单位：秒
		res.setHeader("Cache-Control", "max-age=60");
		
		out.print(true);//登录成功
	}*/
	
	
	
	
	/**
	 * 能作为参数的第四种：Map作为参数
	 * 功能是：向Map中设值等同于向request中设值
	 * @param user
	 * @return
	 */
/*	@RequestMapping(value="/login")
	public ModelAndView login(UserBean user,Map map){
		
		System.out.println(user);
		
		ModelAndView mv = new ModelAndView("/layout/main");
		
		
		map.put("user", user);
		return mv;
	}*/
	
	/**
	 * 能作为参数的第三种：表单提交项所封装的JAVA对象
	 * 要求：对象的属性名与表单提交项要一致
	 * 该方式将会被大面积使用
	 * @param user
	 * @return
	 */
	//HTTP Status 405 - Request method 'POST' not supported
	//HTTP Status 400 - Parameter conditions "userName" not met for actual request parameters: pwd={}
	/*@RequestMapping(value={"/login"},method=RequestMethod.GET,params={"userName"})
	public ModelAndView login(UserBean user){
		
		System.out.println(user);
		
		ModelAndView mv = new ModelAndView("/layout/main");
		mv.addObject("user", user);
		return mv;
	}*/
	
	/**
	 * 能作为参数的第二种：表单提交项
	 * @return
	 */
	/*@RequestMapping(value="/login")
	public ModelAndView login(String userName,@RequestParam(value="pwd",defaultValue="123456")String pwd){
		UserBean user = new UserBean(userName, pwd);
		
		System.out.println(user);
		
		
		ModelAndView mv = new ModelAndView("/layout/main");
		mv.addObject("user", user);
		return mv;
	}*/
	
	/**
	 * 能作为参数的第一种：请求作用域对象：
	 * HttpServletRequest,HttpServletResponse,HttpSession
	 * 特点：个数与顺序自定义
	 * @param req
	 * @return
	 */
	/*@RequestMapping(value="/login")
	public ModelAndView login(HttpServletRequest req,HttpSession session){
		
		String userName = req.getParameter("userName");
		String pwd = req.getParameter("pwd");
		
		
		
		UserBean user = new UserBean(userName, pwd);
		session.setAttribute("u", user);
		
		
		ModelAndView mv = new ModelAndView("/layout/main");
		mv.addObject("user", user);
		return mv;
	}*/
	
	

}
