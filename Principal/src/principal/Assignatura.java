package principal;

/**
 *
 * @author lautre
 */
public class Assignatura {

    private long id = 0;
    private String nom = "";
    private int hores = 0;
    private int credits = 0;
    private boolean disponible = false;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHores() {
        return hores;
    }

    public void setHores(int hores) {
        this.hores = hores;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

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
