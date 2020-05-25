<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Connexion</title>

    <link rel="icon" type="image/png" href="images/isj.png"/>
    <!-- Google Fonts -->
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>

    <link rel="stylesheet" href="css/animate.css">
    <!-- Custom Stylesheet -->
    <link rel="stylesheet" href="css/style.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
</head>

<body>
<div class="container">
    <div class="top">
        <h1 id="title" class="hidden"><span id="logo">ISJ <span>Students</span></span></h1>
    </div>

    <div class="login-box animated fadeInUp">
        <div class="box-header">
            <h2>Sign In</h2>
        </div>
        <form action="Login" method="post">
            <label for="username">Username</label>
            <br/>
            <input type="text" style="border-radius: 10px;" id="username" name="login" required>
            <br/>
            <label for="password">Password</label>
            <br/>
            <input type="password" style="border-radius: 10px;" id="password" name="motDePasse" required>
            <br/>
            <button type="submit">Sign In</button>
        </form>
        <br/>
        <span style="margin-left: 50px; color: red; margin: 20px 0 0;">${requestScope.message}</span><br>
        <a href="#"><p class="small">Forgot your password?</p></a>
        <a href="New-account"><p class="small">Create new account?</p></a>
    </div>

</div>
</body>

<script>
    $(document).ready(function () {
        $('#logo').addClass('animated fadeInDown');
        $("input:text:visible:first").focus();
    });
    $('#username').focus(function() {
        $('label[for="username"]').addClass('selected');
    });
    $('#username').blur(function() {
        $('label[for="username"]').removeClass('selected');
    });
    $('#password').focus(function() {
        $('label[for="password"]').addClass('selected');
    });
    $('#password').blur(function() {
        $('label[for="password"]').removeClass('selected');
    });
</script>
</html>
