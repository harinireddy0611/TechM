package day41.io_tasks;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task10_io {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filep = "/Users/harinireddy/eclipse-workspace/TechM/sample_core_project/src/day41/io_tasks/text1.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filep))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line); 
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }

	}

}
