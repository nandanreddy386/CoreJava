package com.example1;

public class Areas {
//	double add(double a,double b)
//	{
//		return a+b;
//	}
//	double sub(double a,double b)
//	{
//		return a-b;
//		
//	}
//	double mult(double a,double b)
//	{
//		return a *b;
//	}
//	double div(double a,double b)
//	{
//		return a/b;
//	}
	
	double areaCircle(double a)
	{
		return Math.PI * a * a;
	}
	double volumeCircle(double a)
	{
		return 4/3 * Math.PI * a * a* a;
	}
	double Perimeter(double a)
	{
		return 2*Math.PI * a;
	}

	public static void main(String[] args) {
		Areas obj = new Areas();
//		System.out.println(obj.add(200,300));
//		System.out.println(obj.sub(200,100));
//		System.out.println(obj.mult(200, 300));
//		System.out.println(obj.div(200, 10));
		System.out.printf("area of a circle %.2f",obj.areaCircle(3000.233));
		System.out.println();
		System.out.println(obj.volumeCircle(300));
		System.out.println(obj.Perimeter(13.33));

	}

}
