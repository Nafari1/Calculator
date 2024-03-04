package lab.jfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Calculation {
	
	public float calculate(float num1, float num2, String operator)
	{
		switch(operator)
		{
		case "+":
			return num1+num2;
		case "-":
			return num1-num2;
		case "x":
			return num1*num2;
		case "/":
			if(num2==0)
				return 0;
			return num1/num2;
		case "V":
			return num1=(float) Math.sqrt(num2);
		case "^":
			return num1=(float) Math.pow(num1, num2);
		case"%":
			return num1%num2;
		case"1/x":
			return 1/num1;
		default:
			return 0;
		
		
		
		
		}
	}
	private float sqrt(float num1) {
		// TODO Auto-generated method stub
		return 0;
	}
	private float pow(float num1, float num2) {
		// TODO Auto-generated method stub
		return 0;
	}
	private float sqrt(float num1, float num2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}