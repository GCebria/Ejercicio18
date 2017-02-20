package com.fpmislata.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Curso.class)
public abstract class Curso_ {

	public static volatile SingularAttribute<Curso, String> descripcion;
	public static volatile SetAttribute<Curso, Alumno> alumnos;
	public static volatile SingularAttribute<Curso, Integer> id;
	public static volatile SingularAttribute<Curso, String> nombre;
	public static volatile SingularAttribute<Curso, Integer> tutor;

}

