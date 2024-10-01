package com.Anguz.screenmatch.modelos;

public class Series extends Titulo{

    private int temporada;
    private int episodioPorTemporada;
    private int minutosPorTemporada;

    //sobre escritura de METODOS
    @Override
    public int getDuracionEnMinutos() {
        return temporada * minutosPorTemporada * minutosPorTemporada;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getMinutosPorTemporada() {
        return minutosPorTemporada;
    }

    public void setMinutosPorTemporada(int minutosPorTemporada) {
        this.minutosPorTemporada = minutosPorTemporada;
    }
}
