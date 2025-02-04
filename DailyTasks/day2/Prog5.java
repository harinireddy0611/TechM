package day1;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program 5: You are required to create a string and captialize every alternative character.
		//for eg : if the input is anurag then output should be AnUrAg
		
		String str="anurag";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i=i+2) {
			ch[i]=Character.toUpperCase(ch[i]);
		}
		System.out.print(String.valueOf(ch));

	}

}
