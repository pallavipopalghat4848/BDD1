Feature: Test FREE CRM application

  Scenario: Test login functionality
    Given User is on login page
    When user Enter valid username and valid password
    Then user is on homepage

  Scenario: Test Home Page Functionality
    Then Verify home page Title
    And Verify Home Page Logo
    And Verify Home Page Url

  Scenario: Test Contact Page Functionality
    Given user is on Contact Page
    Then create new contact
    Then enter first and Last Name
   
