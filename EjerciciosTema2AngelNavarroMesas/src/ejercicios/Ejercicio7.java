package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int horas, minutos, segundos;
		
		//Le pedimos al usuario que introduzca las horas, minutos y segundos y los escaneamos
		System.out.println("Introduzca las horas");
		horas = sc.nextInt();
		System.out.println("Introduzca los minutos");
		minutos = sc.nextInt();
		System.out.println("Introduzca los segundos");
		segundos = sc.nextInt();
		
		//Añadimos un segundo
		segundos++;
		
		//Si los segundos llegan a 60 se añadira un minuto y se reiniciaran los segundos
		if(segundos>=60){
			minutos++;
			segundos-=60;
		}
		//Si los minutos llegan a 60 se añadira una hora y se reiniciaran los minutos
		if(minutos>=60){
			minutos-=60;
			horas++;
		}
		//Si las horas llegan a 24 se reiniciaran las horas
		if(horas>=24){
			horas-=24;
		}
		//Mostramos el resultado
		System.out.println("Son las "+horas+":"+minutos+":"+segundos);
		
		sc.close();
	}

}
