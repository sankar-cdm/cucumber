package stepdefinations;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import Reuseble.Basepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobject.LoginPageObject;
import pageobject.dresspageobject;

public class dresstest {
	Basepage bp;
	dresspageobject dp;
	LoginPageObject lp;


	public dresstest(){
		dp=new dresspageobject();
		lp=new LoginPageObject();
	}
	@Given("^User opens the application$")
	public void user_opens_the_application() throws Throwable {
	   bp=new Basepage();
	}

	@When("^User click the tab \"(.*?)\"$")
	public void user_click_the_tab(String tab) throws Throwable {
		
		if (tab.equals("Dresses")){
		  System.out.println(lp.getTabDresses().getText());
	  }else if (tab.equals("Women")){
		  System.out.println(lp.getTabwomen().getText());
	  }else if (tab.equals("T-shirt")){
		  System.out.println(lp.getTabtshirts().getText());
	  }
	}


	@Then("^User should see the same number of products count matching with the product header count displayed$")
	public void user_should_see_the_same_number_of_products_count_matching_with_the_product_header_count_displayed() throws Throwable {
		int a = dp.getcountheading();
		System.out.println(a);
		int b = dp.getproductsize();
		System.out.println(b);
		Assert.assertEquals(dp.getcountheading(), dp.getproductsize());
	}
	
	@When("^the click on Add to cart button for the product \"(.*?)\"$")
	public void the_click_on_Add_to_cart_button_for_the_product(String product) throws Throwable {
	dp.getproductsize();
	if (product.equals(product)){
	System.out.println("product");
		dp.getBtnaddtocart();
	}
	}

	@Then("^the product should added to cart page$")
	public void the_product_should_added_to_cart_page() throws Throwable {

	}




	}