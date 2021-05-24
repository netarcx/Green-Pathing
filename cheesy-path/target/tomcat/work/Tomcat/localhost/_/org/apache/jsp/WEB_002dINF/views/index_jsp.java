/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-05-24 18:13:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Cheesy Path</title>\n");
      out.write("\n");
      out.write("        <script src='https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script>\n");
      out.write("        <script src='https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js'></script>\n");
      out.write("        <script type='text/javascript' src='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("'></script>\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link rel='shortcut icon' href='https://media.team254.com/homepage/icons/favicon32.png' />\n");
      out.write("        <link href='");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("' rel='stylesheet'>\n");
      out.write("    </head>\n");
      out.write("    <body onload='init()'>\n");
      out.write("        <input id='title' placeholder='Title' disabled>\n");
      out.write("        <div id='canvases'>\n");
      out.write("            <canvas id='background'></canvas>\n");
      out.write("            <canvas id='field'></canvas>\n");
      out.write("            <svg id='interactive'></svg>\n");
      out.write("        </div>\n");
      out.write("        <div class='buttonContainer'>\n");
      out.write("            <button onclick='addPoint()' class=\"icon-button\" title=\"Add Point\"><i class=\"material-icons\">add</i></button>\n");
      out.write("            <button onclick='update(false)' class=\"icon-button\" title=\"Refresh\"><i class=\"material-icons\">refresh</i></button>\n");
      out.write("            <button onclick='draw(3)' class=\"icon-button\" title=\"Animate\"><i class=\"material-icons\">play_arrow</i></button>\n");
      out.write("            <button onclick=\"showWaypointsList()\">Waypoints Code</button>\n");
      out.write("            <button id=\"resetButton\" onclick=\"restoreFromFile()\" class=\"icon-button\" title=\"Restore from file\"><i class=\"material-icons\">sync</i></button>\n");
      out.write("            <button id=\"openButton\" onclick=\"openFile()\" class=\"btn-pair-left\">Open</button>\n");
      out.write("            <button id=\"saveButton\" onclick=\"saveFile()\" class=\"btn-pair-center\">\n");
      out.write("                Save\n");
      out.write("                <span class=\"modified-indicator\">&bull;</span>\n");
      out.write("            </button>\n");
      out.write("            <button id=\"saveAsButton\" onclick=\"saveFileAs()\" class=\"btn-pair-right\">Save As</button>\n");
      out.write("            <div class=\"spacer\"></div>\n");
      out.write("            <select onchange='changeField(this.value)'>\n");
      out.write("                <option value=\"6_field1\" selected>6_field1</option>\n");
      out.write("                <option value=\"6_field2\">6_field2</option>\n");
      out.write("                <option value=\"7_field1\">7_field1</option>\n");
      out.write("                <option value=\"7_field2\">7_field2</option>\n");
      out.write("                <option value=\"7_field3\">7_field3</option>\n");
      out.write("                <option value=\"snowremoval\">Snow Removal</option>\n");
      out.write("                <option value=\"SnowThrower\">Snow Thrower</option>\n");
      out.write("            </select>\n");
      out.write("            <label class='checkbox'>Is reversed: <input type='checkbox' class='data-input' id='isReversed'></label>\n");
      out.write("        </div>\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <th></th>\n");
      out.write("                <th>X</th>\n");
      out.write("                <th>Y</th>\n");
      out.write("                <th>Heading</th>\n");
      out.write("                <th>Comments</th>\n");
      out.write("                <th>Enabled</th>\n");
      out.write("                <th>Delete</th>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td class='drag-handler'><i class=\"material-icons\">drag_indicator</i></td>\n");
      out.write("                    <td class='x'><input type='number' class='data-input' value='0'></td>\n");
      out.write("                    <td class='y'><input type='number' class='data-input' value='0'></td>\n");
      out.write("                    <td class='heading'><input type='number' class='data-input' value='0'></td>\n");
      out.write("                    <td class='comments'><input type='search' placeholder='Comments'></td>\n");
      out.write("                    <td class='enabled'><input type='checkbox' class='data-input' checked></td>\n");
      out.write("                    <td class='delete'>\n");
      out.write("                        <button onclick='$(this).parent().parent().remove();update()' class=\"icon-button\">\n");
      out.write("                            <i class='material-icons'>clear</i>\n");
      out.write("                        </button>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        <dialog id=\"waypointsDialog\">\n");
      out.write("            <button onclick='this.parentElement.close()' class=\"close-button\">&times;</button>\n");
      out.write("            <h3>Waypoints List</h3>\n");
      out.write("            <pre onclick=\"copyToClipboard()\"><code id=\"waypointsOutput\"></code></pre>\n");
      out.write("        </dialog>\n");
      out.write("        <div class=\"toast\" id=\"clipboardToast\">Copied to clipboard!</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $('table tbody').sortable({\n");
      out.write("        helper: fixWidthHelper,\n");
      out.write("        update: update,\n");
      out.write("        forcePlaceholderSize: true,\n");
      out.write("    }).disableSelection();\n");
      out.write("\n");
      out.write("    function fixWidthHelper(e, ui) {\n");
      out.write("        ui.children().each(function() {\n");
      out.write("            $(this).width($(this).width());\n");
      out.write("        });\n");
      out.write("        return ui;\n");
      out.write("    }\n");
      out.write("</script>\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/index.jsp(9,44) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/resources/js/script.js");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/views/index.jsp(13,20) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/resources/css/style.css");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }
}