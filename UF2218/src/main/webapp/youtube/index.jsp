<%@page import="com.ipartek.formacion.controller.VideoController"%>

<%@include file="../includes/header.jsp"%>
<%@include file="../includes/navbar.jsp"%>

	<h1>Listado Videos</h1>
	
	
	<%@include file="../includes/mensajes.jsp"%>
			
	
	<a href="videos?op=<%=VideoController.OP_NUEVO%>" class="mb-3 btn btn-outline-primary">Nuevo Video</a>
	
	<ul class="list-group">
	  <c:forEach items="${videos}" var="v">	
	  	<li class="list-group-item">
	  		<a href="videos?op=<%=VideoController.OP_DETALLE%>&id=${v.id}">
	  			<img class="float-left mr-3" src="https://img.youtube.com/vi/${v.codigo}/default.jpg" alt="Imagen destacda del video ${v.nombre}"/>
	  			<p class="h3">${v.nombre}</p>
	  		</a>
	  	</li>
	  </c:forEach>	  	  
	</ul>

	
	
<%@include file="../includes/footer.jsp"%>