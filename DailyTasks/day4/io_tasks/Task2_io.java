package day41.io_tasks;

import java.io.File;
import java.io.FileFilter;

public class Task2_io {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to get specific files with extensions from a specified folder.
		String dir="/Users/harinireddy/eclipse-workspace/TechM/Assignments/src/day2";
		try {
			File f=new File(dir);
//			FileFilter filter = new FileFilter() { 
//				  
//                public boolean accept(File f) 
//                { 
//                    return f.getName().endsWith("java"); 
//                } 
//            }; 
//			File[] farr=f.listFiles(filter);
			File[] farr=f.listFiles();
			for(int i=0;i<farr.length;i++) {
				if(farr[i].getName().endsWith("java")) {
				System.out.println(farr[i].getName());
				}
			}
			
		}
		catch(Exception e) {
			System.out.print(e);
		}
		

	}

}
