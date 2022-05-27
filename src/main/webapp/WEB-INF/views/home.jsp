<!DOCTYPE html>
<html lang="en">
<head>

<title>Cat Challenge</title>

<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="author" content="">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<!-- <script src="https://code.jquery.com/jquery-3.5.1.js"></script> -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">


<link rel="stylesheet" href="../assets/css/bootstrap.min.css">
<link rel="stylesheet" href="../assets/css/font-awesome.min.css">
<link rel="stylesheet" href="../assets/css/aos.css">

<!-- MAIN CSS -->
<link rel="stylesheet" href="../assets/css/tooplate-gymso-style.css">
<link rel="stylesheet" href="../assets/css/home.css">
<link rel="stylesheet"
	href="https://unpkg.com/bootstrap-table@1.19.1/dist/bootstrap-table.min.css">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
<script
	src="https://unpkg.com/bootstrap-table@1.19.1/dist/bootstrap-table.min.js"></script>
<script
	src="https://unpkg.com/bootstrap-table@1.19.1/dist/bootstrap-table-locale-all.min.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
</head>
<body data-spy="scroll" data-target="#navbarNav" data-offset="50"
	id="top">
	<!-- MENU BAR -->
	<nav class="navbar navbar-expand-lg fixed-top">
		<div class="container">

			<a class="navbar-brand" href="#top">Bienvenidos</a>

			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNav" aria-controls="navbarNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
		</div>
	</nav>


	<!-- HERO -->
	<section
		class="hero d-flex flex-column justify-content-center align-items-center"
		id="home">

		<div class="bg-overlay"></div>

		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-md-10 mx-auto col-12">
					<div class="hero-text mt-5 text-center">
						<h1 class="text-white" data-aos="fade-up" data-aos-delay="500">Cat Challenge</h1>
						<h6 data-aos="fade-up" data-aos-delay="300">For Citi</h6>

						<button id="getFact" class="btn btn-danger mt-5 p-3 text-white" data-aos="fade-up" data-aos-delay="400">Consultar
							Api</button>
					</div>
				</div>
			</div>
		</div>
	</section>

	<div id="loading-screen" style="display: none">
		<img src="../assets/images/spinning-circles.svg">
	</div>

	<!-- SCRIPTS -->
	<script src="../assets/js/aos.js"></script>
	<script src="../assets/js/smoothscroll.js"></script>
	<script src="../assets/js/custom.js"></script>
	<script src="../assets/js/app.js"></script>
</body>
</html>