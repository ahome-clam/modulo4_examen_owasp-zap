package pages;

import control.Button;
import control.CheckBox;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginModalPage {

    public TextBox emailTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"), "[email] textbox on Login Modal Page");
    public TextBox passwordTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"), "[password] textbox on Login Modal Page");
    public Button loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"), "[signUp] button on Login Modal Page");

    public LoginModalPage(){

    }

}
