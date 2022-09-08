package Basics_Core_Program;
import java.util.Scanner;
public class leapYear {
	static void checkLeapYear(int year) {
	    boolean leap = false;
	    if (year % 4 == 0) {
	      if (year % 100 == 0) {
	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }
        else
	        leap = true;
	    }
	    
	    else
	      leap = false;

	    if (leap)
	      System.out.println( year + " is a leap year.");
	    else
	      System.out.println( year + " is not a leap year.");
	  }
	
	
	public static void main(String[] args)
    {
		int count = 0;
		int temp;
		int Year1;
		System.out.println("--------------CHECK YEAR IS LEAP YEAR OR NOT-----------------");
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter Year Of Four Digit: ");
		int Year= sc.nextInt();
		temp=Year;
		Year1=temp;
	    while (Year != 0) {
	      Year /= 10;
	      ++count;
	    }
	    System.out.println("Number of digits: " + count);
	    if(count==4) {
	    	checkLeapYear(Year1);
	    	
	    }else {
	    	System.out.println("Enter 4 Digit Year");
	    }
    }
	
}
