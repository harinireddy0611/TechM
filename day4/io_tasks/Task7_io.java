package day41.io_tasks;

import java.util.Scanner;

public class Task7_io {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Details");
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Branch:");
        String branch = sc.nextLine();
        System.out.println("ID:");
        String id = sc.nextLine();
        System.out.println("Age:");
        int age = sc.nextInt();
        System.out.println("Experience:");
        int exp = sc.nextInt();

        System.out.println("Entered details");
        System.out.println("Name: " + name + "Branch: " + branch + "ID: " + id);
        System.out.println("Age: " + age + "Experience: " + exp);

        sc.close();

	}

}
