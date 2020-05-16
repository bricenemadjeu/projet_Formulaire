package personne;


import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Utilisateur {

    public Utilisateur() {
    }
//-----------------------------------------------------Mysql-----------------------------------------------------------------------------

    /*
    public int addUser(User user) throws SQLException {
        int message=0;
        ConnexionBD connexionBD = new ConnexionBD();
        if(connexionBD.loadDataBase()!=null){
            if (checkExistUser(user.getLogin())){
                message = 2;
            }
            else {
                try {
                    PreparedStatement preparedStatement = connexionBD.loadDataBase().prepareStatement("INSERT INTO account(firstname, lastname, gender, city, address, email, account_login, account_password, course) VALUES(?,?,?,?,?,?,?,?,?);");
                    preparedStatement.setString(1, user.getFirstname());
                    preparedStatement.setString(2, user.getLastname());
                    preparedStatement.setString(3, user.getGender());
                    preparedStatement.setString(4, user.getCity());
                    preparedStatement.setString(5, user.getAddress());
                    preparedStatement.setString(6, user.getEmail());
                    preparedStatement.setString(7, user.getLogin());
                    preparedStatement.setString(8, user.getPassword());
                    preparedStatement.setString(9, user.getCourse());
                    message=preparedStatement.executeUpdate();
                    connexionBD.loadDataBase().close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        else {
            message = -2;
        }

        return message;
    }


    public User checkLoginPassword(String login, String password){
        User user= new User();
        ConnexionBD connexionBD = new ConnexionBD();

        if(connexionBD.loadDataBase()!=null) {
            ResultSet rs = null;
            try {
                String sql = "SELECT firstname, lastname, gender, city, address, email, account_login, account_password, course FROM account WHERE account_login=? AND account_password=?;";
                // Exécution de la requête
                PreparedStatement ps = connexionBD.loadDataBase().prepareStatement(sql);
                ps.setString(1, login);
                ps.setString(2, password);
                rs = ps.executeQuery();
                while (rs.next()) {
                    user = new User(rs.getString("firstname"), rs.getString("lastname"), rs.getString("gender"), rs.getString("city"), rs.getString("address"),
                            rs.getString("email"), rs.getString("account_login"), rs.getString("account_password"), rs.getString("course"));
                }
                rs.close();
                ps.close();

            } catch (SQLException e) {
            }
            if(user.getFirstname()==""){
                user.setActive(false);
            }
        }

        return user;
    }

    private boolean checkExistUser(String login) throws SQLException {
        User user= null;
        ConnexionBD connexionBD = new ConnexionBD();
        ResultSet rs = null;
        String sql = "SELECT * FROM account WHERE account_login=?;";
        PreparedStatement ps = connexionBD.loadDataBase().prepareStatement(sql);
        ps.setString(1, login);
        rs = ps.executeQuery();
        while (rs.next()) {
            user = new User(rs.getString("firstname"), rs.getString("lastname"), rs.getString("gender"), rs.getString("city"), rs.getString("address"),
                    rs.getString("email"), rs.getString("account_login"), rs.getString("account_password"), rs.getString("course"));
        }
        rs.close();
        ps.close();
        if(user!=null){
            return true;
        }
        else {return false;}
    }

    public String cryptPassword(String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        byte[] bytesOfMessage = password.getBytes("UTF-8");

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] thedigest = md.digest(bytesOfMessage);

        BigInteger bigInt = new BigInteger(1,thedigest);
        String hashtext = bigInt.toString(16);
        return hashtext;
    }

    */



    //-------------------------------------------Postgresql-------------------------------------------------------------------------------


    /***
     * Add New user in Data base
     * @param user
     * @return message
     * @throws SQLException
     */
    public int addUser(User user) throws SQLException {
        int message=0;
        ConnexionBD connexionBD = new ConnexionBD();
        if(connexionBD.loadDataBase()!=null){
            if (checkExistUser(user.getLogin())){
                message = 2;
            }
            else {
                try {
                    PreparedStatement preparedStatement = connexionBD.loadDataBase().prepareStatement("INSERT INTO account(firstname, lastname, gender, city, address, email, account_login, account_password, course) VALUES(?,?,?,?,?,?,?,?,?);");
                    preparedStatement.setString(1, user.getFirstname());
                    preparedStatement.setString(2, user.getLastname());
                    preparedStatement.setString(3, user.getGender());
                    preparedStatement.setString(4, user.getCity());
                    preparedStatement.setString(5, user.getAddress());
                    preparedStatement.setString(6, user.getEmail());
                    preparedStatement.setString(7, user.getLogin());
                    preparedStatement.setString(8, user.getPassword());
                    preparedStatement.setString(9, user.getCourse());
                    message=preparedStatement.executeUpdate();
                    connexionBD.loadDataBase().close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        else {
            message = -2;
        }

        return message;
    }


    /***
     * Check if the login and password exit in data base and return an objet User
     * @param login
     * @param password
     * @return Objet user
     */
    public User checkLoginPassword(String login, String password){
        User user= new User();
        ConnexionBD connexionBD = new ConnexionBD();

        if(connexionBD.loadDataBase()!=null) {
            ResultSet rs = null;
            try {
                String sql = "SELECT firstname, lastname, gender, city, address, email, account_login, account_password, course FROM account WHERE account_login=? AND account_password=?;";
                // Exécution de la requête
                PreparedStatement ps = connexionBD.loadDataBase().prepareStatement(sql);
                ps.setString(1, login);
                ps.setString(2, password);
                rs = ps.executeQuery();
                while (rs.next()) {
                    user = new User(rs.getString("firstname"), rs.getString("lastname"), rs.getString("gender"), rs.getString("city"), rs.getString("address"),
                            rs.getString("email"), rs.getString("account_login"), rs.getString("account_password"), rs.getString("course"));
                }
                rs.close();
                ps.close();

            } catch (SQLException e) {
            }
            if(user.getFirstname()==""){
                user.setActive(false);
            }
        }

        return user;
    }


    /***
     * Check if the login exit in data base during the creation of new account and return true or false
     * @param login
     * @return boolean
     * @throws SQLException
     */
    private boolean checkExistUser(String login) throws SQLException {
        User user= null;
        ConnexionBD connexionBD = new ConnexionBD();
        ResultSet rs = null;
        String sql = "SELECT * FROM account WHERE account_login=?;";
        PreparedStatement ps = connexionBD.loadDataBase().prepareStatement(sql);
        ps.setString(1, login);
        rs = ps.executeQuery();
        while (rs.next()) {
            user = new User(rs.getString("firstname"), rs.getString("lastname"), rs.getString("gender"), rs.getString("city"), rs.getString("address"),
                    rs.getString("email"), rs.getString("account_login"), rs.getString("account_password"), rs.getString("course"));
        }
        rs.close();
        ps.close();
        if(user!=null){
            return true;
        }
        else {return false;}
    }


    /***
     * This function cryptate a password of user
     * @param password
     * @return String encrypt password
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    public String cryptPassword(String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        byte[] bytesOfMessage = password.getBytes("UTF-8");

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] thedigest = md.digest(bytesOfMessage);

        BigInteger bigInt = new BigInteger(1,thedigest);
        String hashtext = bigInt.toString(16);
        return hashtext;
    }



}
