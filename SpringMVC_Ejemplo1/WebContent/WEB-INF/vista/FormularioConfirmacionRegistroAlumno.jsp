<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina de Confirmacion de Registro</title>
</head>
<body>
	
	El alumno con nombre <strong>${alumno.nombre}</strong>, apellido <strong>${alumno.apellido}</strong> , edad <strong>${alumno.edad}</strong> , e correo <strong>${alumno.email}</strong> se ha registrado con exito<br>
	La asignatura escogida es : <strong>${alumno.optativas}</strong><br>
	El sexo del alumno es <strong>${alumno.sexo}</strong>
	La ciudad elegida paran estudiar es :<strong>${alumno.ciudadEstudios}</strong><br>
	El idioma selecciondo por el alumno para estudiar este año :<strong>${alumno.idiomaAlumno}</strong>

</body>
</html>