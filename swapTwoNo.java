package Basics_Core_Program;

import java.util.Scanner;

public class swapTwoNo {
	public static void main(String[] args) {
	    {   
	    	System.out.println("Swaping Two Nos without Third Variable");
	        System.out.println("Enter the value of x and y");  
	        Scanner sc = new Scanner(System.in);  
	        int x = sc.nextInt();  
	        int y = sc.nextInt();  
	        System.out.println("before swapping numbers: "+x +" "+ y);  
	        x = x + y;   
	        y = x - y;   
	        x = x - y;   
	        System.out.println("After swapping: "+x +"  " + y);   
	    }   
		
	}
}
