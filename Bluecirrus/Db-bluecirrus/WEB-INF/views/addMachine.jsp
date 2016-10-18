<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<title>Machine Form</title>
<meta name="viewport" content="width=device-width">
<link href="style.css" rel="stylesheet">

</head>
<body>
<div class="container">
  <div class="jumbotron">
   <center> <h1>Bluecirrus</h1></center>
    </div>
    <br>
  </div>
  <div class="row-fluid">
  <div class="span6 offset6">
    <div id="maincontent" class="span8"> 
      
      <form id="registration-form" class="form-horizontal">
       
          <h2>Add Physical Machine details</h2>
          <br/>
          
          <div class="form-control-group">
            <label class="control-label" for="PHY_SER_ID">PHY_SER_ID</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="PHY_SER_ID" id="PHY_SER_ID">
            </div>
          </div>
          
          <div class="form-control-group">
            <label class="control-label" for="NO_OF_PROCESSORS">NO_OF_PROCESSORS</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="NO_OF_PROCESSORS" id="NO_OF_PROCESSORS">
            </div>
          </div>
          
          <div class="form-control-group">
            <label class="control-label" for="IP_ADDR">IP_ADDR</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="IP_ADDR" id="IP_ADDR">
            </div>
          </div>
          
          <div class="form-control-group">
            <label class="control-label" for="DEPT_ID"> DEPT_ID</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="DEPT_ID" id="DEPT_ID">
            </div>
          </div>
          
          <div class="form-control-group">
            <label class="control-label" for="HDD">HDD</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="HDD" id="HDD">
            </div>
          </div>
          <div class="form-control-group">
            <label class="control-label" for="HARD_DRIVE_QTY">HARD_DRIVE_QTY</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="HARD_DRIVE_QTY" id="HARD_DRIVE_QTY">
            </div>
          </div>
          
           <div class="form-control-group">
            <label class="control-label" for="MEMORY">MEMORY</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="MEMORY" id="MEMORY">
            </div>
          </div>
          
            <div class="form-control-group">
            <label class="control-label" for="HOST_NAME">HOST_NAME</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="HOST_NAME" id="HOST_NAME">
            </div>
          </div>
          
            <div class="form-control-group">
            <label class="control-label" for="STP_BOND_NO">STP_BOND_NO</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="STP_BOND_NO" id="STP_BOND_NO">
            </div>
          </div>
          
          <div class="form-control-group">
            <label class="control-label" for="HBA_TYPE">HBA_TYPE</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="HBA_TYPE" id="HBA_TYPE">
            </div>
          </div>
          
          <div class="form-control-group">
            <label class="control-label" for="RACK_ID">RACK_ID</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="RACK_ID" id="RACK_ID">
            </div>
          </div>
          
          <div class="form-control-group">
            <label class="control-label" for="OS">OS</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="OS" id="OS">
            </div>
          </div>
          
           <div class="form-control-group">
            <label class="control-label" for="REMARKS">REMARKS</label>
            <div class="controls">
              <textarea class="input-xlarge" name="REMARKS" id="REMARKS" rows="3"></textarea>
            </div>
          </div>
          
          <div class="form-control-group">
            <label class="control-label" for="message"> Please agree to our policy</label>
            <div class="controls">
             <input id="agree" class="checkbox" type="checkbox" name="agree">
            </div>
          </div>
          
          <div class="form-actions">
            <button type="submit" class="btn btn-success btn-large">Submit</button>
            <button type="reset" class="btn">Reset</button>
          </div>
  
      </form></center>
   </div>
   <!--  .span --> 
  </div>
 <!--  .row  -->
 </div>
  <div class="container-fluid">
   <c:if test="${!empty machines}">
		
	<table class="table table-bordered">
	<h2>List Of Machines</h2>
	<thread>
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
			
			<th>Actions on Row</th>
		</tr>
		</thread>

		<c:forEach items="${machines}" var="machine">
		<tbody>
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
				
				
				
				<td align="center"><a href="edit.html?PHY_SER_ID=${machine.PHY_SER_ID}">Modify</a> | <a href="delete.html?PHY_SER_ID=${machine.PHY_SER_ID}">Delete</a></td>
                 <!--  <td colspan="2"><input type="submit" value="Submit"/></td> -->
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>
</div>
<!--     </div>
    .span 
  </div>
  .row

  
</div>
.container 
</div>
 -->


<script src="assets/js/jquery-1.7.1.min.js"></script> 

<script src="assets/js/jquery.validate.js"></script> 

<script src="script.js"></script> 
<script>
		addEventListener('load', prettyPrint, false);
		$(document).ready(function(){
		$('pre').addClass('prettyprint linenums');
			});
		</script> 

</body>
</html>
