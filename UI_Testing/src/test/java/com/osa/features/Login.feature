
Feature: Title of your feature. I want to use this template for my feature file
@regression @QA
  Scenario: I should be able to login in OSA Forum by using valid username and password
    Given I open the browser
    And I nevigate to "https://www.osaconsultingtech.com"
    And I click on Forum button
    And I enter username 
    And I enter password
    When I click on Login button
    Then I verify that I am on student page
    And I close the page
 @regression @QA
  Scenario: I should be able to navigate to Inteview question page
  	Given I open the browser
    And I nevigate to "https://www.osaconsultingtech.com"
    And I click on OSA Forum button
    And I enter my username
    And I enter my password
    And I click on OSA login button
    When I click on inteview Question button
    Then I verify that I am on interview question page
    And I close the page
    @regression 
   Scenario: I should be able to login in OSA Forum by using valid username and password
    Given I open the browsers
        	|name|osa|
	    		|phone|54354353|
	    		|email|email@eami.com|

    	
 
    
  


