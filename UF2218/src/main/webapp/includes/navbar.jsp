 <%@page import="com.ipartek.formacion.controller.VideoController"%>
 <link rel="stylesheet" type="text/css" href="resources/vendors/fontawesome-free-5.9.0-web/css/all.min.css">
  <nav class="navbar navbar-expand-lg navbar-dark bg-secondary">
	  <a class="navbar-brand" href="#">JEE <i class="fab fa-java"></i></a>
	 
	 
	  
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	
	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	    <ul class="navbar-nav mr-auto">
	      <li class="nav-item active">
	        <a class="nav-link" href="index.jsp">Inicio <i class="fas fa-igloo"></i></a>
	      </li>
	       <li class="nav-item active">
	        <a class="nav-link" href="backoffice/videos">    Videos <i class="fas fa-database"></i></a>
	      </li>	 	      
	       <li class="nav-item active ml-3">
	       	<c:if test="${usuario == null}">
	        	<a class="nav-link" href="login.jsp">Login <i class="fas fa-door-open"></i></a>
	        	
	        </c:if>
	        <c:if test="${usuario != null}">
	        	
	        	<a class="nav-link" href="logout">Logout  <i class="fas fa-door-closed"></i></a>
	        	<span class="text-white">${usuario}</span>
	        </c:if>		       
	      </li>	
	      
	      <li class="nav-item">
		      <div class="dropdown">
				  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				    Videos Visualizados
				  </button>
				  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
				  	<c:forEach items="${videosVistos}" var="vv"> 
				    	<a class="dropdown-item" href="backoffice/videos?op=<%=VideoController.OP_DETALLE%>&id=${vv.value.id}">(${vv.key}) ${vv.value.nombre}</a>
				    </c:forEach>				    
				  </div>
				</div>
	      </li>
	       	            
	    </ul>	   
	  </div>
	  
	  
	</nav>
    <!-- end navar -->
    
    
    <main class="container">