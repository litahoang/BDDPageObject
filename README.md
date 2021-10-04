Based on the above user story, to automate the end to end testing, Cucumber test automation framework is developed using java and selenium
# What makes the cucumber Test automation Framework a robust one?
## Cucumber Test automation Framework can be a robust one when framework is developed by applying the below steps
#### •	Page Objects Manager
#### •	Read Configurations from Property File
#### •	Web Driver Manager
#### •	Use of Data Driven Testing in Cucumber
#### •	Use of Hooks
#### •	Use of Tags
#### •	Reports
#### •  How to run


# Page Object Manager
In the case of multiple step definition files, we will be creating object of Pages again and again. Which is against the coding principle.
To avoid this situation, we can create a Page Object Manager. Purpose of the Page Object Manager is to create the page’s object and also to make sure that the same object should not be created again and again. But to use single object for all the step definition files.

The main responsibilities are:
#### 1.	To create an Object of Page Class only if the object is null.
#### 2.	To supply the already created object if it is not null 

# Read Configurations from Property File
It is dangerous to store hard coded values in the project, also it is against the coding principles. With the help of properties file, we can eliminate these hard coded values in the project  
What is a Property file in Java  
.properties files are mainly used in Java programs to maintain project configuration data, database config or project settings etc. Each parameter in properties file are stored as a pair of strings, in key-value pair format, where each key is on one line. You can easily read properties from some file using object of type Properties. This is a utility provided by Java itself.
java.util.Properties;

Advantages of Property file in Java  
If any information is changed from the properties file, you don’t need to recompile the java class. In other words, the advantage of using properties file is we can configure things which are prone to change over a period of time without need of changing anything in code.  
For E.g. We keep application Url in property file, so in case you want to run test from on other test environment, just change the Url in property file and that’s it. You do not require to build the whole project again.

#  Design WebDriver Manager
Why do we need WebDriver Manager or some called it as WebDriver Factory or Browser Factory?
Till now we have been creating driver with in the Step file and we kind of explicitly tell our script to start Chrome Driver. Which means later if we need to change Chrome to Firefox, we have to go into every test script to change the same. Which is like bhrrhhhhhhh. On top of it our test is handling the logic of creating WebDriver. Test should not be worried about how to start the driver. Test should just need a driver to execute the script. So let’s bring the WebDriver Manager in between to handle this task for us.

# Data Driven Testing in Cucumber
Cucumber inherently supports Data Driven Testing using Scenario Outline. There are different ways to use the data insertion with in the Cucumber and outside the Cucumber with external files.

Data Driven Testing in Cucumber
#### •	Parameterization without Example Keyword
Data Driven Testing in Cucumber using Scenario Outline
#### •	Parameterization with Example Keyword
#### •	Parameterization using Tables
Data Driven Testing in Cucumber using External Files
#### •	Parameterization using Excel Files
#### •	Parameterization using Json
#### •	Parameterization using XML

# Use of Hooks
What are Hooks in Cucumber?  
Cucumber supports hooks, which are blocks of code that run before or after each scenario. You can define them anywhere in your project or step definition layers, using the methods @Before and @After. Cucumber Hooks allows us to better manage the code workflow and helps us to reduce the code redundancy. We can say that it is an unseen step, which allows us to perform our scenarios or tests.
Why Cucumber Hooks?  
In the world of testing, you must have encountered the situations where you need to perform the prerequisite steps before testing any test scenario. This prerequisite can be anything from:
#### •	Starting a webdriver
#### •	Setting up DB connections
#### •	Setting up test data
#### •	Setting up browser cookies
#### •	Navigating to certain page
#### •	or anything before the test
### In the same way there are always after steps as well of the tests like:
#### •	Killing the webdriver
#### •	Closing DB connections
#### •	Clearing the test data
#### •	Clearing browser cookies
#### •	Logging out from the application
#### •	Printing reports or logs
#### •	Taking screenshots on error
#### •	or anything after the test
Things to note
#### •	An important thing to note about the after hook is that even in case of test fail, after hook will execute for sure.

# Reports
#### Console Output which is more readable
#### HTML Report which gives clear details on each and every step of scenario
Please refer folder 'TestReports' after run test

# How to run
### By mvn
Clone repo: git clone https://github.com/pthao31192/BDDPageObject.git
cd BDDPageObject
mvn clean test
### By Test Runner
Right click and select Run 'TestRunner'





