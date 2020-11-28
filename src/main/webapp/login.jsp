<%-- 
    Document   : login
    Created on : 19 Nov 2020, 16:03:49
    Author     : aoife
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
            <!-- Bootstrap core CSS -->
    <link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
            <!-- Custom style sheet -->
    <link href="custom.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/heroic-features.css" rel="stylesheet">
    
    <link href="https://use.fontawesome.com/releases/v5.14.0/css/all.css" rel="stylesheet">

        <title>Log In</title>
    </head>   
    
    <body>
       <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
        <div class="container">
          <a class="navbar-brand" href="index.html">
              <img src="resources/images/newLogo.png" alt="logo" style="display:inline-block;" height="60" width="90">
              <span style="display: inline-block;"> Toys4Us </span>
          </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
              <a class="nav-link" href="index.html">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="shop.jsp">Shop</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="contact.jsp">Contact Us</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="login.jsp">Log In</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="cart.jsp"><i class="fas fa-shopping-basket"></i></a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
   
    <!-- Container set up to hold 2 other containers for log in and sign up -->
    
    <!-- Code taken from tutorialspoint.com/How-to-place-two-divs-next-to-each-other-in-HTML#:~:text=With%20CSS%20properties%2C%20you%20can,height%3A100px%20and%20set%20margin.
                    to help line up 2 divs side by side --> 
    <br/>
    <br/>
    <br/>
       
        <div class="container" id="LoginPageContainer">
            <!-- Log In -->
            <div class="container" id="login">
                <div class="login" style="width: 500px; float:left; height:500px; background:#8AA994; margin:20px">
                    <form class="form-signin" action="LoginServlet" method="POST">
                        <br/>
                        <br/>
                        <br/>
                        <h3> You need to log in to complete your purchase </h3>
                        <br/>
                        <h3 class="form-signin-heading"><strong>Log In</strong></h3>
                        <br/>
                        <input type="text" class="input-block-level" name="email" placeholder="Email Address">
                        <br/>
                        <input type="password" class="input-block-level" name="Password" placeholder="Password">
                        <br/>
                        <label class="checkbox">
                            <input type="checkbox" value="remember-me">Remember Me
                        </label>
                        <br/>
                        <a class="btn btn-large btn-primary" id="SignIn" type="submit" href="cart.jsp"> Sign In </a>
                    </form>
                 </div>
            </div>
            
            <!-- Sign Up - Goes to the same page anyway -->
            <div class="container" id="signUp">
                <div class="signUp" style="width: 500px; float:right; height:500px; background:#8AA994; margin:20px">
                    <br/>
                    <br/>
                    <br/>
        
                    <form class="form-signin" action="LoginServlet" method="POST">
                        <h3> Not a Member? Enter you details to sign up for an account </h3>
                        <br/>
                        <h3 class="form-signin-heading"><strong>Sign Up</strong></h3>
                        <br/>
                        <input type="text" class="input-block-level" name="email" placeholder="Email Address">
                        <br/>
                        <input type="password" class="input-block-level" name="Password" placeholder="Password">
                        <br/>
                        <br/>
                        <a class="btn btn-large btn-primary" id="SignIn" type="submit" href="cart.jsp"> Sign In </a>
                    </form>
                </div> 
            </div> <!-- end of sign in container --> 
        </div> <!-- end of main container -->
                            
        <!-- Footer is not on the Login/cart/checkout pages because they'll be "secure pages" and 
                in theory you won't be leaving those page (unless it's from a "continue shopping" button -->
            
        
    
        <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/popper/popper.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
    </body>
</html>
