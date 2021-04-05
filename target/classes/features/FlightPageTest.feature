@FlightTests
Feature: To Test Flight Page functionality

  Scenario:one way domestic flight details searching
    Given flightpage is displayed
    When I click on oneway radio button
    When I selected fromCity from dropdown
    When I selected Tocity from dropdown
    When I selected departure date from dropdown
    When I clicked on search button
    Then I should be displayed the flight details of selected date
