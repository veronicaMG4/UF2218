	<%@include file="../includes/header.jsp" %>
  	<%@include file="../includes/navbar.jsp" %>

<h1>Ejemplo servlet basico sin JSP</h1>
<p>Vamos a crear un servlet para mostrar la request y la reponse</p>
<p>El servlet sera el encargado de pintar la respuesta a pelo sin usar una jsp</p>

<a class="btn btn-primary" href="controlador1">PETICICION GET</a>
<a class="btn btn-primary" href="controlador1?param1=paso_valor1&param2=paso_valor2&p3=manolito&nombreparametro=Veronica">PETICICION GET con parametros</a>
<a class="btn btn-primary" href="controladorNoExistente">PETICICION GET-response 404  </a>

<%@include file="../includes/footer.jsp" %>