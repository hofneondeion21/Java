<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = 'java.sql.*' %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Page JSP</title>
</head>
<body>
	101 <br>
	Haku <br>
	90 <br>
	
	
	
	<%
		String url = "jdbc:sqlite:SampleLoginDB.db";
		final String DRIVER = "org.sqlite.JDBC"; 
		String username = null;
		String password = null;
		Class.forName(DRIVER);
		String sql = "Create Table LoginInfo ( ID integer primary key autoincrement not null, First varchar(32), Last varchar(32), Username varchar(32), password varchar(32) );";
		/* String sql = "SELECT * FROM LoginInfo;";  */
		Connection conn = DriverManager.getConnection(url, username, password);
		/* Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		rs.next(); */
		PreparedStatement st = conn.prepareStatement(sql);
		/* ResultSet rs = st.executeQuery(); // for fetching data DDL */
		
		int rowsAffected = st.executeUpdate(sql); // for inserting or manipulating data >>DML  
		/* ResultSetMetaData rsmd = rs.getMetaData(); */ 
				
		
		/* int col = rsmd.getColumnCount(); */
	%>
	
	 Rows Affected: <%= rowsAffected %>
	
	
		 
		<%--  Number of Columns: <%= col %> <br> <%
		for (int i = 1; i <=col; i++) { %>
				<%=rsmd.getColumnName(i) %>
		<% }; %> <br> <% 
		int i = 1;
		while (rs.next()) {
			%> <%= rs.getString(i) %>
			<%
			i++;
			if (i > col) {
				i = 0;
			}
		};
		st.close(); conn.close();
		%>

	
 --%>	
	
		
	
	<%-- 
	ID : <%= rs.getString(1) %><br>
	Last: <%= rs.getString(2) %> <br>
	First: <%= rs.getString(3) %> <br>
	Origin : <%= rs.getString(4) %>
	 --%>
	<%
		/* st.close(); conn.close(); */
	%>
	
</body>
</html>