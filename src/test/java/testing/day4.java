package testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day4 {

    //Scope of the after test annotation is of the class only
    //so it will be execute after test execution of this class
    @AfterTest
    public void afterTest(){
        System.out.println("After test executed");
    }

    @Test
    public void WebloginHomeLoan(){
        System.out.println("Webloginhome");
    }

    @Test(groups = {"Smoke"})
    public void MobileLoginhomeLoan(){

        System.out.println("MobileLoginhome");
    }

    @Test
    public void LoginAPIhomeLoan(){
        System.out.println("LoginAPIhome");
    }
}
