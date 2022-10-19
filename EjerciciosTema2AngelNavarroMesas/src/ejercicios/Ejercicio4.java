package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, d1, d2;
		String letras1 = null, letras2 = null;
		
		System.out.println("Introduzca un numero entre el 1 y el 99");
		num = sc.nextInt();
		
		
		if(num<1||num>99) {
			System.out.println("El numero introducido debe estar entre 1 y 99");
		}else if(num<10) {
			switch (num) {
			case 1-> letras1 ="uno";
			case 2-> letras1 ="dos";
			case 3-> letras1 ="tres";
			case 4-> letras1 ="cuatro";
			case 5-> letras1 ="cinco";
			case 6-> letras1 ="seis";
			case 7-> letras1 ="siete";
			case 8-> letras1 ="ocho";
			case 9-> letras1 ="nueve";
			}
			
			System.out.println(letras1);
			
		}else if(num>9&&num<16) {
			switch (num) {
			case 10-> letras1 ="diez";
			case 11-> letras1 ="once";
			case 12-> letras1 ="doce";
			case 13-> letras1 ="trece";
			case 14-> letras1 ="catorce";
			case 15-> letras1 ="quince";
			}
			
			System.out.println(letras1);
			
		}else {
			
			d1 = num%100;
			d2 = num%10;
			d1 = d1/10;
			d2 = d2/1;
			
			switch (d1) {
			case 1-> letras1 ="diez";
			case 2-> letras1 ="veinte";
			case 3-> letras1 ="treinta";
			case 4-> letras1 ="cuarenta";
			case 5-> letras1 ="cincuenta";
			case 6-> letras1 ="sesenta";
			case 7-> letras1 ="setenta";
			case 8-> letras1 ="ochenta";
			case 9-> letras1 ="noventa";
			}
			switch (d2) {
			case 1-> letras2 ="uno";
			case 2-> letras2 ="dos";
			case 3-> letras2 ="tres";
			case 4-> letras2 ="cuatro";
			case 5-> letras2 ="cinco";
			case 6-> letras2 ="seis";
			case 7-> letras2 ="siete";
			case 8-> letras2 ="ocho";
			case 9-> letras2 ="nueve";
			}
			
			System.out.println(letras1+" y "+letras2);
			
		}
			
		
		sc.close();
	}

}
