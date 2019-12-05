Feature: Exxon Mobil home page tests 


Background: 
    Given I am on the Exxon Mobil Home Page
    And the Exxon Mobil Home Page loads
    
Scenario: Homepage Hero module
	Then user should see homepage hero module
	Then user should see homepage hero module eyebrow
	Then user should see homepage hero module title
	Then user should see homepage hero module title text
	Then user should see homepage hero module CTA
	Then user should see the hompeage hero module controls 


	
    
  #Mission Statement module
#Scenario: Mission Statement module
#	Then user should see the mission statement module
#	And the the mission statement module content should display
#
#Scenario: Mission Statement module first element hover
#	Then on first element hover, first tooltip should render 
#	Then on second element hover, second tooltip should render 
#	Then on third element hover, third tooltip should render
#	 
#    
# # Our Commitment module
#Scenario: Our Commitment: Improving energy access (1st grid)
#	Then on hover, the first grid opens
#	And first grid item title should be present 
#	And first grid item description should be present 
#	And first grid item link should be present 	
#Scenario: Our Commitment: Improving efficiency (2nd grid)
#	Then on hover, the second grid opens
#	And second grid item title should be present 
#	And second grid item description should be present 
#	And second grid item link should be present 		
#Scenario: Our Commitment: Sustainability (3rd grid)
#	Then on hover, the third grid opens
#	And third grid item title should be present 
#	And third grid item description should be present 
#	And third grid item link should be present 		
#Scenario: Our Commitment: Mitigating emissions (4th grid)
#	Then on hover, the fourth grid opens
#	And fourth grid item title should be present 
#	And fourth grid item description should be present 
#	And fourth grid item link should be present 
#	
#Scenario: Our Commitment: Job creation (5th grid)
#	Then on hover, the fifth grid opens
#	And fifth grid item title should be present 
#	And fifth grid item description should be present 
#	And fifth grid item link should be present 	
#	
#Scenario: Our Commitment: Outreach (6th grid)
#	Then on hover, the sixth grid opens
#	And sixth grid item title should be present 
#	And sixth grid item description should be present 
#	And sixth grid item link should be present 
#	
## Trending module 
Scenario: Trending module	
	Then user should see the Trending module
	Then each Trending module item should have a title
	Then the title link should be valid
	Then each item should have a dot
	Then eaxh item should have a date




		
## Energy Factor module
#Scenario: Energy Factor module
#	Then user should see the Energy Factor module
#	And user should see the Energy Factor eyebrow
#	And user should see the Energy Factor title
#	And user should see the Energy Factor description 
#	And user should see the Energy Factor Learn more button
#	 
## Stock Ticker module
#Scenario: Stock Ticker module
#	Then user should see the Stock Ticker module
#	And user should see the Stock Ticker title
#	And user should see the Stock Ticker price
#	And user should see the Stock Ticker change
#	And user should see the Stock Ticker time
#	And user should see the Stock Ticker date
#    And user should see the Stock Ticker button
#    And user should see the Stock Ticker button
