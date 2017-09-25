package by.htp.authForm.web.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BasicAction {

	String executeAction(HttpServletRequest request, HttpServletResponse response);

}
