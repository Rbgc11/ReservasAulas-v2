package org.iesalandalus.programacion.reservasaulas.mvc.controlador;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reservasaulas.mvc.modelo.Modelo;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Aula;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Permanencia;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Profesor;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Reserva;
import org.iesalandalus.programacion.reservasaulas.mvc.vista.Vista;

public class Controlador {

	 private Modelo modelo;
	 private Vista vista;

	public Controlador(Modelo modelo, Vista vista) 
	{
		if (modelo == null) {
			throw new IllegalArgumentException(" El modelo no puede ser nulo.");
		}
		
		if (vista == null) {
			throw new IllegalArgumentException(" La vista no puede ser nula.");
		}
		
		this.modelo = modelo;
		this.vista = vista;
		this.vista.setControlador(this);
	}

	// Método comenzar
		public void comenzar()  {
			vista.comenzar();
		}

		// Método terminar
		public void terminar() {
			vista.salir();
		}

		// Método insertarAula
		public void insertarAula(Aula aula) throws OperationNotSupportedException {
			modelo.insertarAula(aula);
		}
		
		// Método insertarProfesor
		public void insertarProfesor(Profesor profesor) throws OperationNotSupportedException {
			modelo.insertarProfesor(profesor);
		}
		
		// Método borrarAula
		public void borrarAula(Aula aula) throws OperationNotSupportedException {
			modelo.borrarAula(aula);
		}
		
		// Método borrarProfesor
		public void borrarProfesor(Profesor profesor) throws OperationNotSupportedException {
			modelo.borrarProfesor(profesor);
		}
		
		// Método buscarAula
		public Aula buscarAula(Aula aula) {
			return modelo.buscarAula(aula);
		}
		
		// Método buscarProfesor
		public Profesor buscarProfesor(Profesor profesor) {
			return modelo.buscarProfesor(profesor);
		}

		// Método representarAulas
		public List<String> representarAulas() {
			return modelo.representarAulas();
		}

		// Método representarProfesores
		public List<String> representarProfesores() {
			return modelo.representarProfesores();
		}

		// Método representarReservas
		public List<String>representarReservas() {
			return modelo.representarReservas();
		}
		
		// Método realizarReservas
		public void realizarReserva(Reserva reserva) throws OperationNotSupportedException {
			modelo.realizarReserva(reserva);
		}

		// Método anularReservas
		public void anularReserva(Reserva reserva) throws OperationNotSupportedException {
			modelo.anularReserva(reserva);

		}

		// Método getReservasProfesor(Profesor)
		public List<Reserva> getReservasProfesor(Profesor profesor) {
			return modelo.getReservasProfesor(profesor);
		}

		// Método getReservasAula(Aula)
		public List<Reserva> getReservasAula(Aula aula) {
			return modelo.getReservasAula(aula);
		}

		// Método getReservasPermanencia(Permanencia)
		public List<Reserva> getReservasPermanencia(Permanencia permanencia) {
			return modelo.getReservasPermanencia(permanencia);
		}

		// Método consultarDisponibilidad(Aula,Permanencia)
		public boolean consultarDisponibilidad(Aula aula, Permanencia permanencia) {
			return modelo.consultarDisponibilidad(aula, permanencia);
		}
	}