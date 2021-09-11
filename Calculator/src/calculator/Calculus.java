package calculator;

public class Calculus {
	Vars var = new Vars();
	
	protected void inputs() {
		var.setA(Input.nextInt("Digite o primeiro numero"));
		var.setB(Input.nextInt("digite o segundo numero"));
		var.setc(Input.nextChar("Digite a operacao"));
	}
	
	protected void logic() {
		switch(var.getC()) {
		case '+':
				var.setA(var.getA() + var.getB());
				System.out.println(var.getA());
			break;
		case '-':
			var.setA(var.getA() - var.getB());
			System.out.println(var.getA());
			break;
		case '*':
			var.setA(var.getA() * var.getB());
			System.out.println(var.getA());
			break;
		case '/':
			var.setA(var.getA() / var.getB());
			System.out.println(var.getA());
			break;
		}
	}
}
