<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Machines</title>
</head>
<body>
<h1>List Machines</h1>
<h3><a href="add.html">Add More Machines</a></h3>

<c:if test="${!empty machines}">
	<table align="left" border="1">
		<tr>
			<th>Serial Number</th>
			<th>System Family</th>
			<th>IP Address</th>
			<th>Department Code</th>
			<th>Location</th>
		</tr>


		<c:forEach items="${machines}" var="machine">
			<tr>
				<td><c:out value="${machine.serial_no}"/></td>
				<td><c:out value="${machine.system_family}"/></td>
				<td><c:out value="${machine.ipaddress}"/></td>
				<td><c:out value="${machine.department_code}"/></td>
				<td><c:out value="${machine.location}"/></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>