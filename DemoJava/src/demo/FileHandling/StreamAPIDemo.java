package demo.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamAPIDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		FileOutputStream  output = new FileOutputStream("E:\\Grima_Swati\\testfile2_17JUN2025.txt");//writing
		
		//output.write(65);// unicode value for @
		
		String s="Welcome to javaTpoint.";   
		
        byte b[]=s.getBytes();//
        
        output.write(b);
		
		//output.close();
		
		
		 FileInputStream fin=new FileInputStream("E:\\Grima_Swati\\testfile2_17JUN2025.txt");
		 
		 int i = 0 ;
		 
		    while((i=fin.read()) != -1)
		 			 
		     System.out.print((char)i);
		 
		 fin.close();

	}

}
