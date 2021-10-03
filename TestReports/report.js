$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration.feature");
formatter.feature({
  "line": 2,
  "name": "Registration for a new user",
  "description": "As a new user I want to signup new account",
  "id": "registration-for-a-new-user",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I open the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.iOpenTheURL()"
});
formatter.result({
  "duration": 4905378962,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Signup an account which valid information",
  "description": "",
  "id": "registration-for-a-new-user;signup-an-account-which-valid-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I click on Register",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterStepDefs.iClickOnRegister()"
});
formatter.result({
  "duration": 1662488122,
  "status": "passed"
});
formatter.after({
  "duration": 145325179,
  "status": "passed"
});
});