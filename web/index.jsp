<%-- 
    Document   : index
    Created on : 15/05/2021, 12:38:31
    Author     : carlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            .container{
                width: 100%;
                height: 80px;
                background: darkgray;
            }
            
            li{
                float: left;
                text-decoration: none;
                list-style: none;
                padding: 10px 10px 10px;
            }
            
            li a {
            color: white;
            text-decoration: none;
            }
        </style>
        
    </head>
    <body>
        <%--aplicando CSS e estilo para melhorar o design--%>
        <div class="container">
            
            <nav>
                <ul>
                    <li><a href="#">HOME</a></li>
                    <li><a href="#">PRODUTOS</a></li>
                    <li><a href="#">CONTATOS</a></li>
                    <li><a href="#">SOBRE</a></li>
                    <li style="float: right"><a href="registro.jsp">REGISTRAR</a></li>
                    <li style="float: right"><a href="login.jsp">CONECTAR</a></li>
                    
                </ul>
            </nav>
            
        </div>
    </body>
</html>
