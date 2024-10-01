import com.Anguz.screenmatch.modelos.Pelicula;
import com.Anguz.screenmatch.modelos.Series;

public class Principal {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2020);
        miPelicula.setDuracionEnMinutos(180);
        miPelicula.setIncluidoEnElPlan(true);

        // INVOCACION METODOS
        miPelicula.muestraFichaTecnica(); // Muestra ficha tecnica
        miPelicula.evalua(10); //
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println(miPelicula.getTotalEvaluacionesUsuario());
        System.out.println(miPelicula.calculaMedia());


        Series casaDragon = new Series();
        casaDragon.setNombre("House of the dragons");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporada(2);
        casaDragon.setMinutosPorTemporada(100);
        casaDragon.setEpisodioPorTemporada(10);
        casaDragon.muestraFichaTecnica();






    }
}
