package Steps;

import BaseLayer.BaseClass;
import PageLayer.CheckOutPage;
import io.cucumber.java.en.When;

public class CheckoutPageStep extends BaseClass{
	
	public static CheckOutPage  ckout;
	
	@When("use click on backpack and bikelight  add to cart button")
	public void use_click_on_backpack_and_bikelight_add_to_cart_button() {
		ckout = new CheckOutPage();
		ckout.clickOnAddToCart();
	    
	}

	@When("user click on shopping cart button")
	public void user_click_on_shopping_cart_button() {
	   ckout.shoppingCartButton();
	}

	@When("user click on check out button")
	public void user_click_on_check_out_button() {
	   ckout.clickOncheckpoutButton();
	}

}
