package personne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBD {

    private Connection connexion = null;
    private String host="localhost:3306";
    private String dbname="travis_projet_bd";
    private String username="root";
    private String password="";

    public Connection loadDataBase(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        }

        try {
            connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/travis_projet_bd", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connexion;
    }
}
