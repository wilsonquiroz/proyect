<%-- 
    Document   : RegistroPersonas
    Created on : 14-feb-2016, 18:11:45
    Author     : SHADY-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
     <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Transportes Urimar</title>
    </head>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link rel="stylesheet" href="stilos.css" type="text/css" />
    <body>

        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12">
                    <img id="logo" alt="Trasportes Urimar" src="img/banner4.jpg" width="100%" height="100%">
                    <div class="row">
                        <div class="col-md-12">

                            <nav class="navbar navbar-inverse">
                                <div class="container-fluid">
                                    <div class="navbar-header">
                                        <a class="navbar-brand" href="#"><span class="glyphicon glyphicon-th"> URIMAR</span></a>
                                    </div>
                                    <div>
                                        <ul class="nav navbar-nav">
                                            <li  class="active"><a href="Index.jsp"><span class="glyphicon glyphicon-home"></span> Inicio</a></li>
                                            <li><a href="somos.jsp"><span class="glyphicon glyphicon-briefcase"></span> Quiénes Somos</a></li>
                                            <li><a href="Instalaciones.jsp"><span class="glyphicon glyphicon-globe"></span> Instalaciones</a></li>
                                            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-info-sign"></span> Nuestros Servicios<span class="caret"></span></a>
                                                <ul class="dropdown-menu">
                                                    <li><a href="granel.jsp">Transporte a Granel</a></li>
                                                    <li><a href="contenedor.jsp">Transporte Contenedorizada</a></li>

                                                </ul>
                                            <li><a href="contacto.jsp"><span class="glyphicon glyphicon-envelope"> </span> Contáctenos</a></li>

                                        </ul>
                                    </div>

                                    <div>
                                        <form action="" class="navbar-form navbar-right">
                                            <a href="Login.jsp">
                                                <button type="button" class="btn btn-default"><span class="glyphicon glyphicon-user"> Login</span></button>
                                            </a>
                                        </form>


                                    </div>
                                </div>
                            </nav>	

                        </div>
                    </div>
                    <br>
                    <br>
                <table border='0px' width='200%' height='200px' align='center'>
                <div  style='width:700px ;margin:0 auto; margin-top:1em; margin-bottom:.1em'>
                
                
                <img class="imgcenter" src="img/regis.png">
                <font color="black" size="5"  face="arial" align="justify" >
                <center>
                <p> Registre aquí sus datos: </p>
                </center>
                
                
                </font>
                
                <form class="form-horizontal">
                <div class="form-group">
                <label class="control-label col-xs-3">Email:</label>
                <div class="col-xs-9">
                <input type="email" class="form-control" id="inputEmail" placeholder="Email">
                </div>
                
                </div>
                
                <br></br>
                
                <div class="form-group">
                <label class="control-label col-xs-3">Documento de identidad:</label>
                <div class="col-xs-9">
                <input type="password" class="form-control" id="inputPassword" placeholder="Ingresar identificación">
                </div>
                </div>
                
                <br></br>
                
                <div class="form-group">
                <label class="control-label col-xs-3">Password:</label>
                <div class="col-xs-9">
                <input type="password" class="form-control" id="inputPassword" placeholder="Password">
                </div>
                </div>
                
                <br></br>
                
                <div class="form-group">
                <label class="control-label col-xs-3">Confirmar Password:</label>
                <div class="col-xs-9">
                <input type="password" class="form-control" placeholder="Confirmar Password">
                </div>
                </div>
                <br></br>
                <div class="form-group">
                <label class="control-label col-xs-3">Nombre:</label>
                <div class="col-xs-9">
                <input type="text" class="form-control" placeholder="Nombre">
                </div>
                </div>
                <br></br>
                <div class="form-group">
                <label class="control-label col-xs-3">Apellido:</label>
                <div class="col-xs-9">
                <input type="text" class="form-control" placeholder="Apellido">
                </div>
                </div>
                <br></br>
                <div class="form-group">
                <label class="control-label col-xs-3" >Telefono:</label>
                <div class="col-xs-9">
                <input type="tel" class="form-control" placeholder="Telefono">
                </div>
                </div>
                <br></br>
                <div class="form-group">
                <label class="control-label col-xs-3">F. Nacimiento:</label>
                <div class="col-xs-3">
                <select class="form-control">
                <option>Dia</option>
                </select>
                </div>
                
                <div class="col-xs-3">
                <select class="form-control">
                <option>Mes</option>
                </select>
                </div>
                
                <div class="col-xs-3">
                <select class="form-control">
                <option>Año</option>
                </select>
                </div>
                </div>
                <br></br>
                <div class="form-group">
                <label class="control-label col-xs-3">Dirección:</label>
                <div class="col-xs-9">
                <textarea rows="3" class="form-control" placeholder="Dirección"></textarea>
                </div>
                </div>
                <br></br>
                <div class="form-group">
                <label class="control-label col-xs-3">Genero:</label>
                <div class="col-xs-2">
                <label class="radio-inline">
                <input type="radio" name="genderRadios" value="male"> Maculino
                </label>
                </div>
                
                <div class="col-xs-2">
                <label class="radio-inline">
                <input type="radio" name="genderRadios" value="female"> Femenino
                </label>
                </div>
                </div>
                
                <div class="form-group">
                <div class="col-xs-offset-3 col-xs-9">
                
                </div>
                </div> 
                <div class="form-group">
                
                <label class="control-label col-xs-3">Comentarios:</label>
                <div class="col-xs-9">
                <textarea rows="3" class="form-control" placeholder="Comentario"></textarea>
                </div>
                </div>
                <br></br>
                <div class="form-group">
                <div class="col-xs-offset-3 col-xs-9">
                <label class="checkbox-inline">
                <input type="checkbox" value="agree">  Accepto <a href="#">Terminos y condiciones</a>.
                </label>
                </div>
                </div>
                <br>
                
                
                
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