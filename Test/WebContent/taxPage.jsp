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
	<%--         <html:form action="/taxCalculator" >
            Age : <html:text name="taxCalculatorForm" property="age" /> <br>
            Tax Year : <html:text name="taxCalculatorForm" property="taxYear" /> <br>
            Total Taxable Income : <html:text name="taxCalculatorForm" property="totaltaxableIncome" /> <br>
            IsMonthly : <input type="checkbox" name="IsMonthly"><br>
            Medical Aid : <html:text name="taxCalculatorForm" property="madicalAid" /> <br>
        <html:submit value="Calculate" />
        </html:form> --%>

	<div class="container">
		<h2>Tax Income Calculation Form</h2>
		<html:form action="/taxCalculator">
			<div class="form-group">
				<label for="age">Age:</label>
				<html:text name="taxCalculatorForm" styleClass="form-control"
					property="age" />
			</div>
			<div class="form-group">
				<label for="taxYear">Tax Year:</label>
				<html:text name="taxCalculatorForm" styleClass="form-control"
					property="taxYear" />
			</div>
			<div class="form-group">
				<label for="totaltaxableIncome">Total Taxable Income:</label>
				<html:text name="taxCalculatorForm" styleClass="form-control"
					property="totaltaxableIncome" />
			</div>
			<div class="form-group">
			    <label for="IsMonthly">IsMonthly:</label>
				<input type="checkbox" name="IsMonthly"/>
			</div>
			<div class="form-group">
				<label for="madicalAid">Medical Aid:</label>
				<html:text name="taxCalculatorForm" property="madicalAid" />
			</div>
			<html:submit styleClass="btn btn-default" value="Calculate" />

		</html:form>
	</div>

</body>
</html>


