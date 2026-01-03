3:00 to 3:45 --->WindowHandle
3:45 to 4:30 --->Webtable
4:30 to 4:50 --->BreakOut
4:50 to 5:00 --->Break
5:00 to 5:40 --->Advanced User Interactions
5:40 to 6:00 --->Recap

Window Handling:
What is a Window Handle?
A Window Handle is a unique identifier, a string, that Selenium WebDriver assigns to each open window or tab. It acts much like a unique address for a house, allowing WebDriver to navigate to and control a specific window.
Why Window Handles are Important
Web applications can open multiple windows or tabs.
To perform actions on elements within these windows, Selenium needs to know which window to interact with. - - Window handles enable this by providing a unique ID for each window.

How to Handle Windows
To handle windows, WebDriver provides two methods:
getWindowHandle(): Retrieves the ID of the current window.
getWindowHandles(): Retrieves a set of all open windows' IDs.
To switch to a different window, the syntax is driver.switchTo().window(windowHandle); where windowHandle is the unique identifier of the target window.

Handling Multiple Windows
Retrieve the set of window handles using driver.getWindowHandles().
Convert the set to a list to handle windows in a sequential manner.
Use the driver.switchTo().window(windowHandle) to switch control to the desired window.

After operations are completed, windows can be closed using driver.close(), and control can be switched back to the main window.
NoSuchWindowException:
NoSuchWindowException is an exception which signifies that the action you are trying to perform cannot be completed because the window or tab you are referencing no longer exists or is inaccessible. 
types of Webtable:
1)static--->No of rows and columns remain same but the values changed.
2)dynamic--->size of rows and columns may change.

structure of webtable:

<table>

 <thead>--->tableHeader
  <tr>--->headerRow
   <th>--->headerColumn
   </th>
  </tr>
 </thead>

 <tbody>---->tableBody

  <tr>--->tableRow
   <td>--->tableData
   </td>
  </tr>
 
 </tbody>

</table>
