package testing;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
    @Test
    public void ploan(){
        System.out.println("personalLoan");
    }
    @BeforeTest
    public void prerequisites(){
        System.out.println("I will execute first");
    }
}
