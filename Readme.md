# Hackathon Project Requirements

# The outcomes of Hackathon deliverables are:

Explore the Innovative Implementations.
Implement Best practices such as creating Smoke and Regression suite.
Implement Maven on the created automation test scripts
Explore Jenkins to execute the test scripts periodically on Selenium Grid.
Explore Selenium Grid to run test scripts on different platforms and against different browsers.
Integrate Jenkins with version controller (GIT) and scheduled builds to run automatically.

# Book one way outstation cab and display the lowest charges

# Problem Statement : Book one way outstation cab and display the lowest charges

1. From Delhi to Manali, himachal Pradesh.
2. Pick up from Delhi at 6.30 AM on 23rd Dec 2019
3. Car type should be SUV.
(Suggested Site: Makemytrip however  you are free to choose any other legitimate  site)

# Detailed Description: Hackathon Ideas

1. Book one way outstation cab, From Delhi to Manali, himachal Pradesh, give future date & time & Car type should be SUV; Display the lowest charges
2. Find Group Gifting in Gift Cards, fill card details & give invalid email; capture & display the error message
3. On the Hotel booking page, extract all the numbers for Adult persons and store in a List; Display the same
(Suggested Site: makemytrip.com however  you are free to choose any other legitimate site)

# Key Automation Scope

- Handling alerts
- Filling simple form, Capture warning message
- Scrolling down in web page
- Extract drop down items & store in collections
- Navigation from Menus
- Navigating back to home page

# Selenium Automation Testing Project: Book one way outstation cab and display the lowest charges
 
## Project Overview
This Selenium automation testing project focuses on automating tasks on makemytrip.com
The primary objectives include capturing user information, navigating through the portal, verifying the presence of specific elements. 
The project uses various dependencies and libraries to facilitate automation.


## Project Structure
 
### 1. Maven Repository
 
- *Maven Version*: 3.9.3
 
### 2. Dependencies
 
- *Apache POI*
  - Version: 5.2.2
  - Purpose: Used for reading and writing Excel files, facilitating data-driven testing.
 
- *TestNG*
  - Version: 7.8.0
  - Purpose: Framework for test automation that allows for parallel execution and flexible test configuration.
 
- *Extent Report*
  - Version: 5.1.1
  - Purpose: Generates interactive and detailed HTML reports to enhance test result analysis.
  
- *WebDriverManager*
  - Version: 5.6.2
  - Purpose: Used to run the automation script on browser
 
- *Selenium*
  - Version: 4.15.0
  - Purpose: Enables interaction with web elements, navigation, and form submission in the browser.
 
- *Loggers*
  - Version: 2.22.0
  - Purpose: Provides logging capabilities for better debugging and traceability.
 
## Automation Test Flow
 
1. *Open makemytrip.com*
   - Navigate to the makemytrip.com
 
2. *Go to Cabs*
   - Click on Cabs from menu.
 
3. *Select Outstation One-Way*
   - Click on Outstation One-Way .
 
4. *Fill all the details and click on Search*
   - Click on From.
   - Select Delhi from suggestion dropdown.
   - Type Manali in To
   - Select first option from suggestion list
   - Verify if the month is same as required and select date else click on next button
   - Select hour(06), minute(30) and meredian(AM)
   - Click on Apply
   - Click on Search
   
5. *Filter cabs for SUV*
   - Click on SUV in Car Type filter 
   - Display lowest price of cab
   
6. *Go to Giftcards*
   - Hover on More from menu and click on Giftcards
 
7. *Go to Wedding Gift Card*
   - Scroll down and click on Wedding Gift Card
 
8. *Click on Email and Fill all the details for reciepient and sender*
   - Scroll down click on E-Mail and scroll down again
   - Fill Reciepient's name, mobile number(10-digit number), invalid email-id(without @ or .)
   - Fill Sender's name, mobile number(10-digit number), invalid email-id(without @ or .)
 
7. *Go to Hotels*
   - Click on Hotels from menus
 
9. *Fetch all the numbers for Adults from dropdown*
   - Click on Rooms & Guests
   - Click on Adults dropdown
   - Get all numbers present in dropdown
 
10. *Close the window*
   - Close the window 

 
## How to Run the Tests
 
1. *Open Eclipse IDE:*
   - Launch Eclipse IDE on your machine.
 
2. *Import Project:*
   - Select File -> Import from the menu.
   - Choose Existing Maven Projects and click Next.
   - Browse to the directory where you cloned the repository and select the project.
 
3. *Update Maven Project:*
   - Right-click on the project in the Project Explorer.
   - Choose Maven -> Update Project.
   - Click OK to update dependencies.
 
4. *Set Up Configuration:*
   - Open the src/test/resources/config.properties file.
   - Update any configuration parameters like browser type, URLs, etc., as needed.
 
5. *Run Test Suite:*
   - Locate the test suite file (e.g., src/test/java/TestSuite.java).
   - Right-click on the file and choose Run As -> TestNG Suite.
 
6. *View Reports:*
   - After execution, open the test-output folder.
   - Find the Extent Report HTML file (index.html) for detailed test reports.
 
## Author Information
 
- *Deepak Kumar(2303537)*
 
## Disclaimer
 
This project is intended for educational and testing purposes only. The authors are not responsible for any unauthorized use or modification of the code. Use at your own risk.