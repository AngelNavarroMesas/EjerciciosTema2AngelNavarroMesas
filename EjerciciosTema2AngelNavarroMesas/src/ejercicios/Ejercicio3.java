package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int comidaCom, animales, comidaTotal, racion, falta;
		
		//Pedimos al usuario que introduzca la cantidad de comida comprada,
		//los animales y la comida que comerian y escaneamos todos esos datos
		System.out.println("Introduzca la cantidad de comida comprada");
		comidaCom = sc.nextInt();
		System.out.println("Introduzca el numero de animales para alimentar");
		animales = sc.nextInt();
		System.out.println("Introduzca los kg que comerian en total");
		comidaTotal = sc.nextInt();
		
		//en este paso nos aseguramos de que el usuario no ha introdcido ningun cero,
		//asi evitamos hacer divisiones con el
		if(comidaCom==0||animales==0||comidaTotal==0) {
			System.out.println("Intente no introducir el numero 0");
			
			//En caso de que haya los kg de comida necesarios para los animales se le indicara al usuario
		}else if(comidaCom>=comidaTotal) {
			System.out.println("Hay comida para todos los animales");
			
			//En caso de que no haya comida suficiente hacemos los calculos necesarios y le mostramos los resultados al usuario
		}else {
			racion=comidaTotal/animales;
			falta=comidaTotal-comidaCom;
			
			System.out.println("Faltan "+falta+"Kg de comida, a cada animal le corresponden "+racion+"Kg");
		}
		
		
		
		sc.close();
	}

}
