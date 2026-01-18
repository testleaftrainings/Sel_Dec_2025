3:00 to 3:30 --->Exception Handling
3:30 to 4:00 --->Constructor
4:00 to 4:30 --->Encapsulation
4:30 to 4:45 --->Break
4:45 to 5:30 --->POM introduction
5:30 to 6:30 --->Seq & Parallel Execution

Exception:
Abnormal behaviour which stops the execution of pgm.
Types:
1)checked Exception:(compile time)
  due to external factors i/o,database errors
2)Unchecked :(RunTime)
 during the execution of the program.

How to handle the exceptions:
 using try/catch block

  PageobjectModel:
  LoginPage--->java class
    -EnterUname
    -EnterPassword
    -Click login
  WelcomePage
   -click crmsfa
  MyHomePage
   -click Leads
  MyLeadsPage
   -clickCreateLead
  CreateLeadPage
   -EnterCompanyname
   -EnterFirstName
   -EnterLastName
   -clickcreateLead
  ViewLeadsPage
   -verifyLeads

   Steps to Implement POM:
Create a new Project and have all the dependencies inside the pom.xml
Create 3 packages inside src/main/java
base Create a ProjectSpecificMethods and create 2 methods preCondition() and postCondition() and annotate with @BeforeMethod and @AfterMethod Create static driver as a global variable
pages Create 6 classes for each page Each Classes inside pages package should extends ProjectSpecificMethods Create methods for each action inside each page Inside each method add return statement according to the page navigation if an action stays in the sama page -> return this if an action takes you to another page -> return new Page();
testcases
All classes inside the testcase package should extend ProjectSpecificMethods Create a class called RunLogin Create a method called runLogin and annotate with @Test Create object for LoginPage and call the method and execute
For Sequential Execution:
- Driver declaration should be static
- Create 2 testcases inside testcases package
     runLogin
     runCreateLead
- Select the required testcases and convert into testng.xml file
- Finally, run the testcases together sequentially from testng.xml file


