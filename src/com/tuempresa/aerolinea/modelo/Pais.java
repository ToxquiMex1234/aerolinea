package com.tuempresa.aerolinea.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter

public class Pais extends Identificable{
	
	
	@Column(length=32)
	@Required
	String nombre;
	
	
	
	
}
