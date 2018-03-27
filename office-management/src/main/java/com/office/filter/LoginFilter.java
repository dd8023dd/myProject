package com.office.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author zhangmj
 * @date 2018年3月14日
 */
public class LoginFilter implements Filter{

	/* 
	 * @parameter 
	 * @return 
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	     HttpServletRequest req = (HttpServletRequest)request;
	     HttpServletResponse resp =(HttpServletResponse) response;
	     HttpSession session = req.getSession();
	     String path = req.getRequestURI();
	     String id =(String)session.getAttribute("sessionId");
	     if(path.indexOf("ogin")>-1 || path.indexOf("js")>-1 || path.indexOf("css")>-1 || path.indexOf("img")>-1){
	    	 chain.doFilter(req, resp);
	    	 return;
	     }else {
	    	 if((id == null || "".equals(id))){
	    		 resp.sendRedirect(req.getContextPath()+"/login.do");
	 		}else if(id.equals(session.getId())){
	 			chain.doFilter(req, resp);
	 		}
	     }
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
