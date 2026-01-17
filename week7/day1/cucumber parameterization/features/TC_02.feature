Feature: createLead Functionality for LeafTaps Application
#Background: 
#Given Launch the browser and load the url
@functional
Scenario Outline: createLead with multipledata

When Enter the username as 'democsr2'
When Enter the password as 'crmsfa'
And click on Login 
And Click on crmsfa link
And click on Leads
And Click on CreateLeads link
And Enter the company Name <companyName>
And enter the firstName <firstName>
And enter the LastName <lastName>
And click on Submit button
Then viewLeads page is displayed
Examples:
|companyName|firstName|lastName|
|Testleaf|Saranya|S|
|Qeagle|HariPrasad|R|
|Qeagle|Babu|M|

