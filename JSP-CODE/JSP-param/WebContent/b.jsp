<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>second page</title>
</head>
<body>
	<h1>
		<b>from b.jsp</b><br/>
		<%= new java.util.Date() %><br/><br/>
	</h1>

	<h1 style='color: blue; text-align: center;'>
		CustomerName is ::<%= request.getParameter("customerName") %><br />
		BillAmount is ::<%= request.getParameter("billAmount") %><br />
	</h1>
</body>
</html>