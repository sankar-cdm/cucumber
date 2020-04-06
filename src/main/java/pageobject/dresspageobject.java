package pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Reuseble.Basepage;

public class dresspageobject extends Basepage {

	@FindBy(xpath="//ul[@class='product_list grid row']")
	private List<WebElement>allproduct;

	@FindBy(xpath="//ul[@class='product_list grid row']/li//*[text()='Add to cart']")
	private WebElement btnaddtocart;

	@FindBy(xpath="//*[@class='heading-counter']")
	private WebElement txtheading;
	


	public dresspageobject(){
		PageFactory.initElements(driver, this);
	}

	public int getAllproduct() {
		
		return allproduct.size();
	}

	public void getBtnaddtocart() {
		mouseOver(allproduct.get(0));
		isElementVisible(btnaddtocart);
		btnaddtocart.click();
	}

	
	public int getTxtheading() {
		return Integer.parseInt(txtheading.getText().split("")[2]);
	}



}
