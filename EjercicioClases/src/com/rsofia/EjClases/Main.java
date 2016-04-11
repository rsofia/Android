package com.rsofia.EjClases;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado1 = new Empleado(12, 25, "Pedro", "Programador", 500f);
		empleado1.Imprimir();
		Empleado.SetSalario(300);
		empleado1.Imprimir(); 
		empleado1.SetNombre("Ignacio");
		empleado1.SetTiempo(34);
		
		Empleado empleado2 = new Empleado();
		empleado2.Imprimir();
		empleado1.Imprimir();
	}

}
