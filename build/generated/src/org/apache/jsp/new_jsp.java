package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("                <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("        <style>\n");
      out.write("  .inline { \n");
      out.write("display: inline-block; \n");
      out.write("border: 1px;\n");
      out.write("margin:7px;\n");
      out.write("}</style>\n");
      out.write("        <style>\n");
      out.write("* {box-sizing: border-box;}\n");
      out.write("\n");
      out.write("body { \n");
      out.write("  margin: 0;\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("  padding: 20px 10px;\n");
      out.write("}\n");
      out.write(".header a.logo {\n");
      out.write("  font-size: 25px;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header a:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header a.active {\n");
      out.write("  background-color: dodgerblue;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("@media screen and (max-width: 500px) {\n");
      out.write("  .header a {\n");
      out.write("    float: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: right;\n");
      out.write("  }\n");
      out.write(".header-right {\n");
      out.write("    float: none;\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("        <center> <img src=\"C:\\Users\\ROHIT\\Desktop\\Quikr-Logo.png\" height=\"80\" width=\"300\"></center>\n");
      out.write("       <div class=\"header-right\"> <h1 ><a href=\"first.jsp\"><input type=\"submit\" value=\"Back\" class=\"btn btn-success\"/></a></h1>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    <br>\n");
      out.write("        <h3>NEW CARS</h3>\n");
      out.write("        <div>\n");
      out.write("        <div class='inline'><div><img src=\"C:\\Users\\ROHIT\\Desktop\\logo\\n3.jpg\" height=\"300px\" width=\"500px\"><h3>Bed sets</h3></div></div>\n");
      out.write("        <div class='inline'><div> Honda XR V<br>\n");
      out.write("                7.87 L - 10.16 L <br> \n");
      out.write("            </div></div>\n");
      out.write("        </div>\n");
      out.write("        </body>\n");
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
