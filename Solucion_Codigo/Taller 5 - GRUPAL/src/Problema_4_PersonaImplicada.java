public class Problema_4_PersonaImplicada {
    
    protected String nombrePersonaImplicada;
    protected int edadPersonaImplicada;
    protected String ocupacionPersonaImplicada;
    protected String nivelImplicacionPersona;

    public Problema_4_PersonaImplicada() {}

    public void setNombrePersonaImplicada(String nombrePersonaImplicada) {
        this.nombrePersonaImplicada = nombrePersonaImplicada;
    }
    public void setEdadPersonaImplicada(int edadPersonaImplicada) {
        this.edadPersonaImplicada = edadPersonaImplicada;
    }
    public void setOcupacionPersonaImplicada(String ocupacionPersonaImplicada) {
        this.ocupacionPersonaImplicada = ocupacionPersonaImplicada;
    }
    public void setNivelImplicacionPersona(String nivelImplicacionPersona) {
        this.nivelImplicacionPersona = nivelImplicacionPersona;
    }
    public String getNombrePersonaImplicada() {
        return nombrePersonaImplicada;
    }
    public int getEdadPersonaImplicada() {
        return edadPersonaImplicada;
    }
    public String getNivelImplicacionPersona() {
        return nivelImplicacionPersona;
    }
    
    @Override
    public String toString() {
        return "{" + "nombrePersonaImplicada=" + nombrePersonaImplicada + ", edadPersonaImplicada=" + edadPersonaImplicada + ", ocupacionPersonaImplicada=" + ocupacionPersonaImplicada + ", nivelImplicacionPersona=" + nivelImplicacionPersona + '}';
    }
}
