// Fibonacci Sequence Distributed Systems
//Patrick Dunning G00284875
//Fibonacci Sequence Where each number is the sum of the 2 previous numbers before

package ie.gmit;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int fibNum;
		
		//Get the number of numbers to print
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Fibonacci numbers do you want to print:");
		fibNum = sc.nextInt();
		sc.close();
		
		//initialise and print the first two numbers
		int presentNum = 1;
		int previousNum = 0;
		System.out.println(previousNum);
		System.out.println(presentNum);
		
		//Printing out the rest of the numbers
		
		//Holds the value that comes before previousNum
		//Useful for updating values when printed out
		int lastlast;
		//Start at 2 as we have already printed out the first number
		for (int i = 2; i < fibNum; i++)
		{
			lastlast = previousNum;
			previousNum = presentNum;
			presentNum = lastlast + previousNum;
			System.out.println(presentNum);
		}
	}

}
