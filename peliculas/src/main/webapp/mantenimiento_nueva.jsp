<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nueva película:</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<form action="./mantenimiento?accion=insert" method="post">
		<div>
			<div class="form-group">
				<label for="titulo">Título:</label> 
				<input class="form-control" type="text" placeholder="Introduce el titulo" name="titulo" required>
			</div>
			<div class="form-group">
				<label for="fecha">Fecha:</label> 
				<input  class="form-control" type="date" placeholder="Introduce la fecha" name="fecha" required >
			</div>
			<div class="form-group">
				<label for="director">Director:</label> 
				<input class="form-control" type="number" placeholder="Introduce el director" name="director" required>
			</div>
		</div>
		<button type="submit" class="btn btn-info">Añadir</button>
	<a href="mantenimiento" class="btn btn-info">Volver</a>
	</form>
</body>
</html>