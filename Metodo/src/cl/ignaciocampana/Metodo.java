package cl.ignaciocampana;

import java.util.Scanner;

public class Metodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ingreso de variable
		int n1;
		int n2;
		int suma;
		int resta;
		
		int resultadosuma;
		
		//scanner
		
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		n1 = ingreso.nextInt();
		System.out.println("Ingrese el segundo numero");
		n2 = ingreso.nextInt();
		ingreso.close();
		resultadosuma =	sumar(n1,n2);
		System.out.println("la suma es " + resultadosuma);
	}

	public static int sumar(int a, int b) {
		int resultado;
		resultado = a+b;
		return resultado;
	}

}
