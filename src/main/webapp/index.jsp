<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <title>Demo Servlet</title>
</head>
<body>

<meta charset="UTF-8">
<div class="container">
    <h1 class="display-1">Welcome! Servlet-Project</h1>
    <figcaption class="blockquote-footer"><%= new java.util.Date() %></figcaption>
</div>

<form method="post" action="login">
    <div class="col-auto form-floating mb-3">
        <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com">
        <label for="floatingInput">Email address</label>
    </div>
    <div class="col-auto form-floating">
        <input type="password" class="form-control" id="floatingPassword" placeholder="Password">
        <label for="floatingPassword">Password</label>
    </div>
    <div class="col-auto">
        <button type="submit" class="btn btn-primary btn-lg btn-block">--Login--</button>
    </div>
</form>
<div class="col-auto">
    <a href="newUser.jsp" type="button" class="btn btn-secondary btn-lg btn-block">-Sing up-</a>
</div>

</body>
</html>