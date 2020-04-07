package pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Reuseble.Basepage;

public class dresspageobject extends Basepage {

	@FindBy(xpath="//ul[@class='product_list grid row']/li")
	private List<WebElement>allproduct;

	@FindBy(xpath="//ul[@class='product_list grid row']/li[1]//*[text()='Add to cart']")
	private WebElement btnaddtocart;

	@FindBy(xpath="//*[@class='heading-counter']")
	private WebElement txtheading;
	
	@FindBy(xpath="//*[@title='View my shopping cart']")
	private WebElement cart;
	


	public dresspageobject(){
		PageFactory.initElements(driver, this);
	}

	public int getproductsize() {
		
		return allproduct.size();
	}

	public void getBtnaddtocart() {
		mouseOver(allproduct.get(0));
		isElementVisible(btnaddtocart);
		btnaddtocart.click();
	}
	
	public int getcountheading() {
		return Integer.parseInt(txtheading.getText().split(" ")[2]);
	}

	public WebElement getCart() {
		return cart;
	}



}
