<%-- 
    Document   : RegistrosGenerales
    Created on : 21-feb-2016, 15:05:18
    Author     : SHADY-
--%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Transportes Urimar</title>
    </head>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="stilos.css" rel="stylesheet">
    <body background="" style="background-repeat: no-repeat; background-position: center center;"> 

        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12">
                    <img id="logo" alt="Trasportes Urimar" src="img/logo.jpg">

                    <div class="pull-center">
                        <a href="Index.jsp"><button type="button" class="btn btn-danger btn-lg"><span class="glyphicon glyphicon-home"> Inicio</span></button></a>
                    </div>
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-12">



                                <center>

                                    <br> </br>

                                    <table border='0px' width='200%' height='200px' align='center'>
                                        <div  style='width:700px ;margin:0 auto; margin-top:1em; margin-bottom:.1em'>


                                            <img class="imgcenter" src="img/regis.png">
                                            <font color="black" size="5"  face="arial" align="justify" >
                                            <center>
                                                <p> Registro de usuarios </p><br><br>
                                            </center>
                                            
                                            <div class="alert alert-info fade in">
                                            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                                             <h5>
                                            <% if (request.getAttribute("mensaje")!=null){%>

                                            ${mensaje}

                                            <%}%>
                                            </h5>
                                            
                                            </div>

                                            </font>

                                            <form class="form-horizontal" method="post" action="ServletRegistro" >
                                                <div class="form-group">
                                                    <label class="control-label col-xs-3">Identificacion:</label>
                                                    <div class="col-xs-9">
                                                        <input type="text" class="form-control" id="inputEmail" placeholder="id" name="id" required><br>
                                                    </div>
                                                    <label class="control-label col-xs-3">NombreUsuario:</label>
                                                    <div class="col-xs-9">
                                                        <input type="text" class="form-control" id="inputEmail" placeholder="usuario" name="usuario" required><br>
                                                    </div><br>

                                                </div>

                                                <br></br>

                                                <div class="form-group">
                                                    <label class="control-label col-xs-3">Nombre completo:</label>
                                                    <div class="col-xs-9">
                                                        <input type="text" class="form-control" id="inputPassword" placeholder="nombre" name="nombre" required><br>
                                                    </div>
                                                </div>

                                                <br></br>

                                                <div class="form-group">
                                                    <label class="control-label col-xs-3">Rol:</label><br>
                                                    <div class="col-xs-9">

                                                        <select name="rol">
                                                            <option value="Admin">--Administrador--</option> 
                                                            <option value="Asistente">--Asistente--</option> 
                                                            <option value="cliente">--Cliente--</option>
                                                            <option value="jefe">-Jefe Departamento-</option>

                                                        </select><br>
                                                    </div>
                                                </div>

                                                <br></br>

                                                <div class="form-group">
                                                    <label class="control-label col-xs-3">Password:</label>
                                                    <div class="col-xs-9">
                                                        <input type="hidden" name="txtopcion" value="1">
                                                        <input type="text" class="form-control" placeholder="Password" name="contrasena"><br>
                                                    </div>
                                                </div>
                                                <br></br>




                                                </br>
                                                <div class="form-group">



                                                    <div class="col-xs-offset-3 col-xs-9">
                                                        <input type="submit" class="btn btn-primary" value="Enviar">
                                                        <input type="reset" class="btn btn-default" value="Limpiar">

                                                        

                                                    </div>


                                                </div>




                                            </form>


                                    </table>
                            </div>

                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>

       
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
</body>
</html>