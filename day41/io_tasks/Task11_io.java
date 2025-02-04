package day41.io_tasks;

import java.io.FileInputStream;
import java.io.IOException;

public class Task11_io {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String fileP = "/Users/harinireddy/eclipse-workspace/TechM/sample_core_project/src/day41/io_tasks/text1.txt";
		 try{
			 FileInputStream fs = new FileInputStream(fileP);
	            int bd;
	            StringBuilder content = new StringBuilder();

	            while ((bd = fs.read()) != -1) {
	                content.append((char) bd);
	            }
	            System.out.println(content.toString());
	        } 
		 catch (IOException e) {
	            System.err.println("An error occurred while reading the file: " + e.getMessage());
	        }

	}

}
