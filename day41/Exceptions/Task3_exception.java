package day41.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Task3_exception {

	public static void main(String[] args)
		 {
		// TODO Auto-generated method stub
		String filepath="text1.txt";
		 try {
	            readfile(filepath);
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found - " + e.getMessage());
	        }
		

	}
	public static void readfile(String filep) throws FileNotFoundException {
			File file=new File(filep);
			if (!file.exists()) {
		        throw new FileNotFoundException("File does not exist: " + filep);
		    }
			else {
				System.out.println("File exists: " + filep);
				FileInputStream fis=null;
				
			}

		    
			
		
	}
}
