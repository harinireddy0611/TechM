package junittasks;

public class Task5_junit {
	//Write a Java test case that fails if a method takes longer than a specified time to execute.
	
	    public void longRunningMethod() {
	        
	    	try {
	            Thread.sleep(500); 
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	    	
	    }

}
