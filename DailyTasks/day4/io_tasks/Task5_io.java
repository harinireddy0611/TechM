package day41.io_tasks;

import java.io.File;

public class Task5_io {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to check if the given pathname is a directory or a file.
		String dir="/Users/harinireddy/eclipse-workspace/TechM/Assignments/src/day2";
		try {
			File f=new File(dir);
			if(f.isDirectory()) {
				System.out.print("is a directory");
			
			}
			else if (f.isFile()){
				System.out.print("is a file");
			}
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
