Feature: Global Footer Module 

Background: 
	Given I am on the Exxon Mobil Home Page 
	And the Exxon Mobil Home Page loads 
	
Scenario: Footer links
	Then all the footer links should be valid

Scenario: Footer Social sites 
	Then user should see all the social sites 

Scenario: Footer Brand links
	Then all the footer brand links should be valid

Scenario: Footer Privacy links
	Then all the footer privacy links should be valid
