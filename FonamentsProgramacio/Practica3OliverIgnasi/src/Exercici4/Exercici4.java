package Exercici4;

import Keyboard.*;
//L'esquema detallat usat es troba al codi font en paper per tal que aquest sigui mes comprensible
public class Exercici4 {
	public static void main (String args[]){
		int any, mes, dia, valor, residu = 0, numerosort = 0;
		System.out.println("Especifica l'any en que vas neixer en format 4 xifres");
		any = Keyboard.readInt();
		//No puc utilitzar l'estructura do while ja que el text canvia segons si es el primer cop o no
		while (any > 2016){
			System.out.println("Siusplau introdueix un any valid");
			any = Keyboard.readInt();
		}
		System.out.println("Especifica el mes en que vas neixer [1, 12]");
		mes = Keyboard.readInt();
		while (mes < 1 || mes > 12){
			System.out.println("Siusplau introdueix un mes valid [1, 12]");
			mes = Keyboard.readInt();

		}
		System.out.println("Especifica el dia en que vas neixer [1, 31]");
		dia = Keyboard.readInt();
		while (dia < 1 || dia > 31){
			System.out.println("Siusplau introdueix un dia valid [1, 31]");
			dia = Keyboard.readInt();
		}
		//Sumo tot el que tenim fins ara
		valor = any + mes + dia;
		while (valor > 9){
			numerosort = 0;
			while (valor > 0){
				residu = valor % 10;
				numerosort = numerosort + residu;
				valor = valor / 10;
			}
			valor = numerosort;
		} System.out.println("El numero de la sort de la data " + dia + "-" + mes + "-" + any + " es: " + numerosort);
	}
}