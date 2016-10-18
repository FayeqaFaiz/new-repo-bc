<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Physical Machine</title>
</head>
<body>
<body>
		<h2>Add Machine Info</h2>
		<form:form method="POST" action="/sdnext/save.html">
	   		<table>
			    <tr>
			        <td><form:label path="serial_no">Serial Number:</form:label></td>
			        <td><form:input path="serial_no" value="${machine.serial_no}" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="system_family">System Family:</form:label></td>
			        <td><form:input path="system_family" value="${machine.system_family}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="ipaddress">IP Address:</form:label></td>
			        <td><form:input path="ipaddress" value="${machine.ipaddress}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="department_code">Department Code:</form:label></td>
			        <td><form:input path="department_code" value="${machine.department_code}"/></td>
			    </tr>
			    
			    <tr>
			        <td><form:label path="location">Location:</form:label></td>
                    <td><form:input path="location" value="${machine.location}"/></td>
			    </tr>
			    <tr>
			      <td colspan="2"><input type="submit" value="Submit"/></td>
		      </tr>
			</table> 
		</form:form>
		
  <c:if test="${!empty machines}">
		<h2>List Machines</h2>
	<table align="left" border="1">
		<tr>
			<th>Serial Number</th>
			<th>System Family</th>
			<th>IP Address</th>
			<th>Department Code</th>
			<th>Location</th>
			<th>Actions on Row</th>
		</tr>

		<c:forEach items="${machines}" var="machine">
			<tr>
				<td><c:out value="${machine.serial_no}"/></td>
				<td><c:out value="${machine.system_family}"/></td>
				<td><c:out value="${machine.ipaddress}"/></td>
				<td><c:out value="${machine.department_code}"/></td>
				<td><c:out value="${machine.location}"/></td>
				<td align="center"><a href="edit.html?serial_no=${machine.serial_no}">Modify</a> | <a href="delete.html?serial_no=${machine.serial_no}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>