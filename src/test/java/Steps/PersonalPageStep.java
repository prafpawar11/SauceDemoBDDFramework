package Steps;

import BaseLayer.BaseClass;
import PageLayer.PersonalPage;
import io.cucumber.java.en.When;

public class PersonalPageStep extends BaseClass {
	protected static PersonalPage pp;

	@When("user enter firstname, lastname and pincode and click on continue button")
	public void user_enter_firstname_lastname_and_pincode_and_click_on_continue_button() {
		pp = new PersonalPage();
		pp.userEnterDetails("Shri", "Jadhav", "431124");
	}

	@When("user click on finish button")
	public void user_click_on_finish_button() {
		pp.clickOnFinishButton();
	}

	@When("validate thank for your order message")
	public void validate_thank_for_your_order_message() {
		pp.validateThankYouMessage();
	}

}
