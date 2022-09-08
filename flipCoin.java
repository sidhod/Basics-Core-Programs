package Basics_Core_Program;
import java.util.*;

public class flipCoin {
	public static void main(String[] args) {
		int Head=0;
		int Tail=0;
		
		float percentageHead;
		float percentageTail;
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter No Time Coin flips- ");
		float noCoinFlip= sc.nextFloat();
		
		
		
		for(int i=0;i<noCoinFlip;i++){
			int random =(int) Math.floor(Math.random()*10)%2;
			if( random == 0) {
				Head=Head+1;
				System.out.println("Head");
			}
			else {
				Tail=Tail+1;
				System.out.println("Tail");
			}
		}
		System.out.println("Total no of times coin flip: "+noCoinFlip);
		System.out.println("Total no of Heads: "+Head);
		percentageHead=(float)((Head/noCoinFlip)*100);
		
		System.out.println("Total no of Tails: "+Tail);
		percentageTail=(float)((Tail/noCoinFlip)*100);
		System.out.println("Percentage of Heads Appear: "+percentageHead);
		System.out.println("Percentage of Tails Appear: "+percentageTail);
		
	}

}
