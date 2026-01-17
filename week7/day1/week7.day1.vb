3:00 to 3:30 ---> Parametrization
3:30 to 4:00 ---> Multiple data
4:00 to 4:25 ---> Breakout
4:25 to 4:35 --->Break
4:35 to 5:10 ---> Hooks implementation and tags
5:15 to 6:00 --->ExceptionHandling
static parameterization:
1)surround the data with single quote in the feature file.
2)In the stepdefinition class,replace the data with {string}.
3)pass the i/p args to the mthd and replace the hardcoded data with the args

Steps to pass multiple data to a scenario using Scenario Outline and Examples:
Create a feature file called CreateLead.feature and write all the BDD steps
In Scenario Outline replace the data with <> and pass a name inside it Enter the companyname as
In StepDefinition on the top of that particular method replace the parameterized data with (.)$ @Given("Enter the companyname as (.)$")

Steps to implement Hooks:
Create a package called hooks and create a class called HooksImplementation
Create 2 methods preCondition() and postCondition() and annotate with @Before and @After
The HooksImplementatio class should extends BaseClass
In the Runner class inside glue attribute mention hooks package as well glue ={"steps","hooks"}
Tags:
It is used to categorize the scenarios

tags="@smoke" )// only smoke scenarios will be executed tags="not @smoke") // to exclude a scenario from execution tags="@smoke or @functional")// To run scenarios that have either of the tags tags="@functional and @regression" )//To run scenarios which has both the tags

Exceptions:
1)undefined step exception
2)duplicate step definition exception
3)Invalid method exception
4)Null pointer Exception
