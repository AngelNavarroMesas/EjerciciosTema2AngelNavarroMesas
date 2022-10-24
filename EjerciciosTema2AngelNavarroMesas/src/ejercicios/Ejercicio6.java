package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int num1, num2, suma;
		
		//Damos un valor aleatorio entre 0 y 99 a estas dos variables
		num1 = (int) (Math.random()*99);
		num2 = (int) (Math.random()*99);
		
		//Le mostramos ese valor aleatorio al usuario, le pedimos que sume los dos numeros y escaneamos el resultado introducido
		System.out.println("La suma de "+num1+"+"+num2+" es:");
		suma = sc.nextInt();
		
		//Si el resultado introducido por el usuario es correcto se le mostrara un mensaje indicandoselo 
		if(suma == num1+num2) {
			System.out.println("Correcto");
			//Si el resultado introducido por el usuario es incorrecto se le indicara cual es el resultado correcto mediante un mensaje
		}else {
			System.out.println("Incorrecto, el verdadero resultado es "+suma);
		}
		
		sc.close();
	}

}
