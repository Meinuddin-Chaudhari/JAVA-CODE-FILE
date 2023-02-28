
<h1 style='color:red; text-align:center;'>Setting values to Student object</h1>

<jsp:useBean id="student" class='in.ineuron.bean.Student' scope="session"/>

<jsp:setProperty name="student" property="sid" value="10"/>
<jsp:setProperty name="student" property="sname" value="sachin"/>
<jsp:setProperty name="student" property="saddress" value="IND"/>
<jsp:setProperty name="student" property="sage" value="49"/>   

<h1 style='color:red; text-align:center;'>	<%= student %></h1><br/><br/>
	
<%--setting the request parameter values to student bean--%>

<jsp:setProperty name='student' property="sid" param="sid"/>
<jsp:setProperty name='student' property="sname" param="sname"/>
<jsp:setProperty name='student' property="saddress" param="saddress"/>
<jsp:setProperty name='student' property="sage" param="sage"/>
<h1 style='color:red; text-align:center;'><%= student %></h1><br/><br/>

<%--if java bean properties and request parameter names are same then map property with '*'--%>
	<jsp:setProperty name='student' property="*"/>
<h1 style='color:green; text-align:center;'><%= student %></h1>