TEST EXECUTION OPTIONS.
=======================
You have the choice to run each test scenario individually or all at once.

EXECUTING INDIVIDUAL SCENARIO
=============================
on windows, just double click on the "run_scenario<SCENARIO NUMBER>.bat" file and test will start executing. Once test if finished the command prompt will close itself.

Ex:- to run scenario 7, just double click on "run_scenario7.bat" file.

EXECUTING ALL SCENARIOS
=======================
on windows, just double click on the "run_all_scenarios.bat" file and tests will start executing. Once all tests are finished, the command prompt will close itself.

TEST RESULTS
============
Open the "target\cucumber-report-html\cucumber-html-reports\AmazonShoppingCart-feature.html" file in any browser and it will open up the maven-cucumber report that includes all test results of recently ran tests.

TEST SCENARIO DESCRIPTION
=========================
You can find the details steps of all scenarios under "AmazonShoppingCart - Scenario description.feature" file. You may use a text editor to open this file to view. 

CHANGING TEST PARAMETERS
========================
You can change test parameters used in the scenario description by changing the data within double quotation in each step as required. To change, please edit "src\test\java\Features\AmazonShoppingCart.feature" file and save.

Note: Changing test parameters may result in test script failure if given test data is invalid or if it leads to actual script failure.