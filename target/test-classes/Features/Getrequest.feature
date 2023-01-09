#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
#I want to use this template for my feature file
#
#@tag1
#Scenario: Title of your scenario
#Given I want to write a step with precondition
#And some other precondition
#When I complete action
#And some other action
#And yet another action
#Then I validate the outcomes
#And check more outcomes
#
#@tag2
#Scenario Outline: Title of your scenario outline
#Given I want to write a step with <name>
#When I check for the <value> in step
#Then I verify the <status> in step
#
#Examples:
#| name  | value | status  |
#| name1 |     5 | success |
#| name2 |     7 | Fail    |
@RunAllScenarios
Feature: Verify the GET Request in the API

  @ScenarioOne
  Scenario Outline: GET all Posts from the API
    Given Give call to the API as "https://api.coindesk.com/v1/bpi/currentprice.json"
    Then Validate the Response if its 200

  @ScenarioTwo
  Scenario Outline: GET the chartname from the API
    Given Request a call to the API "https://api.coindesk.com/v1/bpi/currentprice.json"
    Then Validate the ChartName if its "Bitcoin"
