package day41.io_tasks;

import java.io.File;

public class Task4_io {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Write a Java program to check if a file or directory has read and write permissions.
		String dir="/Users/harinireddy/eclipse-workspace/TechM/Assignments/src/day2";
		try {
			File f=new File(dir);
			if(f.canRead()&&f.canWrite()) {
				System.out.print("can read and write");
			
			}
			else {
				System.out.print("cannot read and write");
			}
		}
		catch(Exception e) {
			System.out.print(e);
		}

	}

}
