package OOP.polymophism;

public class Operator {
	public void sum(int a, int b) {
		
	}
	public void sum(double a, double b) {
		
	}
	public void sum(float a, float b) {
		
	}
	public void sum(long a, long b) {
		
	}
	public static void main(String[] args) {
		Operator opr = new Operator();
		
		opr.sum(5, 5);
		opr.sum(55f, 55f);
		opr.sum(5.12, 5.12);
		opr.sum(55.12d, 5.12d);
	}

}
