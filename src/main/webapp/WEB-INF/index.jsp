<html>
<head>
    <title>Mon formulaire</title>
</head>
<body>
<style>
    body{
        background-color: #f3f3f3;
        font-family: "Segoe UI";
    }

    input[type=text],input[type=password]{
        width: 80%;
        height: 40px;
        background-color: #f3f3f3;
        border:solid 0px;
        margin-left: 10%;
        font-family: "Segoe UI";

    }
    input[type=submit],input[type=reset]{
        width: 100px;
        height: 35px;
        border: solid 0px;
        border-radius: 4px;
        background-color: #f3f3f3;
        box-shadow:  0px 2px rgba(0,0,0,0.1);
        margin-left: 50px;
        font-family: "Segoe UI";
        font-size: 15px;
    }
</style>

<div class="part2" style="background-color: white; position: absolute; width: 27%; height:50%; left:36.5%; top: 25%; box-shadow:1px 5px 5px rgba(0,0,0,0.2);">
    <h3 style="color: rgba(0,0,0,0.5); text-align: center;">Authentification  étudiants d'ingé 4</h3>
    <form>
        <br/>
        <input type="text" name="login" required placeholder="login"><br/>
        <br/><input type="password" name="motDePasse" required placeholder="mot de passe"><br/> <br>

        <br/><input type="submit" value="Envoyer" />
        <input type="reset" value="Effacer" />

    </form>
    <br> <br>
</div>
</body>
</html>
