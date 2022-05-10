package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    @FindBy(xpath="//h1[@class='search-header__title']")
    WebElement result;

    public String verifyTheResults(){
        Reporter.log("getting  text from result"+result.toString()+"<br>");
        return getTextFromElement(result);
    }
}
