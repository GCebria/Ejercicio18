/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.domain;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;


@Entity
@NamedQueries({
    @NamedQuery(name = "Libro.findAll", query = "SELECT l FROM Libro l ORDER BY l.id")})
@Table(name = "libros")

public class Libro implements Serializable {
    
     private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private int id;

    @Column(nullable = false, length = 45)
    private String titulo;

    @Column(nullable = false, length = 45)
    private String autor;

    @Column(nullable = false)
    private int alumno;

    
    
}
