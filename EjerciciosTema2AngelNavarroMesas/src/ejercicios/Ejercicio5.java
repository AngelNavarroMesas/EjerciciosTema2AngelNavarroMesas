package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, numAb;
		
		System.out.println("Introduzca un numero para averiguar su absoluto");
		num= sc.nextInt();
		
		numAb=num<0?num*-1:num;
		
		System.out.println("El absoluto de "+num+" es "+numAb);
		
		sc.close();
	}

}
