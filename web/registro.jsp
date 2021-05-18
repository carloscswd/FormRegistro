<%-- 
    Document   : registro
    Created on : 15/05/2021, 12:49:39
    Author     : carlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            .registercontainer{
                width: 100%;
                height: auto;
                text-align: center;
            }
        </style>
        
    </head>
    <body>
        
        
        <div class="registercontainer">
            
            <form action="registrar" method="post">
                
                <label>Nome Completo</label><br/>
                <input type="text" placeholder="Digite Nome Completo" name="ncompleto"><br/>
                
                <label>Nome de Usuário</label><br/>
                <input type="text" placeholder="Digite Nome de Usuário" name="unome"><br/>
                
                
                <label>E-mail</label><br/>
                <input type="email" placeholder="Digite E-mail" name="email"><br/>
                
                
                <label>Senha</label><br/>
                <input type="senha" placeholder="Digite Senha" name="paw"><br/>
                
                <span style="display: none;">Insira no mínimo 8 caracteres</span>
                
                <label>Confirme Senha</label><br/>
                <input type="senha" placeholder="Confirme sua senha" name="cnfpaw"><br/>
                <span style="display: none;">As senhas precisam ser identicas</span><br/><br/>
                
                
                <input type="submit" value="REGISTRAR"><br/>
            </form>
            
        </div>
        
    </body>
</html>
