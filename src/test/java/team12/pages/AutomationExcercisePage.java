package team12.pages;

import org.openqa.selenium.support.PageFactory;
import team12.utilities.Driver;


public class AutomationExcercisePage {

    public AutomationExcercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
