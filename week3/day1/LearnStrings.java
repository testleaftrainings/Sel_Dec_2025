package week3.day1;

public class LearnStrings {

	public static void main(String[] args) {
		/**
		 * Strings:
		 * -collection of characters,Non primitivedatatype
		 * -immutable class(it has proper structure,behaviour,methods)
		 * implementations:
		 * 1)String literal
		 * 2)String instantation
		 * 
		 * 
		 */
		//String literal:syn:Datatype var.name="values";
		String name="Testleaf";
		String name1="Test leaf";
		//String instantiation
		//syn:Class obj=new Class("values");
		String str=new String("Test Leaf");
		String str1=new String("Test lEAF");
		//count the no of characters
		int length = str.length();
		System.out.println(length);
		//concatenation
		System.out.println(5+9);//14
		System.out.println(5+"9");
		String s1="welcome";
		String s2=" to testleaf";
		String s3=" for Selenium course";
		//System.out.println(s1+s2);
		System.out.println(s1.concat(s2).concat(s3));
		//comparison methods
		//equals--->based on the content(case sensitive)
		boolean equals = str.equals(str1);
		System.out.println(equals);
		//== method-->based on the memory address
		if (str==str1) {
			System.out.println("values matched");
		} else {
			System.out.println("values not matched");
		}
	
		//ignore casesensitive
		boolean equalsIgnoreCase = str.equalsIgnoreCase(str1);
		System.out.println(equalsIgnoreCase);
		// toCharArray
		char[] charArray = name.toCharArray();
		System.out.println(charArray);
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		//charAt
		System.out.println(name1.charAt(4));
		System.out.println(name1.charAt(5));
		//replace
		String s="Testleaf@123";
		String replace = s.replace("e", " ");
		System.out.println(replace);
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		//retreive any values
		String replaceAll = s.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		String replaceAll2 = s.replaceAll("[^A-z]", "");
		System.out.println(replaceAll2);
		
		//string to integer
		
		String st="120";
		System.out.println(st+10);
		int stringToInteger = Integer.parseInt(st);
		System.out.println(stringToInteger+10);
		
		//Integer to string
		int i=10;
		System.out.println(i+10);
		String integerToString = Integer.toString(i);
		System.out.println(integerToString+10);
		
		//split-->split the strings to multiple strings
		
		String st1="Testleaf and Qeagle";//test--->0 af and Qeag--->1 (length=2)
		String[] split = st1.split("le");
		System.out.println(split[1]);
		
		String[] split2 = st1.split(" ");//Testleaf--->0 and-->1 qeagle--->2(length=3)
		System.out.println(split2[2]);
		
		String[] split3 = st1.split("");//t-->0e-->1s-->2 t-->3l-->4e-->5
		System.out.println(split3[8]);
		
		String[] split4 = st1.split("e");//t--->0 stl-->1  af and q--->2 agl--->3
		System.out.println(split4[2]);
		
		//substring
		
		String st2="December";
		String substring = st2.substring(2);
		System.out.println(substring);
		String substring2 = st2.substring(2,7);//end index-->n+1
		System.out.println(substring2);
		
		
		
	}
	

}
