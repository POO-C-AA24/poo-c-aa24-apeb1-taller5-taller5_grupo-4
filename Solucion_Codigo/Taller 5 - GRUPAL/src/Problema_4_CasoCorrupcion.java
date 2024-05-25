public class Problema_4_CasoCorrupcion {
    
    public String nombreCasoCorrupcion;
    public String fechaInicio;
    protected int numPersonasImplicadas;
    public int numDiasDesdeFechaInicio;
    public String estadoCaso;

    public Problema_4_CasoCorrupcion() {}
    public Problema_4_CasoCorrupcion(String nombreCasoCorrupcion, String fechaInicio, int numPersonasImplicadas, int numDiasDesdeFechaInicio, String estadoCaso) {
        this.nombreCasoCorrupcion = nombreCasoCorrupcion;
        this.fechaInicio = fechaInicio;
        this.numPersonasImplicadas = numPersonasImplicadas;
        this.numDiasDesdeFechaInicio = numDiasDesdeFechaInicio;
        this.estadoCaso = estadoCaso;
    }

    public int getNumPersonasImplicadas() {
        return numPersonasImplicadas;
    }
    
    public void verificarEstadoCaso(){
        this.estadoCaso = (this.numDiasDesdeFechaInicio >= 14) ? ("Urgente") : ((this.numDiasDesdeFechaInicio >= 7) ? ("Alerta") : (this.estadoCaso));
    }

    @Override
    public String toString() {
        return "{" + "nombreCasoCorrupcion=" + nombreCasoCorrupcion + ", fechaInicio=" + fechaInicio + ", numPersonasImplicadas=" + numPersonasImplicadas + ", numDiasDesdeFechaInicio=" + numDiasDesdeFechaInicio + ", estadoCaso=" + estadoCaso + '}';
    }
}
