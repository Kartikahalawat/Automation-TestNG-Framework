package testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
    @Test
    public void Weblogin(){
        System.out.println("Weblogincar");
    }

    @Test
    public void MobileLoginCarLoan(){
        System.out.println("MobileLoginCar");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before every test method in day3 class");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite I am No.1");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite I am at Last");
    }

    @Test
    public void LoginAPIcarLoan(){
        System.out.println("LoginAPIcar");
    }
}
