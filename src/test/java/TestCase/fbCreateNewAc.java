package TestCase;

import Pages.BasePage;
import Pages.FB.facebook;
import WebDriver.Web;
import org.testng.Assert;
import org.testng.annotations.Test;

public class fbCreateNewAc extends Web {
    ////  Test Case ////

    BasePage bp = new BasePage();
    facebook lpage = new facebook();

    @Test
    public void createNewAccount(){
        lpage.createNewAccount();
        lpage.enterN("Eeeeee");
        lpage.enterL("Ddddd");
        //lpage.emailIN("testcase@yahoo.com");
        //lpage.waitandRun("testcase@yahoo.com");
        lpage.enterPhone("123654789");
        lpage.passIt("12345");
        lpage.selectM("3");
        lpage.selectD("15");
        lpage.selectY("1988");
        lpage.radioButt("Male");
        lpage.clickSearch();
        Assert.assertTrue(lpage.popUpShow(), "PopUp did not display");


    }


}
