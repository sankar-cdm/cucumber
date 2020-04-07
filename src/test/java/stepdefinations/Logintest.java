package stepdefinations;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;

import Reuseble.Basepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageobject.LoginPageObject;


public class Logintest {
	LoginPageObject1 lp;
	Basepage bp;
	
	int random=new Random().nextInt(10000);
	String email="ponnar"+random+"@gmail.com";
	
	public Logintest(){
		lp=new LoginPageObject();
		
		
	}
	
	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
	 lp=new LoginPageObject();  
	 System.out.println("application launched");
	}

	@When("^User enter the email in the subscription text box$")
	public void user_enter_the_email_in_the_subscription_text_box() throws Throwable {
		lp.setNewsletter(email);
		lp.getSubmitbtn().click();
	   
	}

	@Then("^User should see the verification message$")
	public void user_should_see_the_verification_message() throws Throwable {
	   lp.getAlertmsg().equals("Successfully");
	   System.out.println("successfully verified");
	}
	@When("^User click the \"(.*?)\"$")
	public void user_click_the(String arg1) throws Throwable {
			if (arg1.equals("Dresses")){
				System.out.println(lp.getTabDresses().getText());
				lp.getTabDresses().click();
			}else if (arg1.equals("Women")){
			System.out.println(lp.getTabwomen().getText());
				lp.getTabwomen().click();
			}else if (arg1.equals("tshirts")){
				System.out.println(lp.getTabtshirts().getText());
				lp.getTabtshirts().click();
			}
	}

	@Then("^User should see the pages$")
	public void user_should_see_the_pages() throws Throwable {
		if (lp.equals("Dresses")){
			System.out.println(lp.getTitlte());
		}
		else if (lp.equals("Women")){
			System.out.println(lp.getTitlte());
		}else if (lp.equals("tshirts")){
			System.out.println(lp.getTitlte());
		}
	}
	

}
