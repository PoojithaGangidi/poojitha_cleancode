package cleancode_poojitha;

import java.util.Scanner;

public class Interest {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc=new Scanner(System.in);
		
		double principle=0;
		
		double rate=0;
		
		int time =0;
		
		int numberOfTimesInterestApplied=0;
		
		System.out.println("Enter the principle amount:");
		
		principle=sc.nextDouble();
		
		System.out.println("Enter the time period:");
		
		time=sc.nextInt();
		
		System.out.println("Enter the number of times interest applied per time period:");
		
		numberOfTimesInterestApplied=sc.nextInt();
		
		SimpleInterest simpleinterest=new SimpleInterest();
		
		CompoundInterest compoundinterest=new CompoundInterest(principle,rate,time,numberOfTimesInterestApplied);
		
		System.out.println("Simple Interest :"+ simpleinterest.getSimpleInterest());
		
		System.out.println("Compound Interest :" + compoundinterest.getCompoundINterest());
	}

}
