package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            img{\n");
      out.write("                border: solid 0.05em;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <img src=\"image/sih_header.PNG\" />\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/homePage.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .loginbox{\n");
      out.write("                width: 320px;\n");
      out.write("                height: 360px;\n");
      out.write("                background-color: #999999;\n");
      out.write("                color: #000000;\n");
      out.write("                top: 60%;\n");
      out.write("                left: 15%;\n");
      out.write("                padding: 60px 30px;\n");
      out.write("                position: absolute;\n");
      out.write("                transform: translate(-50%,  -50%);\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                border-radius: 3%;\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                color: #fff;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0 0 0px;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 22px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .loginbox p {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .loginbox input{\n");
      out.write("                width: 100%;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .loginbox input[type=\"text\"], input[type=\"password\"]{\n");
      out.write("                border: none;\n");
      out.write("                border-bottom: 1px solid #bdc3c7;\n");
      out.write("                background: transparent;\n");
      out.write("                outline: none;\n");
      out.write("                height: 30px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                opacity: 1;\n");
      out.write("                color: #ccc;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .loginbox input[type=\"submit\"]{\n");
      out.write("                border: none;\n");
      out.write("                outline: none;\n");
      out.write("                height: 40px;\n");
      out.write("                background: #2ecc71;\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                font-family: 'Open Sans', sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .loginbox input[type=\"submit\"]:hover {\n");
      out.write("                cursor: pointer;\n");
      out.write("                background: #27ae60;\n");
      out.write("                color: #fff;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .loginbox a {\n");
      out.write("                font-size: 14px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #fff;\n");
      out.write("                opacity: 0.8;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .loginbox a:hover {\n");
      out.write("                color: #fff;\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #text-account {\n");
      out.write("                font-size: 14px;\n");
      out.write("                color: #fff;\n");
      out.write("                opacity: 0.4;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #create-account:hover {\n");
      out.write("                text-decoration: underline;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    <div class=\"loginbox\">\n");
      out.write("        <h1>Sign in</h1><br>\n");
      out.write("        <form>\n");
      out.write("            <input type=\"text\" placeholder=\"Username\"><br>\n");
      out.write("            <input type=\"password\" placeholder=\"Password\">\n");
      out.write("            <input type=\"submit\" value=\"LOGIN\">\n");
      out.write("        </form>\n");
      out.write("        <a href=\"#\">Forgot Password?</a><br>\n");
      out.write("        <span id=\"text-account\">Don't have an account?</span><a id=\"create-account\" href=\"#\"> Create here.</a>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    <div class=\"container\">\n");
      out.write("  <h2>Carousel Example</h2>\n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\">\n");
      out.write("\n");
      out.write("      <div class=\"item active\">\n");
      out.write("          <img class=\"im\" src=\"image/img1.jpeg\" alt=\"Los Angeles\" >\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("          <img style=\"height:30em;\" class=\"im\" src=\"image/img2.jpg\" alt=\"Chicago\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      <div class=\"item\">\n");
      out.write("          <img style=\"height:30em;\" class=\"im\" src=\"image/img3.jpg\" alt=\"New York\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"item\">\n");
      out.write("          <img style=\"height:30em;\" class=\"im\" src=\"image/img4.jpg\" alt=\"New York\" >\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("          \n");
      out.write("        <footer id=\"footer\">\n");
      out.write("            \n");
      out.write("        </footer>\n");
      out.write("        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("        <script  src=\"js/homePage.js\"></script>\n");
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
