package by.htp.authForm.web.command.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.authForm.web.command.BasicAction;

public class BasicActionImpl implements BasicAction {

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) {
		
		String page = "/jsp/error.jsp";
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		System.out.println("Entered parameters: " + login + " " + password);
		
		if(login.equals("user") && password.equals("password")) {
			page = "/jsp/user.jsp";
		}
		
		if(login.equals("admin") && password.equals("password")) {
			page = "/jsp/admin.jsp";
		}
		
		return page;
	}

}
