
<h1 style='color: red; text-align: center;'>Getting values from Student Object</h1>
<jsp:useBean id="student" class='in.ineuron.bean.Student' scope="session" />

<center>
	<!--  Reading values from bean and printing on the console -->
<%-- 	<b>SID:: <jsp:getProperty name="student" property="sid" /></b><br /> <b>SNAME:: --%>
<%-- 		<jsp:getProperty name="student" property="sname" /></b><br /> <b>SAGE:: --%>
<%-- 		<jsp:getProperty name="student" property="sage" /></b><br /> <b>SADDR:: --%>
<%-- 		<jsp:getProperty name="student" property="saddress" /></b><br /> <br /> --%>
<!-- 	<br /> -->


	<table border='1'>
		<tr>
			<td>SID</td>
			<td><jsp:getProperty name='student' property="sid" /></td>
		</tr>
		<tr>
			<td>SNAME</td>
			<td><jsp:getProperty name='student' property="sname" /></td>
		</tr>
		<tr>
			<td>SAGE</td>
			<td><jsp:getProperty name='student' property="sage" /></td>
		</tr>
		<tr>
			<td>SADDRESS</td>
			<td><jsp:getProperty name='student' property="saddress" /></td>
		</tr>
	</table>
</center>
