<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Pets life</title>
		<!--google fonts-->
		<link href='http://fonts.googleapis.com/css?family=Oxygen:400,700' rel='stylesheet' type='text/css'>
		
		<!--general css-->
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="css/font-awesome.css">
		<link rel="stylesheet" type="text/css" href="css/custom.css">
		<link rel="stylesheet" type="text/css" href="css/responsive.css">
		<link rel="stylesheet" type="text/css" href="css/animate.css">	
		<link rel="stylesheet" type="text/css" href="css/style.css">
        
		<!--slider css-->
		<link rel="stylesheet" type="text/css" href="rs-plugin/css/settings.css" media="screen" />

		<!--scripts-->
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		<script type="text/javascript" src="js/magnet.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.js"></script>
		<script type="text/javascript" src="js/custom.js"></script>
		<script type="text/javascript" src="js/wow.js"></script>
		
		<!--slider js-->
		<script type="text/javascript" src="rs-plugin/js/jquery.themepunch.plugins.min.js"></script>
		<script type="text/javascript" src="rs-plugin/js/jquery.themepunch.revolution.js"></script>	
		

	
	
			
	</head>
	
<body>

<section id="header">
		<?php include_once 'componentes/header.php';?>
	</section><!--end header-->
	
	<section id="parallax">
		<div id="pets-parallax-head">
			<div id="parallax-overlay">
				<div class="container">
					<div class="row">
						<div class="col-md-12 col-xs-12 col-sm-12">
							<h4>&nbsp </h4>
							<h1>&nbsp </h1>
							<h2>&nbsp </h2>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section><!--end parallax-->

	<section id="portfolio">
		
			<div class="container">
				<div class="row">
					<div class="col-md-4 col-sm-4"></div>
						<div class="col-md-4 col-sm-4">
							<div class="heading">
								<h3>Galeria de fotos</h3>
								<p></p>
							</div>
						</div>
					<div class="col-md-4 col-sm-4"></div>
				</div>
				
				<div class="row">
					

					<div class="col-md-12 col-xs-12 content">
						<!-- Main container. This container it's selected in script.js to initialize Magnet -->
						<div id="container">
							<!-- Container with filters. This container it's selected by Magnet via magnet-filter class to get the filter of the clicked button -->
							<div class="magnet-filter btn-group">
								<button class="btn btn-default active" data-filter="*">Todos</button>
								<button class="btn btn-default" data-filter="puppies">Filhotes</button>
								<button class="btn btn-default" data-filter="cats">Gatos</button>
								<button class="btn btn-default" data-filter="rabbit">Coelhos</button>
								<button class="btn btn-default" data-filter="others">Outros</button>
							</div>
							<!-- Container with items. This container it's selected by Magnet via magnet class to show or hide when the match a filter -->
							<div class="magnet">
								<!-- Item. It's selected by Magnet via magnet-item class -->
								<div class="magnet-item puppies">
									
									<a href="#img3" class="image-gal" data-content="Click Here">
										<img src="images/gallery-images/dog.png" alt="dog">
									</a>
									
								</div>
								<!-- lightbox container hidden with CSS -->
									<a href="#_" class="lightbox" id="img3">
										<img src="images/gallery-images/dog.png" alt="dog">
										
									</a>
								<div class="magnet-item cats">
									<a href="#img4" class="image-gal" data-content="Click Here">
										<img src="images/gallery-images/cat.png" alt="dog">
									</a>
									
								</div>
								<!-- lightbox container hidden with CSS -->
									<a href="#_" class="lightbox" id="img4">
										<img src="images/gallery-images/cat.png" alt="dog">
										
									</a>
								<div class="magnet-item cats">
									<a href="#img5" class="image-gal" data-content="Click Here">
										<img src="images/gallery-images/cat1.png" alt="dog">
									</a>
									
								</div>
								<!-- lightbox container hidden with CSS -->
									<a href="#_" class="lightbox" id="img5">
										<img src="images/gallery-images/cat1.png" alt="dog">
									</a>	
								<div class="magnet-item puppies">
									<a href="#img6" class="image-gal" data-content="Click Here">
										<img src="images/gallery-images/dog1.png" alt="dog">
									</a>
									
								</div>
								<!-- lightbox container hidden with CSS -->
									<a href="#_" class="lightbox" id="img6">
										<img src="images/gallery-images/dog1.png" alt="dog">
										
									</a>

								<div class="magnet-item cats">
									<a href="#img7" class="image-gal" data-content="Click Here">
										<img src="images/gallery-images/cat2.png" alt="dog">
									</a>
									
								</div>
								<!-- lightbox container hidden with CSS -->
									<a href="#_" class="lightbox" id="img7">
										<img src="images/gallery-images/cat2.png" alt="dog">
										
									</a>
								<div class="magnet-item puppies">
									<a href="#img8" class="image-gal" data-content="Click Here">
										<img src="images/gallery-images/dog2.png" alt="dog">
									</a>
									
								</div>
								<!-- lightbox container hidden with CSS -->
									<a href="#_" class="lightbox" id="img8">
										<img src="images/gallery-images/dog2.png" alt="dog">
										
									</a>	
								<div class="magnet-item cats">
									<a href="#img9" class="image-gal" data-content="Click Here">
										<img src="images/gallery-images/cat3.png" alt="dog">
									</a>
									
								</div>
								<!-- lightbox container hidden with CSS -->
									<a href="#_" class="lightbox" id="img9">
										<img src="images/gallery-images/cat4.png" alt="dog">
										
									</a>
								<div class="magnet-item cats">
									<a href="#img10" class="image-gal" data-content="Click Here">
										<img src="images/gallery-images/cat4.png" alt="dog">
									</a>
									
								</div>
								<!-- lightbox container hidden with CSS -->
									<a href="#_" class="lightbox" id="img10">
										<img src="images/gallery-images/cat4.png" alt="dog">
									</a>

								<div class="magnet-item cats">
									<a href="#img11" class="image-gal" data-content="Click Here">
										<img src="images/gallery-images/cat5.png" alt="dog">
									</a>
									
								</div>
								<!-- lightbox container hidden with CSS -->
									<a href="#_" class="lightbox" id="img11">
										<img src="images/gallery-images/cat5.png" alt="dog">
										
									</a>

								<div class="magnet-item rabbit">
									<a href="#img12" class="image-gal" data-content="Click Here">
										<img src="images/gallery-images/rabbit.png" alt="dog">
									</a>
									
								</div>
								<!-- lightbox container hidden with CSS -->
									<a href="#_" class="lightbox" id="img12">
										<img src="images/gallery-images/rabbit.png" alt="dog">
										
									</a>

								<div class="magnet-item cats">
									<a href="#img13" class="image-gal" data-content="Click Here">
										<img src="images/gallery-images/cat6.png" alt="dog">
									</a>
									
								</div>
								<!-- lightbox container hidden with CSS -->
									<a href="#_" class="lightbox" id="img13">
										<img src="images/gallery-images/cat6.png" alt="dog">
										
									</a>

								<div class="magnet-item cats">
									<a href="#img14" class="image-gal" data-content="Click Here">
										<img src="images/gallery-images/cat7.png" alt="dog">
									</a>
									
								</div>
								<!-- lightbox container hidden with CSS -->
									<a href="#_" class="lightbox" id="img14">
										<img src="images/gallery-images/cat7.png" alt="dog">
										
									</a>
								<div class="magnet-item puppies">
									<a href="#img15" class="image-gal" data-content="Click Here">
										<img src="images/gallery-images/dog2.png" alt="dog">
									</a>
									
								</div>
								<!-- lightbox container hidden with CSS -->
									<a href="#_" class="lightbox" id="img15">
										<img src="images/gallery-images/dog2.png" alt="dog">
										
									</a>

								<div class="magnet-item others">
									<a href="#img16" class="image-gal" data-content="Click Here">
										<img src="images/gallery-images/other.png" alt="dog">
									</a>
									
								</div>
								<!-- lightbox container hidden with CSS -->
									<a href="#_" class="lightbox" id="img16">
										<img src="images/gallery-images/other.png" alt="dog">
										
									</a>	
								

								<div class="magnet-item others">
									<a href="#img20" class="image-gal" data-content="Click Here">
										<img src="images/gallery-images/other1.png" alt="dog">
									</a>
									
								</div>
								<!-- lightbox container hidden with CSS -->
									<a href="#_" class="lightbox" id="img20">
										<img src="images/gallery-images/other1.png" alt="dog">
										
									</a>
								
							</div>
						</div>
					</div>
				</div>
			</div>
		
	</section><!--end gallery-->

	<!--top pets-->
	<section id="top-pets">
		<div class="container">
			<div class="row">
				<div class="col-md-4 col-sm-4"></div>
				<div class="col-md-4 col-sm-4">
					<div class="heading">
						<h3>Top Animais do Mês</h3>
						<p>Novembro 2015</p>
					</div>
				</div>
				<div class="col-md-4 col-sm-4"></div>
			</div>
			<div class="row">
				<div class="col-md-4 col-sm-4">
					
					<a href="#img" class="image" data-content="Click Here">
						<img src="images/thumb2.png" alt="thumb">
					</a>
					<!-- lightbox container hidden with CSS -->
					<a href="#_" class="lightbox" id="img">
						<img src="images/thumb2.png" alt="thumb">
					</a>		
					<div class="num">
						<h3>1º</h3>
					</div>
				</div>
				
				<div class="col-md-4 col-sm-4">
					<a href="#img1" class="image" data-content="Click Here">
						<img src="images/thumb1.png" alt="thumb">
					</a>

					<!-- lightbox container hidden with CSS -->
					<a href="#_" class="lightbox" id="img1">
						<img src="images/thumb1.png" alt="thumb">
					</a>

					<div class="num">
						<h3>2º</h3>
					</div>

				</div>
				<div class="col-md-4 col-sm-4">
					
					<a href="#img2" class="image" data-content="Click Here">
						<img src="images/thumb2.png" alt="thumb">
					</a>

					<!-- lightbox container hidden with CSS -->
					<a href="#_" class="lightbox" id="img2">
						<img src="images/thumb2.png" alt="thumb">
						
					</a>

					<div class="num">
						<h3>3º</h3>
					</div>
				</div>
			</div>
		</div>

	</section><!--end top pets-->

	<!--footer-->
	<section id="footer">
		<?php include_once 'componentes/footer.php';?>
</body>
</html>

