package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, d1, d2, d3, d4, mun=0;
		
		System.out.println("Introduzca un numero entre el 0 y el 9999");
		num = sc.nextInt();
		
		
		if(num >0&&num<10) {
			mun= num;
			System.out.println(mun);
		}else if(num>9&&num<100) {
			d1 = num%10;
			d2 = num%100;
			d1 = d1/1;
			d2 = d2/10;
			
			mun =(d2*1)+(d1*10);
			System.out.println(mun);
			
		}else if(num>99&&num<999) {
			d1 = num%10;
			d2 = num%100;
			d3 = num%1000;
			d1 = d1/1;
			d2 = d2/10;
			d3 = d3/100;
			
			mun =(d3*1)+(d2*10)+(d1*100);
			System.out.println(mun);
			
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
			
		}else {
			System.out.println("El numero introducido no es valido, introduzca uno entre 0 y 9999");
		}
		
		
		
		if(num==mun) {
			System.out.println("El numero introducido es capicuo");
		}else {
			System.out.println("El numero introducido no es capicuo");
		}
		
	}

}
