package by.htp.authForm.web.command;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpSession;

public class SessionLocator {

	private final static String BR = "<br/><hr/>";
	public static boolean flag = true;

	public static ArrayList<String> addMessage(HttpSession session) {
		ArrayList<String> messages = new ArrayList<String>();

		if (session != null) {
			messages.add("Creation Time : " + new Date(session.getCreationTime()) + BR);
			messages.add("Session id : " + session.getId() + BR);
			messages.add("Session alive!" + BR);
		} else {
			messages.add("Session disabled!" + BR);
		}
		return messages;
	}

}
