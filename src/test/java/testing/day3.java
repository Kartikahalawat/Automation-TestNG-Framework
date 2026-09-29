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
    @Parameters({"URL", "APIKey/Username"})
    public void MobileLoginCarLoan(String URL, String APIKey){

        System.out.println("MobileLoginCar");
        System.out.println(URL);
        System.out.println(APIKey);
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

    @Test(dataProvider = "getData")
    public void MobileSignOutCarLoan(String username, String password){
        System.out.println("MobileSignOutCar");
        System.out.println(username);
        System.out.println(password);
    }

    @DataProvider
    public Object[][] getData(){
        //username - password  -- good credic history
        //username - password -- no credic history
        //faudelent credit history

        Object[][] data = new Object[3][2];
        data[0][0]="firstUsername";
        data[0][1]="firstPassword";

        data[1][0]="secondUsername";
        data[1][1]="secondPassword";

        data[2][0]="thirdUsername";
        data[2][1]="thirdPassword";
        return data;
    }
}
