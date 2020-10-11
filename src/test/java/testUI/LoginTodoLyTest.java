package testUI;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LoginModalPage;
import pages.MainPage;
import session.Session;

public class LoginTodoLyTest {
    LoginModalPage loginModalPage = new LoginModalPage();
    MainPage mainPage = new MainPage();

    @Before
    public void before(){
        // No guarda histórico de las páginas
        Session.getInstance().getDriver().get("http://todo.ly/");

        // Permite guardar el histórico de las páginas
        //Session.getInstance().getDriver().navigate().to("");

    }

    @DisplayName("Verify the login")
    @Description("Make a login using a username and a password")
    @Owner("Cecilia Alvarado")
    @Test
    public void loginTest() throws InterruptedException {
        mainPage.signUpFreeButton.click();
        loginModalPage.fullNameTextBox.type("usuario-prueba");
        loginModalPage.emailTextBox.type("usuario_prueba@ucb.com");
        loginModalPage.passwordTextBox.type("ucb123");
        loginModalPage.agreeTermsCheckbox.click();
        loginModalPage.sipnUpButton.click();

        //Verificación
        Thread.sleep(2000);
        Assert.assertFalse("ERROR, no se puede realizar el login!", loginModalPage.sipnUpButton.isDisplayedOnPage());
    }

    @After
    public void after(){
        Session.getInstance().closeBrowser();
    }
}
