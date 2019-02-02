<header id="header" class="container">
	<div id="mast-head">
		<div id="logo">
			<a href="index.php" title="CoffeCar" rel="home"><img
				src="images/logo.png" alt="CoffeCar" /></a>
		</div>
	</div>


	<nav class="navbar navbar-inverse clearfix nobot">

		<a id="responsive-menu-button" href="#swipe-menu"> <span
			class="icon-bar"></span> <span class="icon-bar"></span> <span
			class="icon-bar"></span>
		</a>

		<!-- Responsive Navbar Part 2: Place all navbar contents you want collapsed withing .navbar-collapse.collapse. -->
		<div class="nav-collapse" id="swipe-menu-responsive">

			<ul class="nav">

				<li><span id="close-menu"> <a href="#" class="close-this-menu">Close</a>
						<script type="text/javascript">
							jQuery('a.sidr-class-close-this-menu').click(function(){
								jQuery('div.sidr').css({
									'right': '-476px'
								});
								jQuery('body').css({
								'right': '0'
								});							
							});
						</script>

				</span></li>

				<li><a href="index.php"><img src="images/home.png" alt="CoffeCar"></a></li>
				<li><a href="index.php">Capa</a></li>
				<li class="dropdown"><a href="##">Carros</a>
					<ul class="sub-menu">
						<li><a href="classicos.php">Classicos</a></li>
						<li><a href="esportivo.php">Esportivos</a></li>
						<li><a href="corrida.php">Corridas </a></li>
					</ul></li>
				<li class="dropdown"><a href="#">Fabricantes</a>
					<ul class="sub-menu">
						<li><a href="volks.php">Volkswagem</a></li>
						<li><a href="gm.php">General Motors</a></li>
						<li><a href="peugeot.php">Peugeot</a></li>
					</ul></li>
				<li><a href="mecanica.php">Mecanicas</a></li>
				<li><a href="contato.php">Contanto</a></li>
			</ul>

		</div>
		<!--/.nav-collapse -->

	</nav>
	<!-- /.navbar -->

</header>
<!-- #masthead -->