package Anandclass;

import java.io.IOException;

public class ReadData {
public static void main(String[] args) throws IOException {
	
	Xls_Reader x1=new Xls_Reader("D:\\210519\\Testng\\src\\testdata\\testdata.xls");
	int rows=x1.getrowcount("Data2");
	int colms=x1.getColumncount("Data2");
	System.out.println(rows);
	System.out.println(colms);
	
	for(int r=2; r<=rows;r++) {
		
		for (int c=1; c<=colms; c++) {
			Object val=x1.getCellData("Data2", r, c);
		System.out.println(val);
		}
			
	}			
	
	
}
}