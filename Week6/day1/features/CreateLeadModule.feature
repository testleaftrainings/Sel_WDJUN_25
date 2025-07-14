Feature: Lead Creation in the CRM application
@positive@regression
Scenario Outline: Verifying the successful Lead creation
    When the user enters the username as 'DemoSalesManager'
    And the user enters the password as 'crmsfa'
    And the user clicks the login button 
    Then the user should be navigated to the welcome page
    When the user clicks the crmsfa link
    And the user clicks the leads module
    And the user clicks the create lead from the shortcuts menu
    And the user enters the company name as <cname>
    And the user enters the first name as <fname>
    And the user enters the last name as <lname>
    And the user enters the phone number as <phno>
    And the user clicks the create lead button
    Then the user should be navigated to the view lead page
Examples:
        | cname | fname | lname | phno |
		| Testleaf | Bhuvanesh | M | 889977|
		| Qeagle | Anbu | M | 998877 |
		| TCS | Seenivasan | S | 667788|
    
@negative@sanity
Scenario: Verify the lead creation without filling the mandatory fields

    When the user enters the username as 'DemoCSR'
    And the user enters the password as 'crmsfa'
    And the user clicks the login button 
    Then the user should be navigated to the welcome page
    When the user clicks the crmsfa link
    And the user clicks the leads module
    And the user clicks the create lead from the shortcuts menu
    And the user enters the phone number as 765465
    And the user clicks the create lead button
    But the user will get the error message 
