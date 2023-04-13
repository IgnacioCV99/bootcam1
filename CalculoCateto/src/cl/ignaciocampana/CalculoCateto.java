package cl.ignaciocampana;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoCateto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float cateto1 = 0;
		float cateto2 =0;
		float hipotenusa = 0;
		boolean continua;
		
		Scanner tecla =new Scanner(System.in);
		do {
			continua = false;
			do {
				try {
				System.out.println("Ingrese un cateto:");
				cateto1=tecla.nextFloat();
				if(cateto1 <= 0) {
					System.out.println("dato invalido");
				}}
				catch (InputMismatchException ex) {
					System.out.printf("Debe ingresar un numero ");
					tecla.next();
					continua = true;
				}}
			while(cateto1 <= 0);
			
	
		
		do {
			try {
				
			System.out.println("Ingrese la hipotenusa:");
			hipotenusa=tecla.nextFloat();
			if(hipotenusa <= cateto1) {
			System.out.println("dato invalido");
			}
				}catch (InputMismatchException ex) {
			System.out.printf("Debe ingresar un numero ");
			tecla.next();
			continua = true;
			}
			}	
		while(hipotenusa <= cateto1);
	
		cateto2 = (float) Math.sqrt((Math.pow(hipotenusa, 2) - Math.pow(cateto1, 2)));
		
		System.out.printf("El cateto es %.2f " , cateto2);
		}while(continua);
	tecla.close();
	}}

