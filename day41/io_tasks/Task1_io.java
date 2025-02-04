package day41.io_tasks;

import java.io.File;

public class Task1_io {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to get a list of all file/directory names in the given directory.
		String dir="/Users/harinireddy/eclipse-workspace/TechM/Assignments/src/day2";
		try {
			File f=new File(dir);
			File[] farr=f.listFiles();
			for(int i=0;i<farr.length;i++) {
				System.out.println(farr[i].getName());
			}
			
		}
		catch(Exception e) {
			System.out.print(e);
		}
		

	}

}
