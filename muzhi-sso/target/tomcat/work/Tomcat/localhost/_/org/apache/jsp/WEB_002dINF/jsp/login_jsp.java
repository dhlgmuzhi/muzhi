/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-09-28 02:11:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>登录界面</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/public.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/login.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav id=\"nav\">\r\n");
      out.write("    <div class=\"nav_main\">\r\n");
      out.write("        <div class=\"nav_left\">\r\n");
      out.write("            <h1>牧之</h1>\r\n");
      out.write("            <b>欢迎登录</b>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<section id=\"login\">\r\n");
      out.write("    <div class=\"login\">\r\n");
      out.write("        <div class=\"title_line\">\r\n");
      out.write("            <span class=\"tit\">登录</span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"login_left\">\r\n");
      out.write("            <img src=/image/show.png\">\r\n");
      out.write("            <h3>扫描二维码登录</h3>\r\n");
      out.write("            <p>请使用<a href=\"#\">牧之客户端</a></p>\r\n");
      out.write("            <p>扫码登录</p>\r\n");
      out.write("            <p>或扫码下载APP</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"login_right\">\r\n");
      out.write("            <form action=\"/login/user\" method=\"post\" id=\"myform\">\r\n");
      out.write("                <input type=\"text\" name=\"email\" placeholder=\"你的邮箱\" autocomplete=\"off\">\r\n");
      out.write("                <p id=\"checkemail\"></p>\r\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"密码\">\r\n");
      out.write("                <p id=\"checkpass\"></p>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <input type=\"text\" id=\"code_input\" value=\"\" placeholder=\"请输入验证码\" autocomplete=\"off\"/>\r\n");
      out.write("                    <div id=\"v_container\"></div>\r\n");
      out.write("                    <span id=\"verification\"></span>\r\n");
      out.write("                    <div class=\"clear\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <h3><input type=\"checkbox\">记住我<b>不是自己的电脑上不要勾选</b><a>无法验证?</a><a>忘记密码?</a></h3>\r\n");
      out.write("                <input type=\"button\" value=\"登录\" id=\"publish\">\r\n");
      out.write("                <input type=\"button\" value=\"注册\" id=\"register\">\r\n");
      out.write("                <h4><a id=\"weibo\">微博账号登录</a> <a id=\"qq\">QQ账号登录</a></h4>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"clear\">\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("<footer id=\"footer\">\r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"#\">关于我们</a></li><li>|</li>\r\n");
      out.write("            <li><a href=\"#\">联系我们</a></li><li>|</li>\r\n");
      out.write("            <li><a href=\"#\">人才招聘</a></li><li>|</li>\r\n");
      out.write("            <li><a href=\"#\">商家入驻</a></li><li>|</li>\r\n");
      out.write("            <li><a href=\"#\">手机牧之</a></li><li>|</li>\r\n");
      out.write("            <li><a href=\"#\">牧之社区</a></li><li>|</li>\r\n");
      out.write("            <li><a href=\"#\">牧之论坛</a></li><li>|</li>\r\n");
      out.write("            <li><a href=\"#\">牧之公益</a></li><li>|</li>\r\n");
      out.write("            <li><a href=\"#\">English Site</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <p>Copyright © 2015-2018  牧之MZ.com 版权所有</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("<script src=\"/js/jquery-3.3.1.js\"></script>\r\n");
      out.write("<script src=\"/js/Verification.js\"></script>\r\n");
      out.write("<script src=\"/js/checked.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
