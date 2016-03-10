package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import br.edu.ifrn.sispac.modelo.reservas;

public final class resultado_005freservas_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Salas reservadas</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.mobile-1.4.5.min.css\"/>\n");
      out.write("        <script src=\"js/jquery-1.12.0.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.mobile-1.4.5.min.js\"></script>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div data-role=\"page\">\n");
      out.write("            <div data-role=\"header\">\n");
      out.write("                <h3>SISPAC</h3>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div data-role=\"navbar\" data-position=\"fixed\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"frequencia.jsp\" data-role=\"button\">Registrar frequência</a></li>\n");
      out.write("                    <li><a href=\"reserva_sala.jsp\" data-role=\"button\">Reservar sala</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div data-role=\"content\"> \n");
      out.write("                <center><h4>Salas Reservadas</h4></center>\n");
      out.write("                    <table data-role=\"table\" data-mode=\"columntoggle\">\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            <th>Sala</th>\n");
      out.write("                            <th>Data</th>\n");
      out.write("                            <th>Horário</th>\n");
      out.write("                            <!-- ABRIR UMA CAIXA DE DIALOGO ACIONADA AO CLICAR EM ALGUMA LINHA\n");
      out.write("                            NA CAIXA VAI CONSTAR OS DEMAIS DADOS DA RESERVA\n");
      out.write("                            Nome de quem reservou e matricula\n");
      out.write("                            -->\n");
      out.write("                        </tr>\n");
      out.write("                        <!-- COMO PEGAR O ARRAY DA SESSÃO? -->\n");
      out.write("                            ");
 ArrayList<reservas> rsvs = (ArrayList<reservas>) request.getAttribute("resultado");
                                for(reservas r : rsvs){ 
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                                <td>");
      out.print( r.getNum_sala() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( r.getData() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( r.getHorario() );
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                    <div data-role=\"footer\" data-position=\"fixed\">\n");
      out.write("                        <div data-role=\"navbar\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"pagina_inicial.jsp\" data-role=\"button\">Inicio</a></li>\n");
      out.write("                                <li><a href=\"index.jsp\" data-role=\"button\">Sair</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("        </div>\n");
      out.write("     </body>\n");
      out.write("</html>\n");
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
