package Exercici1;

import Keyboard.*;

public class Exercici1 {
	public static void main (String args[]){
		int a, b, c; 
		boolean bol;
		System.out.println("******Entrada dels valors******");
		System.out.println("*******************************");
		System.out.println("Entra el primer valor:");
		a = Keyboard.readInt();
		System.out.println("Entra el segon valor:");
		b = Keyboard.readInt();
		System.out.println("Entra el tercer valor:");
		c = Keyboard.readInt();
		System.out.println("******  Calcul de les expressions amb els valors: a=" + a + " i b=" + b + " i c =" + c + " ******");
		System.out.println("-----------------------------------------------------------------------------------------------");
		bol = a > 3;
		System.out.println("Resultat de: a > 3 es: " + bol);
		
		bol = a > c;
		System.out.println("Resultat de: a > c es: " + bol);
		
		bol = b != c;
		System.out.println("Resultat de: b != c es: " + bol);
		
		bol = a == 3;
		System.out.println("Resultat de: a == 3 es: " + bol);
		
		bol = a * b == 15;
		System.out.println("Resultat de: a * b == 15 es: " + bol);
		
		bol = c / b < a;
		System.out.println("Resultat de: c / b < a es: " + bol);
		
		bol = c / b == -10;
		System.out.println("Resultat de: c / b == -10 es: " + bol);
		
		bol = a + b + c == 5;
		System.out.println("Resultat de: a + b + c == 5 es: " + bol);
		
		bol = (a + b == 8) && (a - b == 2);
		System.out.println("Resultat de: (a + b == 8) && (a - b == 2) es: " + bol);
		
		bol = (a + b == 8) && (a - b == 6);
		System.out.println("Resultat de: (a + b == 8) && (a - b == 6) es: " + bol);
		
		bol = a > 3 && b > 3 && c < 3;
		System.out.println("Resultat de: a > 3 && b > 3 && c < 3 es: " + bol);
	}
}