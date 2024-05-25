public class Problema_3_Departamento {
    
    public String nombreDepartamento;
    private int numEmpleadosDepartamento;
    private int produccionAnual;
    private String categoriaDepartamento;

    public Problema_3_Departamento() {}
    public Problema_3_Departamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
    
    public void setNumEmpleadosDepartamento(int numEmpleadosDepartamento) {
        this.numEmpleadosDepartamento = numEmpleadosDepartamento;
    }
    public void setProduccionAnual(int produccionAnual) {
        this.produccionAnual = produccionAnual;
    }
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }
    
    public void asignarCategoriaDepartamento(){
        this.categoriaDepartamento = ((this.numEmpleadosDepartamento > 20)&&(this.produccionAnual > 1000000))?("A"):(((this.numEmpleadosDepartamento == 20)&&(this.produccionAnual == 1000000))?("B"):(((this.numEmpleadosDepartamento == 10)&&(this.produccionAnual == 500000))?("C"):(null)));
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombreDepartamento=" + nombreDepartamento + ", numEmpleadosDepartamento=" + numEmpleadosDepartamento + ", produccionAnual=" + produccionAnual + ", categoriaDepartamento=" + categoriaDepartamento + '}';
    }
}
