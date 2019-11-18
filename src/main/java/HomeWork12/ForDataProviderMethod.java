package HomeWork12;

import org.testng.annotations.DataProvider;

public class ForDataProviderMethod {
    @DataProvider(name = "data")
    public Object[][] dataProviderMethod(){
        return new Object[][] { { 1 }, { 2 }, { 3 }};
    }

}
