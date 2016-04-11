package com.rsofia.EjClases;

public class Empleado {

		/*7. Crea una clase Empleado. La clase contendrá
		 *  un atributo estático o atributo de clase.*/
	private int tiempoEnEmpresa;
	private int edad;
	private String nombre;
	private String puesto;
	public static float salario = 300; 
	
	//constructor para inicializar todo en 0
	Empleado()
	{
		tiempoEnEmpresa = 0;
		edad = 0;
		nombre = "";
		puesto = "";
		//salario = 0.0f;
	}
	
	Empleado(int _tiempo, int _edad, String _nombre, String _puesto, float _salario)
	{
		tiempoEnEmpresa = _tiempo;
		edad = _edad;
		nombre = _nombre;
		puesto = _puesto;
		salario = _salario;
	}
	
	//funciones set y get
	int GetEdad(){return this.edad;}
	int GetTiempo(){return tiempoEnEmpresa;}
	String GetNombre(){return this.nombre;}
	String GetPuesto(){return this.puesto;}
	public static float GetSalario(){ return salario;}

	void SetEdad(int _edad){ this.edad = _edad;}
	void SetNombre(String _nom){this.nombre = _nom;}
	void SetPuesto(String _puesto){this.puesto = _puesto;}
	void SetTiempo(int _tiempo){this.tiempoEnEmpresa = _tiempo;}
	
	public static void SetSalario(float _sal){salario = _sal;}

	
	void Imprimir()
	{
		System.out.println("Nombre: " + nombre);
		System.out.println("Tiempo: " + tiempoEnEmpresa);
		System.out.println("Edad: " + edad);
		System.out.println("Puesto: " + puesto);
		System.out.println("Salario: " + salario);
	}
}
