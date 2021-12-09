package dec9;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="vijay";
		String revString="";
		char revCharacter[]= new char[a.length()];
		int count=0;
		for(int i=a.length()-1;i>=0;i--) {
			revCharacter[count]=a.charAt(i);
			count++;
		}
		for (char c : revCharacter) {
			revString=revString+Character.toString(c);        // or  revString=revString+c;
		}
		System.out.println(revString);
		if(a.equalsIgnoreCase(revString)) {
			System.out.println("Given string is a palindrome");
		}
		else {
			System.out.println("Given string is not a palindrome");
		}
		
		
		
		
         	}

}
