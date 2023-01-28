package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.connection.*;
import java.sql.*;

public final class my_002dorders_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Online Shopping System</title>\r\n");
      out.write("        <!-- Importing all ui libs -->\r\n");
      out.write("        <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("        <script src=\"js/simpleCart.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,900,900italic,700italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"js/jquery.easing.min.js\"></script>\r\n");
      out.write("        <script src=\"jquery-3.2.1.min.js\"></script>\r\n");
      out.write("        <script src='../../../../../../ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js'></script>\r\n");
      out.write("        <script src=\"../../../../../../m.servedby-buysellads.com/monetization.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            //Checking whether customer in session or not
            if (session.getAttribute("name") != null && session.getAttribute("name") != "") {
        
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"ban-top\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"top_nav_left\">\r\n");
      out.write("                    <nav class=\"navbar navbar-default\">\r\n");
      out.write("                        <div class=\"container-fluid\">\r\n");
      out.write("                            <div class=\"navbar-header\">\r\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("                                    <span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"top_nav_right\">\r\n");
      out.write("                        <div class=\"cart box_1\">\r\n");
      out.write("                            <a href=\"checkout.jsp\"> \r\n");
      out.write("                            ");

                                //Getting count of products of cart
                                ResultSet resultCount = DatabaseConnection.getResultFromSqlQuery("select count(*) from tblcart where customer_id='" + session.getAttribute("id") + "'");
                                resultCount.next();
                                int count = resultCount.getInt(1);
                            
      out.write("\r\n");
      out.write("                            <h3>\r\n");
      out.write("                                <div class=\"total\">\r\n");
      out.write("                                    <i class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    (\r\n");
      out.write("                                    ");
      out.print(count);
      out.write("\r\n");
      out.write("                                    items )\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </h3>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            <a href=\"javascript:;\" class=\"simpleCart_empty\">My Cart</a>\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clearfix\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"page-head\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <h3>My Orders</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"checkout\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <h3>My Orders</h3>\r\n");
      out.write("                <div class=\"table-responsive\">\r\n");
      out.write("                    <table class=\"table table-bordered\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>SR.No</th>\r\n");
      out.write("                                <th>Order No</th>\r\n");
      out.write("                                <th>Product</th>\r\n");
      out.write("                                <th>Quantity</th>\r\n");
      out.write("                                <th>MRP($)</th>\r\n");
      out.write("                                <th>Selling Price($)</th>\r\n");
      out.write("                                <th>Total Price($)</th>\r\n");
      out.write("                                <th>Order Date</th>\r\n");
      out.write("                                <th>Status</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        ");

                            int index = 0;
                            //Getting all products
                            ResultSet totalProduct = DatabaseConnection.getResultFromSqlQuery("select * from tblorders where customer_name='" + session.getAttribute("name") + "' ");
                            while (totalProduct.next()) {
                                index++;
                        
      out.write("\r\n");
      out.write("                        <tr class=\"rem1\">\r\n");
      out.write("                            <td class=\"invert\">");
      out.print(index);
      out.write("</td>\r\n");
      out.write("                            <td class=\"invert\">");
      out.print(totalProduct.getInt(18));
      out.write("</td>\r\n");
      out.write("                            <td class=\"invert\"><img src=uploads/");
      out.print(totalProduct.getString(9));
      out.write(" style=\"width: 150px; height: 100px;\"><br>");
      out.print(totalProduct.getString(10));
      out.write("</td>\r\n");
      out.write("                            <td class=\"invert\">");
      out.print(totalProduct.getString(11));
      out.write("</td>\r\n");
      out.write("                            <td class=\"invert\"><del>");
      out.print(totalProduct.getString(12));
      out.write("</del></td>\r\n");
      out.write("                            <td class=\"invert\">");
      out.print(totalProduct.getString(13));
      out.write("</td>\r\n");
      out.write("                            <td class=\"invert\">");
      out.print(totalProduct.getString(14));
      out.write("</td>\r\n");
      out.write("                            <td class=\"invert\">");
      out.print(totalProduct.getString(16));
      out.write("</td>\r\n");
      out.write("                            ");

                                //If order is delivered
                                if (totalProduct.getString(15).equals("Deliver")) {
                            
      out.write("\r\n");
      out.write("                            <td><span class=\"label label-success\"><strong>Delivered</strong></span></td>\r\n");
      out.write("                            ");

                            } else {
                            
      out.write("\r\n");
      out.write("                            <td><span class=\"label label-danger\"><strong>Pending</strong></span></td>\r\n");
      out.write("                            ");

                                }
                            
      out.write("\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");

                            }
                        
      out.write("\r\n");
      out.write("                        <script>\r\n");
      out.write("                            $('.value-plus').on('click', function () {\r\n");
      out.write("                                var divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10) + 1;\r\n");
      out.write("                                divUpd.text(newVal);\r\n");
      out.write("                            });\r\n");
      out.write("\r\n");
      out.write("                            $('.value-minus').on('click', function () {\r\n");
      out.write("                                var divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10) - 1;\r\n");
      out.write("                                if (newVal >= 1)\r\n");
      out.write("                                    divUpd.text(newVal);\r\n");
      out.write("                            });\r\n");
      out.write("                        </script>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("        ");

            } else {
                response.sendRedirect("index.jsp");
            }
        
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
