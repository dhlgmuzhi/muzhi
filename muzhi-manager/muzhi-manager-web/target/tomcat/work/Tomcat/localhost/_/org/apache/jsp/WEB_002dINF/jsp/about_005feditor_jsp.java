/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-10-10 01:21:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_005feditor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <title>关于我们编辑</title>\r\n");
      out.write("    <link href=\"/css/bootstrap.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"/css/base.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"/css/about_editor.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <nav class=\"navbar navbar-default row navbar-fixed-top\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#nav-list-left\" aria-expanded=\"false\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">牧之后台管理系统</a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"collapse navbar-collapse pull-right\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img class=\"img-circle pull-left img-responsive nav-user-img\" src=\"/img/user/user.jpg\" /><span class=\"pull-left nav-username\">&nbsp;管理员</span></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"row\" style=\"margin-top:70px\">\r\n");
      out.write("        <div class=\"  nav-left col-md-2 no-padding\" id=\"nav-list-left\">\r\n");
      out.write("            <div class=\"user-panel\">\r\n");
      out.write("                <img src=\"/img/user/user.jpg\" class=\"img-circle center-block\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"nav-list\">\r\n");
      out.write("                <ul id=\"list-down\">\r\n");
      out.write("                    <li class=\"nav-left-dropdown\">\r\n");
      out.write("                        <a href=\"#\">商品管理</a>\r\n");
      out.write("                        <ul class=\"nav-left-dropdown-menu\">\r\n");
      out.write("                            <li><a href=\"#\">添加商品</a></li>\r\n");
      out.write("                            <li><a href=\"#\">查询商品</a></li>\r\n");
      out.write("                            <li><a href=\"#\">修改商品</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">客户管理</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">订单管理</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">收入管理</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">系统设置</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">广告管理</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-md-10 col-md-offset-2\">\r\n");
      out.write("    \r\n");
      out.write("        <form action=\"/add/item\" method=\"post\" id=\"SubForm\"  enctype=\"multipart/form-data\">\r\n");
      out.write("            <div class=\"about_editor\">\r\n");
      out.write("                <span>商品类别：</span>\r\n");
      out.write("                <select class=\"select_body\">\r\n");
      out.write("                    <option>服饰</option>\r\n");
      out.write("                    <option>国画</option>\r\n");
      out.write("                    <option>雕刻</option>\r\n");
      out.write("                    <option>编制</option>\r\n");
      out.write("                    <option>饰品</option>\r\n");
      out.write("                </select>\r\n");
      out.write("                <select class=\"select_second\">\r\n");
      out.write("                    <option>汉服</option>\r\n");
      out.write("                    <option>唐装</option>\r\n");
      out.write("                    <option>旗袍</option>\r\n");
      out.write("                    <option>民族服饰</option>\r\n");
      out.write("                </select><br>\r\n");
      out.write("                <span>商品名称：</span><input type=\"text\" autocomplete=\"off\" id=\"name\" name=\"names\"><br>\r\n");
      out.write("                <span>商品价格：</span><input type=\"text\" autocomplete=\"off\" id=\"price\" name=\"price\"><br>\r\n");
      out.write("                <span>商品折扣：</span><input type=\"text\" autocomplete=\"off\" id=\"discount\" name=\"discount\"><br>\r\n");
      out.write("                <span>商品库存：</span><input type=\"text\" autocomplete=\"off\" id=\"stock\" name=\"stock\"><br>\r\n");
      out.write("                <div class=\"box\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <span>详细内容：</span>\r\n");
      out.write("                <textarea id=\"editor_id\" name=\"desc\">\r\n");
      out.write("            </textarea>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary clin\" id=\"publish\"><span>添加</span></button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary clin\"><span>重置</span></button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script src=\"/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script charset=\"utf-8\" src=\"/kindeditor-master/kindeditor-all.js\"></script>\r\n");
      out.write("<script charset=\"utf-8\" src=\"/kindeditor-master/lang/zh-CN.js\"></script>\r\n");
      out.write("<script src=\"/js/imgFileupload.js\"></script>\r\n");
      out.write("<script src=\"/js/public.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t\r\n");
      out.write("\t/* 向后台申请数据填写类目  */\r\n");
      out.write("\t$.get(\"/get/list\", function(data){\r\n");
      out.write("\t  /* var result = JSON.parse(data.data);\r\n");
      out.write("\t  var json = JSON.stringify( result.hashMap );\r\n");
      out.write("\t  var json2 = JSON.parse( json );\r\n");
      out.write("\t  alert(json2.length)\r\n");
      out.write("\t   */\r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t var result =  JSON.parse( data.data );\r\n");
      out.write("\t result. \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  alert(\"\");\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("     var options = {\r\n");
      out.write("        resizeType: 0,\r\n");
      out.write("        uploadJson: \"/pic/uploadPic\", //指定图片上传的url路径，server端写一个视图来处理上传的图片\r\n");
      out.write("        filePostName  : \"uploadFile\", //表单提交中file组件的名称\r\n");
      out.write("        extraFileUploadParams: {\r\n");
      out.write("            \"csrfmiddlewaretoken\": \"{{ csrf_token }}\"\r\n");
      out.write("        }\r\n");
      out.write("     };\r\n");
      out.write("     \r\n");
      out.write("\tvar\titemAddEditor = KindEditor.create(\"#editor_id\", options); //为指定元素创建富文本编辑器 \r\n");
      out.write("    \r\n");
      out.write("   $(\"#publish\").click(function(){\r\n");
      out.write("\t    //将编辑器中的内容同步到隐藏多行文本中\r\n");
      out.write("   \t\titemAddEditor.sync();\r\n");
      out.write("   \t\t//表单提交\r\n");
      out.write("   \t\t$(\"#SubForm\").submit();\r\n");
      out.write("   })\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\t   //数组转json\r\n");
      out.write("\tvar arr = [1,2,3,4,5];\r\n");
      out.write("\tcc.sys.localStorage.setItem(\"key\", JSON.stringify(arr).toString());\r\n");
      out.write("\t            \r\n");
      out.write("\t//json转数组                \r\n");
      out.write("\tvar jsonStr = cc.sys.localStorage.getItem(\"key\");\r\n");
      out.write("\tvar v = JSON.parse(jsonStr);\r\n");
      out.write("\tconsole.log(v[1], v[2]);\r\n");
      out.write("\t//2 3\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
