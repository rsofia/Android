package com.rsofia.CalcularAreas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area {

	public static void main(String[] args)  throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		/*1) Crea una aplicación que nos calcule el área de un circulo,
		 *  cuadrado o triangulo. Pediremos que figura queremos calcular 
		 *  su área y según lo introducido pedirá los valores necesarios
		 *   para calcular el área. 
		 */
		InputStreamReader hey = new InputStreamReader(System.in);
		BufferedReader recInput = new BufferedReader(hey);
		
		int figura = 0;
		System.out.println("Calcular el area de:\n\t1. Circulo\n\t2. Cuadrado\n\t3. Triangulo\n");
		figura = Integer.parseInt(recInput.readLine());
		
		switch(figura)
		{
		case 1: 			
			AreaCirculo();
			break;
		case 2: AreaCuadrado();
			break;
		case 3: AreaTriangulo();
			break;
		default:System.out.println("Opcion incorrecta.");
			break;
		}
		
	}
	
	public static void AreaCuadrado() throws NumberFormatException, IOException
	{
		InputStreamReader hey = new InputStreamReader(System.in);
		BufferedReader recInput = new BufferedReader(hey);
		
		float lado = 0.0f;
		System.out.println("Ingresa el valor de un lado: ");
		lado = Float.parseFloat(recInput.readLine());
		System.out.print("Area del Cuadrado con L = " + lado + " es " + lado*lado);
	}
	
	public static void AreaCirculo() throws NumberFormatException, IOException
	{
		InputStreamReader hey = new InputStreamReader(System.in);
		BufferedReader recInput = new BufferedReader(hey);
		
		float radio = 0.0f;
		System.out.println("Ingresa el radio del circulo: ");
		radio = Float.parseFloat(recInput.readLine());
		float resultado = 3.14159f * radio * radio;
		System.out.print("Area del Circulo con radio = " + radio + " es " + resultado );
	}
	
	public static void AreaTriangulo() throws NumberFormatException, IOException
	{
		InputStreamReader hey = new InputStreamReader(System.in);
		BufferedReader recInput = new BufferedReader(hey);
		
		float base = 0.0f;
		float altura = 0.0f;
		float res = 0.0f;
		System.out.println("Ingresa la base del triangulo: ");
		base = Float.parseFloat(recInput.readLine());
		System.out.println("Ingresa la altura del triangulo: ");
		altura = Float.parseFloat(recInput.readLine());
		res = (base * altura)/2;
		System.out.println("El area del triangulo con base = "+base + " y altura = " +altura+" es: " + res);
		
		
	}

}
