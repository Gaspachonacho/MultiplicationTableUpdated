package lab4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////////
		
		Scanner scan = new Scanner(System.in);
		
		// Skannar in x och y värdet
		System.out.print("x: ");
		int xAxis = scan.nextInt();
		
		System.out.print("y: ");
		int yAxis = scan.nextInt();
		
		// Ber användaren vilken 
		System.out.print("Välj räknesätt: +-/*");
		scan.nextLine();
		String raknesatt = scan.nextLine();
		
		switch (raknesatt) {
		
		case "+":
			AdditionTable tableAdd = new AdditionTable(xAxis, yAxis);
			tableAdd.print();
			break;
		case "-":
			SubtractionTable tableSubtract = new SubtractionTable(xAxis, yAxis);
			tableSubtract.print();
			break;
		case "*":
			MultiplicationTable tableMultiply = new MultiplicationTable(xAxis, yAxis);
			tableMultiply.print();
			break;
		case "/":
			DivisionTable tableDivide = new DivisionTable(xAxis, yAxis);
			tableDivide.print();
			break;
		}
	}
}
