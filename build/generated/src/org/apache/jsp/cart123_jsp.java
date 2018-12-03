package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class cart123_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.2/css/bulma.min.css\" />\n");
      out.write("    <style>\n");
      out.write("#customers {\n");
      out.write("    font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers td, #customers th {\n");
      out.write("    border: 3px solid black;\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("#customers tr:hover {background-color: cyan;}\n");
      out.write("#customers th:hover {background-color: green;}\n");
      out.write("#customers th {\n");
      out.write("    padding-top: 12px;\n");
      out.write("    padding-bottom: 12px;\n");
      out.write("    text-align: left;\n");
      out.write("    background-color: skyblue;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("body \n");
      out.write("{\n");
      out.write("    background-image: url(\"qwer1.png\");\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

//String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write(" \n");
      out.write("<nav class=\"navbar\" role=\"navigation\" aria-label=\"main navigation\" style=\"border-bottom: 0.5px solid black;\">\n");
      out.write("            <div class=\"navbar-brand\">\n");
      out.write("                <a class=\"navbar-item\" href=\"#/\">\n");
      out.write("                    <img src=\"Quikr-Logo.png\" height=\"300px\" width=\"150px\">\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a role=\"button\" class=\"navbar-burger burger\" aria-label=\"menu\" aria-expanded=\"false\" data-target=\"navbarBasicExample\">\n");
      out.write("                    <span aria-hidden=\"true\"></span>\n");
      out.write("                    <span aria-hidden=\"true\"></span>\n");
      out.write("                    <span aria-hidden=\"true\"></span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"navbarBasicExample\" class=\"navbar-menu\">\n");
      out.write("                <div class=\"navbar-start\">\n");
      out.write("                    <a class=\"navbar-item\">\n");
      out.write("                        <font color=\"darkblue\"><h1><b>Home</B></h1></font>\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                    <div class=\"navbar-item has-dropdown is-hoverable\">\n");
      out.write("                        <a class=\"navbar-link\">\n");
      out.write("                            <font color=\"darkblue\"><h1><b>More</B></h1></font>\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                        <div class=\"navbar-dropdown\">\n");
      out.write("                            <a class=\"navbar-item\">\n");
      out.write("                                <a href=\"about.html\"> About</a>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"navbar-item\">\n");
      out.write("                                Contact\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <div class=\"navbar-end\">\n");
      out.write("                    <div class=\"navbar-item\">\n");
      out.write("                        <div class=\"buttons\">\n");
      out.write("                            <a class=\"button is-primary\" href=\"reg.jsp\">\n");
      out.write("                                <strong>Sign up</strong>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"button is-primary\" href=\"rohit12.jsp\">\n");
      out.write("                                <strong>Log in</STRONG>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"button is-primary\" href=\"post.jsp\">\n");
      out.write("                                <strong>Post Add</strong>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<table border=\"3 solid black\" id=\"customers\">\n");
      out.write("<tr>\n");
      out.write("    <td><B>Product_Brand</b></td>\n");
      out.write("    <td><b>Product_Color</b></td>\n");
      out.write("    <td><b>Product_Model</b></td>\n");
      out.write("    <td><b>Year</b></td>\n");
      out.write("    <td><b>City</b></td>\n");
      out.write("    <td><b>Price</b></td>\n");
      out.write("    <td><b>Name</b></td>\n");
      out.write("    <td><b>Number</b></td>\n");
      out.write("    <td><b>Email</b></td>\n");
      out.write("    <td><b>Image</b></td>\n");
      out.write("</tr>\n");

try{
connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
statement=connection.createStatement();
String sql ="select * from post1 where Email='rk7944702@gmail.com' or Email='abc@gmail.com' or Email='def@gmail.com'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td>");
      out.print(resultSet.getString(1) );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString(2) );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString(3) );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString(4) );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString(5) );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString(6) );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString(7) );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString(8) );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString(9) );
      out.write("</td>\n");
      out.write("<td><img src='");
      out.print(resultSet.getString(10) );
      out.write("' height=\"180\" width=\"180\"></td>\n");
      out.write("</tr>\n");

}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>\n");
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
