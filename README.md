# EntrataAssignment

This project is a Java Selenium Test Cases managed with Maven.

## Project Structure

- `src/test/` - Test source code
- `pom.xml` - Maven project configuration
- `testng.xml` - TestNG configuration for running tests


## Running Tests

To execute tests using TestNG, run:

```sh
mvn verify
```


## Description
 * Test base class is used to create and initialize WebDriver and can be extended to be used across the test cases.
 * The `Test1` class contains assertions and handles navigation within the application pages. It utilizes explicit waits to synchronize actions with page elements and conditions, ensuring reliable test execution.
 * The `Test2` class demonstrates scrolling on the page and interacting with forms, including input boxes and dropdown menus. It automates user actions such as entering text and selecting options to validate form functionality.
 
## Test Execution as a Suite

Test cases are organized and executed as a suite using TestNG's `testng.xml` configuration file. This allows grouping and running multiple test classes together, providing flexibility in test management.

## Maven Surefire Plugin

The Maven Surefire Plugin is configured in the `pom.xml` to enable running TestNG tests through Maven goals. This integration ensures that tests can be executed consistently using:

```sh
mvn test
```

The Surefire plugin automatically detects the `testng.xml` file and runs the specified test suite.

