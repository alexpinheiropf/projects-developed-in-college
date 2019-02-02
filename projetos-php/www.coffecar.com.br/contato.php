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
<title>Contato</title>
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
<script type="text/javascript" src="funcoes.js"></script>


<script>

function initialize() {
  var myLatlng = new google.maps.LatLng(-6.914744,107.609811);
  var mapOptions = {
    zoom: 14,
    center: myLatlng
  }
  var map = new google.maps.Map(document.getElementById('googleMap'), mapOptions);

  var marker = new google.maps.Marker({
      position: myLatlng,
      map: map,
      title: 'Bandung Kota Kembang Gula'
  });
}

google.maps.event.addDomListener(window, 'load', initialize);

	
</script>

<!-- END -->

</head>

<body>

	<div id="page">

		<div id="page">
			<div id="container">
		
		<?php include_once 'componentes/menu.php';?>
		<?php include_once 'componentes/noticiasmenu.php';?>
		<?php include_once 'componentes/ultimasnoticias.php';?>
		
	</div>
			<div id="content" class="container">

				<div id="main" class="row-fluid">
					<div id="main-center" class="span8">

						<article id="post-206"
							class="post-206 page type-page status-publish hentry instock">
							<header class="entry-header"  >
								<h1 class="entry-title">
									<span>Contato</span>
								</h1>
							</header>
							<!-- .entry-header -->
							<iframe
								src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3514.0987290934013!2d-52.397129100000015!3d-28.265023!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94e2bf848c15afa9%3A0x998d003b68100b99!2sFaculdade+Meridional+-+Imed!5e0!3m2!1spt-BR!2sbr!4v1442084240541"
								width="600" height="400" frameborder="0" style="border: 0"
								allowfullscreen></iframe>
							<br />
							<form class="contact-form" action="controller.php" onsubmit="return validaform(this);" method="post" >
								<div class="cform name">
									<input type="text" name="cf_name" id="cf_name" size="50"
										maxlength="50" value="" placeholder="Digite seu nome" />
								</div>
								<div class="cform email">
									<input type="text" name="cf_email" id="cf_email" size="50"
										maxlength="50" value="" placeholder="Digite seu e-mail" />
								</div>

								<div class="cform website">
									<input type="text" name="txfone" id="txfone" size="14"
										maxlength="12" value="" placeholder="Fone"
										onkeypress="formata_campo(this,'##-####-####'); return valnumeros(event) "/>
								</div>
								
								<div class="clearfix"></div>

								<div>
									<textarea name="cf_message" id="cf_message" cols="50" rows="3"
										placeholder="Insira sua mensagem"></textarea>
								</div>
								<div>
									<input type="submit" value="Enviar" name="send" id="cf_send" />
								</div>
							</form>
						</article>

					</div>
					<!-- #main-left -->

				</div>
				<!-- #main -->

			</div>
			<!-- #content -->

			<?php include_once 'componentes/footer.php';?>

		</div>
		<!-- #wrapper -->

</body>
</html>
