3:00 to 3:30 ---> DropDown
3.30 to 3.50 --->BreakOut
3:50 to 4:00 ---> Break
4:00 to 4:30 ---> AbsoluteXpath
4:30 to 5:00 ---> Basic Xpath
5:00 to 5:10 ---> Break
5:10 to 5:45 ---> AdvancedXpath
5:45 to 6:00 ---> Recap

Dropdown:
What is a Dropdown?

A dropdown in web development is a user interface element that allows users to select one option from a list of options.
In HTML, this is structured with a <select> tag as the parent element and <option> elements as children.
Selenium must be able to interact with these elements to test web applications thoroughly.
How to Handle Dropdown?

Selenium provides a Select class specifically for interacting with dropdown elements.
The Select class offers methods to select options within a dropdown easily.

When to Use?
The Select class should be used when an element in the DOM is identified with a <select> tag, indicating a dropdown menu.
<select> Structure in DOM

The <select> tag in the DOM represents the dropdown element,
and the nested <option> tags represent the individual choices available to the user.

How to Use Select Class?
To use the Select class, a Selenium script must first identify the <select> element in the DOM.
Then, an instance of the Select class is created by passing the located WebElement as an argument to its constructor.
This allows the script to manipulate the dropdown as needed.
Helper Methods

The Select class provides various methods to select options from a dropdown, such as:
selectByIndex(index): Selects an option by its index in the dropdown, starting with 0.
selectByVisibleText("text"): Selects an option by the text visible to the user in the dropdown.
selectByValue("value"): Selects an option by the value of attribute.

Absolute XPath: It starts from the root (html) and traverses down to the desired element, detailing every single element in the hierarchy. The path starts with a single forward slash /, 
indicating the root.
Relative XPath: It starts from anywhere within the document and typically focuses on identifying elements based on attributes, indexes, or specific tags, 
not necessarily detailing the entire path from the root. It starts with a double forward slash //, indicating the search can begin anywhere. For example: //input[@id=‘username’].



Basic xpath:

1)AttributeBasedXpath:
syn://tagName[@attribute='attribute value']
eg)//input[@id='username']
2)Text based xpath:
syn://tagName[text()='text value']
eg)//a[text()='Leads']
3)partial attribute xpath:
syn://tagname[contains(@attibute,'attribute value')]
eg)//input[contains(@class,'Submit')]
4)partial textbased xpath:
syn://tagName[contains(text(),'text value ')]
eg)//a[contains(text(),'CRM')]
5)collection based xpath
syn:(//tagName[@attribute='attribute value'])[2]
eg)(//input[@class='inputLogin'])[2]

Axes xpath:
1)parent to child:
syn:xpath of parent/tagname of the child
eg)//p[@class='top']/input
2)grandparent to grand child:
syn:xpath for Grandparent//tagname of grandchild
eg)(//form[@id='login']//input)[2]
3)Child to parent
syn:xpath for child/parent::parent tagname
eg)(//input[@class='inputLogin']/parent::p)[2]
4)Grandchild to Grandparent
syn:xpath for Grandchild/ancestor::Grandparent tagname
eg)//input[@class='decorativeSubmit']/ancestor::form