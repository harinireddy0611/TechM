package junittasks;

public class Task10_junit {
//Write a Java program that create tests that verify the interaction between different components or modules in your application.
	
	private String name;
    private int age;

    public Task10_junit(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
