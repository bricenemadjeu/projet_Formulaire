<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>New Account</title>

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
        <h1 id="title" class="hidden"><span id="logo">ISJ <span>Account</span></span></h1>
    </div>

    <div class="login-box animated fadeInUp">
        <div class="box-header">
            <h2>New Account</h2>
        </div>
        <form action="New-account" method="post">
            <table>
                <tr>
                    <td>
                        <table>
                            <tr><td><label>First Name</label></td></tr>
                            <tr><td><input type="text" name="prenom" placeholder="David" title="First name" required></td></tr>
                        </table>
                    </td>
                    <td>
                        <table>
                            <tr><td><label>Last Name</label></td></tr>
                            <tr><td><input type="text" name="nom" placeholder="TIAHA" title="Last name" required></td></tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td>
                        <table>
                            <tr><td><label>Gender</label></td></tr>
                            <tr><td>
                                <select name="gender" title="Gender">
                                    <option>Male</option>
                                    <option>Female</option>
                                </select>
                            </td></tr>
                        </table>
                    </td>
                    <td>
                        <table>
                            <tr><td><label>City</label></td></tr>
                            <tr><td>
                                <select name="city" title="City">
                                    <option>Yaounde</option>
                                    <option>Douala</option>
                                    <option>Bafia</option>
                                    <option>Maroua</option>
                                    <option>Ebolowa</option>
                                </select>
                            </td></tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td>
                        <table>
                            <tr><td><label>Address</label></td></tr>
                            <tr><td><input type="text" name="address" placeholder="Your Address" title="Address" required></td></tr>
                        </table>
                    </td>
                    <td>
                        <table>
                            <tr><td><label>Email</label></td></tr>
                            <tr><td><input type="email" name="email" placeholder="davidtiaha@gmail.com" title="Email" required></td></tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td>
                        <table>
                            <tr><td><label>USERNAME</label></td></tr>
                            <tr><td><input type="text" name="login" placeholder="Login" title="Login" required></td></tr>
                        </table>
                    </td>
                    <td>
                        <table>
                            <tr><td><label>Password</label></td></tr>
                            <tr><td><input type="password" name="password" placeholder="Password" title="Password" required></td></tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <table>
                            <tr><td><label>Course</label></td></tr>
                            <tr><td>
                                <select name="course" title="Course">
                                    <option></option>
                                    <option>Computer Operator & Pragramming Assistant</option>
                                    <option>Algorithmic</option>
                                    <option>Agile project management</option>
                                    <option>Information system</option>
                                    <option>Business Intelligence</option>
                                </select>
                            </td></tr>
                        </table>
                    </td>
                </tr>
            </table>
            <button type="submit">Create account</button>
        </form>
        <br/>
        <span style="margin-left: 50px; color: red; margin: 20px 0 0;">${requestScope.error}</span>
        <span style="margin-left: 50px; color: green;  margin: 20px 0 0;">${requestScope.pass}</span>
        <a href="Login"><p class="small">Sign In?</p></a><br>

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
