package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Controlador.Pedidos;
import Controlador.ConsultaPedidos;
import java.util.List;
import Modelo.Entidad.BeanPedido;
import java.sql.ResultSet;

public final class VerPedidosCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
      out.write(" ");
      out.write('\n');
ArrayList<Pedidos> em = (ArrayList<Pedidos>) session.getAttribute("pedidos");
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
      out.write("                                            <li  class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-info-sign\"></span> Pedidos<span class=\"caret\"></span></a>\n");
      out.write("                                                <ul class=\"dropdown-menu\">\n");
      out.write("                                                    <li class=\"active\"><a href=\"VerPedidosCliente.jsp\">Ver Pedidos</a></li>\n");
      out.write("                                                    <li><a href=\"CrearPedido.jsp\">Crear Pedido</a></li>\n");
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
      out.write("                                        <form action=\"\" class=\"navbar-form navbar-right\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"Buscar...\">\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <button class=\"btn btn-default\" top=\"5\" href=\"login.html\"><span class=\"glyphicon glyphicon-search\"></span></button>\n");
      out.write("                                            <a href=\"Index.jsp\"><button type=\"button\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-off\"> CerrarSesion</span>\n");
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
      out.write("                    <div class=\"container\" >\n");
      out.write("\n");
      out.write("                        <h2>Pedidos</h2>\n");
      out.write("\n");
      out.write("                        <p><font color=\"red\" size=\"5\"  face=\"arial\" align=\"justify\" >Aquí puede ver el estado de su pedido: </font></p> \n");
      out.write("\n");
      out.write("                        <input type=\"text\" class=\"form-inline\"  align=\"right\" placeholder=\"Buscar pedido\">\n");
      out.write("\n");
      out.write("                        <button class=\"btn btn-default\" top=\"5\"><span class=\"glyphicon glyphicon-search\"></span></button>\n");
      out.write("\n");
      out.write("                        <br> </br>\n");
      out.write("                      \n");
      out.write("\n");
      out.write("                        \n");
      out.write("                          <h1 class=\"h1 text-center text-info\">TABLA PEDIDOS</h1>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <table class=\" table table-responsive\">\n");
      out.write("                <thead>\n");
      out.write("                <th>NUMERO PEDIDO</th>\n");
      out.write("                <th>ORIGEN</th>\n");
      out.write("                <th>DESTINO</th>\n");
      out.write("                <th>PRODUCTO</th>\n");
      out.write("                <th>CANTIDAD</th>\n");
      out.write("                <th>FECHA DE PEDIDO</th>\n");
      out.write("                <th>FECHA DE ENTREGA</th>\n");
      out.write("                <th>USUARIO</th>\n");
      out.write("                <th class=\"text-center\">OPCIONES</th>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
for (Pedidos e : em) {
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td> ");
      out.print( e.getIdpedido());
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( e.getOrigen());
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( e.getDestino());
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( e.getProducto());
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( e.getCantidad());
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( e.getFechapedido());
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( e.getFechaentrega());
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( e.getUsuario());
      out.write(" </td>\n");
      out.write("                        <td>\n");
      out.write("                            <form action=\"CRUD\" method=\"POST\">\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <input class=\"btn btn-primary\" type=\"submit\" value=\"EDITAR\" name=\"edit\">\n");
      out.write("                                    <input class=\"btn btn-danger\" type=\"submit\" value=\"ELIMINAR\" name=\"delete\">\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>   \n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                        \n");
      out.write("               </tbody>\n");
      out.write("            </table>\n");
      out.write("           \n");
      out.write("             \n");
      out.write("                         \n");
      out.write("             \n");
      out.write("       \n");
      out.write("        \n");
      out.write("\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!----Este es el footer---->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <img id=\"footer\" alt=\"Bootstrap Image Preview\" src=\"img/footer.png\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("    </body>\n");
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
