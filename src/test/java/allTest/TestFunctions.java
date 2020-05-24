package allTest;

import org.junit.Assert;
import org.junit.Test;
import personne.ConnexionBD;
import personne.Utilisateur;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;

public class TestFunctions {

    @Test
    public void testCrypt() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Utilisateur user = new Utilisateur();
        String crypt = user.cryptPassword("admin");
        String actual = "21232f297a57a5a743894a0e4a801fc3";
        if(!actual.equals(crypt)){
            Assert.fail("Test failure !");
        }
    }

    @Test
    public void testconnection() {
        ConnexionBD con = new ConnexionBD();
        Connection connection = con.loadDataBase();
        if (connection == null) {
            Assert.fail("Connection DB fail");
        }
    }

}
