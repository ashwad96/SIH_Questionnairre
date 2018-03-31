package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class view_005fquestion_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con; 
 int tid; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Connection.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

        
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sih","root","");
        }    
        catch(Exception e){
            out.println("error..... <br>"+e); 
        }
        

      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel = \"stylesheet\" type = \"text/css\" href = \"css/view_question_form.css\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #cccccc\">\n");
      out.write("    <center><div id=\"heading\"><h1 style=\"color: #666666\">QUESTIONNAIRE</h1></div></center>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            tid = Integer.parseInt(request.getParameter("tid"));
            
            String sql = "select * from question where tid ="+tid;
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                int qid;
                String question=null, description=null, format=null;
                boolean required;
                qid = rs.getInt("qid");
                question = rs.getString("question");
                description = rs.getString("Description");
                format = rs.getString("format");
                required = rs.getBoolean("required"); 
//                out.println(qid);
//                out.println("<br>");
                out.println("<center><div class=quest_div>");
                out.println("<label class=label_quest>");
                out.println(question);
                out.println("</label>");
                out.println("<br>");
                out.println("<br>");
                out.println("<span class=desc>");
                out.println(description);
                out.println("</span>");
                out.println("<br><br>");
                
//                out.println(format);
//                out.println("<br>");
                if(required==true){
                    out.println("<span style=\"color:red; float:right; margin-top:-4.5em;\">*Required</span>");
                }
                 
                ArrayList<String> options = new ArrayList<String>();
                String sql1 = "select * from question_option where qid ="+qid;
                Statement stm1 = con.createStatement();
                ResultSet rs1 = stm1.executeQuery(sql1);
                
                while(rs1.next()){
                    options.add(rs1.getString("ques_option"));
//                    out.println(rs1.getString("ques_option")+"<br>");
                }
                
                //input field
                if(format.equalsIgnoreCase("text")){ 
                    out.println("<input type=\"text\" name=\"qid_text\" id=\"qid_text\" />");
                }
                else if(format.equalsIgnoreCase("Multiple Choice")){
                    for(String str : options){
                        out.println("<input type=checkbox value=\""+str+"\" name=\""+qid+"_checkbox\" id=\""+qid+"_checkbox\" class=check>");
                        out.println("<label class=radio_label>");
                        out.println(str);
                        out.println("</label>");
                        
                        out.println("<br><br>");
//                        out.println("<label><input type=checkbox value=\""+str+"\" name=\""+qid+"_checkbox\" id=\""+qid+"_checkbox\" class=check> \""+str+"\"</label><br>");
                    }
                }
                else if(format.equalsIgnoreCase("Drop Down")){
                    out.println("<select name="+qid+"_drop id="+qid+"_drop>");
                    for(String str : options){
                        out.println("<option value="+str+">"+str+"</option>");
                    }
                    out.println("</select>");
                }
                else if(format.equalsIgnoreCase("Radio Button")){
                    for(String str : options){
                        
                        out.println("<input class=radio_but type=radio name="+qid+"_radio value="+str+" >");
                        out.println("<label class=radio_label>");
                        out.println(str);
                        out.println("</label>");
                        
                        out.println("<br><br>");
                    }
                }
                else if(format.equalsIgnoreCase("Date")){
                    out.println("<input type=date name="+qid+"_date id="+qid+"_date >");
                }
                
                stm1.close();
                rs1.close();
                out.println("</div></center>");
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("    <br>\n");
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
