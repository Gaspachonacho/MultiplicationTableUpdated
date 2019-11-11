package lab4;

import java.util.Scanner;

public class SubtractionTable extends ArithmeticTable{
	
	private int xAxis2 = 0;
	private int yAxis2 = 0;
	private String raknesatt2;
	public SubtractionTable(int xAxis, int yAxis, String raknesatt) {
		super(xAxis,yAxis, raknesatt);
		xAxis2 = xAxis;
		yAxis2 = yAxis;
		raknesatt2 = raknesatt;
	}

	@Override
	int evaluate(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;	
	}	
}