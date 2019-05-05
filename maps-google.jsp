<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<base href="${pageContext.request.contextPath}/Admin/">
    <meta charset="utf-8">
    <title>Avenxo Admin Theme</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-touch-fullscreen" content="yes">
    <meta name="description" content="Avenxo Admin Theme">
    <meta name="author" content="KaijuThemes">

    <link type='text/css' href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400italic,600' rel='stylesheet'>

    <link type="text/css" href="css/font-awesome.min.css" rel="stylesheet">        <!-- Font Awesome -->
    <link type="text/css" href="css/themify-icons.css" rel="stylesheet">              <!-- Themify Icons -->
    <link type="text/css" href="css/styles.css" rel="stylesheet">                                     <!-- Core CSS with all styles -->

    <link type="text/css" href="css/prettify.css" rel="stylesheet">                <!-- Code Prettifier -->
    <link type="text/css" href="css/blue.css" rel="stylesheet">              <!-- iCheck -->

    <!--[if lt IE 10]>
        <script type="text/javascript" src="assets/js/media.match.min.js"></script>
        <script type="text/javascript" src="assets/js/respond.min.js"></script>
        <script type="text/javascript" src="assets/js/placeholder.min.js"></script>
    <![endif]-->
    <!-- The following CSS are included as plugins and can be removed if unused-->
    

    </head>

    <body class="animated-content">
        
        <jsp:include page="Header.jsp"></jsp:include>

        <div id="wrapper">
            <div id="layout-static">
              <jsp:include page="Menu.jsp"></jsp:include>
                <div class="static-content-wrapper">
                    <div class="static-content">
                        <div class="page-content">
                            <ol class="breadcrumb">
                                
<li><a href="index.html">Home</a></li>
<li><a href="#">Maps</a></li>
<li class="active"><a href="maps-google.html">Google Maps</a></li>

                            </ol>
                            <div class="container-fluid">
                                

<div class="alert alert-info">
	<h3>Google Maps API</h3>
	<p>gmaps.js allows you to use the potential of Google Maps in a simple way. No more extensive documentation or large amount of code</p>
</div>

<div data-widget-group="group1">
    <div class="row">
        <div class="col-xs-12">
            <div class="panel panel-transparent">
                <div class="panel-heading">
                    <h2>Geolocation</h2>
                    
                </div>
                <div class="panel-body">
                    <div id="basic-map" style="height: 300px"></div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-xs-12">
            <div class="panel panel-transparent">
                <div class="panel-heading">
                    <h2>Routes</h2>
                    
                </div>
                <div class="panel-body">
                    <div id="advance-route" style="height: 300px">

                    </div>
                    <a href="#" id="start_travel" class="btn btn-primary" style="margin: 15px 0">Start</a>
                    <ul id="instructions">
                    </ul>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
            <div class="panel panel-transparent">
                <div class="panel-heading">
                    <h2>Street View Panoramas</h2>
                    
                </div>
                <div class="panel-body">
                    <div id="panorama" style="height: 300px"></div>
                </div>

            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-6">
            <div class="panel panel-transparent">
                <div class="panel-heading">
                    <h2>Fusion Tables layers</h2>
                    
                </div>
                <div class="panel-body">
                    <div id="fusion" style="height: 250px"></div>
                </div>
            </div>
        </div>

        <div class="col-md-6">
            <div class="panel panel-transparent">
                <div class="panel-heading">
                    <h2>Geocoding</h2>
                    
                </div>
                <div class="panel-body">
                    <div id="geocoding" style="height: 204px;"></div>
                    <form method="post" id="geocoding_form" class="form-inline" style="margin-top:10px">
                        <div class="form-group">
                            <label for="address" class="sr-only control-label">Address:</label>
                            <div class="input-group">
                                <input type="text" id="address" name="address" class="form-control" placeholder="Address..." />
                                <span class="input-group-btn">
                                    <input type="submit" class="btn btn-primary" value="Search" />
                                </span>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-6">
            <div class="panel panel-transparent">
                <div class="panel-heading">
                    <h2>Poly Lines</h2>
                    
                </div>
                <div class="panel-body">
                    <div id="polylines" style="height: 250px"></div>
                </div>
            </div>
        </div>

        <div class="col-md-6">
            <div class="panel panel-transparent">
                <div class="panel-heading">
                    <h2>Polygons</h2>
                    
                </div>
                <div class="panel-body">
                    <div id="polygons" style="height: 250px;"></div>
                </div>
            </div>
        </div>
    </div>
</div>


                            </div> <!-- .container-fluid -->
                        </div> <!-- #page-content -->
                    </div>
                    <footer role="contentinfo">
    <div class="clearfix">
        <ul class="list-unstyled list-inline pull-left">
            <li><h6 style="margin: 0;">&copy; 2015 Avenxo</h6></li>
        </ul>
        <button class="pull-right btn btn-link btn-xs hidden-print" id="back-to-top"><i class="ti ti-arrow-up"></i></button>
    </div>
</footer>
<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-44426473-4', 'auto');
  ga('send', 'pageview');

</script>

                </div>
            </div>
        </div>

    
    <!-- Switcher -->
    <div class="demo-options">
        <div class="demo-options-icon"><i class="ti ti-paint-bucket"></i></div>
        <div class="demo-heading">Demo Settings</div>

        <div class="demo-body">
            <div class="tabular">
                <div class="tabular-row">
                    <div class="tabular-cell">Fixed Header</div>
                    <div class="tabular-cell demo-switches"><input class="bootstrap-switch" type="checkbox" checked data-size="mini" data-on-color="success" data-off-color="default" name="demo-fixedheader" data-on-text="&nbsp;" data-off-text="&nbsp;"></div>
                </div>
                <div class="tabular-row">
                    <div class="tabular-cell">Boxed Layout</div>
                    <div class="tabular-cell demo-switches"><input class="bootstrap-switch" type="checkbox" data-size="mini" data-on-color="success" data-off-color="default" name="demo-boxedlayout" data-on-text="&nbsp;" data-off-text="&nbsp;"></div>
                </div>
                <div class="tabular-row">
                    <div class="tabular-cell">Collapse Leftbar</div>
                    <div class="tabular-cell demo-switches"><input class="bootstrap-switch" type="checkbox" data-size="mini" data-on-color="success" data-off-color="default" name="demo-collapseleftbar" data-on-text="&nbsp;" data-off-text="&nbsp;"></div>
                </div>
            </div>
        </div>

        <div class="demo-body">
            <div class="option-title">Topnav</div>
            <ul id="demo-header-color" class="demo-color-list">
                <li><span class="demo-cyan"></span></li>
                <li><span class="demo-light-blue"></span></li>
                <li><span class="demo-blue"></span></li>
                <li><span class="demo-indigo"></span></li>
                <li><span class="demo-deep-purple"></span></li> 
                <li><span class="demo-purple"></span></li> 
                <li><span class="demo-pink"></span></li> 
                <li><span class="demo-red"></span></li>
                <li><span class="demo-teal"></span></li>
                <li><span class="demo-green"></span></li>
                <li><span class="demo-light-green"></span></li>
                <li><span class="demo-lime"></span></li>
                <li><span class="demo-yellow"></span></li>
                <li><span class="demo-amber"></span></li>
                <li><span class="demo-orange"></span></li>               
                <li><span class="demo-deep-orange"></span></li>
                <li><span class="demo-midnightblue"></span></li>
                <li><span class="demo-bluegray"></span></li>
                <li><span class="demo-bluegraylight"></span></li>
                <li><span class="demo-black"></span></li> 
                <li><span class="demo-gray"></span></li> 
                <li><span class="demo-graylight"></span></li> 
                <li><span class="demo-default"></span></li>
                <li><span class="demo-brown"></span></li>
            </ul>
        </div>

        <div class="demo-body">
            <div class="option-title">Sidebar</div>
            <ul id="demo-sidebar-color" class="demo-color-list">
                <li><span class="demo-cyan"></span></li>
                <li><span class="demo-light-blue"></span></li>
                <li><span class="demo-blue"></span></li>
                <li><span class="demo-indigo"></span></li>
                <li><span class="demo-deep-purple"></span></li> 
                <li><span class="demo-purple"></span></li> 
                <li><span class="demo-pink"></span></li> 
                <li><span class="demo-red"></span></li>
                <li><span class="demo-teal"></span></li>
                <li><span class="demo-green"></span></li>
                <li><span class="demo-light-green"></span></li>
                <li><span class="demo-lime"></span></li>
                <li><span class="demo-yellow"></span></li>
                <li><span class="demo-amber"></span></li>
                <li><span class="demo-orange"></span></li>               
                <li><span class="demo-deep-orange"></span></li>
                <li><span class="demo-midnightblue"></span></li>
                <li><span class="demo-bluegray"></span></li>
                <li><span class="demo-bluegraylight"></span></li>
                <li><span class="demo-black"></span></li> 
                <li><span class="demo-gray"></span></li> 
                <li><span class="demo-graylight"></span></li> 
                <li><span class="demo-default"></span></li>
                <li><span class="demo-brown"></span></li>
            </ul>
        </div>



    </div>
<!-- /Switcher -->
    <!-- Load site level scripts -->

<!-- <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/jquery-ui.min.js"></script> -->

<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script> 							<!-- Load jQuery -->
<script type="text/javascript" src="js/jqueryui-1.10.3.min.js"></script> 							<!-- Load jQueryUI -->
<script type="text/javascript" src="js/bootstrap.min.js"></script> 								<!-- Load Bootstrap -->
<script type="text/javascript" src="js/enquire.min.js"></script> 									<!-- Load Enquire -->

<script type="text/javascript" src="js/velocity.min.js"></script>					<!-- Load Velocity for Animated Content -->
<script type="text/javascript" src="js/velocity.ui.min.js"></script>

<script type="text/javascript" src="js/wijets.js"></script>     						<!-- Wijet -->

<script type="text/javascript" src="js/prettify.js"></script> 				<!-- Code Prettifier  -->
<script type="text/javascript" src="js/bootstrap-switch.js"></script> 		<!-- Swith/Toggle Button -->

<script type="text/javascript" src="js/bootstrap-tabdrop.js"></script>  <!-- Bootstrap Tabdrop -->

<script type="text/javascript" src="js/icheck.min.js"></script>     					<!-- iCheck -->

<script type="text/javascript" src="js/jquery.nanoscroller.min.js"></script> <!-- nano scroller -->

<script type="text/javascript" src="js/application.js"></script>
<script type="text/javascript" src="js/demo.js"></script>
<script type="text/javascript" src="js/demo-switcher.js"></script>

<!-- End loading site level scripts -->
    
    <!-- Load page level scripts-->
    
<script src="http://maps.google.com/maps/api/js?sensor=true"></script>
<script type="text/javascript" src="js/gmaps.js"></script>
<script type="text/javascript" src="js/demo-gmaps.js"></script>

    <!-- End loading page level scripts-->

    </body>
</html>