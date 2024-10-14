package study;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class demo {

	public static void main(String[] args) {
     String path1="C:\\advance\\input.txt";
     String path2="C:\\advance\\output.txt";
     try(FileInputStream fis=new FileInputStream(path1);
    		 FileOutputStream fos=new FileOutputStream(path2)){
    	 int x;
    	 while((x=fis.read())!=-1) {
    		 fos.write(x);
    	 }
     }
     catch(Exception e) {
    	 e.printStackTrace();
     }
     System.out.println("done!");	 
	}

}
