package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		/**
		 * List(interface) is an ordered collection(fifo)
		 * -allows the duplicate values
		 * -need an implementation class,since not able to create an object
		 * syn:interface<generic type> listName=new imp.class<generictype>();
		 */
		List<String>Learners=new ArrayList<String>();
		//List<String> list=new ArrayList<String>(Arrays.asList("manikandan","roja","seenivasan"));
		List<String>Trainer=new ArrayList<String>();
		Trainer.add("Saranya");
		System.out.println(Trainer);
		//add the names in the list
		Learners.add("Ravindran");
		Learners.add("jajee");
		Learners.add("swetha");
		System.out.println(Learners);
		Learners.add(1, "mahalakshmi");
		System.out.println(Learners);
		//iterate
		for (int i = 0; i < Learners.size(); i++) {
			System.out.println(Learners.get(i));
		}
		//size
		int size = Learners.size();
		System.out.println(size);
		//retreive any item from the list
		String parValue = Learners.get(2);
		System.out.println(parValue);
		//remove a value from list
		Learners.remove(1);
		System.out.println(Learners);
		
		boolean remove = Learners.remove("jajee");
		System.out.println(remove);
		
		//clear the list
		//Learners.clear();
		//System.out.println(Learners);
		Trainer.addAll(Learners);
		System.out.println(Trainer);

	}

}
