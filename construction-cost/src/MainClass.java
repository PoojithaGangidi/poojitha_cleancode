
import java.util.InputMismatchException;

import java.util.Scanner;

public class MainClass {
	
	private static Scanner sc;
	
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		
		double areaOfHouse = 0;
		
		String typeOfMaterial;
		
		boolean automationRequired = false;
		
		try
		{
			System.out.println("Enter the Area of the House : ");
			
			areaOfHouse = sc.nextDouble();
			
		} catch(InputMismatchException misMatchInput) {
			
			System.out.println(misMatchInput.getMessage());
		}
		
		System.out.println("Select Material Standard : ");
		
		MaterialStandards.getMaterialType();
		
		System.out.println("Input : ");
		
		typeOfMaterial =sc.next();
		
		if(typeOfMaterial.toLowerCase().equals(MaterialStandards.Standards.HighStandardMaterial.toString().toLowerCase()))
		{
			System.out.println("Required automation (true/false) : ");
			
			automationRequired = sc.hasNextBoolean();
		}
		
		CostEstimate calculateCost = new CostEstimate();
		
		try
		{
			System.out.println("Estimate Cost of Costruction is:" + calculateCost.getCost(areaOfHouse,typeOfMaterial,automationRequired));
			
		} catch(InvalidMaterialSelect invalidMaterial)
		{
			System.out.println(invalidMaterial.getMessage());
		}
		
	}

}
