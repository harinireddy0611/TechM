package day1;
public class Task1 {
	
public static void main(String args[]) {
	// Program 1 : Write a Java program to copy the alternative elements in the array.
	
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {100,200,300,400,500};
		for(int i=0;i<arr1.length;i=i+2) {
			System.arraycopy(arr1, i, arr2, i,1);
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
			}
	
}

}