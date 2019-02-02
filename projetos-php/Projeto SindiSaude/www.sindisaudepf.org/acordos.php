<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie ie8" class="no-js" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html class="no-js" lang="pt-br">
<!--<![endif]-->
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
						<h2>Acordos e Convenções</h2>
						<nav id="breadcrumbs">
							<ul>
								<li>Você está:</li>
								<li><a href="index.php">Home</a></li>
								<li><a>Dissídios</a></li>
								<li>Acordos e Convenções</li>
							</ul>
						</nav>
					</div>
				</div>
				<!--./row-->
			</div>
			<!--./Container-->
		</section>

		<section class="content elements">
			<div class="container">

				<!-- Inicio Acordos Coletivos -->
				<div class="col-lg-12 col-md-12 col-sm-12">
					<div class="dividerHeading">
						<h4>
							<span>Acordos Coletivos</span>
						</h4>

					</div>
				</div>
				<!-- Acordo 2018 -->
				<?php include_once 'acordos_coletivos/2018/a_2018.php';?>
				
				<!-- Acordo 2017 -->
				<?php include_once 'acordos_coletivos/2017/a_2017.php';?>

				<!-- Acordo 2016 -->
				<?php include_once 'acordos_coletivos/2016/a_2016.php';?>

				<!-- Acordo 2015 -->
				<?php include_once 'acordos_coletivos/2015/a_2015.php';?>
				
				<!-- Acordo 2013 -->
				<?php include_once 'acordos_coletivos/2013/a_2013.php';?>
				<!-- Final Acordos Coletivos -->

				<!-- Inicio Convenções Coletivas -->
				<div class="col-lg-12 col-md-12 col-sm-12">
					<div class="dividerHeading">
						<h4>
							<span>Convenções Coletivas</span>
						</h4>

					</div>
				</div>
				<?php include_once 'acordos_coletivos/2017/c_2017.php';?>
				
				<?php include_once 'acordos_coletivos/2016/c_2016.php';?>
				
				<?php include_once 'acordos_coletivos/2013/c_2013.php';?>
				<!-- Final Convenções Coletivas -->

			</div>
		</section>
	</section>

	<!--end wrapper-->


	<!--start footer-->
	<script type="text/javascript" src="js/vendor/jquery-1.10.2.min.js"></script>
	<?php include_once 'componentes/footer.php'; ?>
	<!-- End footer -->
</body>
</html>
