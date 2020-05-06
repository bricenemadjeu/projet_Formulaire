package serveletClass;

import personne.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

//import javax.servlet.annotation.WebServlet;

@javax.servlet.annotation.WebServlet(name = "login")
public class Login extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String login=request.getParameter("login");
        String password=request.getParameter("motDePasse");

        if (!login.equals("") && !password.equals("")){
            User user = new User(login,password,true);
            request.setAttribute("user",user);
            this.getServletContext().getRequestDispatcher("/compteUser.jsp").forward(request, response);

        }
        else
        {
            request.setAttribute("message","Erreur Remplir les champs");
            this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
