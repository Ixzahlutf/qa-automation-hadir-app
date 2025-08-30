# 🧪 QA Automation - HADIR Mobile Mirroring App

[![Java](https://img.shields.io/badge/Java-17+-red?logo=openjdk)](https://java.com)
[![Selenium](https://img.shields.io/badge/Selenium-4.0-green?logo=selenium)](https://selenium.dev)
[![Cucumber](https://img.shields.io/badge/Cucumber-BDD-brightgreen?logo=cucumber)](https://cucumber.io)
[![Build](https://img.shields.io/badge/Build-Maven-blue?logo=apache-maven)](https://maven.apache.org)

> End-to-end automated test suite for HADIR Mobile Mirroring Attendance Application, built with Selenium WebDriver and Cucumber BDD framework.

## 📋 Project Overview

This repository contains comprehensive automation test scripts developed for **PT. Danamas Insan Kreasi Andalan (DIKA)** as part of the Juara Coding Bootcamp capstone project. The tests validate the functionality, data synchronization, and UI consistency of the HADIR attendance application across mobile and web platforms.

## 🚀 Tech Stack

- **Programming Language:** Java 17+
- **Test Framework:** Selenium WebDriver 4.0
- **BDD Framework:** Cucumber with Gherkin syntax
- **Assertion Library:** TestNG
- **Build Tool:** Maven
- **Report Framework:** Extent Reports/Cucumber Reports
- **Version Control:** Git

## 📁 Project Structure
qa-automation-hadir-app/
├── src/
│ ├── main/java/com/dika/hadirmobile/
│ │ ├── pages/ # Page Object Model classes
│ │ └── utils/ # Utility helper classes
│ └── test/
│ ├── java/com/dika/hadirmobile/
│ │ ├── definitions/ # Cucumber step definitions
│ │ │ ├── absenMasukKeluar/
│ │ │ ├── authentications/
│ │ │ ├── correction/
│ │ │ └── providers/
│ │ └── runners/ # Test runner classes
│ └── resources/
│ ├── features/ # Gherkin feature files (.feature)
│ └── suites/ # Test suite configurations
└── target/
├── cucumber-reporting/ # Cucumber HTML reports
└── ExtentReports/ # Extent Reports with screenshots


## ✅ Test Coverage

### Core Functionality
- User login/logout authentication
- Attendance clock-in/clock-out processes
- Data validation and synchronization
- Error handling and validation messages

### Cross-Platform Validation
- Mobile-to-web data mirroring
- Real-time synchronization testing
- Multi-device compatibility

### UI/UX Consistency
- Layout and styling consistency
- Responsive design validation
- Cross-browser compatibility (Chrome, Firefox, Safari)

## 🛠️ Installation & Setup

### Prerequisites
- Java JDK 17 or higher
- Maven 3.6+
- Chrome/Firefox browser

### Clone Repository
```bash
git clone https://github.com/Ixzahlutf/qa-automation-hadir-app.git
cd qa-automation-hadir-app

**Run Tests**

# Run all tests
mvn test

# Run with specific browser
mvn test -Dbrowser=chrome

# Run specific feature file
mvn test -Dcucumber.options="src/test/resources/features/login.feature"

📊 Test Reports
After test execution, view detailed reports:

Cucumber HTML Report: target/cucumber-reports.html

Extent Reports: target/extent-reports/

👨‍💻 Author
Nurul Izzah Luthfiah Nur

📧 Email: izzahlxc@email.com

💼 LinkedIn: linkedin.com/in/izzahluthfiah

🔗 GitHub: github.com/ixzahlutf

📄 License
This project is developed for educational and portfolio purposes as part of Juara Coding Bootcamp curriculum.