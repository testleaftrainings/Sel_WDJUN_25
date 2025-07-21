Feature: Verifying the login funtionality of the CRM application 

Scenario: The user tries to login with the valid credentials 

	When the user enters the username as "DemoCsr"
	And the user enters the password as "crmsfa" 
	And the user clicks the login button 
	
Scenario Outline: The user tries to create a new lead using the valid credentials 
	When the user enters the username as "demosalesmanager" 
	And the user enters the password as "crmsfa" 
	And the user clicks the login button 
	And the user clicks the crmsfa link 
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
	
	
