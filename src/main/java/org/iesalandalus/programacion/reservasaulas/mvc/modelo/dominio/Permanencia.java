package org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Permanencia {
	private LocalDate dia;
    protected static final DateTimeFormatter FORMATO_DIA = DateTimeFormatter.ofPattern("dd/MM/yyyy");


	public Permanencia(LocalDate dia) {
		setDia(dia);
	}

    public Permanencia(Permanencia permanencia){        
        if(permanencia==null){       
            throw new NullPointerException("No se puede copiar una permanencia nula.");                
        }else{          
        	setDia(permanencia.getDia());
        }
    }

	public LocalDate getDia() {
		return dia;

	}

	private void setDia(LocalDate dia)  {
		if(dia==null) {
			throw new NullPointerException("El día de una permanencia no puede ser nulo.");
		} else {		
		this.dia = LocalDate.of(dia.getYear(), dia.getMonth(), dia.getDayOfMonth());
		}

}


	//Metodos abstractos que van a heredar 
	public abstract int getPuntos();
	public abstract int hashCode();
	public abstract boolean equals(Object obj);

	@Override
	public String toString() {
		return "dia=" +this.dia.format(FORMATO_DIA) ;
	}


}
