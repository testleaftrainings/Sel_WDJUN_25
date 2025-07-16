Feature: Verifying the login funtionality of the CRM application 

Scenario: The user tries to login with the valid credentials 

	When the user enters the username as demosalesmanager 
	And the user enters the password as crmsfa 
	And the user clicks the login button 
	
Scenario: The user tries to create a new lead using the valid credentials 
	When the user enters the username as demosalesmanager 
	And the user enters the password as crmsfa 
	And the user clicks the login button 
	And the user clicks the crmsfa link 
	And the user clicks the leads module 
	And the user clicks the create lead from the shortcuts menu 
	
	
