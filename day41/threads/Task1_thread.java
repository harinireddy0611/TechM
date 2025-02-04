package day41.threads;

public class Task1_thread implements Runnable {
	public void run() {
        System.out.println("Hello, Java");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		//Write a Java program to create a basic Java thread that prints "Hello, Java!" when executed.
		Thread thread = new Thread(new Task1_thread());
	        thread.start();

	}

}
