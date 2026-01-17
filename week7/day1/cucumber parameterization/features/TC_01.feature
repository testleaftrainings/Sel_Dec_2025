Feature: Login functionality of Leaftaps Application

#Background: 
#Given Launch the browser and load the url
@Regression
Scenario: Login with positive credentials

And Enter the username as 'democsr2'
And Enter the password as 'crmsfa'
And click on login button
Then Homepage is displayed

@Smoke @functional
Scenario: Login with negative credentials

And Enter the username as 'demo'
And Enter the password as 'crmsfa'
And click on login button
But Error msg is displayed
