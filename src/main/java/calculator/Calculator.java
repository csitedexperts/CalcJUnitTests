
package calculator;

public class Calculator {
	public double add(double a,double b){
		double sum;
		sum=a+b;
		System.out.println("sum = " + sum);
		return sum;
	}
	public double sub(double a,double b){
		double sub;
		sub=a-b;
		return sub;
	}
	public double mult(double a,double b){
		double mult;
		mult=a*b;
		return mult;
	}
	public double div(double a,double b){
		double div;
		div=a/b;
		return div;
	}
}