package collaction;

public class collaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Collections
		Interface : List              set
		Classes     Arraylist        treeset
		            linkedlist       hashset
		            vector           linkedhashseet
		            
		            
		            Set not allow to store duplicate values
		            List allow duplicates valus
		            Linkedlist : double linkedlist, to use to manupilate the value, not thread safe non synco
		            Arraylist : dynamic arry, to use extract the values, 50% grow
		            Vector :Thread safe synro, 100% grow in size,
		            Hashset:random value
		            linkedset: in same order
		            Treeset : sorted by
		            
		            
		            
		            */
		       int a=10;
		       String name="anand";
		       boolean flag=true;
		       Object[] obj=new Object[3];
		       obj[0]=a;
		       obj[1]=name;
		       obj[2]= flag;
		       for(int i=0; i<obj.length;i++) {
		    	   System.out.println(obj[i]);
		       }
		       
	}

}
