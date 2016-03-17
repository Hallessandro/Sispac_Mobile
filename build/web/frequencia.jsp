<%-- 
    Document   : frequencia
    Created on : 05/03/2016, 22:21:50
    Author     : Hallessandro
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="br.edu.ifrn.sispac.dao.SalasDAO"/>
<jsp:useBean id="sala" class="br.edu.ifrn.sispac.modelo.Sala"/>
<jsp:useBean id="admdao" class="br.edu.ifrn.sispac.dao.AdministradorDAO"/>
<jsp:useBean id="professor" class="br.edu.ifrn.sispac.modelo.Professor"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/jquery.mobile-1.4.5.min.css"/>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="js/jquery-1.12.0.min.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <script type="text/javascript" src="js/jquery.mobile-1.4.5.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script>
            $(function() {
              var availableTags = new Array());

              $('#tags').bind("keydown", function (event){
                  var data = {nome:$('#tags').val()};
                  $.getJSON("frequenciaServlet", data, function(res,est, jqXHR){
                      availableTags.length = 0;
                      $.each(res, function (i, item){
                          availableTags[i] = item;
                      });
                  });
              });

              $( "#tags" ).autocomplete({
                source: availableTags,
                minLength = 1;
              });
            });
    </script>
    </head>
    <body>
        <div data-role="page">
            <div data-role="header" data-position="fixed">
                <h3>SISPAC</h3>
            </div>
            
            <div data-role="navbar">
                <ul>
                    <li><a href="index.jsp" data-role="button">Sair</a></li>
                </ul>
            </div>
            
            <div data-role="content">
                <p><legend>Registro de Frequência</legend></p>
                
                <form method="post" action="frequenciaServlet">
                    <label for="nome_professor">Professor</label>
                        <select name="id_professor">    
                            <c:forEach var="professor" items="${admdao.professor}">
                                <option value="${professor.id_professor}">${professor.nome_professor}</option> 
                            </c:forEach>
                        </select>
                    <label for="data">Data</label>
                        <input type="text" name="data">    
                    <label for="horario">Horario</label>
                        <select name="horario">
                            <option value="1T">1T</option>
                            <option value="2T">2T</option>
                            <option value="3T">3T</option>
                        </select>
                    <label for="id_sala">Sala</label>
                        <select name="id_sala">    
                            <c:forEach var="sala" items="${dao.salas}">
                                <option value="${sala.id_sala}">${sala.num_sala}</option> 
                            </c:forEach>
                        </select>
                    
                    <input type="submit" data-role="button" value="Registrar">
                </form>
            </div>
        </div>
    </body>
</html>
