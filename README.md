Expedier Automation Testing – Swap & Transfer Process
This project automates the Login, Currency Swap, and Local Money Transfer workflows of expedier using Appium with Java. The automation scripts are developed and executed in IntelliJ IDEA, with Maven as the build management tool.

Tools & Technologies
Component	Description
Programming Language: Java
Automation Framework: Appium
Build Tool: Maven
Test Framework: TestNG 
IDE: IntelliJ IDEA
Mobile Platform: Android 

Project Overview
The automation suite validates critical user journeys in the mobile app:
1. Login: Automates user authentication with valid credentials.
2. Swap Currency: Automates accessing the swap feature, selecting currencies (NGN/CAD), entering amount, and verifying conversion.
3. Send Money Locally: Simulates sending funds to a local contact and validates transaction success confirmation.
   
Project Structure
MobileAutomation
 ┣ src
 ┃ ┣ main
 ┃ ┃ ┗ java
 ┃ ┃    ┗ BaseTest.java
 ┃ ┣ test
 ┃ ┃ ┣expedierLoginTest.java
 ┃ ┃ ┣ sendLocallyTest.java
 ┃ ┃ ┗ swapFundsTest.java
 ┣ pom.xml
 ┣ README.md
 ┗ appium-config.json
• BaseTest.java: Handles Appium driver setup, configuration, and teardown.
• LoginTest.java: Verifies login functionality.
• SwapCurrencyTest.java: Covers currency swap operation.
• SendMoneyTest.java: Automates sending money locally.
• pom.xml: Manages dependencies and Maven lifecycle configurations.


Setup Instructions
1. Prerequisites
Ensure the following tools are installed and configured:
- Java JDK 8 or higher
- Node.js & npm
- Appium Server
- Android SDK / Emulator
- IntelliJ IDEA
- Android device or emulator

  
2. Environment Variables
Variable	Path Example
JAVA_HOME	C:\Program Files\Java\jdk-11
ANDROID_HOME	C:\Users\<User>\AppData\Local\Android\Sdk
PATH	Include %ANDROID_HOME%\platform-tools and %ANDROID_HOME%\tools

4. Verify Setup
Run the following commands to confirm setup:
java -version
node -v
appium --version
adb devices


Running the Tests
Option 1 – Run from IntelliJ IDEA:
1. Open the project in IntelliJ IDEA.
2. Start Appium Server (appium command).
3. Launch your emulator or connect an Android device.
4. Right-click the desired test class (e.g., SwapCurrencyTest.java) and select Run.
   
Option 2 – Run from Command Line (Maven):
1. Navigate to your project root.
2. Execute: mvn clean test
3. Maven will build the project and run all test classes.

   
Test Results
Results are displayed in IntelliJ’s Run panel or terminal output. You can also integrate Extent Reports or Allure for detailed HTML reporting.

Troubleshooting
Issue	Possible Fix
App not launching:	Verify app package and activity names in BaseTest.java
Device not detected:	Check USB debugging & adb devices output
Port already in use:	Ensure Appium’s default port 4723 is free
Driver initialization fails: 	Confirm correct capabilities in appium-config.json

Future Improvements
- Integrate with Jenkins or GitHub Actions for CI/CD.
- Add screenshot capture for failed test steps.
- Extend support for iOS platform testing.
