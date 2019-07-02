package collaction;

import java.util.HashSet;
import java.util.LinkedHashSet;

import java.util.Set;
import java.util.TreeSet;


public class setInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> list=new HashSet<>();//Random value
		list.add("anand");
		list.add("Anand");
		list.add("techbodhi");
		list.add("bhayre");
		list.add("Anand");
		for(String e: list)
			System.out.println(e);	
		System.out.println("********************************8");
		
		
		list=new LinkedHashSet<>();//Sequence value, insertion preserves
		list.add("anand");
		list.add("Anand");
		list.add("techbodhi");
		list.add("bhayre");
		list.add("Anand");
		for(String e: list)
			System.out.println(e);	
		System.out.println("********************************8");
				
		
		list= new TreeSet<>();//Sorted value
		list.add("anand");
		list.add("Anand");
		list.add("techbodhi");
		list.add("bhayre");
		list.add("Anand");
		for(String e: list)
			System.out.println(e);	
		System.out.println("********************************8");
		
	}

}

