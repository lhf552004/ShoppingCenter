package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hello_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Users</title>\r\n");
      out.write("<script src=\"https://cdn.bootcss.com/jquery/3.2.1/jquery.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"load();\">\r\n");
      out.write("<input type=\"hidden\" id= user_id>\r\n");
      out.write("\tName: <input type=\"text\" id=\"name\" required=\"required\" name=\"user_name\"><br>\r\n");
      out.write("\tEmail: <input type=\"email\" id=\"email\" required=\"required\" name=\"email\"><br>\r\n");
      out.write("\t<button onclick=\"submit();\">Submit</button>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<table id=\"table\" border=1>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<th> Name </th>\r\n");
      out.write("\t\t<th> Email </th>\r\n");
      out.write("\t\t<th> Edit </th>\r\n");
      out.write("\t\t<th>Delete</th>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tdata = \"\";\r\n");
      out.write("\t\tsubmit = function(){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl:\"saveOrUpdate\",\r\n");
      out.write("\t\t\t\ttype: \"POST\",\r\n");
      out.write("\t\t\t\tdata: {user_id:$(\"#user_id\").val(),user_name:$(\"#user_name\").val(),email: $(\"#email\")},\r\n");
      out.write("\t\t\t\tdataType: \"json\",\r\n");
      out.write("\t\t\t\tsuccess: function(response){\r\n");
      out.write("\t\t\t\t\talert(response.message);\r\n");
      out.write("\t\t\t\t\tload();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tdelete_ = function(id){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl: 'delete',\r\n");
      out.write("\t\t\t\ttype: 'POST',\r\n");
      out.write("\t\t\t\tdata: {user_id: id},\r\n");
      out.write("\t\t\t\tsuccess: function(response){\r\n");
      out.write("\t\t\t\t\talert(response.message);\r\n");
      out.write("\t\t\t\t\tload();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tedit = function(index){\r\n");
      out.write("\t\t\t$(\"#user_id\").val(data[index].user_id);\r\n");
      out.write("\t\t\t$(\"#user_name\").val(data[index].user_name);\r\n");
      out.write("\t\t\t$(\"#email\").val(data[index].email);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tload = function(){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl: 'list',\r\n");
      out.write("\t\t\t\ttype: 'POST',\r\n");
      out.write("\t\t\t\tsuccess: function(response){\r\n");
      out.write("\t\t\t\t\tdata = response.data;\r\n");
      out.write("\t\t\t\t\t$('.tr').remove();\r\n");
      out.write("\t\t\t\t\tfor(var i=0; i<response.data.length; i++){\r\n");
      out.write("\t\t\t\t\t\t$('#table').append(\"<tr class='tr'> <td> \" + response.data[i].user_name + \"</td> <td>\" + response.data[i].email + \"</td> <td><a onclick='edit(\" + i + \");'> Edit </a></td> <td><a onclick='delete_(\" + response.data[i].user_id  + \");'> Delete </a></td> </tr>\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
