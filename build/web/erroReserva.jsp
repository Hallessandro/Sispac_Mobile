<%-- 
    Document   : erroReserva
    Created on : 27/03/2016, 13:45:24
    Author     : Hallessandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/jquery.mobile-1.4.5.min.css"/>
        <link rel="stylesheet" href="css/geralCSS.css"/>
        <script src="js/jquery-1.12.0.min.js"></script>
        <script type="text/javascript" src="js/jquery.mobile-1.4.5.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Sala já reservada</title>
    </head>
    <body>
        <div data-role="page">
            <div data-role="header" data-theme="b"><h3>SISPAC</h3></div>
            
            <div data-role="content">
                <center><h4>Sala já reservada nesse horário</h4></center>
                <a href="perfil_reserva.jsp" class="ui-btn">Selecionar outro horário</a>
                <a href="logout.jsp" class="ui-btn">Sair</a>
            </div>
        </div>
    </body>
</html>
