/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query ="SELECT c FROM Curso c ORDER BY c.id")})
    @Table (name = "cursos")
public class Curso implements Serializable{
    
    private static final long serialVersionUID = 1L; 
    
    @Id
    @Column(name = "id_curso", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; 
    
    @Column(name="nombre", nullable =false, length=45)
    private String nombre;
    
    @Column(name="tutor", nullable=false)
    private Integer tutor;
    
    @Column(name="descripcion")
    private String descripcion;
    
    @ManyToMany(cascade = {CascadeType.ALL}, mappedBy="cursos")
    private Set<Alumno> alumnos;

    public Curso() {
        this.alumnos = new HashSet<>();
    }

    public Curso(String nombre, Integer tutor, String descripcion) {
        this.nombre = nombre;
        this.tutor = tutor;
        this.descripcion = descripcion;
        this.alumnos = new HashSet<>();
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTutor() {
        return tutor;
    }

    public void setTutor(Integer tutor) {
        this.tutor = tutor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nombre=" + nombre + ", tutor=" + tutor + ", descripcion=" + descripcion + ", alumnos=" + alumnos + '}';
    }
    
    
    
    
    
}
