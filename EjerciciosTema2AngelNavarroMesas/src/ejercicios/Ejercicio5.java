package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos variables
		int num, numAb;
		
		//Pedimos al usuario que introduzca un numero para calcular su absoluto
		System.out.println("Introduzca un numero para averiguar su absoluto");
		num= sc.nextInt();
		
		//En esta ternaria hacemos que si el numero introducido es menor que 0 se haga la operacion (num*-1)
		// y se le de ese valor a la variable numAb y si es un numero mayor que 0 se le de su valor directamente a la variable numAb
		numAb=num<0?num*-1:num;
		
		//Mostramos el resultado
		System.out.println("El absoluto de "+num+" es "+numAb);
		
		sc.close();
	}

}
