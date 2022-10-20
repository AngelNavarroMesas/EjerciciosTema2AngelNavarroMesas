package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horas, minutos, segundos;
		
		System.out.println("Introduzca las horas");
		horas = sc.nextInt();
		System.out.println("Introduzca los minutos");
		minutos = sc.nextInt();
		System.out.println("Introduzca los segundos");
		segundos = sc.nextInt();
		
		segundos++;
		
		if(segundos==60){
			minutos++;
			segundos=0;
		}
		if(minutos==60){
			minutos=0;
			horas++;
		}
		if(horas==24){
			horas=0;
		}
		
		System.out.println("Son las "+horas+":"+minutos+":"+segundos);
		
		sc.close();
	}

}
