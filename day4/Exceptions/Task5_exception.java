package day41.Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Task5_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/Users/harinireddy/eclipse-workspace/TechM/sample_core_project/src/day41/io_tasks/text1.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            if (file.length() == 0) {
                throw new Exception("Error: File is empty");
            }
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

	}

}
