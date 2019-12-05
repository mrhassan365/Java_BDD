**Exxon_Mobil_BDD_Automation_Suite**
	This project is a bdd style automation suite for ExxonMobil production site. It is built with Java, Cucumber, TestNG, and Selenium WebDriver in a page object model pattern. 
    
**Getting Started**
	To get Started download Java 8 JDK, and JRE, with an IDE(preferably Eclipse). Since this is a Maven Project, all the necessary dependencies are in the pom.xml file. No need to download anything further. 
    
https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

https://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html

https://www.eclipse.org/downloads/

Simply clone this repo. 


**Folder Structure:**

**com.exxon_mobil.runner** – this package includes the “TestRunner.java” class. This class has the necessary cucumber options and setup
com.exxon_mobil.util – this package has the “TestBase.java” class. This class defines creating a webdriver instances and some set up prior to running the scenarios. It also has the “util_methods.java” class. There are useful methods here that can be used if needed. 

Example: a method is there where it will take a list of links and see if it returns a 200 http status code. 

**com.exxon_mobil.config** – this package has the config file where url, browsers are defined

**com.exxon_mobil.features** – this package contains all the feature files where the tests are written in Gherkin Syntax. Each file represents either a unique page or component of the site. To learn more about Gherkin:
https://cucumber.io/docs/gherkin/

**com.exxon_mobil.pagefactory** – this package contains all the page objects/ page elements for the site. It’s structured in a way to reflect all the feature file. Each class includes all the webelements defined and methods that can be used for the specific page or component. 

**com.exxon_mobil.stepdefinitions** – this package contains classes that has steps for each feature file. Each gherkin line as a corresponding unique step definition. 

Example: Header feature file is there where all the tests are written in Gherkin syntax under the feature package. Then a class under the pagefactory package exists where all the pageobjects and methods for the header are there. Then head class is there in the Stepdefinitions package that map to all the tests written in the feature file. Each gherkin line has a “step”. 

**Running the tests**
	In order to run test(s), user should open the “com.exxon_mobil.runner” package. On the “TestRunner.java” class all the necessary cucumber options are there. Notice under the “@CucumberOptions” tag there is a “feature” variable. This is where the path to the feature package is stated. If you specify the path to the whole package (com.exxon_mobil.features), then all the individual feature file under that package will get executed. If you specify a specific file within the package, then only that specific feature fill will get executed. 

To run: right click > Run As > TestNG Test

**Writing the tests**
	In order write tests for a new component or a page:

1.	Create a file under the “com.exxon_mobil.features” package. File should end with .feature 
2.	Write the tests for it in Gherkin Syntax (ex: Given, When, Then, etc)
3.	Go to the Runner class, and under cucumber options, for feature, specify the specific path to this newly created feature file.
    Example: footer.feature
4.	Run the test, and notice the output are all the missing steps for each line that is not defined. Copy those empty step definition methods.
5.	Under the “come.exxon_mobil.stepdefinitions” package create a class you can paste all the missing steps that you copied. 
    Ex: Footer_steps.java
6.	Now Under the “com.exxon_mobil.pagefactory” create a class for the unique component/page you have created the feature file and steps for. 
    Ex : “Footer_pagefactory.java”. Here you will identify all the webelements related to the unique componenet/page. @FindBy tag will be used to define       them. Then a constructor will be defined to initialize all the elements. See another class for example
7.	In the steps class, now you can code the steps as intended 
8.	Once done you can now final return to the Runer class and run the test again

** TO add tests to an existing component/page simply write the tests in Gherkin syntax on the appropriate feature file, and follow the same steps defined above in the appropriate classes defined for that component/page

**Reports:**
    After exection go to test-output > Default suite > Default test.html



Authors
•	Mohammed R Hassan (mhassan@hugeinc.com) – Initial set up and work 




