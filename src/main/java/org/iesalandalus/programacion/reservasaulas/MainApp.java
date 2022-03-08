package org.iesalandalus.programacion.reservasaulas;

import org.iesalandalus.programacion.reservasaulas.mvc.controlador.Controlador;
import org.iesalandalus.programacion.reservasaulas.mvc.controlador.IControlador;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.IModelo;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.Modelo;
import org.iesalandalus.programacion.reservasaulas.mvc.vista.IVista;
import org.iesalandalus.programacion.reservasaulas.mvc.vista.Vista;

public class MainApp {

	public static void main(String[] args)  {
		System.out.println("Programa para la gestión de reservas de espacios del IES Al-Ándalus");
		IModelo modelo=new Modelo();
		IVista vista=new Vista();
		IControlador controlador=new Controlador(modelo,vista);
			
		controlador.comenzar();	
	}

} 
