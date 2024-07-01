package com.tesji.proyectoapi.model;

//encapsulacion: los atributos deben ser privados para que no todos los metodosd
//puedan acceder a ellos y accede mediante un get y un set

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//conviete todos la clase en tabla con los tributos definidos
@Entity

public class DatosBiblioApi {
//primera forma normal, y a ID lo convierte en una llave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private  String autores;
    private String editorail;
    private String edicion;

    //el constructor vasio debe ser primero
    public DatosBiblioApi( ) {
    }

    public DatosBiblioApi(String titulo, String autores, String editorail, String edicion) {
        this.titulo = titulo;
        this.autores = autores;
        this.editorail = editorail;
        this.edicion = edicion;
    }
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public String getAutores() {return autores;}
    public void setAutores(String autores) {this.autores = autores;}
    public String getEditorail() {return editorail;}
    public void setEditorail(String editorail) {this.editorail = editorail;}
    public String getEdicion() {return edicion;}
    public void setEdicion(String edicion) {this.edicion = edicion;}
}
