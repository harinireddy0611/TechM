package day41.threads;

import java.util.Arrays;

public class Task3_thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 3, 8, 6, 2, 7, 4, 1};
        Sortthread sort = new Sortthread(arr);
        sort.start();
        try {
			sort.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Sorted: " + Arrays.toString(arr));
 

	}

}

class Sortthread extends Thread {
    private int[] arr;
    public Sortthread(int[] arr) 
    {
    	this.arr = arr;
    }
    public void run()
    {
    	Arrays.sort(arr); 
    
    }
}