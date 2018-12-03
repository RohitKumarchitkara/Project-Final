package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registration</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background-image: url(\"a4.jpg\");\n");
      out.write("                background-size: cover;\n");
      out.write("                background-position: center;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("            }\n");
      out.write("            .wrap{\n");
      out.write("                width: 350px;\n");
      out.write("                margin: auto;\n");
      out.write("                background: transparent;\n");
      out.write("                margin-top: 50px;\n");
      out.write("                padding: 5px;\n");
      out.write("            }\n");
      out.write("            form{\n");
      out.write("                padding: 10px;\n");
      out.write("                font-family: arial;\n");
      out.write("                border: 1px doted white;\n");
      out.write("                margin: 10px;\n");
      out.write("            }\n");
      out.write("            h2{\n");
      out.write("                text-align: center;\n");
      out.write("                background: skyblue;\n");
      out.write("                color: black;\n");
      out.write("                padding: 10px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                padding: 10px;\n");
      out.write("                margin: 5px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                border: none;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            input[type=\"text\"],input[type=\"email\"],input[type=\"number\"],input[type=\"password\"]\n");
      out.write("            {\n");
      out.write("                width: 90%;\n");
      out.write("            }\n");
      out.write("            input[type=\"submit\"]\n");
      out.write("            {\n");
      out.write("                width: 95%;\n");
      out.write("                background: white;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            input[type=\"submit\"]:hover{\n");
      out.write("                background: yellow;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class = \"wrap\">\n");
      out.write("            <form method=\"post\" action=\"registration.jsp\" onsubmit=\"return checkPassword(this)\">\n");
      out.write("                <h2><u>Sign up Here</u></h2>\n");
      out.write("                <center>\n");
      out.write("                    <input type=\"text\" name=\"fname\" value=\"\" placeholder=\"First Name\" required/><br>\n");
      out.write("                    <input type=\"text\" name=\"lname\" value=\"\" placeholder=\"Last Name\" required/><br>\n");
      out.write("                    <input type=\"email\" name=\"email\" value=\"\" placeholder=\"Email\" required/><br>\n");
      out.write("                    <input type=\"text\" name=\"uname\" value=\"\"placeholder=\"User name\" required/><br>\n");
      out.write("                    <input class=\"pass\" type=\"password\" name=\"pass\" value=\"\" placeholder=\"Password\" required/><br>\n");
      out.write("                    <input class=\"pass\" type=\"password\" name=\"cpassword\" value=\"\" placeholder=\"confirm password\" required></br>\n");
      out.write("                    <input type=\"checkbox\" required>I am agree to term use<br>\n");
      out.write("                    <input type=\"submit\" value=\"Submit\" class=\"btn btn-success\"/><br>\n");
      out.write("                </center>\n");
      out.write("            </form>\n");
      out.write("            <script>\n");
      out.write("                function checkPassword(form) {\n");
      out.write("                    if (form[4].value === form[5].value) {\n");
      out.write("                        return true;\n");
      out.write("                    } else {\n");
      out.write("                        alert(\"Password does not match !\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            </script>\n");
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
