package testing;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
    @Test
    public void studyLoan(){
        System.out.println("studyLoan");
    }

    @BeforeTest
    public void prerequisites(){
        System.out.println("I will execute first");
    }
}
