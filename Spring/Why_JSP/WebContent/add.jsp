<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adding via JSP</title>
</head>
<body bgcolor = 'cyan'>

	<!-- implicit objects -->
	<!-- delimeter tags will print out the results of of computation  -->
	JSP <br>
	<%
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	// request object is given 
	
	int k = j+i;
	
	out.println("Result: "+k);
	%>

</body>
</html>