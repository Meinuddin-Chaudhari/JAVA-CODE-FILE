<%-- pageContext implicit object to perform attribute management in any scopes --%>
<%
	pageContext.setAttribute("p", "page");
	request.setAttribute("h", "request");
	session.setAttribute("s", "session");
	application.setAttribute("K", "application");
	
	pageContext.forward("./disp.jsp");
%>
