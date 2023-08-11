import config.AppiumConfig;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.ContactListScreen;
import screens.SplashScreen;

public class RemoveContactsTests extends AppiumConfig {

    @BeforeClass
    public void precondition(){
        new SplashScreen(driver)
                .gotoAuthenticationScreen()
                .fillEmail("abc@def.com")
                .fillPassword("$Abcdef12345")
                .submitLogin();
    }

    @Test
    public void removeOneContactPositive(){
        new ContactListScreen(driver)
                .removeOneContact()

    }
}
