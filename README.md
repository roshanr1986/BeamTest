
PREREQUISITES FOR TEST  
=======================
1. Set up Java
--------------
If you do not have java installed in your client machine, Please make sure you install java (version 1.8 or above) first

2. Set up Maven
---------------
If you do not have maven installed in your client machine, 
Please install maven ( version 3 or above). More documentation on installing maven on windows can be found at https://docs.wso2.com/display/IS323/Installing+Apache+Maven+on+Windows

3. Install Firefox browser.
---------------------------
Please install or downgrade your firefox to version 45.0 (For system stability and support various dependencies). Link to download Firefox version 45.0 - https://ftp.mozilla.org/pub/firefox/releases/45.0/


4. Download the source code
----------------------------
Please follow the link https://github.com/roshanr1986/BeamTest and you will find the repository of code. 
If you are familiar with git, then you may clone this repository into your local machine.
If you are not familiar with git, then you can also download the code by selecting "clone or download" option and then select "Download ZIP" option under that. You may then unzip the folder to a desired location in your local machine.

TEST EXECUTION.
==============
Please find all instructions related to test execution and other options in "BeamTest\Run on Windows\Readme_Test_Execution.txt".


OTHER DETAILS ABOUT TEST AUTOMATION FRAMEWORK
=============================================

1. This test automation framework is based on java and uses maven as the build tool. It is based on the BDT approach and uses Cucumber as the framework to draft and execute tests.
2. Cucumber JVM framework allows the automation engineers to write test code that are mapped against actual business scenario written in form of feature files.
3. It uses the flexibility of cucumber JVM to pass parameters into the test steps and to reuse already developed steps in any other scenarios as well. (it promotes re usability)
4. The test setup and tier down methods are written as steps in feature file which can be used before and after each test scenario. Hence the test setup can be executed based for required tests only, rather than executing it as a common method before each test suite.
4. Cucumber-Maven standard reporting plugin has been used to create test report and it can be easily viewed in a browser window.
5. Selenium is used for browser automation and Selenium's page factory model is used in identifying and initializing web elements.
5. All tests are run in Firefox browser and the required firefox driver is provided within the source code package. However your existing firefox version should be downgraded to version 45.0 or below.




