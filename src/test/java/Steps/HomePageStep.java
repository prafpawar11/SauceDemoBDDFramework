package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.When;

public class HomePageStep extends BaseClass{

	public static  HomePage hm;
	
	@When("user is on homepage and validate homepage title")
	public void user_is_on_homepage_and_validate_homepage_title() {
		  hm = new HomePage();
		
		String actualTitle = hm.getTitle();
		
		Assert.assertEquals(actualTitle, "Swag Labs");
	}

	@When("validate homepage url")
	public void validate_homepage_url() {
	    String actualUrl =hm.getCurrentUrl();
	    boolean value =actualUrl.contains("sauce");
	    Assert.assertTrue(value);
	}

}
