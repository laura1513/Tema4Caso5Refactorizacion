package principal;

/**
 *
 * @author lautre
 */
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Matricula {

    private static final float COSTCREDITS = 15;
    private long id = 0;
    private int curs = 0;
    private Collection assignatures;
    private Estudiant estudiant;

    public Matricula() {
    }

    /**
     * Constructor amb tots els atributs de matricula
     *
     * @param id Nombre enter únic
     * @param estudiant Estudiant registrat en la classe Estudiant
     * @param curs Curs al que vas a matricularte, un enter
     * @param assignatures Assignaturas registrades en el ArrayList
     */
    public Matricula(long id, Estudiant estudiant, int curs, Collection assignatures) {
        this.id = id;
        this.estudiant=estudiant;
        this.curs = curs;
        this.assignatures = assignatures;
    }

    public long getid() {
        return id;
    }
    public void setid(long id) {
        this.id=id;
    }
    public Estudiant getestudiant() {
        return estudiant;
    }
    public void setestudiant(Estudiant estudiant) {
        this.estudiant=estudiant;
    }
    public int getcurs() {
        return curs;
    }
    public void setcurs(int curs) {
        this.curs=curs;
    }
    public Collection getassignatures() {
        return assignatures;
    }
    public void setassignatures(Collection assignatures) {
        this.assignatures=assignatures;
    }

    public float costMatricula() {

        float cost = 0;
        int credits = 0;

        for (Iterator iter = assignatures.iterator(); iter.hasNext();) {
            Assignatura element = (Assignatura) iter.next();
            credits = credits + element.getCredits();
        }

        cost = credits * COSTCREDITS;
        return cost;
    }
}
