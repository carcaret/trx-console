<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<link type="text/css" href="<c:url value='/ui/jquery-ui.min.css'/>" rel="stylesheet" />
		<link type="text/css" href="<c:url value='/ui/jquery-ui.structure.min.css'/>" rel="stylesheet" />
		<link type="text/css" href="<c:url value='/ui/jquery-ui.theme.min.css'/>" rel="stylesheet" />
		<link type="text/css" href="<c:url value='/css/style.css'/>" rel="stylesheet" />
		<link type="text/css" href="<c:url value='/css/chartist.min.css'/>" rel="stylesheet" />
		
		<script type="text/javascript" src="<c:url value='/js/jquery-1.11.3.min.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/js/jquery-ui.min.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/js/chartist.min.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/js/report.js'/>"></script>
	</head>
	
	<body>
		<h2>Hello World!</h2>
		<select name="reportType" id="reportType">
			<option selected="selected">General</option>
		</select>
		<select name="serviceType" id="serviceType">
			<option selected="selected" value="urn:safelayer:tws:services:ds">Firma</option>
			<option value="urn:safelayer:tws:services:dsv">Verificacion</option>
		</select>
		Fecha: <input type="text" id="date"/>
		<button id="consulta">Consulta</button>
		<div class="ct-chart ct-perfect-fourth" />
	</body>
</html>
