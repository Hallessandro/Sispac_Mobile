package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adicionar_005fusuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.mobile-1.4.5.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/geralCSS.css\"/>\n");
      out.write("        <script src=\"js/jquery-1.12.0.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.mobile-1.4.5.min.js\"></script>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Adicionar usuários</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div data-role=\"page\">\n");
      out.write("            <div data-role=\"header\"><h3>Cadastrar Usuário</h3></div>\n");
      out.write("            \n");
      out.write("            <div data-role=\"navbar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"frequencia.jsp\" data-role=\"button\">Frequência</a></li>\n");
      out.write("                    <li><a href=\"reserva_sala.jsp\" data-role=\"button\">Reserva</a></li>\n");
      out.write("                    <li><a href=\"logout.jsp\" data-role=\"button\">Sair</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div data-role=\"content\">\n");
      out.write("                <form method=\"post\" action=\"inserir_usuarioServlet\">\n");
      out.write("                    <p><label>Nome</label>\n");
      out.write("                        <input type=\"text\" name=\"nome\"></p>\n");
      out.write("                    <p><label>Matrícula</label>\n");
      out.write("                        <input type=\"number\" name=\"matricula\"></p>\n");
      out.write("                    <p><select name=\"nv_acesso\">\n");
      out.write("                            <option value=\"1\">Funcionário</option>\n");
      out.write("                            <option value=\"2\">Administrador</option>\n");
      out.write("                        </select></p>\n");
      out.write("                    <p><label>Senha</label>\n");
      out.write("                        <input type=\"password\" name=\"senha\"></p>    \n");
      out.write("                    \n");
      out.write("                    <p><input type=\"submit\" value=\"Cadastrar\"></p>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
