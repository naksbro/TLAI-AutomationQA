package utilities;

import org.openqa.selenium.support.PageFactory;
import pages.login;

public class Base {

    protected static login loginPage;

    public static Base instantiatePages(){
        loginPage = PageFactory.initElements(Driver.getInstance(), login.class);
        return new Base();
    }
}
