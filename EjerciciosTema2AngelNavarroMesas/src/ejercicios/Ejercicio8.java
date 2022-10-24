package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		double distancia, dias, precio;
		
		
		//Le pedimos al usuario que introduzca la distancia y los dias que desea quedarse y escaneamos los datos
		System.out.println("introduzca la distancia que desea recorrer");
		distancia = sc.nextDouble();
		System.out.println("Introduzca la cantidad de dias que desea quedarse");
		dias = sc.nextDouble();
		
		//Calculamos el precio basado en la distancia a recorrer
		precio = 2.5*distancia;
		
		//Si la distancia es mayor a los 800Km y la estancia es superior a los 7 dias se le aplica el descuento del 30%
		if(distancia>800&&dias>7){
			precio = precio-(precio*0.3);
			
			//Mostramos el precio final añadiendo el descuento
			System.out.println("Usted debe pagar: "+precio+"€ (30% de descuento)");
			
			//En caso de no cumplir una de las especificaciones anteriores no se aplicaria el descuento
		}else {
			//Mostramos el precio final sin descuento
			System.out.println("Usted debe pagar: "+precio+"€");
		}
		
		sc.close();
	}

}
