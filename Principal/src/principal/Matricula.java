package principal;
/**
 *
 * @author lautre
 */
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

    public class Matricula {
        public static final float costCredits= 15;
        public long id = 0;
        private int curs = 0;
        private Collection assignatures;
        private Estudiant estudiant;
        
        public Matricula(){}

            /**
             * Constructor amb tots els atributs de matricula
             * @param id Nombre enter únic
             * @param nom Cadena de carácters
             * @param cognoms Cadena de carácters
             * @param dni Cadena de 8 nombres i una lletra
             * @param curs Curs al que vas a matricularte, un enter
             * @param assignatures Assignaturas registrades en el ArrayList
             */
            public Matricula(long id, Estudiant estudiant, int curs, Collection assignatures) {
            this.id = id;
            this.curs = curs;
            this.assignatures = assignatures;
    }
    
    public float costMatricula(){
        
        float cost = 0;
        int credits = 0;
 
        for (Iterator iter = assignatures.iterator(); iter.hasNext();) {
        Assignatura element = (Assignatura) iter.next();
        credits = credits + element.credits;
        }
 
        cost = credits * costCredits;
        return cost;
    }
}