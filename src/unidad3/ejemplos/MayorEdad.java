package unidad3.ejemplos;

import java.util.Scanner;

public class MayorEdad {

	public static void main(String[] args) {

		int edad;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca su edad. Gracias");

		edad = entrada.nextInt();

		if (edad > 18) 
		{
			System.out.println("Es mayor de edad");
			
		}else if(edad==17) {
			System.out.println("Estás a punto de cumplir los 18");
		}
		else 
		{
			System.out.println("Tendrás que esperar!!");
		}

		
		System.out.println("Gracias por usar el programa");

	}

}
