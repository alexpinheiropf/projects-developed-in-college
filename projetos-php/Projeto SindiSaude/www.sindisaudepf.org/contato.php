<!DOCTYPE html>
<html class="no-js" lang="pt-br">
<head>
	<?php include_once 'componentes/title.php';?>
</head>
<body>
	<!--Start Header-->
    <?php include_once 'componentes/header.php';?>
	<!--End Header-->

	<!--start wrapper-->
	<section class="wrapper">
		<section class="page_head">
			<div class="container">
				<div class="row">
					<div class="col-lg-12 col-md-12 col-sm-12">
						<h2>Contato</h2>
						<nav id="breadcrumbs">
							<ul>
								<li>Você está:</li>
								<li><a href="index.php">Home</a></li>
								<li>Contato</li>
							</ul>
						</nav>
					</div>
				</div>
			</div>
		</section>



		<section class="content contact">

			<div class="container">
				<div class="row sub_content">
					<div class="col-lg-12 col-md-12 col-sm-12">
						<div class="maps">

							<iframe width="100%" height="380px" frameborder="0"
								scrolling="no" marginheight="0" marginwidth="0"
								src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d4179.15914060714!2d-52.4209722912238!3d-28.2607404555997!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94e2bf7d2f06a1dd%3A0xb378aface15816e9!2sSindisaude!5e0!3m2!1spt-BR!2sbr!4v1469734106447"
								frameborder="0" style="border: 0" allowfullscreen></iframe>
						</div>
					</div>
				</div>


				<div class="row sub_content">
					<div class="col-lg-8 col-md-8 col-sm-8">
						<div class="dividerHeading">
							<h4>
								<span>Fale Conosco</span>
							</h4>
						</div>

						<!-- <div class="alert alert-success hidden alert-dismissable"
							id="contactSuccess">
							<button type="button" class="close" data-dismiss="alert"
								aria-hidden="true">&times;</button>
							<strong>Success!</strong> Your message has been sent to us.
						</div>

						<div class="alert alert-error hidden" id="contactError">
							<button type="button" class="close" data-dismiss="alert"
								aria-hidden="true">&times;</button>
							<strong>Error!</strong> There was an error sending your message.
						</div> -->

						<form id="contactForm" method="POST" action="enviar.php" >
							<div class="row">
								<div class="form-group">
									<div class="col-lg-6 col-md-6 col-sm-6">
										<input type="text" id="nome" name="nome" class="form-control"
											maxlength="100"
											 placeholder="Digite seu Nome">
									</div>
									<div class="col-lg-6 col-md-6 col-sm-6">
										<input type="email" id="email" name="email"
											class="form-control" maxlength="100"
											 placeholder="Digite seu e-mail">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group">
									<div class="col-md-12">
										<input type="text" id="assunto" name="assunto"
											class="form-control" maxlength="100"
											placeholder="Assunto">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group clearfix">
									<div class="col-md-12">
										<textarea id="mensagem" class="form-control" name="mensagem"
											rows="10" cols="50"
											maxlength="5000" placeholder="Por Favor insira sua Mensagem"></textarea>

									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-12">
									<input type="submit" 
										class="btn btn-default btn-lg" value="Enviar">
								</div>
							</div>
						</form>
					</div>

					
					<!-- Informações do Contato na lateral -->
					<div class="col-lg-4 col-md-4 col-sm-4">
						<div class="sidebar">
							<div class="widget widget_info">
								<div class="dividerHeading">
									<h4>
										<span>Informações do Contato</span>
									</h4>
									<b></b>
								</div>
								<ul class="widget_info_contact">
									<li><i class="fa fa-map-marker"></i>
										<p>
											<strong>Endereço</strong> Rua Eduardo de Britto, 168
										</p></li>
									<li><i class="fa fa-user"></i>
										<p>
											<strong>Fone</strong> 54 3312.4200
										</p></li>
									<li><i class="fa fa-envelope"></i>
										<p>
											<strong>E-mail</strong> contato@sindisaudepf.org
										</p></li>

									<li><i class="fa fa-envelope"></i>
										<p>
											<strong>E-mail</strong> secretaria@sindisaudepf.org
										</p></li>

									<li>
										<h2>
											<strong>Horário de Atendimento</strong>
										</h2> 
										<h3>
										Das 08:30 às 11:30 e </br>
										Das 13:45 às 17:30</h3>
									</li>




								</ul>

							</div>

							<div class="widget widget_social">
								<div class="dividerHeading">
									<h4>
										<span>Mídias Sociais</span>
									</h4>

								</div>
								<ul class="widget widget_social">
									<li><a class="fb" href="https://www.facebook.com/sindisaudepf"
										target="_blank" data-placement="bottom" data-toggle="tooltip"
										title="Facbook"><i class="fa fa-facebook"></i></a></li>
									<li><a class="twtr" href="https://twitter.com/?lang=pt-br"
										target="_blank" data-placement="bottom" data-toggle="tooltip"
										title="Twitter"><i class="fa fa-twitter"></i></a></li>
									<li><a class="gmail" href="https://plus.google.com/"
										target="_blank" data-placement="bottom" data-toggle="tooltip"
										title="Google"><i class="fa fa-google-plus"></i></a></li>
									<li><a class="instagram"
										href="https://www.instagram.com/?hl=pt-br" target="_blank"
										data-placement="bottom" data-toggle="tooltip"
										title="Instagram"><i class="fa fa-instagram"></i></a></li>
									<li><a class="youtube"
										href="https://www.youtube.com/channel/UCrmFAwS1fUVwWe_bPVSUc9w"
										target="_blank" data-placement="bottom" data-toggle="tooltip"
										title="Youtube"><i class="fa fa-youtube"></i></a></li>
									<li><a class="linkedin"
										href="https://www.linkedin.com/portugues" target="_blank"
										data-placement="bottom" data-toggle="tooltip" title="Linkedin"><i
											class="fa fa-linkedin"></i></a></li>
									<li><a class="rss" href="noticias.php" data-placement="bottom"
										data-toggle="tooltip" title="RSS"><i class="fa fa-rss"></i></a></li>
								</ul>
							</div>

							<div class="our_clients">
								<ul class="client_items clearfix">
									<li class="col-sm-3 col-md-3 col-lg-3"><a
										href="http://sindisaudepf.org/" data-placement="bottom"
										data-toggle="tooltip" title="cut"> <img
											src="img/logo_sindisaude.png" alt="" width="380" height="95" /></a></li>
								</ul>
							</div>

						</div>
					</div>

				</div>
			</div>
		</section>
	</section>
	<!--start footer-->
	<script type="text/javascript" src="js/vendor/jquery-1.10.2.min.js"></script>
	<?php include_once 'componentes/footer.php'; ?>
	
</body>
</html>
