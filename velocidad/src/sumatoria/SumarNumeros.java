package sumatoria;

import java.util.Scanner;

public class SumarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		int n2;
		float velocidad;
		
			Scanner tecla =new Scanner(System.in);
			
				System.out.println("Ingrese distanciaen kilometros:");
				n1=tecla.nextInt();
				System.out.println("Ingrese tiempo en horas:");
				n2=tecla.nextInt();
				
			velocidad= (float)n1 / (float)n2;
			
			if(velocidad >=80) {velocidad = 50;}
			
			System.out.println("la velocidad es " + velocidad + " Km/h");
		
	}

}
