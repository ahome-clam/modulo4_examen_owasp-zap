package pages;

import control.Button;
import control.CheckBox;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginModalPage {

    public TextBox fullNameTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"), "[fullname] textbox on Login Modal Page");
    public TextBox emailTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"), "[email] textbox on Login Modal Page");
    public TextBox passwordTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"), "[password] textbox on Login Modal Page");
    public CheckBox agreeTermsCheckbox = new CheckBox(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"), "[agree terms] checkbox on Login Modal Page");
    public Button sipnUpButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"), "[signUp] button on Login Modal Page");



    public LoginModalPage(){

    }
/*
    sign Up Free ---> //img[@src='/Images/design/pagesignup.png']
    fullName ----> ctl00_MainContent_SignupControl1_TextBoxFullName
    email ---> ctl00_MainContent_SignupControl1_TextBoxEmail
    Password ---> ctl00_MainContent_SignupControl1_TextBoxPassword
    agreeTerms--> ctl00_MainContent_SignupControl1_CheckBoxTerms
    Signup --> ctl00_MainContent_SignupControl1_ButtonSignup

 */
}
