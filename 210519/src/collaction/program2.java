package collaction;

import java.util.ArrayList;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list= new ArrayList<>();
		list.add("Anand");
		list.add(20);
		list.add(true);
		for(Object e:list) {
			System.out.println(e);
		}
	}

}
