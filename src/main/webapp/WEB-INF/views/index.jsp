<%-- 
    Document   : index
    Created on : 30 mar 2023, 14:27:35
    Author     : LordKazor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p><%= request.getAttribute("message") %> </p>
                
    </body>
</html>
