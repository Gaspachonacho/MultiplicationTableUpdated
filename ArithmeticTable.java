package lab4;

import java.util.Scanner;

public abstract class ArithmeticTable extends Main{
	String raknesatt2;
	int xAxis2;
	int yAxis2;
	public ArithmeticTable(int xAxis, int yAxis, String raknesatt) {
		xAxis2 = xAxis;
		yAxis2 = yAxis;
		raknesatt2 = raknesatt;
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
		System.out.printf("%" + width + "s", raknesatt2);
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
		
		for (int y = 0; y <= yAxis; y++) {
			System.out.printf("%" + width + "d", y);
			System.out.print(" |");
			
			for(int x = 0; x <= xAxis; x++) {
				if (raknesatt2.equals("/") && y == 0) {
					System.out.printf("%" + width + "s", "-");
				}else {
				System.out.printf("%" + width + "d", evaluate(x,y));
				}
				}
			System.out.println("");
		}
		//////////////////////////////////////////////////////////////////////////////
		
		
	}
	
	public int width(int xAxis, int yAxis) {
		
	int width = 0;
	
	switch (raknesatt2) {
	case "+":
		width = String.valueOf(xAxis + yAxis).length() + 1;
		break;
	case "-":
		width = String.valueOf(xAxis - yAxis).length() + 2;
		break;
	case "*":
		width = String.valueOf(xAxis * yAxis).length() + 1;
		break;
	case "/":
		width = String.valueOf(xAxis).length() + 1;
		break;
	}
	return width;

	}
	

}
