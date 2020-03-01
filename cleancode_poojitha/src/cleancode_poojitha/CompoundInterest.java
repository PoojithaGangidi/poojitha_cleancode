package cleancode_poojitha;

public class CompoundInterest {
	
	private double principleAmount;
	
	private double interestRate;
	
	private int timeofInvestment;
	
	private int numberOfTimesInterestApplied;
	
	public CompoundInterest(double principle,double rate,int time,int n) {
		
		this.principleAmount=principle;
		
		this.interestRate=rate;
		
		this.timeOfInvestment=time;
		
		this.numberOfTimesInterestApplied=n;
		
	}
	
	
	public double getCompoundINterest() {
		
		double amount=principleAmount*(Math.pow(1+interestRate/numberOfTimesInterestApplied, numberOfTimesInterestApplied*timeOfInvestment));
		
		double compoundIntrest=amount-principleAmount;
		
		return compoundInterest;
	}

}
