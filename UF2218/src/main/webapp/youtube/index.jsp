<%@page import="com.ipartek.formacion.controller.VideoController"%>
<%@include file="../includes/header.jsp"%>
<%@include file="../includes/navbar.jsp"%>





	<h1>Listado Videos</h1>
	

	
	
	
	${videos}
	
	
	<ul class="list-group">
		<c:forEach items="${videos}" var="video">
			<li class="list-group-item">
			<iframe class="embed-responsive-item" src="https://www.youtube.com/embed/${video.getCodigo()}?rel=0" allowfullscreen></iframe>
			<a href="videos?op=<%=VideoController.OP_DETALLE%>&id=${video.id}">${video.nombre}</a>
			
		</li>
			
		</c:forEach>
	</ul>
	
	
	
	
	
	
	
<%@include file="../includes/footer.jsp"%>