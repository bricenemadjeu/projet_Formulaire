package serveletClass;

import personne.User;

import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "login")
public class LoginServelet extends javax.servlet.http.HttpServlet {
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String login=request.getParameter("login");
        String password=request.getParameter("motDePasse");

        if (!login.equals("") && !password.equals("")){
            User user = new User(login,password,true);
            request.setAttribute("user",user);
            this.getServletContext().getRequestDispatcher("/compteUser.jsp").forward(request, response);

        }
        else
        {
            request.setAttribute("message","Erreur Remplir les champs vide");
            this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

        }

    }

}
