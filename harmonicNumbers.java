package Basics_Core_Program;

import java.util.Scanner;

public class harmonicNumbers {
	public static void main(String[] args) {
		System.out.println("--------------Print Nth Harmonic Number-----------------");
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter Value  Of N : ");
		int N= sc.nextInt();
		
     double result = 0.0;
     for(int i=1;i<=N;i++)
       {
    	 System.out.print("1/"+i);
          if(i<N) {  
    	  System.out.println("+");
          }
    	 result = result + (double) 1 / N;
           
            
            
       }
     System.out.println("="+result);
     System.out.println("Output of Harmonic Series is "+result);
		
	}
}
	


