package Exercici5;

import Keyboard.*;

public class Exercici5 {
	public static void main(String args[]){
		double edatp1, edatp2, edatp3, edatp4, mitjana;
		System.out.println("Especifica l'edat de les 4 persones");
		System.out.println("-----------------------------------");
		System.out.print("Persona 1 - Quants anys té? ");
		edatp1 = Keyboard.readDouble();
		System.out.print("Persona 2 - Quants anys té? ");
		edatp2 = Keyboard.readDouble();
		System.out.print("Persona 3 - Quants anys té? ");
		edatp3 = Keyboard.readDouble();
		System.out.print("Persona 4 - Quants anys té? ");
		edatp4 = Keyboard.readDouble();
		mitjana = (edatp1 + edatp2 + edatp3 + edatp4) / 4;
		System.out.println();
		System.out.print("Edat mitjana és: " + mitjana);
	}
}