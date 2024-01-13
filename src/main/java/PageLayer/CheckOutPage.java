package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class CheckOutPage extends BaseClass {

	@FindBy(name="add-to-cart-sauce-labs-backpack")
	private WebElement backpack;

	@FindBy(name="add-to-cart-sauce-labs-bike-light")
	private WebElement bikelight;

	@FindBy(id="shopping_cart_container")
	private WebElement shoopingCart;

	@FindBy(name="checkout")
	private WebElement checkoututton;

	public CheckOutPage() {

		PageFactory.initElements(driver, this);
	}

	public void clickOnAddToCart() {
		
		Wait.click(backpack);
		Wait.click(bikelight);

	}

	public void shoppingCartButton() {
		
		Wait.click(shoopingCart);

	}

	public void clickOncheckpoutButton() {
		
		Wait.click(checkoututton);

	}

}
