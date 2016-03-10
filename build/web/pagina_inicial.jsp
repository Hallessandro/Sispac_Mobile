<%-- 
    Document   : pagina_inicial
    Created on : 05/03/2016, 22:22:24
    Author     : Hallessandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/jquery.mobile-1.4.5.min.css"/>
        <script src="js/jquery-1.12.0.min.js"></script>
        <script type="text/javascript" src="js/jquery.mobile-1.4.5.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
    </head>
    <body>
        <div data-role="page">
            <div data-role="header">
                <h3>SISPAC</h3>
            </div>
          
            <div data-role="navbar">
                <ul>
                    <li><a href="frequencia.jsp" data-role="button">Registrar frequência</a></li>
                    <li><a href="index.jsp" data-role="button">Sair</a></li>
                </ul>
            </div>
            
            <div data-role="content">
                <br>
                <h4>Bem vindo ${usuario.nome}</h4>
                <br>
                <ul data-role="listview" data-inset="true">
                    <li><a href="reserva_sala.jsp">Reserva de Sala</a></li>
                    <li><a href="frequencia.jsp">Registrar Frequência</a></li>
                    <li><a href="vfrequencia.jsp" data-rel="dialog">Visualizar Frequência</a></li>
                    <li><a href="vreservas.jsp" data-rel="dialog">Visualizar Reservas de Salas</a></li>
                    <li><a href="index.jsp">Sair</a></li>
                </ul> 
            </div>
        </div>
    </body>
</html>
