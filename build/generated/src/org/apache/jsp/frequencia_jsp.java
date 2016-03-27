package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class frequencia_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      br.edu.ifrn.sispac.dao.SalasDAO dao = null;
      synchronized (_jspx_page_context) {
        dao = (br.edu.ifrn.sispac.dao.SalasDAO) _jspx_page_context.getAttribute("dao", PageContext.PAGE_SCOPE);
        if (dao == null){
          dao = new br.edu.ifrn.sispac.dao.SalasDAO();
          _jspx_page_context.setAttribute("dao", dao, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      br.edu.ifrn.sispac.modelo.Sala sala = null;
      synchronized (_jspx_page_context) {
        sala = (br.edu.ifrn.sispac.modelo.Sala) _jspx_page_context.getAttribute("sala", PageContext.PAGE_SCOPE);
        if (sala == null){
          sala = new br.edu.ifrn.sispac.modelo.Sala();
          _jspx_page_context.setAttribute("sala", sala, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      br.edu.ifrn.sispac.dao.AdministradorDAO admdao = null;
      synchronized (_jspx_page_context) {
        admdao = (br.edu.ifrn.sispac.dao.AdministradorDAO) _jspx_page_context.getAttribute("admdao", PageContext.PAGE_SCOPE);
        if (admdao == null){
          admdao = new br.edu.ifrn.sispac.dao.AdministradorDAO();
          _jspx_page_context.setAttribute("admdao", admdao, PageContext.PAGE_SCOPE);
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
      out.write("        <title>Frequência</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.mobile-1.4.5.min.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/geralCSS.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"http://ququplay.github.io/jquery-mobile-square-ui-theme/css/jquery.mobile.squareui.css\" />\r\n");
      out.write("        <script src=\"http://ququplay.github.io/jquery-mobile-square-ui-theme/js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"http://ququplay.github.io/jquery-mobile-square-ui-theme/js/jqm.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery-1.12.0.min.js\"></script>\r\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.mobile-1.4.5.min.js\"></script>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div data-role=\"page\" data-theme=\"a\">\r\n");
      out.write("            <div data-role=\"header\" data-position=\"fixed\">\r\n");
      out.write("                <h3>SISPAC</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div data-role=\"navbar\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"opcoesFrequencia.jsp\" data-role=\"button\" data-rel=\"dialog\">Frequência</a></li>\r\n");
      out.write("                    <li><a href=\"opcoesReserva.jsp\" data-role=\"button\" data-rel=\"dialog\">Reserva</a></li>\r\n");
      out.write("                    <li><a href=\"logout.jsp\" data-role=\"button\">Sair</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div data-role=\"content\">\r\n");
      out.write("                \r\n");
      out.write("                <form method=\"post\" action=\"frequenciaServlet\">\r\n");
      out.write("                    <label for=\"nome_professor\">Professor</label>\r\n");
      out.write("                        <select name=\"id_professor\">    \r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                    <label for=\"data\">Data</label>\r\n");
      out.write("                    <input type=\"date\" name=\"data\">    \r\n");
      out.write("                    <label for=\"horario\">Horario</label>\r\n");
      out.write("                        <select name=\"horario\">\r\n");
      out.write("                            <option value=\"07:00 - 08:30\">07:00 - 08:30</option>\r\n");
      out.write("                            <option value=\"08:50 - 10:20\">08:50 - 10:20</option>\r\n");
      out.write("                            <option value=\"10:30 - 12:00\">10:30 - 12:00</option>\r\n");
      out.write("                            <option value=\"13:00 - 14:30\">13:00 - 14:30</option>\r\n");
      out.write("                            <option value=\"14:50 - 16:20\">14:50 - 16:20</option>\r\n");
      out.write("                            <option value=\"16:30 - 18:00\">16:30 - 18:00</option>\r\n");
      out.write("                            <option value=\"19:00 - 20:30\">19:00 - 20:30</option>\r\n");
      out.write("                            <option value=\"20:40 - 22:10\">20:40 - 21:25</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    <label for=\"id_sala\">Sala</label>\r\n");
      out.write("                        <select name=\"id_sala\">    \r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"submit\" data-role=\"button\" value=\"Registrar\">\r\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${admdao.professor}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("sala");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dao.salas}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sala.id_sala}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sala.num_sala}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option> \r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
