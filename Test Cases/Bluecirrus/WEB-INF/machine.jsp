<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bluecirrus Mvc Form</title>
</head>

<body>

<h2>Physicla Machine Information</h2>
<form:form method="POST" action="/HelloWeb/addMachine">
   <table>
    <tr>
        <td><form:label path="serial_number">Serial No:</form:label></td>
        <td><form:input path="serial_number" /></td>
    </tr>
    <tr>
        <td><form:label path="system_family">System Family:</form:label></td>
        <td><form:input path="system_family" /></td>
    </tr>
    <tr>
        <td><form:label path="location">Location</form:label></td>
        <td><form:input path="location" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>
