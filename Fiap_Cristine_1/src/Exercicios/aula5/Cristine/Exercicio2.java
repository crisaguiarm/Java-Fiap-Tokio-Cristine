package Exercicios.aula5.Cristine;

public class Exercicio2 {
	public static void main(String[] args) {
		int i;
		float f;
		double d;
		
		i = 2;
		f = 10;
		d = 16.5;
		
		System.out.printf(" i = %d \n f = %.2f \n d = %.2f \n", i, f, d);
		
		String d1 = Double.toString(d);
		String i1 = Integer.toString(i);
		String f1 = Float.toString(f);
		
		System.out.printf(" i = %s \n f = %s \n d = %s", i1, f1, d1);
		
	}
}