<%@ page %>

<%-- Creating a DTO object to hold the data of the user --%>
<jsp:useBean id="dto" class='in.ineuron.dto.EmployeeDto' scope="request"/>

<%-- Setting the values to the DTO object --%>
<jsp:setProperty name='dto' property='*'/>

<%-- Creating a Service Object to hold the data of the user at the application level--%>
<jsp:useBean id="service" class='in.ineuron.service.SalaryDetailsGeneratorImpl' scope="application"/>

<%
	service.generateSalaryDetails(dto);
%>

<br/><br/>
<%-- Displaying the details in table format --%>
<table border='1' align='center' bgcolor='cyan'>
	<caption>Salary Details</caption>
	<tr>
		<th>Employee ID</th>
		<td>
			<jsp:getProperty property="eno" name="dto"/>
		</td>
	</tr>
	<tr>
		<th>Employee Name</th>
		<td>
			<jsp:getProperty property="ename" name="dto"/>
		</td>
	</tr>
	<tr>
		<th>Employee Salary</th>
		<td>
			<jsp:getProperty property="bsalary" name="dto"/>
		</td>
	</tr>
	<tr>
		<th>Gross Salary</th>
		<td>
			<jsp:getProperty property="grossSalary" name="dto"/>
		</td>
	</tr>
	<tr>
		<th>Net Salary</th>
		<td>
			<jsp:getProperty property="netSalary" name="dto"/>
		</td>
	</tr>
</table>
<br/><br/>
<h1 style='text-align: center;'>
	<a href='./index.html'>|HOME PAGE|</a>
</h1>