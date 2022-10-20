package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, suma;
		
		num1 = (int) (Math.random()*99);
		num2 = (int) (Math.random()*99);
		
		
		System.out.println("La suma de "+num1+"+"+num2+" es:");
		suma = sc.nextInt();
		
		if(suma == num1+num2) {
			System.out.println("Correcto");
		}else {
			System.out.println("Incorrecto");
		}
		
		sc.close();
	}

}
