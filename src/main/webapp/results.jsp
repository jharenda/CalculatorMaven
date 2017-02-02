<%-- 
    Document   : results
    Created on : Jan 30, 2017, 7:43:25 PM
    Author     : Jennifer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator Results</title>
        <link href="https://fonts.googleapis.com/css?family=Nova+Mono" rel="stylesheet">
        <link rel="stylesheet" href="Calculator.css">
        
    </head>
    <body>
        <h1>The area of a <%=request.getAttribute("shape")%></h1>
        <p>
            <%//=request.getAttribute("area")%>
        In Expression Language:
        ${area}
        </p>
        
        <FORM><INPUT Type="button" VALUE="Back" onClick="history.go(-1);return true;"></FORM>
    </body>
</html>
