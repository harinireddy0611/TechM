package day41.threads;

public class Task2_thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread ethread = new Thread(() -> {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
                try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        Thread othread = new Thread(() -> {
            for (int i = 1; i <= 20; i += 2) {
                System.out.println("Odd: " + i);
                try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        ethread.start();
        othread.start();
    }

}
