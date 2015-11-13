<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<link type="text/css" href="<c:url value='/ui/jquery-ui.min.css'/>" rel="stylesheet" />
		<link type="text/css" href="<c:url value='/ui/jquery-ui.structure.min.css'/>" rel="stylesheet" />
		<link type="text/css" href="<c:url value='/ui/jquery-ui.theme.min.css'/>" rel="stylesheet" />
		<link type="text/css" href="<c:url value='/css/style.css'/>" rel="stylesheet" />
		
		<script type="text/javascript" src="<c:url value='/js/jquery/jquery-1.11.3.min.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/js/jquery/jquery-ui.min.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/js/chart/Chart.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/js/report.js'/>"></script>
	</head>
	
	<body>
		<h2>Hello World!</h2>
		<div class="menu">
			<span class="menu-element">
				<select name="reportType" id="reportType">
					<option selected="selected">General</option>
					<option>Medias</option>
					<option>Total peticiones con �xito</option>
				</select>
			</span>
			<span class="menu-element">
				<select name="serviceType" id="serviceType">
					<option selected="selected" value="urn:safelayer:tws:services:ds">Firma</option>
					<option value="urn:safelayer:tws:services:dsv">Verificacion</option>
				</select>
			</span>
			<label class="menu-element">
				Fecha: 
				<input type="text" id="date"/>
			</label>
			<label class="menu-element">
				Per�odo: 
				<input type="text" id="interval"/>
			</label>
			<button class="menu-element" id="consulta">Consulta</button>
		</div>
		<div id="canvas-wrapper"/>
	</body>
</html>
