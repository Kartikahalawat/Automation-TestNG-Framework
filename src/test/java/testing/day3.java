package testing;

import org.testng.annotations.*;

public class day3 {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before executing all methods of the Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After executing all methods of the Class");
    }

    @Parameters({"URL"})
    @Test(timeOut = 3000)
    public void Weblogin(String urlname){

        System.out.println("Weblogincar");
        System.out.println(urlname);
    }

    @Test(groups = {"Smoke"})
    public void MobileLoginCarLoan(){
        System.out.println("MobileLoginCar");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before every test method in day3 class");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After every test method in day3 class");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite I am No.1");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite I am at Last");
    }

    @Test(dependsOnMethods = {"Weblogin", "MobileLoginCarLoan"})
    public void APIcarLoan(){

        System.out.println("LoginAPIcar");
    }
}
