<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.Random;" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Four Main JSP Tags</title>


<style>

	.mainTable thead tr th {
	border: 2px ridge rgba(0,200,200,.90);
	}
	
	.mainTable tbody tr td {
	border: 2px ridge rgba(0,200,200,.90);
	}
	
	b {
	color: #F00;
	}
</style>



</head>
<body style = 'font-size: 20px; background-color: rgba(200,200,200,.8);'>
	<div style = 'margin-left:5%; margin-top:2.5%;'>
		<h1> Java Servlet Page's Tags</h1>
		<table class = 'mainTable'>
			<thead>
				<tr>
					<th colspan = '3'>
						Four Types of JSP Tags	
					</th>
				</tr>
				<tr> 
					<th> Name </th>
					<th> Syntax</th>
					<th> Description</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td> Declaration</td>
					<td> &lt%!...%&gt  </td>
					<td> Used outside of Service Method in Servlet; Can create instance Variables (i.e) </td>
					
				</tr>
				<tr>
					<td> Directive </td>
					<td> &lt%@page...%&gt</td>
					<td> Used to import packages. Becomes attribute, thus import <b> = </b> [package.name] </td>
				</tr>
				<tr>
					<td> Expression </td>
					<td> &lt%=...%&gt </td>
					<td> Used in the argument of the print line of method of the Servlet. Fetches data in other words. </td>
				</tr>
				<tr>
					<td> Scriplet </td>
					<td> &lt%...%&gt </td>
					<td> Code that is written in side the service method. </td>
				</tr>
			</tbody>
		</table>
		
		
		<div>
		
			<h2>
				Examples here!
			</h2>
			
			Using the Scriplet Tag to Add two numbers
			<br>
			5 + 5 = 10;
			<%
				int i = 5;
				int j = 5;
			%>
			
			&lt%
				int i = 5;
				int j = 5;
			%&gt
			<br>
			Using Expression tag to print answer!<br>
			&lt%= i+j%&gt
			<%= i+j%>
			
			
			<br>
			Using Declaration and Directive tag to import Random class; We'll generate random number
			<br>
			<%@page import = "java.util.Random"%>
			&lt%@page import = "java.util.Random" %&gt <br>
			
			<%! Random r = new Random();  int rand = r.nextInt(99999)+0; %>
			&lt%! Random r = new Random();  int rand = r.nextInt(99999)+0; %&gt
			<br>
			&lt%=rand%&gt <br>
			Random Number :<b> <%=rand%> </b>
		</div>
	</div>
</body>
</html>