# 🚀 Selenium Test Automation Framework — Java & TestNG

A structured **UI Test Automation Framework** built with **Java, Selenium WebDriver, TestNG, and Maven**, designed to demonstrate reusable automation practices, TestNG suite management, parameterization, listeners, parallel execution, and maintainable test organization.

The framework uses **TestNG XML suites** to control test execution and supports different execution strategies including class-based, package-based, parameterized, and parallel test execution.

---

## 🧰 Tech Stack

| Technology             | Purpose                                   |
| ---------------------- | ----------------------------------------- |
| **Java**               | Programming language                      |
| **Selenium WebDriver** | Web UI automation                         |
| **TestNG**             | Test execution and test organization      |
| **Maven**              | Build & dependency management             |
| **TestNG Listeners**   | Test execution event handling             |
| **TestNG XML**         | Suite configuration and execution control |

---

## ✨ Framework Highlights

* ✅ Selenium WebDriver based UI automation
* ✅ TestNG test execution and annotations
* ✅ Multiple **TestNG XML** suite configurations
* ✅ **Parallel test execution**
* ✅ TestNG **parameters** for configurable test data
* ✅ TestNG **listeners**
* ✅ Class-level test execution
* ✅ Package-level test execution
* ✅ Include / exclude test methods
* ✅ Maven-based project and dependency management
* ✅ Organized test classes under a standard Maven test structure
* ✅ Reusable framework concepts suitable for scalable automation

---

## 🏗️ Project Structure

```text
Automation-TestNG-Framework/
│
├── src/
│   └── test/
│       └── java/
│           └── testing/
│               ├── day1.java
│               ├── day2.java
│               ├── day3.java
│               ├── day4.java
│               └── Listeners.java
│
├── pom.xml
│
├── testng.xml
├── testng2.xml
├── testng3.xml
│
├── .gitignore
│
└── README.md
```

> The exact test classes may evolve as the framework is extended.

---

# 🧪 TestNG Execution Strategies

This project demonstrates different ways of controlling automation execution through TestNG XML configuration.

### 1. Class-Based Execution

Specific test classes can be selected for execution:

```xml
<classes>
    <class name="testing.day1"/>
    <class name="testing.day2"/>
</classes>
```

This allows targeted execution of selected test classes.

---

### 2. Package-Based Execution

The framework also supports executing all tests belonging to a package:

```xml
<packages>
    <package name="testing"/>
</packages>
```

This is useful when running a larger regression set without manually listing every test class.

---

### 3. Parallel Execution

The primary TestNG suite demonstrates parallel execution:

```xml
<suite name="Loan Department"
       parallel="tests"
       thread-count="2">
```

This allows independent TestNG `<test>` blocks to execute concurrently and helps reduce overall execution time when tests are suitable for parallelization.

---

### 4. Parameterization

TestNG parameters are used to pass configuration values to tests:

```xml
<parameter name="URL" value="personalloan.com"/>
```

Parameters can be used to make test execution more configurable without hardcoding values directly into test classes.

---

### 5. Include / Exclude Methods

Specific test methods can be selected for execution:

```xml
<methods>
    <include name="LoginAPIhomeLoan"/>
</methods>
```

This provides finer control over targeted test execution.

---

# 🎧 TestNG Listeners

The framework includes a custom TestNG listener:

```xml
<listeners>
    <listener class-name="testing.Listeners"/>
</listeners>
```

Listeners allow the framework to respond to TestNG execution events such as:

* Test start
* Test success
* Test failure
* Test skip
* Suite execution events

This provides a foundation for implementing additional automation capabilities such as logging, reporting, screenshots, and failure handling.

---

# 📋 Test Suite Configuration

The repository contains multiple TestNG suite files for demonstrating different execution approaches.

### `testng.xml`

Demonstrates:

* Multiple test groups
* Parameters
* Parallel execution
* TestNG listeners
* Class-level execution
* Method selection

### `testng2.xml`

Demonstrates:

* Package-level execution
* Regression-style execution

### `testng3.xml`

Additional TestNG execution configuration.

---

# 📦 Maven Dependencies

The project uses Maven for dependency management.

Current core dependencies include:

* **Selenium Java**
* **TestNG**
* **Apache Commons IO**

The project is configured for **Java 25** in Maven.

Example dependency configuration:

```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.48.0</version>
</dependency>

<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.12.0</version>
</dependency>
```

---

# ▶️ How to Run

## Prerequisites

Make sure the following are installed:

* Java JDK
* Maven
* Git
* An IDE such as IntelliJ IDEA or Eclipse
* A supported browser such as Chrome

Verify Java:

```bash
java -version
```

Verify Maven:

```bash
mvn -version
```

---

## 1. Clone the Repository

```bash
git clone https://github.com/Kartikahalawat/Automation-TestNG-Framework.git
```

Navigate into the project:

```bash
cd Automation-TestNG-Framework
```

---

## 2. Install Dependencies

```bash
mvn clean install
```

---

## 3. Execute Tests with Maven

```bash
mvn test
```

---

## 4. Execute a TestNG Suite

The TestNG XML files can also be executed directly from your IDE.

For example:

```text
Right Click → testng.xml → Run
```

You can similarly execute:

```text
testng2.xml
testng3.xml
```

depending on the required execution strategy.

---

# 🧩 Framework Concepts Demonstrated

This project focuses on understanding the building blocks required for a maintainable Selenium automation framework.

### Test Automation

* Selenium WebDriver
* Web UI automation
* Automated functional validation

### Test Execution

* TestNG annotations
* TestNG XML
* Test classes
* Test methods
* Test suites

### Advanced TestNG Features

* Parameters
* Listeners
* Parallel execution
* Package execution
* Include / exclude methods

### Build & Dependency Management

* Maven
* `pom.xml`
* Dependency management
* Maven test lifecycle

---

# 🔄 Execution Flow

```text
              ┌──────────────────┐
              │  TestNG XML      │
              │     Suite        │
              └────────┬─────────┘
                       │
                       ▼
              ┌──────────────────┐
              │ TestNG Runner    │
              └────────┬─────────┘
                       │
          ┌────────────┼────────────┐
          ▼            ▼            ▼
      Test Class   Test Class   Test Class
          │            │            │
          └────────────┼────────────┘
                       ▼
              ┌──────────────────┐
              │ Selenium         │
              │ WebDriver        │
              └────────┬─────────┘
                       │
                       ▼
              ┌──────────────────┐
              │ Web Application  │
              └──────────────────┘
                       │
                       ▼
              ┌──────────────────┐
              │ TestNG Listener  │
              │ / Result Handling│
              └──────────────────┘
```

---

# 🎯 Learning Objectives

This project was built to strengthen practical understanding of:

* Designing Selenium automation projects with Java
* Structuring TestNG-based test suites
* Managing tests through XML configuration
* Running tests in parallel
* Passing parameters through TestNG
* Working with TestNG listeners
* Organizing automated tests for maintainability
* Managing automation dependencies with Maven

---

# 🚀 Future Enhancements

The framework can be extended with additional production-style capabilities such as:

* [ ] Page Object Model (POM)
* [ ] WebDriver Factory
* [ ] Explicit Wait utilities
* [ ] Configuration management
* [ ] Cross-browser execution
* [ ] Data-driven testing
* [ ] Screenshot capture on failure
* [ ] Extent Reports / Allure Reports
* [ ] Logging with SLF4J / Log4j
* [ ] Jenkins CI/CD integration
* [ ] Docker-based execution
* [ ] API automation using REST Assured
* [ ] Parallel cross-browser execution

---

# 📚 Key Takeaway

This project demonstrates how **Selenium WebDriver and TestNG can be combined with Maven to create a structured and configurable automation framework**.

The focus is not only on writing Selenium test cases, but also on understanding **test execution architecture, suite configuration, parallel execution, parameterization, listeners, and framework maintainability**.

---

## 👨‍💻 Author

**Kartik Ahalawat**

SDET | Quality Engineering & Test Automation | Java | Selenium | Playwright | API Testing

### 🔗 Connect

* GitHub: [Kartikahalawat](https://github.com/Kartikahalawat)
* Repository: [Automation-TestNG-Framework](https://github.com/Kartikahalawat/Automation-TestNG-Framework)

---

⭐ If you find this project useful, consider giving the repository a star.
