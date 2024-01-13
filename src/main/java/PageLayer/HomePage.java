package PageLayer;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{
	
	
	
	
	
	public String getTitle() {
		
		return driver.getTitle();
		
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

}
