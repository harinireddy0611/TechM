package day41.Exceptions;

import java.util.Scanner;
import java.io.File;
public class Task4_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try  {
			Scanner sc = new Scanner(new File("/Users/harinireddy/eclipse-workspace/TechM/sample_core_project/src/day41/io_tasks/text1.txt"));
            while (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    int num = sc.nextInt();
                    if (num > 0) {
                        throw new PException("Error: Positive number found - " + num);
                    }
                } else {
                    sc.next(); 
                }
            }
            System.out.println("File read successfully without positive numbers.");
        } catch (Exception e) {
            System.err.println("File not found!");
        } 
	}

}
class PException extends Exception {
    public PException(String message) {
        super(message);
    }
}