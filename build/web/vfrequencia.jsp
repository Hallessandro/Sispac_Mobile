<%-- 
    Document   : vfrequencia
    Created on : 06/03/2016, 21:27:56
    Author     : Hallessandro
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="br.edu.ifrn.sispac.dao.AdministradorDAO"/>
<jsp:useBean id="professor" class="br.edu.ifrn.sispac.modelo.Professor"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Visualizar Frequência</title>
        <link rel="stylesheet" href="css/jquery.mobile-1.4.5.min.css"/>
        <script src="js/jquery-1.12.0.min.js"></script>
        <script type="text/javascript" src="js/jquery.mobile-1.4.5.min.js"></script>
        <link rel="stylesheet" href="css/themes/sispac.css"/>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body>
        <div data-role="page">
            <div data-role="header" data-theme="b">
                <h3>SISPAC</h3>
            </div>
                
            <div data-role="content">
                
                <form method="post" action="resultado_frequenciaServlet">
                    
                    <label for="id_professor">Professor</label>
                        <select name="id_professor">    
                            <c:forEach var="professor" items="${dao.professor}">
                                <option value="${professor.id_professor}">${professor.nome_professor}</option> 
                            </c:forEach>
                        </select>   
                    <center><h4>Selecione o mês da frequência</h4></center>
                    <select name="mes">
                        <option value="01">Janeiro</option>
                        <option value="02">Fevereiro</option>
                        <option value="03">Março</option>
                        <option value="04">Abril</option>
                        <option value="05">Maio</option>
                        <option value="06">Junho</option>
                        <option value="07">Julho</option>
                        <option value="08">Agosto</option>
                        <option value="09">Setembro</option>
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
