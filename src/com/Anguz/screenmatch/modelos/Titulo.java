package com.Anguz.screenmatch.modelos;

public class Titulo {

    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalEvaluacionesUsuario;


    //GETTER
    public String getNombre() {
        return nombre;
    }
    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }
    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }


    //Se da click derecho,Generate,Setter y se agregan todos los atributos para que se puedan usar
    //"This" se utiliza para distinguir entre el atributo "nombre" y el "nombre" que se le pregunta al usuario
    // "(String nombre)"
    public void setNombre(String nombre) {
        this.nombre = nombre; // "this" se refiere a que se refiere al atributo no
        //al valor que el usuario le de.
    }
    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }
    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }
    public int getTotalEvaluacionesUsuario(){
        return totalEvaluacionesUsuario;
    }



    //METODOS
    public void muestraFichaTecnica(){
        System.out.println("FICHA TECNICA: ");
        System.out.println("El nombre de tu pelicula es " + nombre);
        System.out.println("La fecha de la lanzamiento fue en:  " + getFechaDeLanzamiento());
        System.out.println("La duracion en minutos es de " + getDuracionEnMinutos() + " minutos");
    }

    public void evalua (double nota){
        sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota;
        totalEvaluacionesUsuario = totalEvaluacionesUsuario + 1;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalEvaluacionesUsuario;
    }

}
