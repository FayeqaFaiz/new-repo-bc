<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All Machines</title>
<script>
function goBack() {
    window.history.back();
}
</script>
</head>
<body bgcolor="#F2F3F4  ">
<h1>List Of Machines</h1>


<c:if test="${!empty machines}">
	<table align="left" border="1">
		<tr>
			<th>PHY_SER_ID</th>
			<th>NO_OF_PROCESSORS</th>
			<th>IP_ADDR</th>
			<th>DEPT_ID</th>
			<th>HDD</th>
			<th>HARD_DRIVE_QTY</th>
			<th>MEMORY</th>
			<th>HOST_NAME</th>
			<th>STP_BOND_NO</th>
			<th>HBA_TYPE</th>
			<th>RACK_ID</th>
			<th>OS</th>
			<th>REMARKS</th>
			<th></th>
		</tr>

		<c:forEach items="${machines}" var="machine">
			<tr>
				<td><c:out value="${machine.PHY_SER_ID}"/></td>
				<td><c:out value="${machine.NO_OF_PROCESSORS}"/></td>
				<td><c:out value="${machine.IP_ADDR}"/></td>
				<td><c:out value="${machine.DEPT_ID}"/></td>
				<td><c:out value="${machine.HDD}"/></td>
				<td><c:out value="${machine.HARD_DRIVE_QTY}"/></td>
				<td><c:out value="${machine.MEMORY}"/></td>
				<td><c:out value="${machine.HOST_NAME}"/></td>
				<td><c:out value="${machine.STP_BOND_NO}"/></td>
				<td><c:out value="${machine.HBA_TYPE}"/></td>
				<td><c:out value="${machine.RACK_ID}"/></td>
				<td><c:out value="${machine.OS}"/></td>
				<td><c:out value="${machine.REMARKS}"/></td>
			</tr>
		</c:forEach>
	</table>
	
</c:if>

<br><br><br><br><br><br><br><br><br><br>
<left-align><h3><a href="add.html">Add More Physical Machines</a></h3></left-align>
<br>
<br>
<button onclick="goBack()"> <-BACK </button>
</body>
</html>