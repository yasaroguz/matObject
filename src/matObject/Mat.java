package matObject;

public class Mat {
	public int sum(int n1,int n2) {
		int result;
		result=n1+n2;
		return result;
		
	}
	public int sub(int n1,int n2) {
		int result;
		result=n1-n2;
		return result;
	}
	public int multiply(int n1,int n2) {
		int result;
		result=n1*n2;
		return result;
	}
	public double divide(int n1,int n2) {
		double result;
		result=n1/n2;
		return result;
	}
	private double pi;
	public Mat() {
		this.pi=3.14785;
		
	}
	public double getpi() {
		return pi;
	}
	public double areaOfCircle(double r) {
		return this.getpi()*r*r;
	}
	//pi*r*r*r*4/3 volumeOfSphere(3)
	public double volumeOfsphere(double r) {
		return this.getpi()*r*r*r*4/3;
	}
	public double areaOfRectangularPrism(double a, double b, double h) {
		return a*b*h;
	}
	public double areaOfTriangle(double a, double b) {
		return a*b/2;
	}
	public double perimeterOfTriangle(double a, double b, double c) {
		return a+b+c;
	}
	public int factoriyel(int f) {
		int result=1;
		for(int i=1;i<=f;i++) {
			result=result*i;
		}
		return result;
	}
	public int sumOfSmallNumbers(int a) {
		int result=0;
		for(int i=1;i<a;i++) {
			result+=i;
		}
		return result;
		
		}
	
	
	}
	
				
		
	
	


