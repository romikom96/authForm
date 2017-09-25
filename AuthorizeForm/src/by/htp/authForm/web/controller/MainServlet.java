package by.htp.authForm.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.htp.authForm.web.command.ActionType;
import by.htp.authForm.web.command.BasicAction;
import by.htp.authForm.web.command.CommandChooser;
import by.htp.authForm.web.command.SessionLocator;

@WebServlet("/sessionservlet")

public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//HttpSession = session = request.getSession(true);
		HttpSession session = null;
		if (SessionLocator.flag) {
			session = request.getSession();
			session.setMaxInactiveInterval(10);
			SessionLocator.flag = false;
		} else {
			session = request.getSession(false);
			if (session == null) {
				SessionLocator.flag = true;
			}	
		}

		if (session.getAttribute("role") == null) {
			session.setAttribute("role", "moderator");
		}
		
		Integer counter = (Integer) session.getAttribute("counter");
		
		if (counter == null) {
			session.setAttribute("counter", 1);
		} else {
			counter++;
			session.setAttribute("counter", counter);
		}

		String page = proceedRequestHandle(request, response);
		request.setAttribute("lifecycle", "CONTROL request LIFECYCLE");
		request.getRequestDispatcher(page).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String page = proceedRequestHandle(request, response);
		request.getRequestDispatcher(page).forward(request, response);

	}

	private String proceedRequestHandle(HttpServletRequest request, HttpServletResponse response) {

		String command = request.getParameter("command");
		ActionType actionType = ActionType.valueOf(command.toUpperCase());
		BasicAction action = CommandChooser.performAction(actionType);

		String page = action.executeAction(request, response);

		return page;
	}

}
