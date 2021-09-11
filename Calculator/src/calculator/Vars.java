package calculator;

public class Vars {
	
	private int a, b;
	private char c;
	
//pow method
	protected int pow(int x, int y) {
		if(y == 0) {
			return 1;
		}
		return x * pow(x, y - 1);
	}

//getters and setters
	protected int getA() {
		return a;
	}
	protected void setA(int num) {
		this.a = num;
	}
	
	protected int getB() {
		return b;
	}
	protected void setB(int num) {
		this.b = num;
	}
	
	protected char getC() {
		return c;
	}
	protected void setc(char cara) {
		this.c = cara;
	}
}
