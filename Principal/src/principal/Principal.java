package principal;
/**
 *
 * @author lautre
 */
/*import ioc.desenvolupament.*;
import ioc.simulacio.dades.*;*/
import java.util.ArrayList;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MatriculaDB matriculaDB = new MatriculaDB();
        ArrayList asig=new ArrayList();
        Estudiant juan = new Estudiant ("Juan", "Perez", "21981534L", 2098);
        asig.add(new Assignatura(12, "asig1", 250, 65, true));
        asig.add(new Assignatura(15, "asig2", 190, 80, false));
        Matricula matricula = new Matricula(2165, juan, 2, asig);
        System.out.print("Cost de la matricula " + matricula.costMatricula());
    }
    
}
