package pages;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {

    public Button signUpFreeButton = new Button(By.xpath("//img[@src='/Images/design/pagesignup.png']"), "[Signup Page] button on Main Page");

    public MainPage(){}
}
