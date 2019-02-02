<?php include_once 'componentes/conectar.php';?>
<?php include_once 'componentes/bancoexecuta.php';?>

<!DOCTYPE HTML>
<!-- BEGIN html -->
<html lang = "en">
	<!-- BEGIN head -->
	<head>
		<title>Briquilaus Corporation</title>

		<!-- Meta Tags -->
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta name="description" content="" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />

		<!-- Favicon -->
		<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon" />

		<!-- Stylesheets -->
		<link type="text/css" rel="stylesheet" href="css/reset.css" />
		<link type="text/css" rel="stylesheet" href="css/main-stylesheet.css" />
		<link type="text/css" rel="stylesheet" href="css/lightbox.css" />
		<link type="text/css" rel="stylesheet" href="css/shortcode.css" />
		<link type="text/css" rel="stylesheet" href="css/fonts.css" />
		<link type="text/css" rel="stylesheet" href="css/colors.css" />
		<!--[if lte IE 8]>
		<link type="text/css" rel="stylesheet" href="css/ie-ancient.css" />
		<![endif]-->
		<link type="text/css" rel="stylesheet" href="css/responsive.css" />

	<!-- END head -->
	</head>

	<!-- BEGIN body -->
	<body>

		<!-- BEGIN .boxed -->
		<div class="boxed">
			
			<?php include_once 'componentes/header.php';?>
			
			<!-- BEGIN .content -->
			<div class="content">
				
				<!-- BEGIN .wrapper -->
				<div class="wrapper">
					
					<div class="breaking-news">
						<span class="the-title">Produtos:</span>
						<ul>
							<li><a href="#">Produto teste</a></li>
						</ul>
					</div>

					<div class="main-content">

						<!-- BEGIN .main-page -->
						<div class="main-page left">

							<!-- BEGIN .double-block -->
							<div class="double-block">
								
								<!-- BEGIN .content-block -->
								<div class="content-block main right">
									
									
									
									<div class="block">
										<div class="block-title" style="background: #dd8229;">
											<a href="category.html" class="right">-</a>
											<h2>Conteudo do SIte</h2>
										</div>
										<div class="block-content">
										
										
	<table border="1">
		<tr>
			<td>Codigo</td>
			<td>Nome</td>
			<td>E-mail</td>
		</tr>
	<?php 
		$comando = "select * from cliente_cad";
		$resposta = mysqlexecuta ( $id, $comando );
		while ( $linha = mysql_fetch_array ( $resposta ) )
		{
	?>		
		<tr>
			<td><?php echo $linha['codigo']; ?></td>
			<td><?php echo $linha['nome']; ?></td>
			<td><?php echo $linha['email']; ?></td>
		</tr>
	<?php 
		}
		?>
	</table>										
										 
										 
										 
										</div>
									</div>

								<!-- END .content-block -->
								</div>
								
								<!-- BEGIN .content-block -->
								<div class="content-block left">

									<div class="block">
										<div class="featured-block">
											<div class="article-content">
												<h3><a href="post.html">Imagem esquerda</a><a href="post.html#comments" class="h-comment">43</a></h3>
												<span class="meta">
													<a href="blog.html"><span class="icon-text">&#128340; </span>11:20, 7.Oct 2013</a>
												</span>
											</div>
											<div class="article-photo">
												<a href="post.html" class="hover-effect"><img src="images/photos/image-8.jpg" alt="" /></a>
											</div>
										</div>
									</div>
																		
								<!-- END .content-block -->
								</div>

							<!-- END .double-block -->
							</div>

						<!-- END .main-page -->
						</div>
						
						<!-- BEGIN .main-sidebar -->
						<div class="main-sidebar right">
							
							<!-- BEGIN .widget -->
							<div class="widget">
								<a href="#" target="_blank"><img src="images/no-banner-300x250.jpg" alt="" /></a>
								<a href="contact-us.html" class="ad-link"><span class="icon-text">&#9652;</span>Advertisement<span class="icon-text">&#9652;</span></a>
							<!-- END .widget -->
							</div>
							
							
							

						<!-- END .main-sidebar -->
						</div>

						<div class="clear-float"></div>

					</div>
					
				<!-- END .wrapper -->
				</div>
				
			<!-- BEGIN .content -->
			</div>
			
			<!-- BEGIN .footer -->
			<?php include_once 'componentes/footer.php';?>
			

		<!-- Scripts -->
		<script type="text/javascript" src="jscript/jquery-latest.min.js"></script>
		<script type="text/javascript" src="jscript/theme-scripts.js"></script>
		<script type="text/javascript" src="jscript/lightbox.js"></script>

	<!-- END body -->
	</body>
<!-- END html -->
</html>