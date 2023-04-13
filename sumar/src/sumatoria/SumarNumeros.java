package sumatoria;

import java.util.Scanner;

public class SumarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		int n2;
		float resultado;
			Scanner tecla =new Scanner(System.in);
			
				System.out.println("Ingrese primer numero:");
				n1=tecla.nextInt();
				System.out.println("Ingrese segundo numero:");
				n2=tecla.nextInt();
				
			resultado= (float)n1 / (float)n2;
			
			System.out.println(resultado);
		
	}

}
