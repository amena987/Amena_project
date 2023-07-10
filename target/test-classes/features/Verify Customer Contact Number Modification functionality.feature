Feature: Customer Contact Number Modification functionality
@Sanity
Scenario: Verify Customer Contact Number Modification functionality
Given I am in landing page 
When I Click on Login menu
And Click on Customer Login
Then Enter User Id as "david@gmail.com"       
And I Enter Password as "1234"
And I Click on Login Button
Then Verify that I am in Home Page
And I Click on Profile Menu
And I Click on Update Info
And I Replace the Contact Number to 662789
And I Click Submit button
Then Verify Contact Number is changed to 662789
