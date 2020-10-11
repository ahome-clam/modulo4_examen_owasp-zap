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
import pages.ToDoPage;
import session.Session;

public class TodoLyTest {
    LoginModalPage loginModalPage = new LoginModalPage();
    MainPage mainPage = new MainPage();
    ToDoPage toDoPage = new ToDoPage();

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
        mainPage.loginButton.click();

        loginModalPage.emailTextBox.type("usuario_prueba@ucb.com");
        loginModalPage.passwordTextBox.type("ucb123");
        loginModalPage.loginButton.click();

        //Verificación
        Thread.sleep(2000);
        Assert.assertFalse("ERROR, no se puede realizar el login!", loginModalPage.loginButton.isDisplayedOnPage());
    }

    @DisplayName("Verify the creating of a project")
    @Description("Create a new project")
    @Owner("Cecilia Alvarado")
    @Test
    public void createProjectTest() throws InterruptedException {
        mainPage.loginButton.click();

        loginModalPage.emailTextBox.type("usuario_prueba@ucb.com");
        loginModalPage.passwordTextBox.type("ucb123");
        loginModalPage.loginButton.click();

        toDoPage.addNewProjectButton.click();
        toDoPage.newProjectNameTextBox.type("PROYECTO DE PRUEBA");
        toDoPage.addProjectButton.click();

        //Verificación
        Thread.sleep(2000);
        Assert.assertTrue("ERROR, no se puede crear nuevo proyecto!", toDoPage.currentProjectLabel.getText().equals("PROYECTO DE PRUEBA"));
    }

    @After
    public void after(){
        Session.getInstance().closeBrowser();
    }
}
