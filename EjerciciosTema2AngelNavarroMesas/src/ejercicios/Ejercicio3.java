package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int comidaCom, animales, comidaTotal, racion, falta;
		
		System.out.println("Introduzca la cantidad de comida comprada");
		comidaCom = sc.nextInt();
		System.out.println("Introduzca el numero de animales para alimentar");
		animales = sc.nextInt();
		System.out.println("Introduzca los kg que comerian en total");
		comidaTotal = sc.nextInt();
		
		
		if(comidaCom==0||animales==0||comidaTotal==0) {
			System.out.println("Intente no introducir el numero 0");
			
		}else if(comidaCom>=comidaTotal) {
			System.out.println("Hay comida para todos los animales");
			
		}else {
			racion=comidaTotal/animales;
			falta=comidaTotal-comidaCom;
			
			System.out.println("Faltan "+falta+"Kg de comida, a cada animal le corresponden "+racion+"Kg");
		}
		
		
		
		sc.close();
	}

}
