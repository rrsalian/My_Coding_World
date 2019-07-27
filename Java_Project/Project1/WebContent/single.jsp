<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
  	
    <title>PhotoBook Photo</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Quicksand:300,400,500,700,900" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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

  <header class="header-bar d-flex d-lg-block align-items-center">
    <div class="site-logo">
      <a href="index1.jsp">PhotoBook</a>
    </div>
    
    <div class="d-inline-block d-xl-none ml-md-0 ml-auto py-3" style="position: relative; top: 3px;"><a href="#" class="site-menu-toggle js-menu-toggle text-white"><span class="icon-menu h3"></span></a></div>

    <div class="main-menu">
      <ul class="js-clone-nav">
        <li><a href="index1.jsp">Home</a></li>
        <li class="active"><a href="single.jsp">Photos</a></li>
        <li><a href="bio.jsp">Bio</a></li>
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

      <div class="row pt-4 mb-5 text-center">
        <div class="col-12">
          <h2 class="text-white mb-4">PhotoBook</h2>
        </div>
      </div>

      <div class="row align-items-stretch">

        <div class="col-6 col-md-6 col-lg-3" data-aos="fade-up">
          <a href="images/img_0.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_0.jpg" alt="Image" class="img-fluid">
          </a>
        </div>
        
        <div class="col-6 col-md-6 col-lg-3" data-aos="fade-up">
          <a href="images/img_1.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_1.jpg" alt="Image" class="img-fluid">
          </a>
        </div>
        <div class="col-6 col-md-6 col-lg-6" data-aos="fade-up" data-aos-delay="100">
          <a href="images/img_2.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_2.jpg" alt="Image" class="img-fluid">
          </a>
        </div>
        <div class="col-6 col-md-6 col-lg-4" data-aos="fade-up" data-aos-delay="200">
          <a href="images/img_3.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_3.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-8" data-aos="fade-up">
          <a href="images/img_4.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_4.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-3" data-aos="fade-up">
          <a href="images/img_5.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_5.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-4" data-aos="fade-up">
          <a href="images/img_6.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_6.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-5" data-aos="fade-up">
          <a href="images/img_7.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_7.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-4" data-aos="fade-up">
          <a href="images/img_8.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_8.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-8" data-aos="fade-up">
          <a href="images/img_9.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_9.jpg" alt="Image" class="img-fluid">
          </a>
        </div>
 
        <!-- after -->

        <div class="col-6 col-md-6 col-lg-3" data-aos="fade-up">
          <a href="images/img_10.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_0.jpg" alt="Image" class="img-fluid">
          </a>
        </div>
        
        <div class="col-6 col-md-6 col-lg-3" data-aos="fade-up">
          <a href="images/img_11.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_1.jpg" alt="Image" class="img-fluid">
          </a>
        </div>
        <div class="col-6 col-md-6 col-lg-6" data-aos="fade-up" data-aos-delay="100">
          <a href="images/img_12.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_12.jpg" alt="Image" class="img-fluid">
          </a>
        </div>
        <div class="col-6 col-md-6 col-lg-4" data-aos="fade-up" data-aos-delay="200">
          <a href="images/img_13.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_13.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-4" data-aos="fade-up">
          <a href="images/img_14.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_14.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-4" data-aos="fade-up">
          <a href="images/img_15.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_15.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-4" data-aos="fade-up">
          <a href="images/img_16.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_16.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-8" data-aos="fade-up">
          <a href="images/img_17.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_17.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-3" data-aos="fade-up">
          <a href="images/img_18.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_18.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-3" data-aos="fade-up">
          <a href="images/img_19.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_19.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

         <!-- after -->

         <div class="col-6 col-md-6 col-lg-6" data-aos="fade-up">
          <a href="images/img_20.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_20.jpg" alt="Image" class="img-fluid">
          </a>
        </div>
        
        <div class="col-6 col-md-6 col-lg-4" data-aos="fade-up">
          <a href="images/img_21.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_21.jpg" alt="Image" class="img-fluid">
          </a>
        </div>
        <div class="col-6 col-md-6 col-lg-4" data-aos="fade-up" data-aos-delay="100">
          <a href="images/img_22.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_22.jpg" alt="Image" class="img-fluid">
          </a>
        </div>
        <div class="col-6 col-md-6 col-lg-4" data-aos="fade-up" data-aos-delay="200">
          <a href="images/img_23.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_23.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-6" data-aos="fade-up">
          <a href="images/img_24.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_24.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-6" data-aos="fade-up">
          <a href="images/img_25.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_25.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-4" data-aos="fade-up">
          <a href="images/img_26.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_26.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-4" data-aos="fade-up">
          <a href="images/img_27.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_27.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-4" data-aos="fade-up">
          <a href="images/img_28.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_28.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-8" data-aos="fade-up">
          <a href="images/img_29.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_29.jpg" alt="Image" class="img-fluid">
          </a>
        </div>
 
        <!-- after -->

        <div class="col-6 col-md-6 col-lg-4" data-aos="fade-up">
          <a href="images/img_30.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_30.jpg" alt="Image" class="img-fluid">
          </a>
        </div>
        
        <div class="col-6 col-md-6 col-lg-3" data-aos="fade-up">
          <a href="images/img_31.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_31.jpg" alt="Image" class="img-fluid">
          </a>
        </div>
        <div class="col-6 col-md-6 col-lg-5" data-aos="fade-up" data-aos-delay="100">
          <a href="images/img_32.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_32.jpg" alt="Image" class="img-fluid">
          </a>
        </div>
        <div class="col-6 col-md-6 col-lg-4" data-aos="fade-up" data-aos-delay="200">
          <a href="images/img_33.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_33.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-5" data-aos="fade-up">
          <a href="images/img_34.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_34.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-3" data-aos="fade-up">
          <a href="images/img_35.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_35.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-4" data-aos="fade-up">
          <a href="images/img_36.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_36.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-7" data-aos="fade-up">
          <a href="images/img_37.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_37.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-2 " data-aos="fade-up">
          <a href="images/img_41.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_41.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

         <div class="col-6 col-md-6 col-lg-3" data-aos="fade-up">
          <a href="images/img_39.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_39.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-8" data-aos="fade-up">
          <a href="images/img_38.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_38.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

       
 
        <!-- after -->

         <div class="col-6 col-md-6 col-lg-4" data-aos="fade-up">
          <a href="images/img_40.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_40.jpg" alt="Image" class="img-fluid">
          </a>
        </div>
        
        
        <div class="col-6 col-md-6 col-lg-6" data-aos="fade-up" data-aos-delay="100">
          <a href="images/img_42.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_42.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        <div class="col-6 col-md-6 col-lg-6" data-aos="fade-up" data-aos-delay="200">
          <a href="images/img_43.jpg" class="d-block photo-item" data-fancybox="gallery">
            <img src="images/img_43.jpg" alt="Image" class="img-fluid">
          </a>
        </div>

        



      </div>


      <div class="row justify-content-center">
        <div class="col-md-12 text-center py-5">
          <p>
        
      </p>
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