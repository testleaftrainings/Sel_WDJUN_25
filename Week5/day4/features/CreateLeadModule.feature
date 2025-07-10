Feature: Lead Creation in the CRM application

#Background:
#
#	Given the user establishes the environment
#    And the user loads the url 
@positive@regression
Scenario: Verifying the successful Lead creation
    When the user enters the username as DemoSalesManager
    And the user enters the password as crmsfa
    And the user clicks the login button 
    Then the user should be navigated to the welcome page
    When the user clicks the crmsfa link
    And the user clicks the leads module
    And the user clicks the create lead from the shortcuts menu
    And the user enters the company name as Testleaf
    And the user enters the first name as Bhuvanesh
    And the user enters the last name as M
    And the user enters the phone number
    And the user clicks the create lead button
    Then the user should be navigated to the view lead page
    
@negative@sanity
Scenario: Verify the lead creation without filling the mandatory fields

    When the user enters the username as DemoSalesManager
    And the user enters the password as crmsfa
    And the user clicks the login button 
    Then the user should be navigated to the welcome page
    When the user clicks the crmsfa link
    And the user clicks the leads module
    And the user clicks the create lead from the shortcuts menu
    And the user enters the phone number
    And the user clicks the create lead button
    But the user will get the error message 
