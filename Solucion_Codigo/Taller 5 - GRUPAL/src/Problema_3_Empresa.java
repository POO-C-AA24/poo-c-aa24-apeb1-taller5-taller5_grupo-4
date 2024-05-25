public class Problema_3_Empresa {
    
    public String nombreEmpresa;
    private String rucEmpresa;
    public String direccionEmpresa;
    public int numeroDepartamentos;

    public Problema_3_Empresa() {}
    public Problema_3_Empresa(String nombreEmpresa, String rucEmpresa, String direccionEmpresa, int numeroDepartamentos) {
        this.nombreEmpresa = nombreEmpresa;
        this.rucEmpresa = rucEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.numeroDepartamentos = numeroDepartamentos;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    public int getNumeroDepartamentos() {
        return numeroDepartamentos;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombreEmpresa=" + nombreEmpresa + ", rucEmpresa=" + rucEmpresa + ", direccionEmpresa=" + direccionEmpresa + ", numeroDepartamentos=" + numeroDepartamentos + '}';
    }
}
