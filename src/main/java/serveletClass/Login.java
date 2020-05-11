package serveletClass;

import personne.User;
import personne.Utilisateur;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.jws.soap.SOAPBinding;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "login")
public class Login extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String login=request.getParameter("login");
        String password=request.getParameter("motDePasse");

        String passCrypt="";
        Utilisateur utilisateur = new Utilisateur();
        try {
            passCrypt = utilisateur.cryptPassword(password);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        User user = utilisateur.checkLoginPassword(login,passCrypt);

        if (user.isConnected()){
            if(user.isActive()){
                request.setAttribute("user",user);
                this.getServletContext().getRequestDispatcher("/compteUser.jsp").forward(request, response);
            }
            else {
                request.setAttribute("message","Incorrect password or login");
                this.getServletContext().getRequestDispatcher("/myLogin.jsp").forward(request, response);
            }

        }
        else
        {
            request.setAttribute("message","Connection Error. Retry");
            this.getServletContext().getRequestDispatcher("/myLogin.jsp").forward(request, response);

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/myLogin.jsp").forward(request, response);
    }
}
