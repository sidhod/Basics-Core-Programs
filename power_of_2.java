package Basics_Core_Program;

import java.util.Scanner;

public class power_of_2 {
	public static void main(String[] args) {
		System.out.println("--------------Table of power of 2-----------------");
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter Power Of 2(0<=N<31): ");
		int N= sc.nextInt();
		if(N<31) {
		for(int i=0;i <=N; i++) {
			System.out.println("2^"+i+"="+Math.pow(2, i));
		}
		}
		else {
			System.out.println("Enter Value between 0 to 31" );
		}
	}
	

}
