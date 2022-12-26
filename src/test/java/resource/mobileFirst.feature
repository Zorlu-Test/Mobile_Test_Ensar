Feature: Login feature
  As a user, I want to be able to log in to the application using my username and password.
  So that I can access my account.

  @test
  Scenario: Successful login
    Given given dnm
    Given I am on the login page
    When I enter my "<username>" and "<password>"
    And I click the login button
    Then I should be logged in to my account

