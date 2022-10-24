package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables para este ejercicio,(las d significan digitos)
		int num, d1, d2, d3, d4, mun=0;
		
		//Le pedimos al usuario que introduzca un numero y lo escaneamos
		System.out.println("Introduzca un numero entre el 0 y el 9999");
		num = sc.nextInt();
		
		//Si el numero solo es de una cifra es capicuo automaticamente
		if(num >0&&num<10) {
			mun= num;
			System.out.println(mun);
			
			//Si el numero tiene dos cifras lo dividimos en dos digitos y los ponemos al reves 
			//para poder compararlo con el numero original mas adelante
		}else if(num>9&&num<100) {
			
			//Estos son los calculos para sacar las dos cifras del numero
			d1 = num%10;
			d2 = num%100;
			d1 = d1/1;
			d2 = d2/10;
			
			//Aqui las juntamos de manera que formamos el mismo numero al reves
			mun =(d2*1)+(d1*10);
			System.out.println(mun);
			
			//Aqui hacemos el mismo proceso que anteriormente solo que esta vez el numero es de tres cifras
		}else if(num>99&&num<999) {
			
			//Los calculos son iguales solo que se añade otra variable para la nueva cifra
			d1 = num%10;
			d2 = num%100;
			d3 = num%1000;
			d1 = d1/1;
			d2 = d2/10;
			d3 = d3/100;
			
			//Obviamente hay que añadir la nueva cifra al numero invertido
			mun =(d3*1)+(d2*10)+(d1*100);
			System.out.println(mun);
			
			//Igual que lo anterior solo que añadiendo los calculos para una cifra mas
		}else if(num>999&&num<=9999) {
			d1 = num%10;
			d2 = num%100;
			d3 = num%1000;
			d4 = num%10000;
			
			d1 = d1/1;
			d2 = d2/10;
			d3 = d3/100;
			d4 = d4/1000;
			
			mun = (d4*1)+(d3*10)+(d2*100)+(d1*1000);
			System.out.println(mun);
			
			//en caso de que el usuario haya introducido un numero que no este entre el 0 y el 9999 saltara este mensaje
		}else {
			System.out.println("El numero introducido no es valido, introduzca uno entre 0 y 9999");
		}
		
		//Aqui comparamos el numero original con el invertido para ver si es capicuo y mostramos el resultado
		if(num==mun) {
			System.out.println("El numero introducido es capicuo");
		}else {
			System.out.println("El numero introducido no es capicuo");
		}
		
		sc.close();
		
	}

}
