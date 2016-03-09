<%-- 
    Document   : Login
    Created on : 05-feb-2016, 23:03:11
    Author     : SHADY-
--%>

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
                <div class="col-md-12" >
                    <img id="logo" alt="Trasportes Urimar" src="img/logo.jpg">

                    <div class="pull-center">
                        <a href="Index.jsp"><button type="button" class="btn btn-danger btn-lg"><span class="glyphicon glyphicon-home"> Inicio</span></button></a>
                    </div>



                    <div class="container-fluid" >
                        <div class="row" >
                            <div class="col-md-4">

                            </div>
                            <div   class="col-md-4" >
                                <br><br><br>
                                <center> <img   src="img/acceso.png" class="img-responsive" class="img-circle" ></center>
                                <h2 class="text-center" >
                                    <font color="red">Inicio de  Sesion !</font> 
                                </h2>


                                <form role="form" action="ServletLogin" method="post">
                                    <div class="form-group">

                                        <label for="usuario">
                                            <h4 class="pull-center"><font color="black" >Nombre Usuario</font></h4>
                                        </label>
                                        <input type="text" class="form-control" id="usuario" name="usuario">
                                    </div>
                                    <div class="form-group">

                                        <label for="Password">
                                            <h4><font color="black"> Contraseña </font></h4>
                                        </label>
                                        <input type="password" class="form-control" id="pass" name="password">
                                    </div>
                                    <button type="submit" class="btn btn-lg btn-block btn btn-danger">
                                        Entrar
                                    </button>
                                    <div class="checkbox">


                                </form>
                                <br>

                                <a href="TipoRegistro.jsp"><button type="button" class="btn btn-lg btn-block btn btn-link">
                                        Registrarte!
                                    </button></a>



                                <div class="col-md-4">

                                </div>
                            </div>
                        </div>
                    </div>






                    <div class="row">
                        <div class="col-md-12">

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
