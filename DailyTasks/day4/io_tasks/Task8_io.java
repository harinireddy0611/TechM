package day41.io_tasks;

import java.io.File;

public class Task8_io {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("/Users/harinireddy/eclipse-workspace/TechM/sample_core_project/src/day41/io_tasks/text1.txt");
		System.out.println(f.getName()+" size in KB is "+(double)(f.length()/1024));
		System.out.println(f.getName()+" size in MB is "+(double)(f.length()/(1024*1024)));
	}

}
