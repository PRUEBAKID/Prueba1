package principalventatiquetes;

/**
 *
 * @author Estudiante
 */
public class Persona {
    private String idPersona;
    private String nomPersona, apePersona;
    private String provPersona;
   
    public Persona(String idPersona, String nomPersona, String apePersona, String provPersona) {
        this.idPersona = idPersona;
        this.nomPersona = nomPersona;
        this.apePersona = apePersona;
        this.provPersona = provPersona;
    }

    public Persona() {
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNomPersona() {
        return nomPersona;
    }

    public void setNomPersona(String nomPersona) {
        this.nomPersona = nomPersona;
    }

    public String getApePersona() {
        return apePersona;
    }

    public void setApePersona(String apePersona) {
        this.apePersona = apePersona;
    }

    public String getProvPersona() {
        return provPersona;
    }

    public void setProvPersona(String provPersona) {
        this.provPersona = provPersona;
    }        
}
