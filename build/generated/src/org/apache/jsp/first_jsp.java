package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class first_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta content=\"text/html; charset=iso-8859-2\" http-equiv=\"Content-Type\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .mySlides {display:none;}\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            * {box-sizing: border-box;}\n");
      out.write("\n");
      out.write("            body { \n");
      out.write("                margin: 0;\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header {\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                padding: 20px 10px;\n");
      out.write("            }\n");
      out.write("            .header1 {\n");
      out.write("                background-color: white;\n");
      out.write("                height: 50px;\n");
      out.write("            }\n");
      out.write("            .header2 {\n");
      out.write("                background-color: white;\n");
      out.write("                height: 100px;\n");
      out.write("            }\n");
      out.write("            .header a {\n");
      out.write("                float: left;\n");
      out.write("                color: black;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 12px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 18px; \n");
      out.write("                line-height: 25px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header a.logo {\n");
      out.write("                font-size: 25px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header a:hover {\n");
      out.write("                background-color: #ddd;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header a.active {\n");
      out.write("                background-color: dodgerblue;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header-right {\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 500px) {\n");
      out.write("                .header a {\n");
      out.write("                    float: none;\n");
      out.write("                    display: block;\n");
      out.write("                    text-align: right;\n");
      out.write("                }\n");
      out.write("                .header-right {\n");
      out.write("                    float: none;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            .a1\n");
      out.write("            {\n");
      out.write("                background-color: deepskyblue;\n");
      out.write("                color: white;\n");
      out.write("                margin: 10px;\n");
      out.write("                padding: 20px;\n");
      out.write("                width: 300px;\n");
      out.write("            }\n");
      out.write("            @media (max-width: 100px) {\n");
      out.write("                nav, article {\n");
      out.write("                    width: 100%;\n");
      out.write("                    height: auto;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            .inline { \n");
      out.write("                display: inline-block; \n");
      out.write("                border: 1px solid black;\n");
      out.write("                background: white;\n");
      out.write("                margin:10px;\n");
      out.write("            }\n");
      out.write("            a:hover {\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <style> \n");
      out.write("            input[type=text] {\n");
      out.write("                width: 20%;\n");
      out.write("                padding: 12px 15px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                border: 2px solid skyblue;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("               background-image: url(\"\")\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <center> <img src=\"C:\\Users\\ROHIT\\Desktop\\Quikr-Logo.png\" height=\"80\" width=\"300\"></center>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <center><input type=\"text\" name=\"roll_no\" placeholder=\"Search...\">\n");
      out.write("                    <button type=\"submit\" name=\"save\" class=\"btn btn-primary\">Search</button></center>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            ");
 if (session.getAttribute("userid") == null || session.getAttribute("userid") == "") {
      out.write("\n");
      out.write("            <div class=\"header-right\"> \n");
      out.write("                <h1>\n");
      out.write("                    <a href=\"rohit12.jsp\"><input type=\"submit\" value=\"Login\" class=\"btn btn-success\"/></a>        \n");
      out.write("                    <a href=\"reg.jsp\"><input type=\"submit\" value=\"SIGNUP\" class=\"btn btn-success\"/></a>\n");
      out.write("                    <a href=\"product1.jsp\"><input type=\"submit\" value=\"Add\" class=\"btn btn-success\"/></a>\n");
      out.write("                </h1>\n");
      out.write("            </div>\n");
      out.write("            ");
} else {
      out.write("\n");
      out.write("            <div class=\"header-right\">\n");
      out.write("                <h1>\n");
      out.write("                    <a href=\"logout.jsp\"><input type=\"submit\" value=\"Logout\" class=\"btn btn-success\"/></a>      \n");
      out.write("                </h1>\n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
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
