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
	</section><!--end header-->
	
	<section id="parallax">
		<div id="pets-parallax-head">
			<div id="parallax-overlay">
				<div class="container">
					<div class="row">
						<div class="col-md-12 col-xs-12 col-sm-12">
							<h4> &nbsp </h4>
							<h1> &nbsp </h1>
							<h2> &nbsp </h2>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section><!--end parallax-->

	<section id="contact">
		<div class="container">
			<div class="row">
				<div class="col-md-4 col-sm-3"></div>
				<div class="col-md-4 col-sm-6 col-xs-12">
					<div class="heading">
						<h3>Contato</h3>
					</div>
				</div>
				<div class="col-md-4 col-sm-3"></div>
			</div>
			<div class="row">
				<div class="col-md-9 col-sm-9 ">
					<div class="form-heading">
						<h4>Formulário de Contato</h4>
					</div>
					<div id="form">
						<form action="envia.php" name="form_contato" method="post" > 
							
							<input type="text" name="txnome" placeholder="nome">				
							<input type="email" name="txemail" placeholder="email">
							<input type="text" name="txassunto" placeholder="assunto">
							<input type="tel" name="txtelefone" placeholder="telefone">
							<textarea></textarea>
							<input type="submit" name="txmensagem" value="Enviar">
						</form>
					</div>
				</div>

				
			</div>
		</div>
	
		<!--footer-->
	<section id="footer">
			<?php include_once 'componentes/footer.php';?>
		</section><!--end footer-->
</body>
</html>