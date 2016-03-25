package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vfrequencia_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      br.edu.ifrn.sispac.dao.AdministradorDAO dao = null;
      synchronized (_jspx_page_context) {
        dao = (br.edu.ifrn.sispac.dao.AdministradorDAO) _jspx_page_context.getAttribute("dao", PageContext.PAGE_SCOPE);
        if (dao == null){
          dao = new br.edu.ifrn.sispac.dao.AdministradorDAO();
          _jspx_page_context.setAttribute("dao", dao, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      br.edu.ifrn.sispac.modelo.Professor professor = null;
      synchronized (_jspx_page_context) {
        professor = (br.edu.ifrn.sispac.modelo.Professor) _jspx_page_context.getAttribute("professor", PageContext.PAGE_SCOPE);
        if (professor == null){
          professor = new br.edu.ifrn.sispac.modelo.Professor();
          _jspx_page_context.setAttribute("professor", professor, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Visualizar Frequência</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.mobile-1.4.5.min.css\"/>\r\n");
      out.write("        <script src=\"js/jquery-1.12.0.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.mobile-1.4.5.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/themes/sispac.css\"/>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div data-role=\"page\" data-theme=\"b\">\r\n");
      out.write("            <div data-role=\"header\">\r\n");
      out.write("                <h3>SISPAC</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div data-role=\"navbar\">    \r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"pagina_inicial.jsp\" data-role=\"button\">Inicio</a></li>\r\n");
      out.write("                    <li><a href=\"logout.jsp\" data-role=\"button\">Sair</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div data-role=\"content\">\r\n");
      out.write("                \r\n");
      out.write("                <form method=\"post\" action=\"resultado_frequenciaServlet\">\r\n");
      out.write("                    \r\n");
      out.write("                    <label for=\"id_professor\">Professor</label>\r\n");
      out.write("                        <select name=\"id_professor\">    \r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </select>   \r\n");
      out.write("                    <center><h4>Selecione o mês da frequência</h4></center>\r\n");
      out.write("                    <select name=\"mes\">\r\n");
      out.write("                        <option value=\"01\">Janeiro</option>\r\n");
      out.write("                        <option value=\"02\">Fevereiro</option>\r\n");
      out.write("                        <option value=\"03\">Março</option>\r\n");
      out.write("                        <option value=\"04\">Abril</option>\r\n");
      out.write("                        <option value=\"05\">Maio</option>\r\n");
      out.write("                        <option value=\"06\">Junho</option>\r\n");
      out.write("                        <option value=\"07\">Julho</option>\r\n");
      out.write("                        <option value=\"08\">Agosto</option>\r\n");
      out.write("                        <option value=\"09\">Setembro</option>\r\n");
      out.write("                        <option value=\"10\">Outubro</option>\r\n");
      out.write("                        <option value=\"11\">Novembro</option>\r\n");
      out.write("                        <option value=\"12\">Dezembro</option>\r\n");
      out.write("                </select>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"submit\" value=\"Buscar\">\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("professor");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dao.professor}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${professor.id_professor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${professor.nome_professor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option> \r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
