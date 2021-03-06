/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.5
 * Generated at: 2019-01-04 06:56:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("<html lang=\"en\" >\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>H5微信聊天窗口界面</title>\n");
      out.write("\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,600\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/reset.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"left\">\n");
      out.write("            <div class=\"top\">\n");
      out.write("                <input type=\"text\" placeholder=\"Search\" />\n");
      out.write("                <a href=\"javascript:;\" class=\"search\"></a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"people\">\n");
      out.write("                <li class=\"person\" data-chat=\"person1\">\n");
      out.write("                    <img src=\"img/thomas.jpg\" alt=\"\" />\n");
      out.write("                    <span class=\"name\">Thomas Bangalter</span>\n");
      out.write("                    <span class=\"time\">2:09 PM</span>\n");
      out.write("                    <span class=\"preview\">I was wondering...</span>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"person\" data-chat=\"person2\">\n");
      out.write("                    <img src=\"img/dog.png\" alt=\"\" />\n");
      out.write("                    <span class=\"name\">Dog Woofson</span>\n");
      out.write("                    <span class=\"time\">1:44 PM</span>\n");
      out.write("                    <span class=\"preview\">I've forgotten how it felt before</span>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"person\" data-chat=\"person3\">\n");
      out.write("                    <img src=\"img/louis-ck.jpeg\" alt=\"\" />\n");
      out.write("                    <span class=\"name\">Louis CK</span>\n");
      out.write("                    <span class=\"time\">2:09 PM</span>\n");
      out.write("                    <span class=\"preview\">But we’re probably gonna need a new carpet.</span>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"person\" data-chat=\"person4\">\n");
      out.write("                    <img src=\"img/bo-jackson.jpg\" alt=\"\" />\n");
      out.write("                    <span class=\"name\">Bo Jackson</span>\n");
      out.write("                    <span class=\"time\">2:09 PM</span>\n");
      out.write("                    <span class=\"preview\">It’s not that bad...</span>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"person\" data-chat=\"person5\">\n");
      out.write("                    <img src=\"img/michael-jordan.jpg\" alt=\"\" />\n");
      out.write("                    <span class=\"name\">Michael Jordan</span>\n");
      out.write("                    <span class=\"time\">2:09 PM</span>\n");
      out.write("                    <span class=\"preview\">Wasup for the third time like is\n");
      out.write("you blind bitch</span>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"person\" data-chat=\"person6\">\n");
      out.write("                    <img src=\"img/drake.jpg\" alt=\"\" />\n");
      out.write("                    <span class=\"name\">Drake</span>\n");
      out.write("                    <span class=\"time\">2:09 PM</span>\n");
      out.write("                    <span class=\"preview\">howdoyoudoaspace</span>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"right\">\n");
      out.write("            <div class=\"top\"><span>To: <span class=\"name\">Dog Woofson</span></span></div>\n");
      out.write("            <div class=\"chat\" data-chat=\"person1\">\n");
      out.write("                <div class=\"conversation-start\">\n");
      out.write("                    <span>Today, 6:48 AM</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    Hello,\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    it's me.\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    I was wondering...\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"chat\" data-chat=\"person2\">\n");
      out.write("                <div class=\"conversation-start\">\n");
      out.write("                    <span>Today, 5:38 PM</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    Hello, can you hear me?\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    I'm in California dreaming\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble me\">\n");
      out.write("                    ... about who we used to be.\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble me\">\n");
      out.write("                    Are you serious?\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    When we were younger and free...\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    I've forgotten how it felt before\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"chat\" data-chat=\"person3\">\n");
      out.write("                <div class=\"conversation-start\">\n");
      out.write("                    <span>Today, 3:38 AM</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    Hey human!\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    Umm... Someone took a shit in the hallway.\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble me\">\n");
      out.write("                    ... what.\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble me\">\n");
      out.write("                    Are you serious?\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    I mean...\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    It’s not that bad...\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    But we’re probably gonna need a new carpet.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"chat\" data-chat=\"person4\">\n");
      out.write("                <div class=\"conversation-start\">\n");
      out.write("                    <span>Yesterday, 4:20 PM</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble me\">\n");
      out.write("                    Hey human!\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble me\">\n");
      out.write("                    Umm... Someone took a shit in the hallway.\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    ... what.\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    Are you serious?\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble me\">\n");
      out.write("                    I mean...\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble me\">\n");
      out.write("                    It’s not that bad...\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"chat\" data-chat=\"person5\">\n");
      out.write("                <div class=\"conversation-start\">\n");
      out.write("                    <span>Today, 6:28 AM</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    Wasup\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    Wasup\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    Wasup for the third time like is <br />you blind bitch\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"chat\" data-chat=\"person6\">\n");
      out.write("                <div class=\"conversation-start\">\n");
      out.write("                    <span>Monday, 1:27 PM</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    So, how's your new phone?\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    You finally have a smartphone :D\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble me\">\n");
      out.write("                    Drake?\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble me\">\n");
      out.write("                    Why aren't you answering?\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bubble you\">\n");
      out.write("                    howdoyoudoaspace\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"write\">\n");
      out.write("                <a href=\"javascript:;\" class=\"write-link attach\"></a>\n");
      out.write("                <input type=\"text\" />\n");
      out.write("                <a href=\"javascript:;\" class=\"write-link smiley\"></a>\n");
      out.write("                <a href=\"javascript:;\" class=\"write-link send\"></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script  src=\"js/index.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
