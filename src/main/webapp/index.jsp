<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">


    <title>Welcome To sprring MVC</title>



    <!-- Custom styles for this template -->
    <link href="<c:url value='/assets/css/bootstrap.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/assets/css/starter-template.css'/>" rel="stylesheet"></link>

</head>


<body>


<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
    <a class="navbar-brand" href="<c:url value='/ ' />">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>


    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="<c:url value='/' />">Home <span class="sr-only">(current)</span></a>
            </li>


        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
            <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>


<main role="main" class="container">


    <div class="starter-template">
        <h1>Spring MVC 5 + Bootstrap starter template</h1>
        <p class="lead">Welcome to HomeStay Web</p>
    </div>


</main><!-- /.container -->


<script src="<c:url value='/assets/dist/jquery.js' />"> </script>
<script src="<c:url value='/assets/js/bootstrap.js' />"> </script>

</body>
</html>

