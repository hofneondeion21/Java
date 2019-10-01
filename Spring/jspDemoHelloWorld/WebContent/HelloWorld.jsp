<html>

<head>

<script ></script>

</head>


<body>
	<h2> Hello World of Java!</h2>
		
	<div style = 'border: 1px solid rgba(0,0,0,1);'>
		<p>
		The time on the server is <%= new java.util.Date() %>
		</p>
		
		<p>
		Converting a string to uppercase: <%= new String("string").toUpperCase() %>
		</p>
		
		<p>
		<% 
			for(int i = 0; i < 5; i++) {
				out.println("<br> -- THIS IS CRAZY!"+i);
			}	
		%>
		
		</p>
	
	</div>
	
	
	
</body>
</html>