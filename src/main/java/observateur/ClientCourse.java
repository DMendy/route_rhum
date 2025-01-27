package observateur;
import
import td7.Categorie;

import java.util.HashSet;

public class ClientCourse {
    public static void main(String[] args) {
        HashSet<Abandon> listabandon = new HashSet<>();

        listabandon.add(new Abandon("Nexams", Categorie.CLASS40,"Arthur"));
        listabandon.add(new Abandon("LEYTON", Categorie.IMOCA,"Rayan"));
        listabandon.add(new Abandon("Bella Ima", Categorie.ULTIM,"Jude"));

        DirectionCourse directionCourse = new DirectionCourse();
        Categorie Imoca = Categorie.IMOCA;

        directionCourse.simulationCourse(listabandon);

    }
}
