package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class PersonalPage extends BaseClass {
	@FindBy(id = "first-name")
	private WebElement fname;

	@FindBy(id = "last-name")
	private WebElement lname;

	@FindBy(id = "postal-code")
	private WebElement postalCode;

	@FindBy(id = "continue")
	private WebElement continueButton;

	@FindBy(xpath = "//button[text()='Finish']")
	private WebElement finish;

	@FindBy(xpath = "//h2[text()='Thank you for your order!']")
	private WebElement thankYou;

	public PersonalPage() {
		PageFactory.initElements(driver, this);
	}

	public void userEnterDetails(String fname1, String lname1, String postalCode1) {
		Wait.sendKeys(fname, fname1);
		Wait.sendKeys(lname, lname1);
		Wait.sendKeys(postalCode, postalCode1);
		Wait.click(continueButton);

	}

	public void clickOnFinishButton() {
		Wait.click(finish);
	}

	public String validateThankYouMessage() {
		return Wait.getText(thankYou);
	}

}
