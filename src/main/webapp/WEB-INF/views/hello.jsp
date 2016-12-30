<%-- 
    Document   : hello
    Created on : Dec 13, 2016, 9:50:24 AM
    Author     : ifnu.b.fatkhan
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
    </body>
    
    this is config value XYZ ${configService.findConfig('abc')}
</html>
