package tests;

import PagesUser.ConfirmationPage;
import PagesUser.CredentialsPage;
import PagesUser.RegistrationPage;
import core.BaseTest;
import org.testng.annotations.Test;

public class PositiveTest extends BaseTest {

    @Test
    public static void positiveTest(){
        RegistrationPage.goToRegistrationPage();
RegistrationPage.gotToCredentialsPage();
       CredentialsPage.Register("Ivan", "Stoyanov", "someotheremail@mai.bg", "542444489", "parola2", "parola2");
        ConfirmationPage.verifyRegistration();
    }
}
