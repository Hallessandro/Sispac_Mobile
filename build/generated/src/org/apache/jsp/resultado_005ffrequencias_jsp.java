package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import br.edu.ifrn.sispac.modelo.Frequencia;

public final class resultado_005ffrequencias_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      br.edu.ifrn.sispac.modelo.Frequencia professor = null;
      synchronized (session) {
        professor = (br.edu.ifrn.sispac.modelo.Frequencia) _jspx_page_context.getAttribute("professor", PageContext.SESSION_SCOPE);
        if (professor == null){
          professor = new br.edu.ifrn.sispac.modelo.Frequencia();
          _jspx_page_context.setAttribute("professor", professor, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Frequência mensal</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.mobile-1.4.5.min.css\"/>\r\n");
      out.write("        <script src=\"js/jquery-1.12.0.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.mobile-1.4.5.min.js\"></script>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div data-role=\"page\">\r\n");
      out.write("            <div data-role=\"header\">\r\n");
      out.write("                <h3>SISPAC</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div data-role=\"navbar\" data-position=\"fixed\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"frequencia.jsp\" data-role=\"button\">Registrar frequência</a></li>\r\n");
      out.write("                    <li><a href=\"reserva_sala.jsp\" data-role=\"button\">Reservar sala</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div data-role=\"content\"> \r\n");
      out.write("                <center><h4>Frequência Mensal</h4></center>\r\n");
      out.write("                \r\n");
      out.write("                    <table data-role=\"table\" data-mode=\"columntoggle\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>Dia</th>\r\n");
      out.write("                            <th>Horário</th>\r\n");
      out.write("                            <th>Nome do Professor</th> \r\n");
      out.write("                            <!-- ABRIR UMA CAIXA DE DIALOGO ACIONADA AO CLICAR EM ALGUMA LINHA\r\n");
      out.write("                            NA CAIXA VAI CONSTAR OS DEMAIS DADOS DA RESERVA\r\n");
      out.write("                            NOME E MATRICULA DE QUEM RESERVOU \r\n");
      out.write("                            -->\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <!-- COMO PEGAR O ARRAY DA SESSÃO? -->\r\n");
      out.write("                            ");
 ArrayList<Frequencia> frequencia = (ArrayList<Frequencia>) request.getAttribute("resultadoF");
                                for(Frequencia f : frequencia){ 
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                                <td>");
      out.print( f.getData() );
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print( f.getHorario() );
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print( f.getId_professor() );
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                            ");
 } 
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div data-role=\"footer\" data-position=\"fixed\">\r\n");
      out.write("                        <div data-role=\"navbar\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"pagina_inicial.jsp\" data-role=\"button\">Inicio</a></li>\r\n");
      out.write("                                <li><a href=\"index.jsp\" data-role=\"button\">Sair</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("        </div>\r\n");
      out.write("     </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
