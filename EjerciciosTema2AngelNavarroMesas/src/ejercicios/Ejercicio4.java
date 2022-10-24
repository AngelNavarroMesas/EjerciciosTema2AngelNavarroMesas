package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int num, d1, d2;
		String letras1 = null, letras2 = null;
		
		//Le pedimos al usuario que introduzca un numero entre el 1 y el 99
		System.out.println("Introduzca un numero entre el 1 y el 99");
		num = sc.nextInt();
		
		//En caso de que el numero no este en el rango solicitado se le indicara al usuario
		if(num<1||num>99) {
			System.out.println("El numero introducido debe estar entre 1 y 99");
			
			//En el caso de que el numero sea menor que 10 se usara en un switch para darle un valor a la variable letras1
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
			
			//Mostramos al usuario el resultado
			System.out.println(letras1);
			
			//En caso de que el numero sea un numero especial(10-15) se usara un switch para darle un valor a la variable letras1
		}else if(num>9&&num<16) {
			switch (num) {
			case 10-> letras1 ="diez";
			case 11-> letras1 ="once";
			case 12-> letras1 ="doce";
			case 13-> letras1 ="trece";
			case 14-> letras1 ="catorce";
			case 15-> letras1 ="quince";
			}
			//Mostramos al usuario el resultado
			System.out.println(letras1);
			
			//Para el resto de numeros dividiremos el numero en dos digitos como en el ejercicio1
		}else {
			
			//Calculos para dividir el numero en dos digitos
			d1 = num%100;
			d2 = num%10;
			d1 = d1/10;
			d2 = d2/1;
			
			//Este switch le da un valor a letras1 dependiendo del primer digito del numero
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
			//Este switch le da un valor a letras2 dependiendo del segundo digito del numero
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
			
			//Mostramos el resultado
			System.out.println(letras1+" y "+letras2);
			
		}
		
		
		sc.close();
	}

}
