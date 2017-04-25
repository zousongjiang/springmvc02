package org.framestudy.springmvc02.sysmag.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MySecondInterceptor implements HandlerInterceptor {

	/**
	 * 拦截目标方法执行之前的方法
	 * 适用场合：退出系统之前，记录退出系统日志
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("MySecondInterceptor---------preHandle");
		
		
		//如果在此处方法返回为false，那么目标方法将不被执行
		return true;
	}

	/**
	 * 拦截目标方法执行之后的方法
	 * 适用场合：登录之后，记录登录日志
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MySecondInterceptor---------postHandle");
	}
	/**
	 * 所有的拦截器中方法执行完毕之后的方法
	 * 通常用于关闭连接，或者收尾的工作
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MySecondInterceptor---------afterCompletion");
	}

}
