<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mantenimiento de Películas</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body class="container">
<header>
	<div class="jumbotron text-center">
		<h1>Mantenimiento</h1>
	</div>
</header>
<main>
<div class="align-items-center text-center my-3">
<a href="mantenimiento?accion=nueva" class="btn btn-info ">Nueva película</a>
</div>
<div>
<table class="table table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>Titulo</th>
					<th>Fecha</th>
					<th>Director</th>
					<th>Acciones</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="peliculas" items="${peliculas}">
					<tr>
						<td>${peliculas.id_peliculas}</td>
						<td>${peliculas.titulo}</td>
						<td>${peliculas.fecha}</td>
						<td>${peliculas.director}</td>
						<td><a
							href="mantenimiento?accion=editar&id=${peliculas.id_peliculas}">Editar</a></td>
						<td><a
							href="mantenimiento?accion=eliminar&id=${peliculas.id_peliculas}">Eliminar</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
</div>
</main>
</body>
</html>