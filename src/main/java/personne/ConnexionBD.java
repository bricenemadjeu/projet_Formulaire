package personne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBD {

    private Connection connexion = null;
    //  private String host="localhost:3306";
    // private String dbname="travis_projet_bd";
    //  private String username="root";
    //  private String password="";


    //-------------------------------------------------Mysql------------------------------------------------------------------------
   /* public Connection loadDataBase(){
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
    } */


    //-----------------------------------------Postgresql----------------------------------------------------------------------------

    /***
     * Load Driver and connect to the data base
     * @return objet connection
     */
    public Connection loadDataBase(){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
        }

        try {
            connexion = DriverManager.getConnection("jdbc:postgresql://ec2-54-175-117-212.compute-1.amazonaws.com:5432/dbkl0pdk9cr80p",
                    "nwupllodsrjhvn", "fc845ad9f53f15f11113a936f07848102472bcd6b2d173603495687b0e3c3c7c");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connexion;
    }
}
