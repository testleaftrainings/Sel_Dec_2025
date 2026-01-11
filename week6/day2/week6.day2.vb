03:00 to 04:00 -> Excel Integrations 
04:00 to 04:30 -> Breakout(20mins) + Break(10 mins)
04:30 to 05:30 -> Cucumber Introduction & Implementation
05:30 to 06:00 -> Breakout
06:00 to 06:15 -> Recap


Common Integration:

(./data/createLead.xlsx); 
create input args inside method
public static String[][] read(String fileName){
	 (./data/"+fileName+".xlsx) 
	 }

into the BaseClass or PSM and declare a fileName globally
 * public String fileName; ------------ > Global declaration
 
 Cut and paste the DataProvider code from CreateLead Class
 * @DataProvider(name="fetchData") 
  public String[][] sendData() throws IOException { 
	return ReadExcel.readExcel(fileName); }

PreRequisites for cucumber:
    1)cucumber Plugins
    2)Depedencies
Implementation:
 create 3 packages as feature---define the teststeps--->create a feature file with extension .feature
 stepdefinition---implement the methods for the teststeps 
 runner-->for execution

	