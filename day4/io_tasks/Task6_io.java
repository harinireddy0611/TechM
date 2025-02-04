package day41.io_tasks;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task6_io {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to determine the last modified date of a file.
		String dir="/Users/harinireddy/eclipse-workspace/TechM/Assignments/src/day2";
		try {
			File f=new File(dir);
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String formattedDate = sdf.format(new Date(f.lastModified()));

            System.out.println("Last Modified Date: " + formattedDate);
		}
		catch(Exception e) {
			System.out.print(e);
		}

	}

}
