
Feature: I will Verify Order product List


@Sanity
  Scenario: Verify Order product And order list then i will confirmed order
  	
 Given I want to Locate navigateUrl
 When I want to click on login Menu
    And I want to click on  Customer Login
    And Enter User Id as david@gmail.com
    And Enter Password as 1234
    Then Click Login Button
    And I am in Home Page
    Then Click order product menue
    Then Click product Name
    Then Enter order Date
    Then Click product button
    Then  Click Order product Confirm Link
    Then I want to  Confirmed
    And  I Eventually Log Out
		Then I want to click Employee Login
 		And  I Enter employee email address
 		And  I Enter password
 		Then I want to  Login
 		Then I Want to Click Welcome Test
 		Then I will click My profile
		Then I want see to Update Info
 		And I Replace the Contact Number
 		And I  Replace the Address
 		Then I click submit button
 		Then I   want to Verify Address
 