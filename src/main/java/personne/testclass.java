

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testclass {
  new User arlette =User ();
    @BeforeAll
    public static void setup() {
      System.out.println("the class test is runing");
    }

    @BeforeEach
    public void setupThis() {
      System.out.println("this is the test runing");
    }

    @Test
    public void method() {
        org.junit.Assert.assertTrue(arlette.isConnected == true);
    }
    

    @AfterEach
    public void tearThis() {
      System.out.println("the test is complete");
    }

    @AfterAll
    public static void tear() {
      System.out.println("the test is complete");
    }
}
