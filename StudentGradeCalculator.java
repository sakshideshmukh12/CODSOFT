package com.dkte;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the no of subjects:");
		int n=sc.nextInt();
		int sum=0;
	  
	    for(int i=1;i<=n;i++){
	    	System.out.println("Enter the marks of subject"+i+":");
	    	int m=sc.nextInt();
	    	
	    	sum=sum+m;
	    	
	    }
	   
	    double avgPercentage = (double) sum / (n * 100) * 100;
	    String grade;
	    if(avgPercentage>=90) {
	        grade="A";
	    }
	    else if(avgPercentage>=80) {
	    	grade="B";
	    }
	    else if(avgPercentage>=70) {
	    	grade="C";
	    }
	    else if(avgPercentage>=60) {
	    	grade="D";
	    }
	    else {
	    	grade="F";
	    }
	    System.out.println("\n-----Result------");
	    System.out.println("Total marks- "+sum);
	    System.err.println("Total Percentage- "+avgPercentage);
	    System.err.println("Grade: "+grade);
	    
	    

	}

}
