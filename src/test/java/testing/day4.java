package testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

    //Scope of the after test annotation is of the class only
    //so it will be execute after test execution of this class
    @AfterTest
    public void afterTest(){
        System.out.println("After test executed");
    }

    @Parameters({"URL"})
    @Test(enabled = true, timeOut = 3000)
    public void WebloginHomeLoan(String urlname){

        System.out.println("Webloginhome");
        System.out.println(urlname);
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
