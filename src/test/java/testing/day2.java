package testing;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
    @Test(groups = {"Smoke"})
    public void studyLoan(){

        System.out.println("studyLoan");
    }

    //Scope of the before test annotation is of the class only
    //so it will be execute before test execution of this class
    @BeforeTest
    public void prerequisites(){
        System.out.println("I will execute first");
    }
}
