<%@include file="../includes/header.jsp" %>
<%@include file="../includes/navbar.jsp" %>
<%@include file="../includes/mensajes.jsp"%>
   
  	<h1>Idiomas</h1>
  	
	
	${mensajeIdioma}
	
	
	<ol>
		<li><a href="i18n?idiomaSeleccionado=es_ES"><img src="resources/img/banderaEspaña.jpg" width="30" height="30"></a>
		<li><a href="i18n?idiomaSeleccionado=en_EN"><img src="resources/img/bandera_inglesa.jpg" width="30" height="30"></a></li>
		<li><a href="i18n?idiomaSeleccionado=eu_ES"><img src="resources/img/bandera-pais-vasco.png" width="30" height="20"></a></li>
	</ol>
	<h2>Recuperar properties desde JSP</h2>
	

	<%
		//@see includes/header.jsp para la gestion del idioma
	%>

	<p>locale:  ${locale}</p>

	<p class="h3 text-danger"><fmt:message key="menu.ejemplos" /></p>
	<p class="h3 text-danger"><fmt:message key="menu.inicio" /></p>

   
<%@include file="../includes/footer.jsp" %>