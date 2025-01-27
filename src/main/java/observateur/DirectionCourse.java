package observateur;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class DirectionCourse implements Observable{
    public LinkedList<Abandon> listeabandon;
    public LinkedList<Observateur> listeobservateurs;


    public DirectionCourse(){
        listeabandon = new LinkedList<>();
        listeobservateurs = new LinkedList<>();
    }

    @Override
    public void enregistreObservateur(Observateur observateur) {
        listeobservateurs.addLast(observateur);
    }

    @Override
    public void desenregistreObservateur(Observateur observateur) {

    }

    @Override
    public void informeObservateurs() {
        for (Observateur observateur : listeobservateurs) {
            observateur.actualise(this);
        }

    }

    public Abandon getLastAbandon() {
        return listeabandon.getLast();
    }

    public void simulationCourse(HashSet<Abandon>listeAbandon) {
        for (Iterator<Abandon> i = listeAbandon.iterator(); i.hasNext();) {
            listeabandon.add(i.next());
            informeObservateurs();
            try {
                Thread.sleep( 2 *1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
