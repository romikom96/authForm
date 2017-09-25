package by.htp.authForm.web.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

public class Listener implements ServletRequestListener {
    
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
		System.out.println("--------------------Request from " + request.getContextPath() + " was destroyed!--------------------");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
		System.out.println("--------------------Request from " + request.getContextPath() + " was created--------------------");
	}
	

}