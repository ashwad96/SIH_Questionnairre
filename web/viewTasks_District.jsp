<%-- 
    Document   : visit
    Created on : 30 Mar, 2018, 5:36:21 PM
    Author     : Ishita
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
    </head>
    <body>
        <%
            
            Connection connection = null;
              try
		{
			String connectionURL = "jdbc:mysql://localhost:3306/FINAL_DB";
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL, "root", "ishita");
                        System.out.println("--------DB");
			
		} catch (Exception e)
		{
			throw e;
		}
              
           %>
 

                <%
                String   dis   = request.getParameter("district");
                String description  , deadline , OID;
                
                PreparedStatement stmt = connection.prepareStatement(" Select * FROM TASK WHERE AID IN (select AID FROM ADDRESS WHERE DISTRICT = '"+dis+"') ");
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()){
                    description = rs.getString("DESCRIPTION");
                    deadline = rs.getString("DEADLINE");
                    OID = rs.getString("OID");
                    

                    
                  %>
                  
                  <h1>
                    <%  out.println(description); %>
                   
                  </h1>
  
              </div>
          
                  
                  <%
                    
                }
                
		 
               
                
                %>
 
       
    </body>
</html>