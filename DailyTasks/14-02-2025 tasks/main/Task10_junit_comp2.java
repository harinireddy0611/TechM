package junittasks;

public class Task10_junit_comp2 {
//1 interacts with 2
	private Task10_junit_comp1 userRepository;

    public Task10_junit_comp2(Task10_junit_comp1 userRepository) {
        this.userRepository = userRepository;
    }

    public boolean registerUser(String name, int age) {
        if (age < 18) return false;  // Business rule: Users must be 18+
        userRepository.saveUser(new Task10_junit(name, age));
        return true;
    }

    public Task10_junit getUser(String name) {
        return userRepository.findByName(name);
    }
}
