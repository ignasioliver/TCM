package Exercici8;

import Keyboard.*;

public class Exercici8 {
	public static void main(String args[]){
		double m, i, p, n, r, potencia;
		System.out.println("Especifica el preu de la casa");
		System.out.println("-----------------------------");
		p = Keyboard.readDouble();
		System.out.println("Especifica l'interes hipotecari");
		System.out.println("-------------------------------");
		i = Keyboard.readDouble();
		System.out.println("Especifica el numero d'anys");
		System.out.println("---------------------------");
		n = Keyboard.readDouble();
		r = i / (100 * 12);
		potencia = Math.pow((1 + r), -12 * n);
		m = (((80 * p / 100) * r) / (1 - potencia));
		System.out.print("La mensualitat a pagar sera de " + m);	
	}
}