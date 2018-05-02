package MyStore.StepDefinitions;

import java.awt.Point;
import java.awt.Robot;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;

import MyStore.Config.*;
import MyStore.PageObjects.LoginPage;
import MyStore.PageObjects.MyAccountsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class MyAccounts {
	LoginPage loginpageobj = null;
	public static WebDriver driver = null;
	final static Logger logger = Logger.getLogger(MyAccounts.class);
	int counter = 1;
	MyAccountsPage myaccountpageobj=null;

	@And ("^an existing user enters an email address as \"([^\"]*)\"$")
	public void existingUserEmailAddress(String emailAddress) throws IOException {
		try {
			Thread.sleep(1000);
			myaccountpageobj=new MyAccountsPage(baseclass.driver);
			myaccountpageobj.email_Address_Text_Box.sendKeys(emailAddress);
			String message = "Step:"+(counter++)+"PASSED- user enters email id";
			logger.info(message);
			HTMLReportGenerator.StepDetails("PASS", "existingUserEmailAddress", message,
					TakeScreenShot.TakeScreenShot(Config.getImageFilePath(), baseclass.driver));
		}
		catch(Exception ex) {
			String message = "Step:" + (counter++) + " FAILED- user filed to enter email id\nException Details:"
					+ ex.getLocalizedMessage();
			logger.info(message);
			HTMLReportGenerator.StepDetails("FAIL", "existingUserEmailAddress", message,
					TakeScreenShot.TakeScreenShot(Config.getImageFilePath(), baseclass.driver));
			Assert.assertTrue(false);
		}
	}

	@And ("^an existing user enters an password as \"([^\"]*)\"$")
	public void existingUserPassword(String password) throws IOException {
		try {
			Thread.sleep(1000);
			myaccountpageobj=new MyAccountsPage(baseclass.driver);
			myaccountpageobj.password_Text_Box.sendKeys(password);
			String message = "Step:"+(counter++)+"PASSED- user enters password";
			logger.info(message);
			HTMLReportGenerator.StepDetails("PASS", "existingUserPassword", message,
					TakeScreenShot.TakeScreenShot(Config.getImageFilePath(), baseclass.driver));
		}
		catch(Exception ex) {
			String message = "Step:" + (counter++) + " FAILED- user filed to enter password\nException Details:"
					+ ex.getLocalizedMessage();
			logger.info(message);
			HTMLReportGenerator.StepDetails("FAIL", "existingUserPassword", message,
					TakeScreenShot.TakeScreenShot(Config.getImageFilePath(), baseclass.driver));
			Assert.assertTrue(false);
		}
	}


	@And ("^user clicks on SignIn button$")
	public void clickOnSignInButton() throws IOException {
		try {
			Thread.sleep(1000);
			myaccountpageobj.signIn_Button.click();
			String message = "Step:"+(counter++)+"PASSED- user clicks on SignIn Button";
			logger.info(message);
			HTMLReportGenerator.StepDetails("PASS", "clickOnSignInButton", message,
					TakeScreenShot.TakeScreenShot(Config.getImageFilePath(), baseclass.driver));
		}
		catch(Exception ex) {
			String message = "Step:" + (counter++) + " FAILED- user filed click Sign In button\nException Details:"
					+ ex.getLocalizedMessage();
			logger.info(message);
			HTMLReportGenerator.StepDetails("FAIL", "clickOnSignInButton", message,
					TakeScreenShot.TakeScreenShot(Config.getImageFilePath(), baseclass.driver));
			Assert.assertTrue(false);
		}
	}

	@And ("^user clicks on Dresses mega menu$")
	public void clickOnDressesMegaMenu() throws IOException {
		try {
			Thread.sleep(3000);
			Actions action = new Actions(baseclass.driver);
			//		WebElement we = webdriver.findElement(By.xpath("//html/body/div[13]/ul/li[4]/a"));
			action.moveToElement(myaccountpageobj.dresses_Menu).build().perform();
			//		myaccountpageobj.dresses_Menu.click();
			String message = "Step:"+(counter++)+"PASSED- user clicks on Dresses Mega Menu";
			logger.info(message);
			HTMLReportGenerator.StepDetails("PASS", "clickOnDressesMegaMenu", message,
					TakeScreenShot.TakeScreenShot(Config.getImageFilePath(), baseclass.driver));
		}
		catch(Exception ex) {
			String message = "Step:" + (counter++)
					+ " FAILED- user failed to click on Dresses Mega Menu\nException Details:"
					+ ex.getLocalizedMessage();
			logger.info(message);
			HTMLReportGenerator.StepDetails("FAIL", "clickOnDressesMegaMenu", message,
					TakeScreenShot.TakeScreenShot(Config.getImageFilePath(), baseclass.driver));
			Assert.assertTrue(false);
		}
	}

	@And ("^user clicks on Summer Dresses mega menu$")
	public void clickOnSummerDressesMegaMenu() throws IOException {
		try {
			Thread.sleep(3000);		
			myaccountpageobj.summer_Dresses_Menu.click();
			String message = "Step:"+(counter++)+"PASSED- user clicks on Summer Dresses Mega Menu";
			logger.info(message);
			HTMLReportGenerator.StepDetails("PASS", "clickOnSummerDressesMegaMenu", message,
					TakeScreenShot.TakeScreenShot(Config.getImageFilePath(), baseclass.driver));
		}
		catch(Exception ex) {
			String message = "Step:" + (counter++)
					+ " FAILED- user failed to click on Summer Dresses Mega Menu\nException Details:"
					+ ex.getLocalizedMessage();
			logger.info(message);
			HTMLReportGenerator.StepDetails("FAIL", "clickOnSummerDressesMegaMenu", message,
					TakeScreenShot.TakeScreenShot(Config.getImageFilePath(), baseclass.driver));
			Assert.assertTrue(false);
		}
	}


	@Then("^Summer Dresses page opens with text as \"([^\"]*)\"$")
	public void verifySummerDressesPageOpens(String summerDressesExpectedPageText) throws IOException {
		try {
			Thread.sleep(3000);
			String summerDressesActualPageText = myaccountpageobj.summer_Dresses_Landing_Page.getText();
			Assert.assertEquals(summerDressesExpectedPageText, summerDressesActualPageText);
			String message = "Step:"+(counter++)+"PASSED- user clicks on Summer Dresses Mega Menu";
			logger.info(message);
			HTMLReportGenerator.StepDetails("PASS", "verifySummerDressesPageOpens", message,
					TakeScreenShot.TakeScreenShot(Config.getImageFilePath(), baseclass.driver));
		}
		catch(Exception ex) {
			String message = "Step:" + (counter++)
					+ " FAILED- user failed to click on Summer Dresses Mega Menu\nException Details:"
					+ ex.getLocalizedMessage();
			logger.info(message);
			HTMLReportGenerator.StepDetails("FAIL", "verifySummerDressesPageOpens", message,
					TakeScreenShot.TakeScreenShot(Config.getImageFilePath(), baseclass.driver));
			Assert.assertTrue(false);
		}
	}

	@And("^user selects Sort by drop down value \"([^\"]*)\"$")
	public void selectSortByValue(String sortBy) throws Exception {
		try {
			Thread.sleep(4000);
			myaccountpageobj.productSortDropDown.sendKeys(sortBy);
			myaccountpageobj.productSortDropDown.sendKeys(Keys.TAB);
			org.openqa.selenium.Point coordinates = myaccountpageobj.productSortDropDown.getLocation();
			Robot robot = new Robot();
			// WebElement markNews = driver.findElement(By.xpath("element xpath"));
			robot.mouseMove(coordinates.x + 100, coordinates.y + 100);
			Thread.sleep(2000);
			String message = "Step:" + (counter++) + "PASSED- user selects " + sortBy + " value";
			logger.info(message);
			HTMLReportGenerator.StepDetails("PASS", "selectSortByValue", message,
					TakeScreenShot.TakeScreenShot(Config.getImageFilePath(), baseclass.driver));
		} catch (Exception ex) {
			String message = "Step:" + (counter++) + " FAILED- user failed select the SortBy Value\nException Details:"
					+ ex.getLocalizedMessage();
			logger.info(message);
			HTMLReportGenerator.StepDetails("FAIL", "selectSortByValue", message,
					TakeScreenShot.TakeScreenShot(Config.getImageFilePath(), baseclass.driver));
			Assert.assertTrue(false);
		}

	}

	@Then("^user verifies that the products are sorted based on the selected Sort by value$")
	public void verifyProductSortBasedOnSelectedSortByValue() throws Exception {
		try {
			Thread.sleep(4000);
			// int temp = myaccountpageobj.productPrice.size();
			// System.out.println("the size of the price list is: " + temp);
			// for (int i = 0; i < temp; i = i + 1) {
			// System.out.println(myaccountpageobj.productPrice.get(i).getText());
			// }

			ArrayList<String> priceList = new ArrayList<String>();
			int temp1 = myaccountpageobj.productPrice.size();
			ArrayList<Double> priceListInFloat = new ArrayList<Double>();


			for (int i = 0; i < temp1; i = i + 1) {
				priceList.add(myaccountpageobj.productPrice.get(i).getText());
				String ss = myaccountpageobj.productPrice.get(i).getText();
				Number number = NumberFormat.getCurrencyInstance(Locale.US).parse(ss);

				System.out.println("The price list now is: " + ss);
				System.out.println("The price without dollar is now: " + number);
				priceListInFloat.add(i, (Double) number);

				// System.out.println("The price list now is: " + priceList);

				// String string =
				// NumberFormat.getCurrencyInstance(Locale.GERMANY).format(123.45);
				// Number number = NumberFormat.getCurrencyInstance(Locale.US).parse("$123.45");
				// System.out.println("String is" + string);
				// System.out.println("number is" + number);
			}
			ArrayList<Double> sortedPriceListInFloat = new ArrayList<Double>(priceListInFloat);

			Collections.sort(sortedPriceListInFloat);

			if (sortedPriceListInFloat.equals(priceListInFloat)) {

				System.out.println("List is sorted");

			} else {
				System.out.println("List is not sorted");

			}


			// Boolean ascendingCheck;
			// if(!ascendingCheck(priceList)){
			// Assert.fail("Not is ascending order");
			// }
			//
			// Boolean ascendingCheck(ArrayList<Float> data){
			// for (int i = 0; i < data.size()-1; i++) {
			// if (data.get(i) > data.get(i+1)) {
			// return false;
			// }
			// }
			// return true;
			// }

		}
		catch (Exception ex) {
			String message = "Step:" + (counter++) + " FAILED- Product sort failed\nException Details:"
					+ ex.getLocalizedMessage();
			logger.info(message);
			HTMLReportGenerator.StepDetails("FAIL", "selectSortByValue", message,
					TakeScreenShot.TakeScreenShot(Config.getImageFilePath(), baseclass.driver));
			Assert.assertTrue(false);
		}

	}

}
