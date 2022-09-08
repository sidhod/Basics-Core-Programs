package Basics_Core_Program;

import java.util.Scanner;

public class checkVowelConsonant {
	 public static void main(String[] args) {

		 System.out.println("--------------Check Vowel or Consonant-----------------");
			Scanner sc= new Scanner(System.in); 
			System.out.print("Enter alphabet here : ");
			char ch = sc.next().charAt(0);
	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
	            System.out.println("       "+ch + " is vowel");
	        else
	            System.out.println("       "+ch + " is consonant");

	    }

}
