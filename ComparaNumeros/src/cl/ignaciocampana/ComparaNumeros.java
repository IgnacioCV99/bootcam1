package cl.ignaciocampana;

import java.util.Scanner;

public class ComparaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3,t,mayor;
		
		Scanner tecla =new Scanner(System.in);
		
		System.out.println("ingrese el primer numero");
		n1 = tecla.nextInt();
		System.out.println("ingrese el segundo numero");
		n2 = tecla.nextInt();
		System.out.println("ingrese el tercer numero");
		n3 = tecla.nextInt();
		
		if (n1 > n2) {
			t = n1;
		}else{
			t = n2;
		}

		if ( t > n3) {
			mayor =  t;
		}else{
			mayor = n3;
		}

		System.out.print("El mayor es " + mayor);
        }
		
}
	


