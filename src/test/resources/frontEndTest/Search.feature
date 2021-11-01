@Search
Feature: Search weather in your city

  Background:
    Given I want to open OpenWeather site
    Then page title should be "Сurrent weather and forecast - OpenWeatherMap"

  Scenario: Search weather in Hanoi

    When I search for weather in "Hanoi"
    Then the weather result is shown with current date
