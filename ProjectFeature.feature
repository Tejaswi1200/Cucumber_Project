Feature: Test the SauceDemo Website

	Scenario: To test the SauceDemo Website
			Given I am in the login page of SauceDemo
			When I enter the username and password
			And click the signin button
			And I click on the "Add to Cart" button for "SauceLabs Bolt Tshirt"
			And I click on the "Cart" button Icon
    			And I enter the firstName lastname and postalcode
			And click the Continue button
			And I click on Finish button
			Then I validate the outcomes
