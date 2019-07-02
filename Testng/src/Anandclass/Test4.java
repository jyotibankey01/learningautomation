package Anandclass;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test4 {
	
@Test(dataProvider= "getdata")
public void login(String username, String password) {
	System.out.println("Enter username-" +username);
	System.out.println("Enter password " +password);
	System.out.println("click on login button");
}

@DataProvider
public String[][] getdata() throws IOException {
	Xls_Reader x1=new Xls_Reader("D:\\210519\\Testng\\src\\testdata\\testdata.xls");
	int rows=x1.getrowcount("Data2");
	int colms=x1.getColumncount("Data2");
	System.out.println(rows);
	System.out.println(colms);
		
String[][] d = new String[rows-1][colms];

for(int r=2; r<=rows;r++) {
	
	for (int c=1; c<=colms; c++) {
		
		d[r-2][c-1]=x1.getCellData("Data2", r, c);
	
	}
		
}		
return d;
}

}
