package loop;

import java.util.Scanner;

import functions.practic;

public class Assigmnet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practic p= new practic();
		p.publicmethod();
	
		//==================================
		/*1 2 3 4  
		1 2 3 4  
		1 2 3 4  
		1 2 3 4  */

/*for(int i=1; i<=4; i++) {
	for(int j=1; j<=4; j++) {
		
		System.out.print(j+" ");
		//
	}
	//
	System.out.println(" ");
	}*/
//=====================================
	
		//===========================================================
		/*
		1  
		1 2  
		1 2 3  
		1 2 3 4 */
		/*for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				
				System.out.print(j+" ");
				//
			}
			//
			System.out.println(" ");
	}*/
//========================================================
		
		/*4 3 2 1  
		4 3 2  
		4 3  
		4  
		for(int i=1; i<=4; i++) {
			for(int j=4; j>=i; j--) {
				
				System.out.print(j+" ");
				//
			}
			//
			System.out.println(" ");
	}}*/
		/*for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				
				System.out.print("*" +" ");
				//
			}
			//
			System.out.println(" ");
			}
		*/
		 Scanner sc = new Scanner(System.in);
         
	        int noOfRows = sc.nextInt();

		for(int i=1; i<=noOfRows; i++) {
			for(int j=1; j<=i; j++) {
				
				System.out.print(i+" ");
				//
			}
			//
			System.out.println(" ");
	}
	
}
}