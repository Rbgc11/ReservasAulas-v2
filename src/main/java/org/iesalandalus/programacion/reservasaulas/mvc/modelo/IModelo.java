package org.iesalandalus.programacion.reservasaulas.mvc.modelo;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Aula;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Permanencia;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Profesor;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Reserva;

public interface IModelo {

	//Método getAulas
	List<Aula> getAulas(Aula aula);


	//Método getNumAulas
	int getNumAulas();

	//Método representarAulas
	List<String> representarAulas();

	//Método buscarAula
	Aula buscarAula(Aula aula);

	//Método insertarAula 
	void insertarAula(Aula aula) throws OperationNotSupportedException;

	//Método borrarAula 
	void borrarAula(Aula aula) throws OperationNotSupportedException;
	
	//Método getProfesores
	List<Profesor> getProfesores(Profesor profesor);

	//Método getNumProfesores
	int getNumProfesores();

	//Método representarProfesores
	List<String> representarProfesores();

	//Método buscarProfesor
	Profesor buscarProfesor(Profesor profesor);

	//Método insertarProfesor 
	void insertarProfesor(Profesor profesor) throws OperationNotSupportedException;

	//Método borrarProfesor
	void borrarProfesor(Profesor profesor) throws OperationNotSupportedException;

	List<Reserva> getReservas(Reserva reserva);
	
	//Método getReservas
	int getNumReservas();

	//Método representarReservas
	List<String> representarReservas();

	// Método buscarReserva
	Reserva buscarReserva(Reserva reserva);

	// Método realizarReserva
	void realizarReserva(Reserva reserva) throws OperationNotSupportedException;

	// Método anularReserva
	void anularReserva(Reserva reserva) throws OperationNotSupportedException;

		//Método getReservasAula
	List<Reserva> getReservasAula(Aula aula);

	//Método getReservasProfesor
	List<Reserva> getReservasProfesor(Profesor profesor);

	//Método getReservasPermanencia
	List<Reserva> getReservasPermanencia(Permanencia permanencia);

	//Método consultarDisponibilidad
	boolean consultarDisponibilidad(Aula aula, Permanencia permanencia);


}