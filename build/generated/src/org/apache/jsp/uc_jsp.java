package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class uc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Bootstrap Example</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("    /* Remove the navbar's default rounded borders and increase the bottom margin */ \n");
      out.write("    .navbar {\n");
      out.write("      margin-bottom: 50px;\n");
      out.write("      border-radius: 0;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    /* Remove the jumbotron's default bottom margin */ \n");
      out.write("     .jumbotron {\n");
      out.write("      margin-bottom: 0;\n");
      out.write("    }\n");
      out.write("   \n");
      out.write("    /* Add a gray background color and some padding to the footer */\n");
      out.write("    footer {\n");
      out.write("      background-color: #f2f2f2;\n");
      out.write("      padding: 25px;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("  <style>\n");
      out.write(".button {\n");
      out.write("    background-color: darkblue; /* Green */\n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 20px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("    margin: 4px 2px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".button4 {border-radius: 12px;}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"jumbotron\">\n");
      out.write("  <div class=\"container text-center\">\n");
      out.write("      <img src=\"Quikr-Logo.png\" height=\"100px\" width=\"400px\">\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">    \n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("          <div class=\"panel-heading\"><h1><b>HONDA</b></h1></div>\n");
      out.write("        <div class=\"panel-body\"><img src=\"logo/n3.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div>\n");
      out.write("        <div class=\"panel-footer\"><h3><b><font color=\"darkblue\"> NEW Honda WRV<br> <center>7.7 L /- Rs<br><button class=\"button button4\" onclick=\"window.location.href='buy.jsp'\">BUY NOW</button></center> </font></b></h3></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-danger\">\n");
      out.write("          <div class=\"panel-heading\"><h1><b>SONY LED TV</b></h1></div>\n");
      out.write("        <div class=\"panel-body\"><img src=\"logo/l2.png\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div>\n");
      out.write("        <div class=\"panel-footer\"><font color=\"darkblue\"><h3><b>SONY smart LED TV<br><center>11999/- Rs<br><button class=\"button button4\">BUY NOW</button></center></b></h3></font></div>\n");
      out.write("           \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-success\">\n");
      out.write("          <div class=\"panel-heading\"><h1><b>Lloyd LED TV</b></h1></div>\n");
      out.write("        <div class=\"panel-body\"><img src=\"logo/l3.jpeg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div>\n");
      out.write("        <div class=\"panel-footer\"><font color=\"darkblue\"><h3><b><br>New Plug & PLay LED<br><center>9999/- Rs<br><button class=\"button button4\">BUY NOW</button></center></b></h3></font></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"container-fluid text-center\">\n");
      out.write("  <p>Quikr Electronics LED</p>  \n");
      out.write("  <form class=\"form-inline\">Get deals:\n");
      out.write("    <input type=\"email\" class=\"form-control\" size=\"50\" placeholder=\"Email Address\">\n");
      out.write("    <button type=\"button\" class=\"btn btn-danger\">Sign Up</button>\n");
      out.write("  </form>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
