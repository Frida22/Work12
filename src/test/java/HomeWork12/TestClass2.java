package HomeWork12;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestClass2 {

    @Test(dataProvider = "data", dataProviderClass = ForDataProviderMethod.class)
    public void secondGroupFirstTest(int data){
        int a = 2*data;
        Assert.assertEquals(4,a);

    }
    @Test
    public void secondGroupSecondTest(){
        int b = 333 + 333;
        Assert.assertEquals(666,b);
    }
    @Test(groups = {"addition"})
    public void secondGroupThirdTest(){
        int c = 2 + 2 + 2;
        Assert.assertEquals(6,c);

    }
    @Test(groups = {"addition"})
    public void secondGroupFourthTest(){
        int d = 365511 - 365510;
        Assert.assertEquals(1,d);
    }
}
