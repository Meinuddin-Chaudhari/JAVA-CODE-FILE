<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style='color:blue;text-align:center;'>Working with Declarative tag</h1>
<%!
	int x =10;
	static int y = 20;
	int[] a = {10,20,30};
	public String m1(){
		System.out.println(a[0]);
		System.out.println(x);
		return "working with Declarative tag";
	}
%>	
<%= m1()%>
</body>
</html>