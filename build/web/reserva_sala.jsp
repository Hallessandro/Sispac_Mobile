<%-- 
    Document   : reserva_sala
    Created on : 05/03/2016, 22:22:14
    Author     : Hallessandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Reserva de sala</title>
    <link rel="stylesheet" href="css/jquery.mobile-1.4.5.min.css"/>
    <script src="js/jquery-1.12.0.min.js"></script>
    <script type="text/javascript" src="js/jquery.mobile-1.4.5.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
    <div data-role="page" id="reserva">
        <div data-role="header" data-position="fixed">
            <h3>SISPAC</h3>
        </div>
        <div data-role="navbar">
            <ul>
                <li><a href="frequencia.jsp" data-role="button">Registrar frequência</a></li>
                <li><a href="index.jsp" data-role="button">Sair</a></li>
            </ul>
        </div>
        <div data-role="content">
            <form method="post" action="reservaServlet">
                   
                <label for="nome">Nome:</label><input type="text" name="nome">
                <label for="matricula">Matricula:</label><input type="text" name="matricula">
                   
                <p><label for="sala">Sala</label>
                    <select name="sala">
                            <option value="101">A101</option>
                            <option value="102">A102</option>
                            <option value="103">A103</option>
                    </select></p>
                    
                    <label for="data">Data</label>
                        <input type="text" name="data">

                    <div data-role="collapsible">
                        <h3>Horários</h3>
                        <label for="horarios">1M</label><input type="checkbox" value="1M" name="horarios">
                        <label for="horarios">2M</label><input type="checkbox" value="2M" name="horarios">
                        <label for="horarios">3M</label><input type="checkbox" value="3M" name="horarios">
                    </div>
                    <input type="submit" data-role="button" value="Reservar">    
            </form>
            <!-- 
            <a href="confirmation.html" data-rel="dialog" data-transition="pop" data-role="button">Reservar Sala</a>
            -->
        </div>
    </div>
</body>
</html>