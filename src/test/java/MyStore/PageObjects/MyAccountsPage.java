package MyStore.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyAccountsPage {
	
	WebDriver localdriverobject;

	public MyAccountsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.localdriverobject=driver;
		System.out.println("INSIDE MyAccountsPage CONSTRUCTOR");
	}
	
	@FindBy(how=How.XPATH, using="//a[@title='Dresses']")
	public WebElement dresses_Menu;
	
	@FindBy(how=How.XPATH, using="//a[@title='Summer Dresses']")
	public WebElement summer_Dresses_Menu;
	
	@FindBy(how=How.XPATH, using="//input[@id='email']")
	public WebElement email_Address_Text_Box;
	
	@FindBy(how=How.XPATH, using="//input[@id='passwd']")
	public WebElement password_Text_Box;
	
	@FindBy(how=How.XPATH, using="//button[@id='SubmitLogin']")
	public WebElement signIn_Button;
	
	@FindBy(how=How.XPATH, using="//span[@class='cat-name']")
	public WebElement summer_Dresses_Page;
	
	
}
