<!DOCTYPE html>

<!--[if IE 7]>
<html class="ie ie7" lang="en-US">
<![endif]-->

<!--[if IE 8]>
<html class="ie ie8" lang="en-US">
<![endif]-->

<!--[if IE 9]>
<html class="ie ie9" lang="en-US">
<![endif]-->

<!--[if !(IE 7) | !(IE 8) | !(IE 9)  ]><!-->
<html lang="en-US">
<!--<![endif]-->

<head>
<title>corrida</title>
<meta charset="UTF-8" />
<link rel="shortcut icon" href="images/favicon.png" title="Favicon" />
<meta name="viewport" content="width=device-width" />

<link rel='stylesheet' id='magz-style-css' href='style.css'
	type='text/css' media='all' />
<link rel='stylesheet' id='swipemenu-css' href='css/swipemenu.css'
	type='text/css' media='all' />
<link rel='stylesheet' id='bootstrap-css' href='css/bootstrap.css'
	type='text/css' media='all' />
<link rel='stylesheet' id='bootstrap-responsive-css'
	href='css/bootstrap-responsive.css' type='text/css' media='all' />
<link rel='stylesheet' id='simplyscroll-css'
	href='css/jquery.simplyscroll.css' type='text/css' media='all' />
<link rel='stylesheet' id='jPages-css' href='css/jPages.css'
	type='text/css' media='all' />
<link rel='stylesheet' id='rating-css' href='css/jquery.rating.css'
	type='text/css' media='all' />
<link rel='stylesheet' id='ie-styles-css' href='css/ie.css'
	type='text/css' media='all' />
<link rel='stylesheet' id='Roboto-css'
	href='http://fonts.googleapis.com/css?family=Roboto' type='text/css'
	media='all' />
<link rel='stylesheet' id='pretty-photo-css' href='css/prettyPhoto.css'
	type='text/css' media='screen' />

<script type='text/javascript' src="js/jquery-1.10.2.min.js"></script>
<script type='text/javascript' src='js/html5.js'></script>
<script type='text/javascript' src='js/bootstrap.min.js'></script>
<script type='text/javascript' src='js/jquery.rating.js'></script>
<script type='text/javascript' src='js/jquery.idTabs.min.js'></script>
<script type='text/javascript' src='js/jquery.simplyscroll.js'></script>
<script type='text/javascript' src='js/fluidvids.min.js'></script>
<script type='text/javascript' src='js/jPages.js'></script>
<script type='text/javascript' src='js/jquery.sidr.min.js'></script>
<script type='text/javascript' src='js/jquery.touchSwipe.min.js'></script>
<script type='text/javascript' src='js/jquery.swipemenu.init.js'></script>
<script type='text/javascript' src='js/custom.js'></script>
<script type='text/javascript' src='js/jquery.prettyPhoto.js'></script>

<script>
	jQuery(document).ready(function() {
	    jQuery("a[rel^='prettyPhoto']").prettyPhoto({
			social_tools : false,
			show_title : false
	    });
	});
</script>

<!-- END -->

</head>

<body>

	<div id="page">

		<div id="container">
		
		<?php include_once 'componentes/menu.php';?>
		<?php include_once 'componentes/noticiasmenu.php';?>
		<?php include_once 'componentes/ultimasnoticias.php';?>
		
	</div>

		<div id="content" class="container">

			<div id="main" class="row-fluid">

				<header class="entry-header">
					<h1 class="entry-title">
						<span>Carros de Corrida</span>
					</h1>
				</header>
				<!-- .entry-header -->


				<div class="row-fluid">

					<div class="kontengal2 span6">
						<article class="galleries">
							<a href="images/dummy/ccalpont.jpg"
								title="shutterstock_58382248" rel="prettyPhoto"><img width="570"
								height="360"
								src="images/dummy/ccalpont.jpg"
								alt="shutterstock_58382248" /></a>
							<h3 class="gal-title">
								<a href="#"
									title="Calpont carro pode chegar a 200 km/h"
									rel="bookmark">Calpont carro pode chegar a 200 km/h</a>
							</h3>
						</article>
					</div>


					<div class="kontengal2 span6">
						<article class="galleries">
							<a href="images/dummy/cferrari.jpg"
								title="shutterstock_70184773" rel="prettyPhoto"><img width="570"
								height="360"
								src="images/dummy/cferrari.jpg"
								alt="shutterstock_70184773" /></a>
							<h3 class="gal-title">
								<a href="#"
									title="Ferrari carro pode chegar a 500 km/h"
									rel="bookmark">Ferrari carro pode chegar a 500 km/h</a>
							</h3>
						</article>
					</div>

					<div class="kontengal2 span6">
						<article class="galleries">
							<a href="images/dummy/cporsche.jpg"
								title="shutterstock_109209743" rel="prettyPhoto"><img
								width="570" height="360"
								src="images/dummy/cporsche.jpg"
								alt="shutterstock_109209743" /></a>
							<h3 class="gal-title">
								<a href="#"
									title="Porsche"
									rel="bookmark">Porsche Carro baixo mas com muita velocidade</a>
							</h3>
						</article>
					</div>

					<div class="kontengal2 span6">
						<article class="galleries">
							<a href="images/dummy/crenauld.jpg"
								title="photodune-3517559-idea-s" rel="prettyPhoto"><img
								width="570" height="360"
								src="images/dummy/crenauld.jpg"
								alt="photodune-3517559-idea-s" /></a>
							<h3 class="gal-title">
								<a href="#"
									title="Renauld"
									rel="bookmark">Renauld querendo entrar para ramo de corrida</a>
							</h3>
						</article>
					</div>
				</div>

				<div class="clearfix"></div>
			</div>
			<!-- #main -->

		</div>
		<!-- #content -->

		<?php include_once 'componentes/footer.php';?>

</body>
</html>
