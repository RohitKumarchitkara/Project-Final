package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class buy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            h1{\n");
      out.write("                align-content: left;\n");
      out.write("            }\n");
      out.write("              body{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background-image: url(\"a3.jpg\");\n");
      out.write("                background-size: cover;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("            <style>\n");
      out.write(" \n");
      out.write(".login-box{\n");
      out.write("    width: 320px;\n");
      out.write("    height: 420px;\n");
      out.write("    background: rgba(0, 0, 0, 0.5);\n");
      out.write("    color: #fff;\n");
      out.write("    top: 50%;\n");
      out.write("    left: 50%;\n");
      out.write("    position: absolute;\n");
      out.write("    transform: translate(-50%,-50%);\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    padding: 70px 30px;\n");
      out.write("}\n");
      out.write(".login-box p{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write(".login-box input{\n");
      out.write("    width: 100%;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("}\n");
      out.write(".login-box input[type=\"text\"], input[type=\"password\"]\n");
      out.write("{\n");
      out.write("    border: none;\n");
      out.write("    border-bottom: 1px solid #fff;\n");
      out.write("    background: transparent;\n");
      out.write("    outline: none;\n");
      out.write("    height: 40px;\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 16px;\n");
      out.write("}\n");
      out.write(".login-box input[type=\"submit\"]\n");
      out.write("{\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    height: 40px;\n");
      out.write("    background: #1c8adb;\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 18px;\n");
      out.write("    border-radius: 20px;\n");
      out.write("}\n");
      out.write(".login-box input[type=\"submit\"]:hover\n");
      out.write("{\n");
      out.write("    cursor: pointer;\n");
      out.write("    background: yellow;\n");
      out.write("    color: #000;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-box a{\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size: 14px;\n");
      out.write("    color: #fff;\n");
      out.write("    align-content: left;\n");
      out.write("}\n");
      out.write(".login-box a:hover\n");
      out.write("{\n");
      out.write("    color: red;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1><b>Buy Now</b></h1>\n");
      out.write("        \n");
      out.write("        <h4><b>Listed Price 12499/- Rs</b></h4>\n");
      out.write("    </center>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("        <div class=\"login-box\">\n");
      out.write("        <form method=\"post\" action=\"buy1.jsp\">\n");
      out.write("            <p>Pincode</p>\n");
      out.write("            <input type=\"text\" name=\"code\" placeholder=\"pincode\" required=\"\" style=\"color: white\">\n");
      out.write("            <p>Email</p>\n");
      out.write("            <input type=\"text\" name=\"email\" placeholder=\"Email\" required=\"\">\n");
      out.write("            <p>Mobile Number</p>\n");
      out.write("            <input type=\"text\" name=\"mobile\" placeholder=\"mobile number\" required=\"\">\n");
      out.write("             <input type=\"submit\" name=\"submit\" value=\"Buy\">\n");
      out.write("            \n");
      out.write("            </form> \n");
      out.write("        \n");
      out.write("        \n");
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
