Feature: Lead Creation in the CRM application

Scenario: Verifying the successful Lead creation

	Given the user establishes the environment
    Given the user loads the url 
    When the user enters the username as DemoSalesManager
    When the user enters the password as crmsfa
    When the user clicks the login button 
    Then the user should be navigated to the welcome page
    When the user clicks the crmsfa link
    When the user clicks the leads module
    When the user clicks the create lead from the shortcuts menu
    When the user enters the company name as Testleaf
    When the user enters the first name as Bhuvanesh
    When the user enters the last name as M
    When the user enters the phone number
    When the user clicks the create lead button
    Then the user should be navigated to the view lead page
