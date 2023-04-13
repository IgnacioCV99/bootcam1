package clignaciocampana;

import java.util.Scanner;

public class CalculosMate {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int op = 0;
			do {
				System.out.println("-------------------");
				System.out.println("       MENÚ        ");
				System.out.println("-------------------");
				System.out.println("1-Sumar");
				System.out.println("2-Restar");
				System.out.println("3-Multiplicar");
				System.out.println("4-Dividir");
				System.out.println("5-Salir");
				System.out.println("-------------------");
				System.out.println("Ingrese una opción");
				op = sc.nextInt();
				
				switch (op) {
				
				case 1:
					
					sumar();
					
				case 2:
					restar();
					break;
					
				case 3:
					multiplicar();
					
				case 4:
					dividir();
					
				case 5:
					salir();
					
				default:
				}
					
		}while(op!=5);
	}
			
			static void sumar () {
				System.out.println("sumar");
				System.out.println("Ingrese primer numero");
				float n1 = sc.nextFloat();
				System.out.println("Ingrese segundo numero");
				float n2 = sc.nextFloat();
				float resultado = (n1 + n2);
				
				System.out.printf("Su resultado es %f", resultado);
				
			}
			static void restar () {
				System.out.println("restar");
				System.out.println("Ingrese primer numero");
				float n1 = sc.nextFloat();
				System.out.println("Ingrese segundo numero");
				float n2 = sc.nextFloat();
				float resultado = (n1 - n2);
				
				System.out.printf("Su resultado es %f", resultado);
			}
			static void multiplicar () {
				System.out.println("multiplicar");
				System.out.println("Ingrese primer numero");
				float n1 = sc.nextFloat();
				System.out.println("Ingrese segundo numero");
				float n2 = sc.nextFloat();
				float resultado = (n1 * n2);
				
				System.out.printf("Su resultado es %f", resultado);
			}
			static void dividir () {
				System.out.println("dividir");
				System.out.println("Ingrese primer numero");
				float n1 = sc.nextFloat();
				System.out.println("Ingrese segundo numero");
				float n2 = sc.nextFloat();
				float resultado = (n1 / n2);
				
				System.out.printf("Su resultado es %f", resultado);
			}
			static void salir () {
				System.out.println("Hasta pronto");
				
			}
	}


