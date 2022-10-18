package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dni, calculoletra;
		String letra = null;
		
		System.out.println("Introduzca los numeros de su dni");
		dni = sc.nextInt();
		
		calculoletra = dni%23;
		
		switch(calculoletra) {
		case 0-> letra="T";
		case 1-> letra="R";
		case 2-> letra="W";
		case 3-> letra="A";
		case 4-> letra="G";
		case 5-> letra="M";
		case 6-> letra="Y";
		case 7-> letra="F";
		case 8-> letra="P";
		case 9-> letra="D";
		case 10-> letra="X";
		case 11-> letra="B";
		case 12-> letra="N";
		case 13-> letra="J";
		case 14-> letra="Z";
		case 15-> letra="S";
		case 16-> letra="Q";
		case 17-> letra="V";
		case 18-> letra="H";
		case 19-> letra="L";
		case 20-> letra="C";
		case 21-> letra="K";
		case 22-> letra="E";
		}
		
		System.out.println("Su DNI es: "+dni+letra);
		
	}

}
