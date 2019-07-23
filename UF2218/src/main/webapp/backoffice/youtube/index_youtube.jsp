<!DOCTYPE html>
<html lang="es">
	<head>
		<title>Hello</title>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="../css/estilos.css">
		<base href="/helloWeb/">
	</head>
	<body>

		<p class="text-danger">${mensaje}</p>

		<form action="crear-video">
		
			<label for="titulo">Titulo</label>
			<input type="text" 
			       id="titulo" 
			       class="obligatorio"
			       autofocus
			       name="titulo"
			       required
			       pattern=".{2,150}"
			       title="Minimo 2 letras Maximo 150"
			       placeholder="Minimo 2 letras Maximo 150">
			<br>
			
			<label for="codigo">Codigo: </label>
			<input type="text" 
				   id="codigo" 
				   name="codigo" 
				   required
			       pattern=".{11,11}"
			       title="Exactamente 11 caracteres"
				   placeholder="Exactamente 11 caracteres">
			<br>
		
			<input type="submit" value="Crear Video">
			<input type="reset" value="limpiar formulario">
		
		</form>
	</body>
</html>		