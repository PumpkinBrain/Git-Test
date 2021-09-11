package calculator;

public class Calculus {
	Vars var = new Vars();

//first value will be inserted one time, then a while loop will run
//so that the second value and the operation can be input over and over
//then the results will be stored in the first variable so the calculus can continue
//until the user wishes so
	protected void inputs() {
		var.setA(Input.nextInt("Digite o primeiro numero"));
		
		while (var.getC() != '=') {
			var.setc(Input.nextChar("Digite a operacao"));
			var.setB(Input.nextInt("Digite o segundo numero"));
			logic();
		}
	}
	
//check for the operation and execute corresponding calculus
	protected void logic() {
		switch(var.getC()) {
		case '+':
			var.setA(var.getA() + var.getB());
			System.out.println("resultado: " + var.getA());
			break;
		case '-':
			var.setA(var.getA() - var.getB());
			System.out.println("resultado: " + var.getA());
			break;
		case '*':
			var.setA(var.getA() * var.getB());
			System.out.println("resultado: " + var.getA());
			break;
		case '/':
			var.setA(var.getA() / var.getB());
			System.out.println("resultado: " + var.getA());
			break;
		case '^':
			var.setA(var.pow(var.getA(), var.getB()));
			System.out.println("resultado: " + var.getA());
			break;
		}
//when user decides it's over, print the final result
		if(var.getC() == '=') {
			System.out.println("resultado final: " + var.getA());
		}
	}
}
