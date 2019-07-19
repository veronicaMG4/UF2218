<%@page import="com.ipartek.formacion.controller.VideoController"%>

<%@include file="../includes/header.jsp"%>
<%@include file="../includes/navbar.jsp"%>

	<h1>mostrar y crear</h1>
	
	${video}
	
	
	<form action="videos" method="post">
	
			<label for="id">id: </label>
			<input type="text" 
				   id="id" 
				   name="id" 
				   value="${video.id}">
			<br>
		
			<label for="Nombre">Nombre</label>
			<input type="text" 
			       id="nombre" 
			       class="obligatorio"
			       autofocus
			       name="Nombre"
			       value="${video.nombre}">
			<br>
			
			<label for="codigo">Codigo: </label>
			<input type="text" 
				   id="codigo" 
				   name="codigo" 
				   value="${video.codigo}"
				   required
			       
			       title="Exactamente 11 caracteres"
				   placeholder="Exactamente 11 caracteres">
			<br>
			
			
		
			<input type="submit" value="modificar video">
			<input type="submit" value="eliminar video">
			</form>

	
	
<%@include file="../includes/footer.jsp"%>