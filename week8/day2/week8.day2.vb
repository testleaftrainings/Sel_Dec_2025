Today's Agenda:
 -Extent Reports
 -Extent Report Integration
 -Hybrid Framework
 -Breakout

 ExtentReports:
 -add the library(AventStack)
 -ExtentHtmlReporter
 -ExtentReports
 -ExtentTest

 Annotations hierarchy:
  @beforeSuite--->startReports()
   @beforeTest---->setValues()
    @BeforeClass--->testCaseDetails()
     @DataProvider--->sendData()
      @BeforeMethod--->preconditions()
       @Test--->test
       @AfterMethod()--->postconditions()
        @AfterSuite---stopReports()
        
Framwork:
 1)Description(highlevel overview)
   -HybridFramework(TestNG+CUCUMBER)
   -DesignPattern--POM
   -Project ManagemaentTool-Maven
   -SeleniumWebdriver with Java
   -TestNG
   -cucumber-BDD automation
   -Apache POI-microsoft applications
   -ExtentReports
   -ExceptionHandling
   -Git-Version control
2)Components of Framework:
 
-Com.framework.selenium.api.design:
  a)Browser-defined all the browser related activities
  b)Element-defines all the element related activities
-Com.framework.selenium.api.base:
  a)DriverInstance-to avoi the the conflict when working with parallel and cross browser testing
   b)SeleniumBase-acts as wrapper class,implements browser and element interface,Exception handling is done for 
      each method using try and catch
Com.framework.testNG.api.base:
 a)ProjectSpecificMethod-preconditions and postConditins are defined.
 b)RetryEngine--retries the failed testcases by implementing IretryAnalyZer.
Com.framework.utils:
a)DataLibrary-read the values from excel(ApachePOi)
b)Reporter-Abstract class
Com.framework.Pages:
-pages
Com.framework.Pages:
-testcases

3)Annotations Hierarchy(Exceution flow)
@beforeSuite--->startReports()
   @beforeTest---->setValues()
    @BeforeClass--->testCaseDetails()
     @DataProvider--->sendData()
      @BeforeMethod--->preconditions()
       @Test--->test
       @AfterMethod()--->postconditions()
        @AfterSuite---stopReports()
4)Hierarchy of framework:
   

