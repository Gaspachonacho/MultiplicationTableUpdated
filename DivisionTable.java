package lab4;

import java.util.Scanner;

public class DivisionTable extends ArithmeticTable{
	
	private int xAxis2 = 0;
	private int yAxis2 = 0;
	public DivisionTable(int xAxis, int yAxis) {
		super(xAxis,yAxis);
		xAxis2 = xAxis;
		yAxis2 = yAxis;
	}

	@Override
	int evaluate(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;	
	}	
}