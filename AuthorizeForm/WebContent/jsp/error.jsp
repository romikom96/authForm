<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error</title>
</head>
<body>
	<p>Check parameters you've entered!</p>
	Role: ${role}
	<br>
	<hr>
	Counter: ${counter}
	<br>
	<hr>
	MaxInactiveInterval: ${pageContext.session.maxInactiveInterval}
	<br> ID session: ${pageContext.session.id}
	<br> Lifecycle: ${lifecycle}
	<br>${messages}
	<br />
	<a href="welcome.jsp">Back to welcome.jsp</a>
</body>
</html>