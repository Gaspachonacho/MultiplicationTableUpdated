package lab4;

import java.util.Scanner;

public abstract class ArithmeticTable {
	int xAxis2;
	int yAxis2;
	public ArithmeticTable(int xAxis, int yAxis) {
		xAxis2 = xAxis;
		yAxis2 = yAxis;
		// TODO Auto-generated constructor stub
	}

	abstract int evaluate(int x, int y);
	
	public void print() {
		
		int width = 0;
		int xAxis = xAxis2;
		int yAxis = yAxis2;
		width = width(xAxis, yAxis);

		//////////////////////////////////////////////////////////////
		
		
		////////////////////////////////////////////////////////////////
		
		System.out.printf("%" + width + "s", "*");
		System.out.print(" |");
		
		for (int x = 0; x <= xAxis; x++) {
			System.out.printf("%" + width + "d", x);
		}
		
		System.out.println("");
		
		
		System.out.printf("%" + width + "s", "-");
		System.out.print("-+");
	
		int amountBindestreck = 0;
		String bindestreck = "";
		
		while (amountBindestreck != width) {
			bindestreck = bindestreck + "-";
			amountBindestreck = String.valueOf(bindestreck).length();
		}
		for (int a = 0; a <= xAxis; a++ ) {
			System.out.printf("%" + width + "s", bindestreck);
		}
		
		System.out.println("");
		//Printar endast ut dem fula linjerna
		
		//////////////////////////////////////////////////////////////////////////////
		
		
		/////////////////////////////////////////////////////////////////////////////
		
		for (int y = 0; y <= xAxis; y++) {
			System.out.printf("%" + width + "d", y);
			System.out.print(" |");
			
			for(int x = 0; x <= xAxis; x++) {
				System.out.printf("%" + width + "d", evaluate(x,y));	
				}
			System.out.println("");
		}
		
		//////////////////////////////////////////////////////////////////////////////
	}
	
	public static int width(int xAxis, int yAxis) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Choose one: | + |&&&| - |&&&| * |&&&| / |");
	String operatorer = scan.nextLine();
	int width = 0;
	
	switch (operatorer) {
	case "+":
		width = String.valueOf(xAxis + yAxis).length() + 1;
		break;
	case "-":
		width = String.valueOf(xAxis - yAxis).length() + 1;
		break;
	case "*":
		width = String.valueOf(xAxis * yAxis).length() + 1;
		break;
	case "/":
		width = String.valueOf(xAxis / yAxis).length() + 1;
		break;
	}
	return width;

	}
	

}
