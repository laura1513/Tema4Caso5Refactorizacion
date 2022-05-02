package principal;

/**
 *
 * @author lautre
 */
public class Estudiant {

    private String nom = "";
    private String cognoms = "";
    private String dni = "";

    /**
     * Constructor amb tots els atributs de Estudiant
     *
     * @param nom Cadena de carácters
     * @param cognoms Cadena de carácters
     * @param dni Cadena de 8 nombres i una lletra
     */
    public Estudiant(String nom, String cognoms, String dni) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
}
