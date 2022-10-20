package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double distancia, dias, precio;
		
		System.out.println("introduzca la distancia que desea recorrer");
		distancia = sc.nextDouble();
		System.out.println("Introduzca la cantidad de dias que desea quedarse");
		dias = sc.nextDouble();
		
		precio = 2.5*distancia;
		
		if(distancia>800&&dias>7){
			precio = precio-(precio*0.3);
			System.out.println("Usted debe pagar: "+precio+"€ (30% de descuento)");
		}else {
			System.out.println("Usted debe pagar: "+precio+"€");
		}
		
		sc.close();
	}

}
