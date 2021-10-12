package matObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mat mat=new Mat();
		System.out.println(mat.sum(5,13));
		System.out.println(mat.sub(5, 13));
		System.out.println(mat.multiply(5, 13));
		System.out.println(mat.divide(20,5));
		System.out.println(mat.getpi());
		System.out.println(mat.areaOfCircle(4));
		System.out.println(mat.volumeOfsphere(3));
		System.out.println(mat.areaOfRectangularPrism(3, 4, 5));
		System.out.println(mat.areaOfTriangle(2, 3));
		System.out.println(mat.perimeterOfTriangle(3, 4, 5));
		System.out.println(mat.factoriyel(5));
		System.out.println(mat.sumOfSmallNumbers(6));

	}

}
