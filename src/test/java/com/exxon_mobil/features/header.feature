Feature: Global Header Module 

Background: 
	Given I am on the Exxon Mobil Home Page 
	And the Exxon Mobil Home Page loads 
	
Scenario: ExxonMobil home promo 
	Then I should see ExxonMobil home promo link 
	
Scenario: Energy and environment nav 
	Then on hover each nav displays a subnav 
	Then all links in each sub nav should be valid 
	
Scenario: Global Selector 
	Then user should see the global selector 
	When user clicks on the Global selector 
	Then the global selector overlay should display 
	When user clicks on the x button 
	Then the global selector overlay should no longer display 
