package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class frontend_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<HTML>\n");
      out.write("    <HEAD>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.2/css/bulma.min.css\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  \n");
      out.write("        <STYLE>\n");
      out.write("            input[type=text] {\n");
      out.write("    width: 70%;\n");
      out.write("    padding: 12px 10px;\n");
      out.write("    margin: 4px 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("input[type=button], input[type=submit], input[type=reset] {\n");
      out.write("    background-color: blue;\n");
      out.write("    color: white;\n");
      out.write("    padding: 10px 10px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    margin: 4px 2px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border-radius:8px; \n");
      out.write("}\n");
      out.write("\n");
      out.write("            </style>\n");
      out.write("    </Head>\n");
      out.write("    <BODY>\n");
      out.write("        <nav class=\"navbar\" role=\"navigation\" aria-label=\"main navigation\" style=\"border-bottom: 0.5px solid black;\">\n");
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
      out.write("                <center><form action=\"m1.jsp\"><input type=\"text\" placeholder=\"search\">&nbsp;<input type=\"submit\" value=\"Search\"></FORM></center>&nbsp;&nbsp;&nbsp;\n");
      out.write("\n");
      out.write("                <div class=\"navbar-end\">\n");
      out.write("                    <div class=\"navbar-item\">\n");
      out.write("                      \n");
      out.write("                        <a href=\"cart123.jsp\"><b>Cart Items</b><img src=\"logo/cat.jpg\" height=\"50px\" width=\"50px\"></a>&nbsp;&nbsp;\n");
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
      out.write("        \n");
      out.write("        <section style=\"padding-top : 56px;\">\n");
      out.write("            <container>\n");
      out.write("                <div class=\"columns\">\n");
      out.write("                    <div class=\"column is-one-fifth\">\n");
      out.write("                        <aside class=\"menu\" style=\"border-right: 1px solid black;\">\n");
      out.write("                            <ul class=\"menu-list\">\n");
      out.write("                                <li><a>->Pick Up Drop Off</a></li>\n");
      out.write("                                <li><a><a href=\"f1.jsp\">->Furniture & Decor</a></a></li>\n");
      out.write("                                <li><a><a href=\"uc.jsp\">->Cars</a></a></li>\n");
      out.write("                                <li><a><a href=\"e1.jsp\">->Electronics</a></a></LI>\n");
      out.write("                                <li><a><a href=\"m1.jsp\">->Mobile</a></a></li>\n");
      out.write("                                <li><a>->Bikes</a></li>\n");
      out.write("                                <li><a>->Home & lifestyles</a></li>\n");
      out.write("                                <li><a>->Kids & Toys</a></li>\n");
      out.write("                                <li><a>->Commercial Real Estates</a></li>\n");
      out.write("                                <li><a>->Education</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </aside>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"column\" style=\"box-shadow: 5px 10px\">\n");
      out.write("                        <div class=\"columns\">\n");
      out.write("                            <div class=\"column\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <header class=\"card-header\">\n");
      out.write("                                        <p class=\"card-header-title\">\n");
      out.write("                                        <img src=\"logo.png\" heig1=\"100px\" width=\"100px\">&nbsp;&nbsp;&nbsp; <font color=\"green\"><h1><b>QuikrBazaar</b></h1></font>\n");
      out.write("                                        </p>\n");
      out.write("                                    </header>\n");
      out.write("                                    <div class=\"card-content\">\n");
      out.write("                                        <div class=\"content\">\n");
      out.write("                                            <h4><a href=\"f1.jsp\">-Furniture & Decor</a></h4>\n");
      out.write("                                            <h4><a href=\"e1.jsp\">-Electronics & Applications</a></h4>\n");
      out.write("                                            <h4><a href=\"m1.jsp\">-Mobiles</a></h4>\n");
      out.write("                                            <br>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"column\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <header class=\"card-header\">\n");
      out.write("                                        <p class=\"card-header-title\">\n");
      out.write("                                        <img src=\"logo.png\" heig1=\"100px\" width=\"100px\">&nbsp;&nbsp;&nbsp; <font color=\"green\"><h1><b>QuikrCars</b></h1></font>\n");
      out.write("                                        </p>\n");
      out.write("                                    </header>\n");
      out.write("                                    <div class=\"card-content\">\n");
      out.write("                                        <div class=\"content\">\n");
      out.write("                                            <h4><a href=\"uc.jsp\">-New Cars</a></h4>\n");
      out.write("                                            <h4><a href=\"\">-Used Cars</a></h4>\n");
      out.write("                                            <h4><a href=\"\">-RTO Services</a></h4>\n");
      out.write("                                            <br>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"column\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <header class=\"card-header\">\n");
      out.write("                                        <p class=\"card-header-title\">\n");
      out.write("                                        <img src=\"logo.png\" heig1=\"100px\" width=\"100px\">&nbsp;&nbsp;&nbsp;  <font color=\"green\"><h1><b>QuikrBikes</b></h1></font>\n");
      out.write("                                        </p>\n");
      out.write("                                    </header>\n");
      out.write("                                    <div class=\"card-content\">\n");
      out.write("                                        <div class=\"content\">\n");
      out.write("                                            <h4><a href=\"\">-Used Bikes</a></h4>\n");
      out.write("                                            <h4><a href=\"\">-New Bikes</a></h4>\n");
      out.write("                                            <h4><a href=\"\">-Used Scooters</a></h4>\n");
      out.write("                                            <br>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"columns\">\n");
      out.write("                            <div class=\"column\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <header class=\"card-header\">\n");
      out.write("                                        <p class=\"card-header-title\">\n");
      out.write("                                        <img src=\"logo.png\" heig1=\"100px\" width=\"100px\">&nbsp;&nbsp;&nbsp;  <font color=\"green\"><h1><b>QuikrJobs</b></h1></font>\n");
      out.write("                                        </p>\n");
      out.write("                                    </header>\n");
      out.write("                                    <div class=\"card-content\">\n");
      out.write("                                        <div class=\"content\">\n");
      out.write("                                            <h4><a href=\"\">-BPO / Telecaller</a></h4>\n");
      out.write("                                            <h4><a href=\"\">-Dilivery / Collections</a></h4>\n");
      out.write("                                            <h4><a href=\"\">-Data Enter / Back Office</a></h4>\n");
      out.write("                                            <br>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"column\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <header class=\"card-header\">\n");
      out.write("                                        <p class=\"card-header-title\">\n");
      out.write("                                        <img src=\"logo.png\" heig1=\"100px\" width=\"100px\">&nbsp;&nbsp;&nbsp;  <font color=\"green\"><h1><b>QuikrHomes</b></h1></font>\n");
      out.write("                                        </p>\n");
      out.write("                                    </header>\n");
      out.write("                                    <div class=\"card-content\">\n");
      out.write("                                        <div class=\"content\">\n");
      out.write("                                            <h4><a href=\"\">-House For Sale</a></h4>\n");
      out.write("                                            <h4><a href=\"\">-Newly Launched Projects</a></h4>\n");
      out.write("                                            <h4><a href=\"\">-House for Rent</a></h4>\n");
      out.write("                                            <br>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"column\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <header class=\"card-header\">\n");
      out.write("                                        <p class=\"card-header-title\">\n");
      out.write("                                        <img src=\"logo.png\" heig1=\"100px\" width=\"100px\">&nbsp;&nbsp;&nbsp;  <font color=\"green\"><h1><b>QuikrLearner</b></h1></font>\n");
      out.write("                                        </p>\n");
      out.write("                                    </header>\n");
      out.write("                                    <div class=\"card-content\">\n");
      out.write("                                        <div class=\"content\">\n");
      out.write("                                            <h4><a href=\"\">-Colleges</a></h4>\n");
      out.write("                                            <h4><a href=\"\">-Study Abroad</a></h4>\n");
      out.write("                                            <h4><a href=\"\">-Distance Learning</a></h4>\n");
      out.write("                                            <br>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            </container>\n");
      out.write("        </section>\n");
      out.write("\n");
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
