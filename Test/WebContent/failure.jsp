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
</head>
<body>
	<div style="color: red">
		<h1>
			Invalid age
			<bean:write name="taxCalculatorForm" property="age"></bean:write>
		</h1>
		<h1>
			Invalid taxYear
			<bean:write name="taxCalculatorForm" property="taxYear"></bean:write>
		</h1>
		<h1>
			Invalid totaltaxableIncome
			<bean:write name="taxCalculatorForm" property="totaltaxableIncome"></bean:write>
		</h1>
		<h1>
			Invalid numOfMedicalAidMember
			<bean:write name="taxCalculatorForm" property="numOfMedicalAidMember"></bean:write>
		</h1>
	</div>
</body>
</html>
