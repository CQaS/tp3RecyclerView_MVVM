package com.example.tp3recyclerview_mvvm.modeloPeliculas;

import android.widget.Button;

import java.io.Serializable;

public class Peliculas implements Serializable
{
    public String titulo;
    public int foto;
    public String resenia;
    public String descripcion;
    public String actor;
    public String director;

    public Peliculas(String titulo, int foto, String resenia, String descripcion, String actor, String director)
    {
        this.titulo = titulo;
        this.foto = foto;
        this.resenia = resenia;
        this.descripcion = descripcion;
        this.actor = actor;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getResenia() {
        return resenia;
    }

    public void setResenia(String resenia) {
        this.resenia = resenia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
