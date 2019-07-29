<%@include file="../includes/header.jsp" %>
<%@include file="../includes/navbar.jsp" %>
<%@include file="../includes/mensajes.jsp"%>
   
  	<!-- necesito una base href para que funcione qu esta en el header -->
    <form action="calcular" method="post">
   		<input type="text" name="num1"><br>
   		<input type="text" name="num2"><br>
   		
   		
   		<select name="op" value="${(opc)?'selected':''}" >
		  <option name="suma" value="s">sumar(+)</option>
		  <option name="resta" value="r">restar(-)</option>
		  <option name="division" value="d">dividir(/)</option>
		  <option name="multiplicacion" value="m">multiplicar(*)</option>
		</select>
		<input type="submit" name="calcu" value="calcular">
   		
   		<p>El resultado es: ${resul}</p>
   		<p>Opcion seleccionada:${opc}</p>
   		<p>la opcion seleccionada es: ${(opc)?'selected':''}</p>
   </form>
   
   
<%@include file="../includes/footer.jsp" %>