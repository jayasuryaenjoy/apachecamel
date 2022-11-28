package com.example.demo.interceptor;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class GeneralInterceptor implements HandlerInterceptor {
	
	
	private Logger log =LoggerFactory.getLogger(GeneralInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
//		return HandlerInterceptor.super.preHandle(request, response, handler);
		
		log.info("hello saba");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
//		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
		log.info("hello jaya surya");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
//		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
		log.info("hello rachana");
	}
	

}
