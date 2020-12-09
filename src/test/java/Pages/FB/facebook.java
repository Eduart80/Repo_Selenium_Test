package Pages.FB;

import Pages.BasePage;
import WebDriver.Web;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class facebook extends BasePage {
 /////  Landing Page  //////
    //Locators
    By createNew = By.linkText("Create New Account");
    By firstName = By.xpath("//input[@name='firstname']");
    By lastName = By.xpath("//input[@name='lastname']");
    By email = By.xpath("//input[@name='reg_email__']");
    By reEmail = By.name("reg_email_confirmation__");
    By imutPass = By.xpath("//input[@id='password_step_input']");
    By selectMonth  = By.name("birthday_month");
    By selectDay = By.name("birthday_day");
    By selectYear = By.name("birthday_year");
    By radioButtonF = By.xpath("//input[@type='radio']/preceding::label[contains(text(),'Female')]");
    By radioButtonM = By.xpath("//input[@type='radio']/preceding::label[contains(text(),'Male')]");
    By radioButtonC = By.xpath("//input[@type='radio']/preceding::label[contains(text(),'Custom')]");
    By submitButton = By.name("websubmit");
    By popUp = By.xpath("//div[contains(text(),'Please enter a valid mobile number or email address.')]");




    //Methods
    public void createNewAccount(){
        clickThis(createNew);
    }
    public void enterN(String name){
        enterField(firstName,name);
    }
    public void enterL(String name){
        enterField(lastName,name);
    }
    public void enterPhone(String name){
        enterField(email, name);
    }
    public void emailIN(String emailFill){
        enterField(email, emailFill);
    }

    //Wait method
    public void waitandRun(String email2){
        Web.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        enterField(reEmail,email2);
    }

    public void passIt(String Password){
        enterField(imutPass,Password);
    }
    public void selectM(String monthIs){
        dropDown(selectMonth,monthIs);
    }
    public void selectD(String dayIs){
        dropDown(selectDay,dayIs);
    }
    public void selectY(String yearIs){
        dropDown(selectYear,yearIs);
    }
    public void radioButt(String name){
       switch (name){
           case "Female":
               clickThis(radioButtonF);
               break;
           case "Male":
               clickThis(radioButtonM);
               break;
           case "Custom":
               clickThis(radioButtonC);
               break;
       }
    }
    public void clickSearch(){
        clickThis(submitButton);
    }
    public boolean popUpShow(){
        WebElement popup = Web.getDriver().findElement(popUp);
        boolean isUp = popup.isDisplayed();
        return isUp;
    }


}
