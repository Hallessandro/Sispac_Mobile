<%-- 
    Document   : opcoesReserva
    Created on : 26/03/2016, 20:12:40
    Author     : Hallessandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="css/jquery.mobile-1.4.5.min.css"/>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<link rel="stylesheet" href="css/geralCSS.css"/>
<script src="js/jquery-1.12.0.min.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<script type="text/javascript" src="js/jquery.mobile-1.4.5.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Opções Reserva</title>
    </head>
    <body>
        <div data-role="page">
            <div data-role="header" data-theme="b">
                <h3>SISPAC</h3>
            </div>
            
            <div data-role="content">
                <form method="post" action="opcoesServlet">
                    <h4>Reserva de Sala</h4>
                    
                    <select name="opcao">
                        <option value="reserva">Reservar Sala</option>
                        <option value="viewReserva">Visualizar Reserva</option>
                        <option value="viewReservaDia">Reservas do Dia</option>
                    </select>
                    
                    <input type="submit" value="Selecionar">
                </form>
            </div>
        </div>
    </body>
</html>