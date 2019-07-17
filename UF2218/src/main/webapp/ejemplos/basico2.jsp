<%@include file="../includes/header.jsp" %>
<%@include file="../includes/navbar.jsp" %>

	<h1>ejemplo basico con jsp</h1>
	<p>hacemos una peticion get a traves del enlace botont de abajo</p>
	<p>cuando recibe la peticion el servlet realizar una rquest interna a esta misma jsp pasandole atributos</p>
	
	<a href="useragent" class="btn btn-outline-info">Detectar navegador que estoy usando</a>
	
	
	<h2>respuesta</h2>
	<p>${navegador}</p>
	<p>${movil}</p>
	<p>${nombre}</p>
	
	

<%@include file="../includes/footer.jsp" %>