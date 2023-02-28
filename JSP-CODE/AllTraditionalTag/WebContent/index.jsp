<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<h1 style='color:blue;text-align:center;'>Working with Scripting Elements</h1>
<%!
	java.util.Date d = null;
	String date =null;
%>
<%
	d = new java.util.Date();
	date = d.toString();
%>
<html>
	<head><title>Output</title></head>
	<body bgcolor='lightyellow'>
		<center>
			<b>
				<font size='6' color='red'>
					Today date is <%= date%>
				</font>
			</b>
		</center>
	</body>
</html>
