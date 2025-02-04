package day41.io_tasks;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Task9_io {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "/Users/harinireddy/eclipse-workspace/TechM/sample_core_project/src/day41/io_tasks/text1.txt";
		try {
		byte[] fileBytes = readFile(filePath);
		ByteArrayInputStream bas = new ByteArrayInputStream(fileBytes);
		int data;
		while ((data = bas.read()) != -1) {
				System.out.print((char) data); 
			}
		} 
		catch (IOException e) {
		            System.err.println("An error occurred while reading the file: " + e.getMessage());
}
	}

		    public static byte[] readFile(String fileP) throws IOException {
		       
		        try (FileInputStream fis = new FileInputStream(fileP);
		             ByteArrayOutputStream bas = new ByteArrayOutputStream()) {
		            byte[] buffer = new byte[1024];
		            int br;
		            while ((br = fis.read(buffer)) != -1) {
		                bas.write(buffer, 0, br);
		            }
		            return bas.toByteArray();
		        }

	}

}
