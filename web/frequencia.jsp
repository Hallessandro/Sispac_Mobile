<%-- 
    Document   : frequencia
    Created on : 05/03/2016, 22:21:50
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
            <div data-role="header" data-position="fixed">
                <h3>SISPAC</h3>
            </div>
            
            <div data-role="navbar">
                <ul>
                    <li><a href="reserva_sala.jsp" data-role="button">Reserva de Sala</a></li>
                    <li><a href="index.jsp" data-role="button">Sair</a></li>
                </ul>
            </div>
            
            <div data-role="content">
                <p><legend>Registro de Frequência</legend></p>
                
                <form method="post" action="frequenciaServlet">
                    <label for="matricula_professor">Matrícula</label>
                        <input type="text" name="matricula_professor">
                    <label for="nome_professor">Nome</label>
                        <input type="text" name="nome_professor">    
                    <label for="data">Data</label>
                        <input type="text" name="data">    
                    <label for="horario">Horario</label>
                        <select name="horario">
                            <option value="1T">1T</option>
                            <option value="2T">2T</option>
                            <option value="3T">3T</option>
                        </select>
                    <label for="num_sala">Sala</label>
                        <select name="sala">
                            <option value="A101">A101</option>
                            <option value="A102">A102</option>
                            <option value="A103">A103</option>
                        </select>
                    
                    <input type="submit" data-role="button" value="Registrar">
                </form>
            </div>
        </div>
    </body>
</html>
