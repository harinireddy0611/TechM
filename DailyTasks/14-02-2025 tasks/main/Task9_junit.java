package junittasks;

public class Task9_junit {
	//Write a Java program that tests a singleton class, ensuring it behaves as expected in a multi-threaded environment.

	private static Task9_junit i;

    private Task9_junit() {}

    public static Task9_junit getInstance() {
        if (i == null) {
            i = new Task9_junit();
        }
        return i;
    }

}
