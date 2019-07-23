<%@page import="com.ipartek.formacion.controller.listener.UsuariosLogeadosListener"%>

<%@include file="../includes/header.jsp"%>
<%@include file="../includes/navbar.jsp"%> 
<%@include file="../includes/mensajes.jsp"%>

 <h1>BACKOFFICE</h1>
 
 
 <%=UsuariosLogeadosListener.nombres%>


<%@include file="../includes/footer.jsp"%>