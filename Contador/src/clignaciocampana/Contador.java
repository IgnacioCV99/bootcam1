package clignaciocampana;

import java.util.Scanner;

import java.util.concurrent.TimeUnit; 

public class Contador {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		
			Scanner tecla = new Scanner(System.in);
			System.out.printf("Ingresa un número");
			int n = tecla.nextInt();
			while (n > 0) { 
			System.out.printf("%d\n",n);
			n--; 
			try {
			TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
}
