package day41.io_tasks;

import java.io.File;

public class Task3_io {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to check if a file or directory specified by pathname exists or not.
		String dir="/Users/harinireddy/eclipse-workspace/TechM/Assignments/src/day2";
		try {
			File f=new File(dir);
			if(f.exists()) {
			System.out.println("exists");
		
			}
			else
			{
				System.out.println("does not exists");
			}
		}
		catch(Exception e) {
			System.out.print(e);
		}

	}

}
