package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Reuseble.Basepage;

public class LoginPageObject extends Basepage {
	
	@FindBy(id="newsletter-input")
	private WebElement newslettertxtbox;
	
	@FindBy(name="submitNewsletter")
	private WebElement submitbtn;
	
	@FindBy(xpath="//*[@class='alert alert-success']")
	private WebElement successmsg;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement tabwomen;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement tabDresses;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement tabtshirts;
	
	
	
	public LoginPageObject(){
		PageFactory.initElements(driver, this);
	}
	public void setNewsletter(String email) {
		settext(newslettertxtbox ,email);
	}
	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	public String getAlertmsg() {
		return successmsg.getText();
	}
	public WebElement getTabwomen() {
		return tabwomen;
	}
	
	public WebElement getTabDresses() {
		return tabDresses;
	}

	public WebElement getTabtshirts() {
		return tabtshirts;
	}


}
