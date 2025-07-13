package com.dkte;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		int randumNumber=ran.nextInt(100)+1;
		int attempts=8;
		boolean guess=false;
		
		for(int i=1;i<=attempts;i++) {
			System.out.println("Enter Your Guess: ");
			int n=sc.nextInt();
			if(n==randumNumber) {
				System.out.println("Horrey! you guessed right! ");
				guess=true;
				break;
			}
			else if(Math.abs(n - randumNumber) <= 10) {
				System.out.println("You are close");
			}
			else if(n<randumNumber) {
				System.out.println("Too low! Try again.");
			}
			else {
				System.out.println("Too high! Try again.");
			}
		}
		if(!guess) {
			System.out.println("Sorry! You've used all attempts.");
            System.out.println("The correct number was: " + randumNumber);
		}

	}

}
