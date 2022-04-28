package principal;

/**
 *
 * @author lautre
 */
public class Assignatura {

    public long id = 0;
    private String nom = "";
    private int hores = 0;
    public int credits = 0;
    private boolean disponible = false;

    /**
     * Construcctor per a cada atribut de la assignatura
     *
     * @param id Nombre enter amb el qual se identifica la assignatura, el id no
     * se repetirà
     * @param nom Cadena de caràcters que representa el nom de la assignatura
     * @param hores Nombre enter amb las hores totals de la assignatura
     * @param credits Nombre enter amb els credits totals de la assignatura
     * @param disponible Boolean on s'iindica si la assignatura es troba o no
     * disponible
     */
    public Assignatura(long id, String nom, int hores, int credits, boolean disponible) {
        this.id = id;
        this.nom = nom;
        this.hores = hores;
        this.credits = credits;
        this.disponible = disponible;
    }
}
