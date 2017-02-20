package com.fpmislata.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Alumno.class)
public abstract class Alumno_ {

	public static volatile SetAttribute<Alumno, Curso> cursos;
	public static volatile SingularAttribute<Alumno, String> apellido;
	public static volatile SingularAttribute<Alumno, Integer> id;
	public static volatile SingularAttribute<Alumno, String> nombre;
	public static volatile SingularAttribute<Alumno, String> dni;

}

