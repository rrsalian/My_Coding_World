<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
  	
    <title>Bio Rakshith</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://fonts.googleapis.com/css?family=Quicksand:300,400,500,700,900" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Quicksand:300,400,500,700,900" rel="stylesheet">
    <link rel="stylesheet" href="fonts/icomoon/style.css">

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/magnific-popup.css">
    <link rel="stylesheet" href="css/jquery-ui.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">

    <link rel="stylesheet" href="css/bootstrap-datepicker.css">

    <link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">

    <link rel="stylesheet" href="css/aos.css">
    <link rel="stylesheet" href="css/fancybox.min.css">

    <link rel="stylesheet" href="css/style.css">
    <jsp:include page="Base.jsp" />
  </head>
  <body>
  	
  	<%if(session.getAttribute("log")==null){
    request.getRequestDispatcher("welcome.jsp").forward(request,response);
    
     }%>
  
<%

response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
response.setDateHeader("Expires", 0); // Proxies.

%>


  <div class="site-wrap">

  <div class="site-mobile-menu">
    <div class="site-mobile-menu-header">
      <div class="site-mobile-menu-close mt-3">
        <span class="icon-close2 js-menu-toggle"></span>
      </div>
    </div>
    <div class="site-mobile-menu-body"></div>
  </div>

  <header class="header-bar d-flex d-lg-block align-items-center" data-aos="fade-left">
    <div class="site-logo">
      <a href="index1.jsp">PhotoBook</a>
    </div>
    
    <div class="d-inline-block d-xl-none ml-md-0 ml-auto py-3" style="position: relative; top: 3px;"><a href="#" class="site-menu-toggle js-menu-toggle text-white"><span class="icon-menu h3"></span></a></div>

    <div class="main-menu">
      <ul class="js-clone-nav">
        <li><a href="index1.jsp">Home</a></li>
        <li><a href="single.jsp">Photos</a></li>
        <li class="active"><a href="bio.jsp">Bio</a></li>
        
      </ul>
      <ul class="social js-clone-nav">
        <li><a href="https://www.facebook.com/rrsalian16">
          
          <i class="fa fa-facebook-official" style="font-size:26px;color:blue" ></i>
        </a></li>
        
        <li><a href="https://www.instagram.com/rr_salian/">
          <i class="fa fa-instagram" style="font-size:26px;color:red" ></i>
        </a></li>
      </ul>
    </div>
  </header> 
  <main class="main-content">
    <div class="container-fluid photos">
      <div class="row justify-content-center">
        
        <div class="col-md-6 pt-4">
          <figure class="mb-5" data-aos="fade-up">
            <img src="images/iimg.jpg" alt="Image" class="img-fluid" width="400" height="400">
          </figure>

          <h2 class="text-white mb-4" data-aos="fade-up">Hii, I'm Rakshith</h2>

          <div class="row" data-aos="fade-up">
            <div class="col-md-12">
              <p></p>

              <p cass="mt-4">Thanks! <br> Rakshith R Salian.</p>
            </div>
          </div>
        </div>

      </div>

      <div class="row justify-content-center">
        <div class="col-md-12 text-center py-5">
         
        </div>
      </div>
    </div>
  </main>

</div> <!-- .site-wrap -->

  <script src="js/jquery-3.3.1.min.js"></script>
  <script src="js/jquery-migrate-3.0.1.min.js"></script>
  <script src="js/jquery-ui.js"></script>
  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/owl.carousel.min.js"></script>
  <script src="js/jquery.stellar.min.js"></script>
  <script src="js/jquery.countdown.min.js"></script>
  <script src="js/jquery.magnific-popup.min.js"></script>
  <script src="js/bootstrap-datepicker.min.js"></script>
  <script src="js/aos.js"></script>

  <script src="js/jquery.fancybox.min.js"></script>

  <script src="js/main.js"></script>
    
  </body>
</html>