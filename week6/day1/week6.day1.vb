03:00 - 03:45 ->  Static Parameterization
03:45 - 04:05 ->  CrossbrowserTesting
04:05 - 04:30 -> Breakout
04:30 - 04:45 -> Break
04:45 - 05:15 -> DynamicParameterization
05:15 - 05:35 ->Breakout
05:35 - 06:00 ->Read values from Excel

parameterization:

1)static:data which is common across all the testcases
2)dynamic :data varies or differs across all the testcases.

Steps to implement Static Parameterization: 
Identify the data that are common across all the test cases 
1.Add parameter tag for each data in the XML file ex: url,username,password ,browser 
2.Map the parameters in the class using @Parameters ex: @Parameters({"url","username", "password"})
 Note: The name should exactly match the names in the xml 
 3.Use that parameters inside the method using arguments
Note: Sequence matters but the name of the arguments does not matter 
 4.Finally, replace the arguments with the hardcoded values 
 Note: You should always run from the xml file when you use parameters

Dynamic Parameterization: 
1.Identify the data that are need to be dynamic for the particular testcase ex: CreateLead : companyName, firstName, lastName, phoneNumber EditLead : phoneNumber,companyName 
2.Create a method sendData and annotate with @Dataprovider annotation and give a name for the DataProvider
3.Create an Input array with rowCount and columnCount - add datas into the array with index starting from 0 
4.Return data back to the calling method
5.Receive the data in the testcase uding dataProvider attribute 
6. Pass input arguments to the test method and replace all the hardcoded data

read the values from excel:
---ApachePoi---->.xls and .xlsx
Wb--->ws-->row--->cells
.xlsx--->XSSF
Requirements:
1)plugins
2)dependencies
