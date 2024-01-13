Feature: Test the Sauce Demo application

  Scenario: validate the Login functionality
    Given user is on login page
    When user enter valid username and password
    Then user click on login button

  Scenario: validate homePage Functionality
  When user is on homepage and validate homepage title
  And validate homepage url
  
  Scenario: validate checkout Functionality
  When use click on backpack and bikelight  add to cart button
  And user click on shopping cart button 
  And user click on check out button