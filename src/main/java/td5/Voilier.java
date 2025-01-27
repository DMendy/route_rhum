package td5;

/**
 * Abstract class representing a sailboat.
 * This class includes the name of the sailboat and a strategy for following a route.
 */
public abstract class Voilier {
    /**
     * The name of the sailboat.
     */
    private String nom;

    /**
     * Strategy for following a route.
     */
    private SuivreRoute route;

    /**
     * Constructor with parameters for name and route.
     *
     * @param nom the name of the sailboat.
     * @param route the strategy for following a route.
     */
    public Voilier(String nom, SuivreRoute route) {
        this.nom = nom;
        this.route = route;
    }

    /**
     * Constructor with parameter for name only.
     *
     * @param nom the name of the sailboat.
     */
    public Voilier(String nom) {
        this.nom = nom;
    }

    /**
     * Default constructor.
     */
    public Voilier() {
    }

    /**
     * Sets the route strategy.
     *
     * @param suivreRoute the strategy for following a route.
     */
    public void setSuivreRoute(SuivreRoute suivreRoute) {
        this.route = suivreRoute;
    }

    /**
     * Applies the route strategy.
     */
    public void appliqueSuivreRoute() {
        route.suivreRoute();
    }

    /**
     * Provides a string representation of the sailboat.
     *
     * @return a string representation of the sailboat.
     */
    @Override
    public String toString() {
        return "Voilier : " + nom;
    }
}
