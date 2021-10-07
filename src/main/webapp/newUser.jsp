<%--
  Created by IntelliJ IDEA.
  User: JeanFranco
  Date: 01/10/2021
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <title>Sing Up</title>
</head>
<body>

    <form method="post" action="createUser">
        <div class="col-auto form-floating mb-3">
            <input type="email" class="form-control" id="emailUser" name="emailUser" placeholder="name@example.com">
            <label for="emailUser">Email address</label>
        </div>
        <div class="col-auto form-floating">
            <input type="password" class="form-control" id="newPassword" name="newPassword" placeholder="Password">
            <label for="newPassword">Create a new password</label>
        </div>
        <div class="col-auto form-floating">
            <input type="password" class="form-control" id="repPassword" name="repPassword" placeholder="Password">
            <label for="newPassword">Repeat password</label>
        </div>
        <div class="col-auto">
            <button type="submit" class="btn btn-primary mb-3">Register</button>
        </div>
    </form>

</body>
</html>
