package junittasks;

public class Task8_junit {
	private int square(int num) {
        return num * num;
    }

    // Public method calling private method
    public int getSquare(int num) {
        return square(num);
    }
}
