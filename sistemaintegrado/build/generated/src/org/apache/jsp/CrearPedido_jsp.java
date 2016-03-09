package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CrearPedido_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <title>Transportes Urimar</title>\n");
      out.write(" \n");
      out.write("       ");
 HttpSession sesion = request.getSession();
    
         String usu= sesion.getAttribute("nombre").toString();
             
          
             
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"stilos.css\" rel=\"stylesheet\">\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <img id=\"logo\" alt=\"Trasportes Urimar\" src=\"img/logo.jpg\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("                            <nav class=\"navbar navbar-inverse\">\n");
      out.write("                                <div class=\"container-fluid\">\n");
      out.write("                                    <div class=\"navbar-header\">\n");
      out.write("                                        <a class=\"navbar-brand\" href=\"#\"><span class=\"glyphicon glyphicon-th\"> CLIENTE</span></a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <ul class=\"nav navbar-nav\">\n");
      out.write("                                            <li><a href=\"SesionCliente.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Inicio</a></li>\n");
      out.write("                                            <li class=\"active\" class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-info-sign\"></span> Pedidos<span class=\"caret\"></span></a>\n");
      out.write("                                                <ul class=\"dropdown-menu\">\n");
      out.write("                                                    <li ><a href=\"VerPedidosCliente.html\">Ver Pedidos</a></li>\n");
      out.write("                                                    <li class=\"active\"><a href=\"CrearPedidoCliente.jsp\">Crear Pedido</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            <li><a href=\"VerFacturasCliente.jsp\"><span class=\"glyphicon glyphicon-globe\"></span> Facturas</a></li>\n");
      out.write("                                            <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-info-sign\"></span> Estado de carga<span class=\"caret\"></span></a>\n");
      out.write("                                                <ul class=\"dropdown-menu\">\n");
      out.write("                                                    <li><a href=\"VerRutaCliente.jsp\">Estado de Ruta</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div>\n");
      out.write("                                        <form  class=\"navbar-form navbar-right\" >\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"Buscar...\">\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <button class=\"btn btn-default\" top=\"5\" href=\"#\"><span class=\"glyphicon glyphicon-search\"></span></button>\n");
      out.write("                                            <a href=\"Index.jsp\"><button type=\"button\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-off\"> Cerrar Sesion</span>\n");
      out.write("                                                </button></a>\n");
      out.write("                                        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </nav>\t\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!---Aqui va el contenido de la pagina---->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <img id=\"logo\" alt=\"Trasportes Urimar\" src=\"img/logo.jpg\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"container-fluid\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <center>\n");
      out.write("\n");
      out.write("                                                <br> </br>\n");
      out.write("\n");
      out.write("                                                <table border='0px' width='200%' height='200px' align='center'>\n");
      out.write("                                                    <div  style='width:700px ;margin:0 auto; margin-top:1em; margin-bottom:.1em'>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                        <font color=\"black\" size=\"5\"  face=\"arial\" align=\"justify\" >\n");
      out.write("                                                        <center>\n");
      out.write("                                                            <p> Registre Su Pedido: </p>\n");
      out.write("                                                        </center>\n");
      out.write("                                                        <br>\n");
      out.write("                                                            <div class=\"alert alert-success fade in\">\n");
      out.write("                                                            <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\n");
      out.write("                                                             <h3>\n");
      out.write("                                                            ");
 if (request.getAttribute("mensaje")!=null){
      out.write("\n");
      out.write("\n");
      out.write("                                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensaje}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("                                                            ");
}
      out.write("\n");
      out.write("                                                            </h3>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </font>\n");
      out.write("\n");
      out.write("                                                        <form class=\"form-horizontal\" method=\"post\" action=\"ServletPedido\">\n");
      out.write("                                                            <div class=\"form-group\">\n");
      out.write("                                                                <label class=\"control-label col-xs-3\">N-Pedido</label>\n");
      out.write("                                                                <div class=\"col-xs-9\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" id=\"pedido\" placeholder=\"Numero Pedido\" name=\"npedido\">\n");
      out.write("                                                                </div>\n");
      out.write("\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                            <br></br>\n");
      out.write("\n");
      out.write("                                                            <div class=\"form-group\">\n");
      out.write("                                                                <label class=\"control-label col-xs-3\">Origen</label>\n");
      out.write("                                                                <div class=\"col-xs-9\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" id=\"origen\" placeholder=\"origen\" name=\"origen\">\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                            <br></br>\n");
      out.write("\n");
      out.write("                                                            <div class=\"form-group\">\n");
      out.write("                                                                <label class=\"control-label col-xs-3\">Destino</label>\n");
      out.write("                                                                <div class=\"col-xs-9\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" id=\"destino\"  placeholder=\"destino\" name=\"destino\">\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                            <br></br>\n");
      out.write("\n");
      out.write("                                                            <div class=\"form-group\">\n");
      out.write("                                                                <label class=\"control-label col-xs-3\">Producto</label>\n");
      out.write("                                                                <div class=\"col-xs-9\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\"  placeholder=\"producto\" name=\"producto\">\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <br></br>\n");
      out.write("                                                            <div class=\"form-group\">\n");
      out.write("                                                                <label class=\"control-label col-xs-3\">Cantidad</label>\n");
      out.write("                                                                <div class=\"col-xs-9\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\"   placeholder=\"cantidad\" name=\"cantidad\">\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <br></br>\n");
      out.write("                                                            <div class=\"form-group\">\n");
      out.write("                                                                <label class=\"control-label col-xs-3\">Fecha Pedido</label>\n");
      out.write("                                                                <div class=\"col-xs-9\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" name=\"fechap\" placeholder=\"fecha\">\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <br></br>\n");
      out.write("                                                            <div class=\"form-group\">\n");
      out.write("                                                                <label class=\"control-label col-xs-3\" >Fecha Entrega En Plnata</label>\n");
      out.write("                                                                <div class=\"col-xs-9\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\"  placeholder=\"Entrega\" name=\"fechae\">\n");
      out.write("                                                                    <input type=\"hidden\" name=\"usuario\" value=\"");
      out.print(usu);
      out.write("\">\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <br></br>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input type=\"submit\" class=\"btn btn-success active\" value=\"Crear\" ><a></a>\n");
      out.write("\n");
      out.write("                                                    <a></a><input type=\"reset\" class=\"btn btn-default active\" value=\"Limpiar\"> \n");
      out.write("\n");
      out.write("                                                </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                </table>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!----Este es el footer---->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <img id=\"footer\" alt=\"Bootstrap Image Preview\" src=\"img/footer.png\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/scripts.js\"></script>\n");
      out.write("</body>\n");
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
