<%-- 
    Document   : vreservas
    Created on : 06/03/2016, 21:30:43
    Author     : Hallessandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Visualizar Reservas</title>
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
            
            <div data-role="content">
                <form action="resultado_reservasServlet" method="post">
                    <h4>Informe a data da busca</h4>
                    <br>
                    <label for="data">Data</label>
                    <input type="date" name="data">
                    
                    <input type="submit" value="Buscar">
                </form>
            </div>
        </div>
    </body>
</html>
