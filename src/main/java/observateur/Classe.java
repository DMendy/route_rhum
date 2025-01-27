package observateur;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Classe implements Observateur{
    Classe classe;
    List<Abandon> abandons;


    public Classe(Classe classe) {
        this.classe = classe;
        abandons = new LinkedList<Abandon>();
    }
    @Override
    public void actualise(Observable observable) {
        DirectionCourse directionCourse = new DirectionCourse();
        abandons.add(directionCourse.getLastAbandon());
    }
}
