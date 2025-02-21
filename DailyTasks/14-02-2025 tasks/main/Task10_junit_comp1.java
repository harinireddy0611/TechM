package junittasks;
import java.util.ArrayList;
import java.util.List;

public class Task10_junit_comp1 {
	private List<Task10_junit> users = new ArrayList<>();

    public void saveUser(Task10_junit user) {
        users.add(user);
    }

    public Task10_junit findByName(String name) {
        return users.stream()
                .filter(user -> user.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
