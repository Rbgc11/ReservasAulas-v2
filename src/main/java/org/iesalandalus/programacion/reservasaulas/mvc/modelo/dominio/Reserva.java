
package org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio;

import java.util.Objects;

public class Reserva {
	//Atributos
	private Profesor profesor;
	private Aula aula;
	private Permanencia permanencia;

	public Reserva(Profesor profesor, Aula aula, Permanencia permanencia) {
		setProfesor(profesor);
		setAula(aula);
		setPermanencia(permanencia);
	}

	//Constructor copia
	public Reserva(Reserva reserva)  {
		if(reserva == null) {
			throw new NullPointerException("ERROR: No se puede copiar una reserva nula.");
		} else {
	       setProfesor(reserva.profesor);
	       setAula(reserva.aula);
	       setPermanencia(reserva.permanencia);
		}
	}

	//Setter y Getters
	private void setProfesor(Profesor profesor)  {
		if (profesor == null) {
			throw new NullPointerException("ERROR: No pueden haber valores nulos");
		} else {
			this.profesor = new Profesor(profesor);
		}
	}

	public Profesor getProfesor() {
		return new Profesor(profesor);
	}

	private void setAula(Aula aula)  {
		if (aula == null) {
			throw new NullPointerException("ERROR: No pueden haber valores nulos");
		} else {
			this.aula = new Aula(aula);
		}
	}

	public Aula getAula() {
		return new Aula(aula);
	}

	//Set de Permanencia
	private void setPermanencia(Permanencia permanencia) {
		if (permanencia == null) {
			throw new NullPointerException("ERROR: No pueden haber valores nulos");
			}
			else if (permanencia instanceof PermanenciaPorTramo) {
				this.permanencia = new PermanenciaPorTramo((PermanenciaPorTramo) permanencia);
			}
			else if (permanencia instanceof PermanenciaPorHora) {
				this.permanencia = new PermanenciaPorHora((PermanenciaPorHora) permanencia);
			}
		}
	
	//Get de Permanencia
		public Permanencia getPermanencia() {
			Permanencia permanenciaC = null;
			if (permanencia instanceof PermanenciaPorTramo) {
				permanenciaC = new PermanenciaPorTramo((PermanenciaPorTramo) permanencia); 
			}
			else if (permanencia instanceof PermanenciaPorHora) {
				permanenciaC = new PermanenciaPorHora((PermanenciaPorHora) permanencia);
			}
			return permanenciaC;
		}

		//Método getReservaFicticia
	public static Reserva getReservaFicticia(Aula aula, Permanencia permanencia) {
		
		Reserva reserva=new Reserva(Profesor.getProfesorFicticio("ruben@gmail.com"),aula,permanencia);
		return new Reserva(reserva);
	}
	//Método getPuntos, recoge los puntos de permanencia y aula
	public float getPuntos() {
		return permanencia.getPuntos() + aula.getPuntos();
	}

	


	@Override
	public int hashCode() {
		return Objects.hash(aula, permanencia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Reserva))
			return false;
		Reserva other = (Reserva) obj;
		return Objects.equals(aula, other.aula) && Objects.equals(permanencia, other.permanencia);
	}

	//Método toString
	@Override
	public String toString() {
		return profesor.toString() + ", " + aula.toString() + ", " + permanencia.toString() + ", puntos=" + String.format("%.1f", getPuntos()) + "";
	}
	
}