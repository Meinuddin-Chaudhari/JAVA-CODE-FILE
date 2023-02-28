<%@ page isELIgnored="false" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Output</title>
</head>
<body>	

	<%
	List<String> AL = new ArrayList<String>();
	AL.add("MI");
	AL.add("RCB");
	AL.add("CSK");
	AL.add("GT");
	request.setAttribute("stringList", AL);
	%>
<br/><br/>
<%--Enhanced for loop to iterate collection and array --%>

<c:forEach var="hello" items="${stringList}">
	<h1>Name is :: ${hello}</h1>
</c:forEach>

</body>
</html>