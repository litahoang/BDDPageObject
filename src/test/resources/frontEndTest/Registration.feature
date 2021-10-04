Feature: Registration for a new user
  As a new user I want to signup new account

  Background:
    Given I open the URL

  Scenario: Signup an account which valid information
    When I click on Register
    And fill out the form with information
      | Fullname    | Preferred name | Email | Country  | Mobile number | Follow channel |
      | James Smith | Jackson        | test  | Viet Nam | 906022833     | Google         |





