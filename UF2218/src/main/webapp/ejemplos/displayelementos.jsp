<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>
</head>
<body>

<style>
	 .ejemplo p{
	 	border: 4px solid #000;
	 }
 
 	.ejemplo a{
 		border: 4px solid red;
 	}
 	
 	 .ejemplo2 p{
	 	border: 4px solid #000;
	 }
 
 	.ejemplo2 a{
 		border: 4px solid red;
 	}
 	
 	#rojo{color:red;}
 	
 	h1{color:grey;}
 </style>
 
 <h1>elementos en bloque en negro</h1>
 <h1>elementos en linea en <span id="rojo">rojo</span></h1>
	<div class="ejemplo">
		<p><code>&lt;p&gt;</code>es un elemento de bloque(ocupa todo el ancho)</p>
		<a href="#"><code>&lt;a&gt;</code>elemento inline(ocupa solo su contenido)</a>
		<p>los elementos en bloque pueden tener dentro elementos inline, pero no al reves</p>
	</div>


	<div class="ejemplo2">
		<p>
			esto es un elemento de parrafo<code>&lt;p&gt;</code> (bloque) que encierra a un elemento <code>&lt;a&gt;</code>(inline)<a href="#">elemento inline link o enlace</a> y como estamos en bloque seguimos ocupando todo el espacio
		</p>

	</div>
</body>
</html>