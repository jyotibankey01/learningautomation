package arrays;

public class twoDimentioalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] arr=new String[3][2];
		arr[0][0]="Anna";
		arr[0][1]="jyoti";
		arr[1][0]="lajo";
		arr[1][1]="mann";
		arr[2][0]="semdi";
		arr[2][1]="kalu";
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<2; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(" ");
		}
	}

}
