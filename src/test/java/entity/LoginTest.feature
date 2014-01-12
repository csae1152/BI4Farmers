#----------------------------------
# Example of Cucumber .feature file
#----------------------------------
    
@RunWith 
Feature: Test login

   # A very simple scenario
   Scenario Outline: Login Success and Failure
      Given user navigates to login form 
      When user log in with '<type>' credentials
      Then user should see logged in '<status>'

Examples:
	| type		| status		|
	| valid		| successfully		|
	| invalid	| unsuccessfully	| 
   