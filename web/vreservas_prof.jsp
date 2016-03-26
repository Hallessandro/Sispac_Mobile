<%-- 
    Document   : vreservas_prof
    Created on : 25/03/2016, 21:17:45
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
        <title>Reservas de Sala</title>
    </head>
    <body>
        <div data-role="page">
            <div data-role="header">
                <h3>SISPAC</h3>
            </div>
            
            <div data-role="content">
                <form method="post" action="vreservas_profServlet">
                    <h4>Reservas de Sala</h4>
                    
                    <label>Mês</label>
                    <select name="mes">
                        <option value="1">Janeiro</option>
                        <option value="2">Fevereiro</option>
                        <option value="3">Março</option>
                        <option value="4">Abril</option>
                        <option value="5">Maio</option>
                        <option value="6">Junho</option>
                        <option value="7">Julho</option>
                        <option value="8">Agosto</option>
                        <option value="9">Setembro</option>
                        <option value="10">Outubro</option>
                        <option value="11">Novembro</option>
                        <option value="12">Dezembro</option>
                    </select>
                    
                    <input type="submit" value="Buscar">
                </form>
            </div>
        </div>
        
    </body>
</html>
