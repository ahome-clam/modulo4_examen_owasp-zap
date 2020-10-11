package pages;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class ToDoPage {
    public Button addNewProjectButton = new Button(By.xpath("//*/div/div[@class='AddProjectLiDiv']"), "[Add New Project] button on Todo Ly Page");
    public TextBox newProjectNameTextBox = new TextBox(By.id("NewProjNameInput"), "[New Project Name] textbox on Todo Ly Page");
    public Button addProjectButton = new Button(By.id("NewProjNameButton"), "[Add] button on Todo Ly Page");
    public Label currentProjectLabel = new Label(By.id("CurrentProjectTitle"), "[Current Project Title] label on Todo Ly Page");

    public ToDoPage(){}
}
