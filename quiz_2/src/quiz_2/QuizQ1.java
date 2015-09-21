package quiz_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuizQ1 {
	public static void main(String[] args) {
		System.out.print("What is your initial tuition cost?");
		Scanner input = new Scanner(System.in);
		double Tuition = input.nextInt();

		System.out.print("What is your percentage increases for tuition?");
		Scanner input2 = new Scanner(System.in);
		double perIncrease = input2.nextInt();

		System.out.print("What is your repayment APR?");
		Scanner input3 = new Scanner(System.in);
		double APR = input3.nextInt();

		System.out.print("What is the repayment schedule?(how many years?)");
		Scanner input4 = new Scanner(System.in);
		double years = input4.nextInt();

		double totalCost = 0;
		for (int i = 0; i < years; i++) {
			totalCost = totalCost + Tuition * Math.pow((1 + (perIncrease / 100)), i);
		}
		double monthlyPay = (totalCost * ((APR / 100) / 12)) * (Math.pow(1 + (APR / 100) / 12, (years * 12)))
				/ (Math.pow(1 + (APR / 100) / 12, (years * 12)) - 1);

		DecimalFormat formatter = new DecimalFormat("#0.00");
		System.out.println("The total cost of your tuition is " + (formatter.format(totalCost)));
		System.out.println("The money you need to pay each month is " + (formatter.format(monthlyPay)));

	}

	// I made up methods in order to test the method in J unit.
	// The formula are exactly the same.
	public static double fv(double years, double Tuition, double perIncrease) {
		double totalCost = 0;
		for (int i = 0; i < years; i++) {
			totalCost = totalCost + Tuition * Math.pow((1 + (perIncrease / 100)), i);
		}
		return totalCost;
	}

	public static double pmt(double years, double totalCost, double APR) {
		double monthlyPay = (totalCost * ((APR / 100) / 12)) * (Math.pow(1 + (APR / 100) / 12, (years * 12)))
				/ (Math.pow(1 + (APR / 100) / 12, (years * 12)) - 1);
		return monthlyPay;
	}

}
