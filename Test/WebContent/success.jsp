<%-- 
    Document   : failure
    Created on : Oct 10, 2018, 4:12:46 AM
    Author     : Alex@Mahomana.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Results</a>
			</div>
		</div>
		</nav>
		<ul class="list-group">
			<li class="list-group-item">Monthly Tax <span class="badge"><bean:write
						name="taxCalculatorForm" property="monthlyPAYE"></bean:write></span></li>
			<li class="list-group-item">Annual Tax <span class="badge"><bean:write
						name="taxCalculatorForm" property="annualPAYE"></bean:write></span></li>
			<li class="list-group-item">Tax Credits <span class="badge"><bean:write
						name="taxCalculatorForm" property="taxCredits"></bean:write></span></li>
			<li class="list-group-item">PAYE Due <span class="badge"><bean:write
						name="taxCalculatorForm" property="duePAYE"></bean:write></span></li>
			<li class="list-group-item">NET Cash <span class="badge"><bean:write
						name="taxCalculatorForm" property="netCash"></bean:write></span></li>
		</ul>
	</div>
</body>
</html>
