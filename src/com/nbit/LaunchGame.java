package com.nbit;

import java.util.Scanner;

class Guesser {
	int guessNum;
	
	int guessNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser kindly Guess the number 1-9");
		guessNum = sc.nextInt();
		return guessNum;	
	}
	int mul_2() {
		guessNum =guessNum*2;
		return guessNum;
	}
	int add_5() {
		guessNum = guessNum+5;
		return guessNum;
	}
	int mul_50() {
		guessNum =guessNum*50;
		return guessNum;
	}
	int checker() {
		Scanner sc = new Scanner(System.in);
		System.out.println("If you had youre birthday this year ? Please enter '1' if yes if not '2'...");
		int check = sc.nextInt();
		if(check == 1 )
		{
			guessNum = guessNum+1771;
		}
		else 
		{
			guessNum = guessNum+1770;
		}
		return guessNum;
		
	}
	int subtract() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter youre Year of birth");
		int yearOfBirth = sc.nextInt();
		guessNum = guessNum-yearOfBirth;
		return guessNum;
		
	}
}






public class LaunchGame {

	public static void main(String[] args) {
		
		
		  Guesser g = new Guesser(); 
		  g.guessNumber(); 
		  g.mul_2(); 
		  g.add_5();
		  g.mul_50();
		  g.checker();
		  g.subtract();
		  System.out.println("------------------------------------------------------------------");
		  int x = g.guessNum;
		    int hi = x, n = 0;
		    while (hi > 9) {
		        hi /= 10;
		        ++n;
		    }
		    System.out.println("Number you have guessed is : "+hi);
		    for (int i = 0; i < n; i++) hi *= 10;
		    x -= hi;
		    System.out.println("And Youre age is : " + x);
	}

}
