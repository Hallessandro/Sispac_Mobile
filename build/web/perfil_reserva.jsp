<%-- 
    Document   : perfil_reserva
    Created on : 24/03/2016, 20:00:55
    Author     : Hallessandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/jquery.mobile-1.4.5.min.css"/>
        <script src="js/jquery-1.12.0.min.js"></script>
        <script type="text/javascript" src="js/jquery.mobile-1.4.5.min.js"></script>
        <title>Reserva de Sala</title>
    </head>
    <body>
        <div data-role="page">
            <div data-role="header"><h3>SISPAC</h3></div>
            
            <div data-role="content">
                <h4>Reservar Sala para?</h4>
                <form action="perfil_reservaServlet" method="post">
                    <select name="perfil_reserva">
                        <option value="professor">Professor</option>
                        <option value="funcionario">Funcionário</option>
                        <option value="aluno">Aluno</option>
                    </select>

                    <input type="submit" value="Confirmar">
                </form>
            </div>
        </div>
    </body>
</html>
