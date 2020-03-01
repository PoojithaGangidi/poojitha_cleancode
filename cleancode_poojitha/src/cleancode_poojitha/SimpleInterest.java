package cleancode_poojitha;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

@SuppressWarnings("unused")
public class SimpleInterest
{
	private static Scanner sc;
	public static void main(String[] args) throws NumberFormatException,IOException
	{
		{
			int principle,rate,time;
			sc=new Scanner(System.in);
			System.out.println("enter principle,rate and time");
			principle=sc.nextInt();
			rate=sc.nextInt();
			time=sc.nextInt();
			int simpleInterest=(principle*rate*time)/100;
			System.out.println("Simple Interest earned is"+simpleInterest);
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
			bw.write(simpleInterest);
			}
	}
	public String getSimpleInterest() {
		
		return null;
		
	}
}
