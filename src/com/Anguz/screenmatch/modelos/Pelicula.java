package com.Anguz.screenmatch.modelos;
//Se crea una instacia "package" (new com.Anguz.screenmatch.modelos.Pelicula) para orgnaizar mejor el codigo

public class Pelicula extends Titulo {

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
