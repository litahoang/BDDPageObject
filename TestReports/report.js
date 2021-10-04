$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration for a new user",
  "description": "As a new user I want to signup new account",
  "id": "registration-for-a-new-user",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I open the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.iOpenTheURL()"
});
formatter.result({
  "duration": 44969621646,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Signup an account which valid information",
  "description": "",
  "id": "registration-for-a-new-user;signup-an-account-which-valid-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I click on Register",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "fill out the form with information",
  "rows": [
    {
      "cells": [
        "Fullname",
        "Preferred name",
        "Email",
        "Country",
        "Mobile number",
        "Follow channel"
      ],
      "line": 10
    },
    {
      "cells": [
        "James Smith",
        "Jackson",
        "test",
        "Viet nam",
        "906022833",
        ""
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "RegisterStepDefs.iClickOnRegister()"
});
formatter.result({
  "duration": 7334142775,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.fillOutTheFormWithInformation(DataTable)"
});
formatter.result({
  "duration": 78608131415,
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //div[@class\u003d\u0027q-item__label\u0027 and contains(text(),\u0027%s\u0027)]Viet nam because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027//div[@class\u003d\u0027q-item__label\u0027 and contains(text(),\u0027%s\u0027)]Viet nam\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d94.0.4606.71)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027tho-macbook\u0027, ip: \u00272402:9d80:201:eb39:386e:b306:5411:f534%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 94.0.4606.71, chrome: {chromedriverVersion: 94.0.4606.61 (418b78f5838ed..., userDataDir: /var/folders/vb/hkzl8n6x1lv...}, goog:chromeOptions: {debuggerAddress: localhost:61015}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d60bdb4af9e3b60009cca38dba0a5f7d\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027q-item__label\u0027 and contains(text(),\u0027%s\u0027)]Viet nam}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:472)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\n\tat pageobjects.RegisterPage.scrollToElement(RegisterPage.java:43)\n\tat pageobjects.RegisterPage.selectCountryName(RegisterPage.java:34)\n\tat stepdefinition.RegisterStepDefs.fillOutTheFormWithInformation(RegisterStepDefs.java:63)\n\tat ✽.And fill out the form with information(Registration.feature:9)\n",
  "status": "failed"
});
formatter.after({
  "duration": 185024561,
  "status": "passed"
});
});