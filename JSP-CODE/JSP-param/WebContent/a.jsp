<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First page</title>
</head>
<body>
	<b>Start of JSP</b>
	<%
		float billAmount = 300.0f+(300.0f * 0.03f);
	%>
	<br>
		<jsp:forward page="b.jsp">
			<jsp:param value="divya" name="customerName"/>
			<jsp:param value="<%=billAmount%>" name="billAmount"/>
		</jsp:forward>
	<br>
	<b>End of JSP</b>
</body>
</html>