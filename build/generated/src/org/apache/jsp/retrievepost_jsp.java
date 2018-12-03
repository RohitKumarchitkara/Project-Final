package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class retrievepost_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            fieldset { \n");
      out.write("    display: block;\n");
      out.write("    margin-left: 2px;\n");
      out.write("    margin-right: 20px;\n");
      out.write("    padding-top: 0.35em;\n");
      out.write("    padding-bottom: 0.625em;\n");
      out.write("    padding-left: 0.25em;\n");
      out.write("    padding-right: 0.25em;\n");
      out.write("    border: 6px groove; \n");
      out.write("}\n");
      out.write("input[type=text] {\n");
      out.write("    background-color: white;\n");
      out.write("    background-position: 10px 10px; \n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    padding-left: 40px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    padding: 10px 32px;\n");
      out.write("    box-shadow: inset 1px 2px 8px rgba(0, 0, 0, 0.07);\n");
      out.write("}\n");
      out.write("input[type=email] {\n");
      out.write("    background-color: white;\n");
      out.write("    background-position: 10px 10px; \n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    padding-left: 40px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    padding: 10px 32px;\n");
      out.write("    box-shadow: inset 1px 2px 8px rgba(0, 0, 0, 0.07);\n");
      out.write("}\n");
      out.write("input[type=number] {\n");
      out.write("    background-color: white;\n");
      out.write("    background-position: 10px 10px; \n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    padding-left: 40px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    padding: 10px 32px;\n");
      out.write("    box-shadow: inset 1px 2px 8px rgba(0, 0, 0, 0.07);\n");
      out.write("}\n");
      out.write("input[type=submit]{\n");
      out.write("    background-color: darkblue;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    color: white;\n");
      out.write("    padding: 18px 40px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    margin: 4px 2px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("   \n");
      out.write("body{\n");
      out.write("    background-image: url('logo/qwer.jpg')\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <h1 style=\"text-align: left\"> <img src=\"Quikr-Logo.png\" height=\"70px\" width=\"100px\"><b>&nbsp;&nbsp;The Best Way to Sell Your Product</b></h1>\n");
      out.write("    \n");
      out.write("        <form action=\"showpost.jsp\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend><b><h1>Enter Product Details</b></h1></legend>\n");
      out.write("            Your Brand :<br>\n");
      out.write("            <input type=\"text\" name =\"brand\" required><br>\n");
      out.write("           Color :<br>\n");
      out.write("           <input type=\"text\" name=\"color\" required><br>\n");
      out.write("           Your Model :<br>\n");
      out.write("           <input type=\"text\" name =\"model\" required><br>\n");
      out.write("            Year of Registration :<br>\n");
      out.write("            <input type=\"text\" name=\"yor\" required><br>\n");
      out.write("           City :<br>\n");
      out.write("           <input type=\"text\" name=\"city\" required><br>\n");
      out.write("           Expected Selling Price :<br>\n");
      out.write("           <input type=\"text\" name=\"price\" required><br>\n");
      out.write("           Image of Your Product :<br>\n");
      out.write("           <input type=\"file\" name=\"myimg\"><br>\n");
      out.write("            </fieldset>\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>\n");
      out.write("                    <h1><b>Enter Your Detail</b>\n");
      out.write("                    </h1>\n");
      out.write("                </legend>\n");
      out.write("                Your Name : <br>\n");
      out.write("                <input type=\"text\" name=\"name\" required><br>\n");
      out.write("                Your Mobile Number :<br>\n");
      out.write("                <input type=\"number\" name=\"number\" required><br>\n");
      out.write("                Your E-Mail : <br>\n");
      out.write("                <input type=\"email\" name=\"email\" required><br>\n");
      out.write("            </fieldset>\n");
      out.write("            <center>\n");
      out.write("                <input type=\"submit\" value=\"Post Your Add\">\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
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
