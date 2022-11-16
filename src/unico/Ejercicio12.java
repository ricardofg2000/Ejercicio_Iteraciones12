package unico;

import java.util.Scanner;

public class Ejercicio12 {
	

	public static void main(String[] args) {
		/*
		 Pedir 5 calificaciones de alumnos. El programa debe decir, al final, 
		 si hay algún suspenso o no lo hay. Nota: cuidado, si hay 2 suspensos, 
		 no debe decirlo dos veces.
		 */
		
		Scanner leer = new Scanner (System.in);
		
		final int TOPE = 5;
		final double SUSPENDER = 5.0;
		double nota;
		boolean sus = false;
		int n_sus=0;
		String mensaje;
		
		for(int i=1; i<=TOPE; i++) {
			System.out.print("Introduzca la calificación: ");
			nota = Double.parseDouble(leer.nextLine());
			
			if (nota < SUSPENDER) {
				sus = true;
				n_sus += 1;
			}
			
		}
		
		mensaje = (sus == true) ? "Hay " + n_sus + " suspensos" : "No hay suspensos";
		
		System.out.println(mensaje);
	}
}

