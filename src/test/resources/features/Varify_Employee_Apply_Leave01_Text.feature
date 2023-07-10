
Feature: I  want to  verify Apply Leave Text 
@Sanity
 Scenario: Verify Customer Login  Apply Leavey
 
    Given I want to Verify Navigate Url
    And I want to go Loging mene
    When Click on Employee Login
    And Enter User Id as testpilot@gmail.com
    And Enter Password as "1234"
    Then Click Login button
    And Verify I am in Home Page
    When I Click apply leave menue
    Then Enter Reason
    Then I Enter Start Date
    And I Enter End Date 
    And I Click submit button
    And Verify Confirmed

 