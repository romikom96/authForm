package by.htp.authForm.web.command;

import by.htp.authForm.web.command.impl.BasicActionImpl;

public class CommandChooser {
	
	public static BasicAction performAction(ActionType action) {

		BasicAction basicAction = null;

		switch (action) {
		case LOGIN:
			basicAction = new BasicActionImpl();
			break;
		}

		return basicAction;
	}

}
