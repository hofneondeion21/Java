package com.HakuWei.HttpSession;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4953546175985197986L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		
		int k = Integer.parseInt(req.getParameter("k"));
		
		
	}

}
