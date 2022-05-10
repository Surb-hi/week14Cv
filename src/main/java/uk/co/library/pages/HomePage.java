package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle1;

    public void enterJobTitle(String jobTitle) {
        Reporter.log("Enter jobTitle"+jobTitle + " to jobTitle field "+ jobTitle1.toString() + "<br>");
        sendTextToElement(jobTitle1,jobTitle);
    }


    @FindBy(xpath = "//input[@id='location']")
    WebElement Location;

    public void enterLocation(String location) {
        Reporter.log("Enter Location"+location + " to Location field "+ Location.toString() + "<br>");
        sendTextToElement(Location, location);
    }



    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    public void selectDistance(String distance) {
        Reporter.log("Selecting distanceDropDown "+distance+" from dropdown "+distanceDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
    }


    @FindBy(id="toggle-hp-search")
    WebElement moreSearchOptionsLink;

    public void clickOnMoreSearchOptionLink() {
        Reporter.log("Clicking on moreSearchOptionsLink"+ moreSearchOptionsLink.toString()+ "<br>");
        clickOnElement(moreSearchOptionsLink);
    }
    @FindBy(xpath = "//*[contains(text(),'Accept')]")
    WebElement cookies;

    public void clickOnAcceptCookie(){
         Reporter.log("Clicking on Accept Cookies : " + cookies.toString());
        switchToiFrame("gdpr-consent-notice");
        clickOnElement(cookies);
    }

    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    public void enterMinSalary(String minSalary) {
        Reporter.log("Enter salaryMin"+minSalary+ " to salaryMin  field "+ salaryMin.toString() + "<br>");
        sendTextToElement(salaryMin, minSalary);
    }



    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    public void enterMaxSalary(String maxSalary) {
        Reporter.log("Enter salaryMax"+maxSalary + " to salaryMax field "+ salaryMax.toString() + "<br>");
        sendTextToElement(salaryMax, maxSalary);
    }



    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    public void selectSalaryType(String sType) {
        Reporter.log("Selecting salaryTypeDropDown "+sType+" from dropdown "+salaryTypeDropDown.toString() + "<br>");
        selectByValueFromDropDown(salaryTypeDropDown, sType);
    }



    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    public void selectJobType(String jobType) {
        Reporter.log("Selecting jobTypeDropDown"+jobType +" from dropdown "+jobTypeDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
    }



    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    public void clickOnFindJobsButton() {
        Reporter.log("Clicking on findJobsBtn"+ findJobsBtn.toString()+ "<br>");
        clickOnElement(findJobsBtn);
    }
}
