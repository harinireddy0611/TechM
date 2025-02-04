package day2;
import java.util.Scanner;

class Associate_for_given {
int id;
String name;
String technology;
int exp;

public void getter() {
	
	System.out.println(id);
	
}
public void setter() {
	Scanner sc=new Scanner(System.in);
	id=sc.nextInt();
	exp=sc.nextInt();
	name=sc.next();
	technology=sc.next();
	sc.close();
	
}

}

class Solution{
	 static Associate_for_given[] associatesForGivenTechnology(Associate_for_given[] arr1, String st) {
		int n=arr1.length;
		Associate_for_given[] arr2=new Associate_for_given[n];
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr1[i].technology.equals(st) && arr1[i].exp%5==0 ) {
				arr2[j]=arr1[i];
				j+=1;
			}
			
		}
		return arr2;
	}
}


public class Associate {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of associates");
		int n=sc.nextInt();
		
		System.out.println("enter associates");
		Associate_for_given[] arr1=new Associate_for_given[n];
		
		for(int i=0;i<n;i++) {
			arr1[i] = new Associate_for_given();
			arr1[i].setter();
		}
		System.out.println("enter search ");
		String search=sc.next();
		
		Associate_for_given[] arr3 = Solution.associatesForGivenTechnology(arr1,search);
		if (arr3[0]==null) {
			System.out.println("none matched");
		}
		else {
		for(int i=0;i<n;i++) {
			if( arr3[i]==null){
				break;
			}
			arr3[i].getter();
		}
		}
		sc.close();
	}
}

