
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.sunday.trybc.model.Machine"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>

<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="x-UA-compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	
<title>All Machines</title>

<link href="assets/css/bootstrap.min.css" rel="stylesheet">
<link href="assets/css/dataTables.bootstrap.min.css" rel="stylesheet">
<!-- <link href="assets/css/search.css" rel="stylesheet"> -->






<!-- <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs-3.3.6/jq-2.2.3/dt-1.10.12/af-2.1.2/datatables.min.css"/> 
 <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/r/bs-3.3.5/jq-2.1.4,dt-1.10.8/datatables.min.css">
 <script type="text/javascript" src="https://cdn.datatables.net/r/bs-3.3.5/jqc-1.11.3,dt-1.10.8/datatables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/v/bs-3.3.6/jq-2.2.3/dt-1.10.12/af-2.1.2/datatables.min.js"></script>
<script src="https://code.jquery.com/jquery-1.12.3.js"></script>
<script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.12/js/dataTables.bootstrap.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"></script>
<script src="https://cdn.datatables.net/1.10.12/css/dataTables.bootstrap.min.css"></script>
<script type="text/javascript" charset="utf-8">
			$(document).ready(function() {
				$('#example').DataTable();
			} );
		</script> -->

</head>

<body>



<p><br/></p>

<div class="container">
	<!-- <input type="text" class="search form-control" placeholder="search"> -->
<h1>List Of Machines</h1>
		 
		<table class="table table-striped table-bordered table-hover" id="dbdata">
			 <c:if test="${!empty machines}"> 
				<thead>
					<tr>
						<!-- <th>#</th> -->
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
					</tr>
	<!-- 				<tr class="warning no-result">
      <td colspan="4"><i class="fa fa-warning"></i> No result</td>
    </tr>
			 -->			
					
				</thead>
					
				<tfoot>
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
						
					</tr>
				</tfoot>	
					
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
					</tr>
				</tbody>
				</c:forEach>
			</c:if>
			</table>
			
		</div>
		
		


	

<script src="assets/js/jquery.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<!-- <script src="assets/js/search.js"></script> -->
<!-- <script src="assets/js/jquery-1.12.3.js"></script> -->
<script src="assets/js/jquery.dataTables.min.js"></script>
<script src="assets/js/dataTables.bootstrap.min.js"></script>
<script>
 $('#dbdata').dataTable(); 
/* $(document).ready(function() {
    $('#dbdata').DataTable( {
       /*  "processing": true,
        "serverSide": true,
        "ajax": "../server_side/scripts/server_processing.php" */
/*     } );
} ); */ 
</script>

<!-- <script type="text/javascript">
	// For demo to fit into DataTables site builder...
	$('#example')
		.removeClass( 'display' )
		.addClass('table table-striped table-bordered');
</script>
 -->



<%-- <c:if test="${!empty machines}"> --%>
<!-- 	<table id="example" class="table table-striped table-bordered" width="100%" cellspacing="0">
	 <thead>
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
		</thead> -->
		
		<!-- <tfoot>
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
		</tfoot>

		
	</table> -->
	


<br><br><br><br><br><br>

<left-align><h3><a href="add.html">Add More Physical Machines</a></h3></left-align>
<br>
<br>
<button onclick="goBack()"> BACK </button>

<script>
function goBack() {
    window.history.back();
}
</script>
</body>
</html>