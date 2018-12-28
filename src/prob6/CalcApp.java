package prob6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Add add = new Add();
		Div div = new Div();
		Mul mul = new Mul();
		Sub sub = new Sub();
		
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			expression=expression.replaceAll(" ", "");
			
			if(expression.contains("quit")) {
				break;
			}
			else if(expression.contains("+")) {
				add.setValue(Integer.parseInt(expression.substring(0,expression.indexOf("+"))),Integer.parseInt(expression.substring(expression.indexOf("+")+1)));
				System.out.println(add.calculate());
			}else if(expression.contains("-")) {
				sub.setValue(Integer.parseInt(expression.substring(0,expression.indexOf("-"))),Integer.parseInt(expression.substring(expression.indexOf("-")+1)));
				System.out.println(sub.calculate());
			}else if(expression.contains("*")) {
				mul.setValue(Integer.parseInt(expression.substring(0,expression.indexOf("*"))),Integer.parseInt(expression.substring(expression.indexOf("*")+1)));
				System.out.println(mul.calculate());
			}else if(expression.contains("/")) {
				div.setValue(Integer.parseInt(expression.substring(0,expression.indexOf("/"))),Integer.parseInt(expression.substring(expression.indexOf("/")+1)));
				System.out.println(div.calculate());
			}
			
			/*  코드를 완성 합니다 */
			
		}
	}
}
