
package calculator;

public class Calculator {
	public int add(int a,int b){
		int sum = a+b;
		return sum;
	}
	public float sub(int a,int b){
		int sub = a-b;
		return sub;
	}
	public float modulo(int a,int b){
		int mod =a % b;
		return mod;
	}
	
	public float mult(float a,float b){
		float mult = a*b;
		return mult;
	}
	public float div(float a,float b){
		float div = a/b;
		return div;
	}
}