package ua.lviv.lgs.interface2;

public class Application {

	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		
		calc.a = 20;
		calc.b = 3.7;
		
		MyCalculator.Result(calc.plus());
		MyCalculator.Result(calc.minus());
		MyCalculator.Result(calc.multiply());
		MyCalculator.Result(calc.devide());

		System.out.println();
		
		MyCalculator calc2 = new MyCalculator(4.15, 3.9);
		
		MyCalculator.Result(calc2.plus());
		MyCalculator.Result(calc2.minus());
		MyCalculator.Result(calc2.multiply());
		MyCalculator.Result(calc2.devide());
		
	}
	
}