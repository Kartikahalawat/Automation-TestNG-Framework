package testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day4 {

    @AfterTest
    public void afterTest(){
        System.out.println("After test executed");
    }

    @Test
    public void WebloginHomeLoan(){
        System.out.println("Webloginhome");
    }

    @Test
    public void MobileLoginhomeLoan(){
        System.out.println("MobileLoginhome");
    }

    @Test
    public void LoginAPIhomeLoan(){
        System.out.println("LoginAPIhome");
    }
}
