<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de Registro</title>
</head>
<body>

	<form:form action="procesarFormulario" modelAttribute="alumno">
		Nombre:		
		<form:input path="nombre" />			
		<form:errors path="nombre"/>
		<br><br>
		Apellidos:
		<form:input path="apellido" />
		<br>
		<br>
		Edad:
		<form:input path="edad" />
		<form:errors path="edad"/>
		<br>
		E-mail:
		<form:input path="email" />
		<form:errors path="email"/>
		<br>
		Selecciona asignatura optativa:<br>
		<form:select path="optativas" multiple="true">
			<form:option value="Diseño" label="Diseño" />
			<form:option value="Karate" label="Karate" />
			<form:option value="Comercio" label="Comercio" />
			<form:option value="Danza" label="Danza" />
		</form:select>
		<br>
		<br>
		Seleccionar sexo:
		<br>
		Barcelona <form:radiobutton path="ciudadEstudios" value="Barcelona" />
		<br />
          Madrid: <form:radiobutton path="ciudadEstudios"
			value="Barcelona" />
		<br />
		Valencia:<form:radiobutton path="ciudadEstudios" value="Valencia" />
		<br />
			
		Alicante: <form:radiobutton path="ciudadEstudios" value="Alicante" />
		<br />

		<br>
		<br>		
		
		Ingles:<form:checkbox path="idiomaAlumno" value="Ingles" />
		Frances:<form:checkbox path="idiomaAlumno" value="Frances" />
		Aleman:<form:checkbox path="idiomaAlumno" value="Aleman" />
		<br>
		<input type="submit" value="Enviar">

	</form:form>


</body>
</html>