# API-Testing-With-Rest-Assured-and-Cucumber
## Overview

API is the acronym for Application Programming Interface, which is a software intermediary that allows two applications to talk to each other. This API framework is developed using REST Assured and Cucumber. REST Assured is a Java library that provides a domain-specific language (DSL) for writing powerful, maintainable tests for RESTful APIs. Cucumber is an open source library, which supports behavior driven development. To be more precise, Cucumber can be defined as a testing framework, driven by plain English text. It serves as documentation, automated tests, and a development aid.

For Demo purpose all the test cases are done on [Coindesk](https://api.coindesk.com/v1/bpi/currentprice.json), [Swagger Petstore](https://petstore.swagger.io/).



## Pre-Requisites

-   [Java](https://www.guru99.com/install-java.html)  should be installed and configured.
-   [Maven](https://mkyong.com/maven/how-to-install-maven-in-windows/)  should be installed and configured.
- [Cucumber](https://github.com/cucumber) and [TestNG](https://testng.org/doc/)should be Installed
-   Clone the files from Git repository either as zip file OR using  [Git](https://phoenixnap.com/kb/how-to-install-git-windows).

## Running Tests
Navigate to the [APITestRunner.java](https://github.com/SAYAN-2000/API-Testing-With-Rest-Assured-and-Cucumber/blob/main/src/test/java/TestRunner/APITestRunner.java) file under  [src](https://github.com/SAYAN-2000/API-Testing-With-Rest-Assured-and-Cucumber/tree/main/src)/[test](https://github.com/SAYAN-2000/API-Testing-With-Rest-Assured-and-Cucumber/tree/main/src/test)/[java](https://github.com/SAYAN-2000/API-Testing-With-Rest-Assured-and-Cucumber/tree/main/src/test/java)/[TestRunner](https://github.com/SAYAN-2000/API-Testing-With-Rest-Assured-and-Cucumber/tree/main/src/test/java/TestRunner) select your desired feature file and run as Junit Test.
Otherwise go to the root folder and run `mvn clean test`command to run all the methods.

Once the execution is successfully completed you can see the HTML and JSON report under
[test-output/cucumber-reports](https://github.com/SAYAN-2000/API-Testing-With-Rest-Assured-and-Cucumber/tree/main/test-output/cucumber-reports).
