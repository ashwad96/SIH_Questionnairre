package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class question_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int tid; 
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
      out.write("        <script type=\"text/javascript\" src=\"js/question_form.js\"></script>\n");
      out.write("        <link rel = \"stylesheet\" type = \"text/css\" href = \"css/question_form.css\" />\n");
      out.write("       \n");
      out.write("        <title>Question Form</title>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");

        tid = Integer.parseInt(request.getParameter("tid"));
        System.out.println(tid);
    
      out.write("\n");
      out.write("    <body onload=\"showQuestion(");
      out.print( tid );
      out.write(")\" style=\"background-color: #cccccc\">\n");
      out.write("        <a href=\"view_question_form.jsp?tid=");
      out.print(tid);
      out.write("\"><input type=\"button\" name=\"preview\" id=\"preview\" value=\"PREVIEW\" class=\"prev\" style=\"float: right\" /></a>\n");
      out.write("        <select class=\"visit_type\" id=\"visit_type\">\n");
      out.write("        <option value=\"Door to door visit\">Door to door visit</option>\n");
      out.write("        <option value=\"District visit\">District visit</option>\n");
      out.write("    </select>\n");
      out.write("    <center><div id=\"heading\"><h1>QUESTIONNAIRE</h1></div></center>\n");
      out.write("    \n");
      out.write("       <div>\n");
      out.write("        \n");
      out.write("            <form>\n");
      out.write("                <center>\n");
      out.write("                    <div id=\"add_ques\">\n");
      out.write("                    \n");
      out.write("                        </div>\n");
      out.write("                    <div class=\"create_quest_div\">\n");
      out.write("                \n");
      out.write("                 <label for=\"Question\">Question : </label>\n");
      out.write("                 <input type=\"text\" name=\"question\" id=\"question\"  Placeholder=\"Question\">\n");
      out.write("                 \n");
      out.write("                \n");
      out.write("                 <label for=\"inputType\" style=\"margin-left: 4em;\">Question Format : </label>\n");
      out.write("                 <select name=\"question_format\" id=\"question_format\" onchange=\"quest_opt()\">\n");
      out.write("                        <option value=\"Text\">Text</option>\n");
      out.write("                        <option value=\"Multiple Choice\">Multiple Choice</option>\n");
      out.write("                        <option value=\"Drop Down\">Drop Down</option>\n");
      out.write("                        <option value=\"Radio Button\">Radio Button</option>\n");
      out.write("                        <option value=\"Date\">Date</option>\n");
      out.write("                 </select>\n");
      out.write("                 <br>\n");
      out.write("                \n");
      out.write("                 <br>\n");
      out.write("                    <textarea  name=\"question_description\" id=\"question_description\" placeholder=\"Enter Description\" class=\"desc\"></textarea>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                <div  id=\"question_option\">\n");
      out.write("                    <br>\n");
      out.write("                    <label style=\"float: left;\" >No. of options</label><br><br>\n");
      out.write("                    <input  type=\"text\" name=\"no_of_option\" id=\"no_of_option\" placeholder=\"no_of_option\" value=\"1\" onkeyup=\"change_opt(this.value)\" class=\"no_of_option\" />\n");
      out.write("                    <br><br><br>\n");
      out.write("                    <label style=\"float: left;\">Options :-</label>\n");
      out.write("                    <br>\n");
      out.write("                     <div  id=\"option\">\n");
      out.write("                         <input placeholder=\"1)\"  type=\"text\" name=\"option1\" id=\"option1\" class=\"opt\"/>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("                    <br><br>\n");
      out.write("                \n");
      out.write("                <span><input type=\"button\"  name=\"create\" value=\"create\" id=\"create\" onclick=\"create_question(");
      out.print( tid );
      out.write(")\"/></span>\n");
      out.write("                <span ><input type=\"button\" style=\"margin-left: 1em;\"  name=\"cancel\" value=\"cancel\" id=\"cancel\" onclick=\"cancel_question()\"/></span>\n");
      out.write("                <div>\n");
      out.write("                    <label style=\"float: right; margin-top: 1em; margin-right: -3em;\">Required</label>\n");
      out.write("                    <label class=\"switch\">\n");
      out.write("                        <input  type=\"checkbox\" id=\"required\" name=\"required\">\n");
      out.write("                        <span class=\"slider round\"></span>\n");
      out.write("                    </label> \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("                </center>\n");
      out.write("                <br><br>\n");
      out.write("                <center>\n");
      out.write("                    <div style=\"margin-left: 30em;\">\n");
      out.write("                    <input class=\"form_but\" type=\"button\" value=\"SAVE\" name=\"save\" id=\"save\" onclick=\"save()\"/>\n");
      out.write("                    <input class=\"form_but\" type=\"button\" value=\"DELETE\" name=\"delete\" id=\"delete\" onclick=\"form_delete(");
      out.print( tid );
      out.write(")\"/>\n");
      out.write("                    </div>\n");
      out.write("                </center>\n");
      out.write("            </form>\n");
      out.write("        \n");
      out.write("    </div>\n");
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
