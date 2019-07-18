<%@include file="../includes/header.jsp"%>
<%@include file="../includes/navbar.jsp"%>





	<h1>Listado Videos</h1>
	

	
	
	
	${videos}
	
	
	<ul class="list-group">
		<c:forEach items="${videos}" var="video">
			<li class="list-group-item">
			<iframe class="embed-responsive-item" src="https://www.youtube.com/embed/${video.getCodigo()}?rel=0" allowfullscreen></iframe>
			${video.getId()}
			${video.getNombre()}</li>
			
		</c:forEach>
	</ul>
	
	
<%@include file="../includes/footer.jsp"%>