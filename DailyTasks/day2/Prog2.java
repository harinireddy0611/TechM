package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Program 2 :  Write a java program to accept the students name and marks in subjects and find the total and average of the marks and sort the list accordingly.
			int n=5;
			Scanner sc=new Scanner(System.in);
			String names[]=new String[n];
			int marks[][]=new int[n][3];
			int total[]=new int[n];
			int avg[]=new int[n];
			for(int i=0;i<n;i++) {
				System.out.println("enter name");
				names[i]=sc.next();
				for(int j=0;j<3;j++) {
					System.out.println("enter marks");
					marks[i][j]=sc.nextInt();
					total[i]=total[i]+marks[i][j];
				}
				avg[i]=total[i]/3;
			}
			Arrays.sort(avg);
			for(int i=0;i<n;i++) {
				System.out.println(avg[i]);
			}

			sc.close();
	}

}
