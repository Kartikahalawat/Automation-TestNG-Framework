package testing;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
    @Test
    public void ploan(){

        System.out.println("personalLoan");
        Assert.assertTrue(false);
    }
    @BeforeTest
    public void prerequisites(){
        System.out.println("I will execute first");
    }
}
