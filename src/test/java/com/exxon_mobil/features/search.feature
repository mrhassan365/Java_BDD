Feature: Search 

Background: 
	Given I am on the Exxon Mobil Home Page 
	And the Exxon Mobil Home Page loads 
	
Scenario: Search modal: default state 
	When user clicks search button 
	Then search module should display 
	And the search module input should be present 
	And the search button should be disabled 
	When user clicks on the X button 
	Then search module should no longer display 
	
Scenario: Search modal:Search button enabled/disabled states 
	Then user clicks search button 
	When enters a search term in the search edit field 
	Then the search module search button should be enabled 
	When user deletes the search term in the search edit field 
	Then the search module search button should be disabled 
	
Scenario: Search modal: auto complete behavior test 
	Then user clicks search button 
	When enters a search ca in the search edit field 
	Then type ahead suggestions should display 
	And search term should be in the suggested selections texts 
	When user clears the search edit field 
	Then the type ahead suggestions should no longer display 
	
Scenario: Search modal: Search: no results 
	When user clicks search button 
	And user executes search with "q12we34r" 
	Then user should see no results message section 
	And "q12we34r" should render in the no results message 
	
Scenario: Search modal: Search: search results default 
	When user clicks search button 
	And user executes search with "exxonmobile" 
	Then first tab should be selected 
	Then results eyebrow should display 
	Then results items should display 
	Then Load More button should display 
	When user clicks the Load More button 
	Then the result item count should increase 
	

	
Scenario: Search modal: Search: article filter 
	When user clicks search button 
	And user executes search with "exxonmobile" 
	When user filters by article 
	Then result items should be less 
	Then result items should have the article tag 
		
Scenario: search: boosted search 
	When user clicks search button 
	And user executes search with "Fracking" 
	Then boosted search results should load 
	
	
#The Scenarios below have step definitions for them, but they won't work on all locales. It was meant for the USA locale

	
#Scenario: Search modal: Search: Energy Factor Tab 
#	When user clicks search button 
#	And user executes search with "carbon copy" 
#	When user clicks on Energy Factor tab 
#	Then Energy Factor results tab should be selected 
#	Then Energy Factor results eyebrow should display 
#	Then Energy Factor results items should display 
#	Then Energy Factor Load More button should display 
#	When user clicks the Energy Factor tab Load More button 
#	Then Energy factor result item count should increase 
#	
#Scenario: Search modal: Perspectives blog Factor Tab 
#	When user clicks search button 
#	And user executes search with "carbon copy" 
#	When user clicks on Perspectives blog tab 
#	Then Perspectives blog results tab should be selected 
#	Then Perspectives blog results eyebrow should display 
#	Then Perspectives blog results items should display 
#	Then Perspectives blog Load More button should display 
#	When user clicks the Perspectives blog tab Load More button 
#	Then Perspectives blog result item count should increase

#Scenario: Search modal: Search: Sort by: date
#	When user clicks search button 
#	And user executes search with "carbon copy" 
#	When user sorts by date
#	Then result items should dates should display in descending order
#	
