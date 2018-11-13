<%-- 
    Document   : failure
    Created on : Oct 10, 2018, 4:12:46 AM
    Author     : Alex@Mahomana.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>


<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
	<div style="color: red">
		<html:errors />
	</div>


	<div class="container">
		<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Tax Income Calculation</a>
			</div>

		</div>
		</nav>

		<html:form action="/taxCalculator">

			<div class="input-group">
				<span class="input-group-addon">Age</span>
				<html:text name="taxCalculatorForm" styleClass="form-control"
					property="age" />
			</div>

			<div class="input-group">
				<span class="input-group-addon">Tax Year</span>
				<html:select name="taxCalculatorForm" property="taxYear"
					styleClass="form-control">
					<html:option value="-1">Select Year</html:option>
					<html:option value="2017">2017</html:option>
					<html:option value="2018">2018</html:option>
				</html:select>

			</div>

			<div class="input-group">
				<span class="input-group-addon">Total Taxable Income</span>
				<html:text name="taxCalculatorForm" styleClass="form-control"
					property="totaltaxableIncome" />
			</div>

			<div class="input-group">
				<span class="input-group-addon">IsMonthly</span>
				<html:checkbox name="taxCalculatorForm"
					styleClass="custom-control-input" property="isMonthly" />

			</div>

			<div class="input-group">
				<span class="input-group-addon">Number Of Medical Aid Members</span>
				<html:text name="taxCalculatorForm" styleClass="form-control"
					property="numofMedicalAidMember" />
			</div>
			<html:submit styleClass="btn btn-primary" value="Calculate" />

		</html:form>
	</div>

</body>
</html>


