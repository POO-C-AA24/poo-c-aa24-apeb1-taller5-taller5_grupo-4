public class Problema_4_Acusado {
    
    protected String nombreAcusado;
    protected int edadAcusado;
    protected String colaboracionCaso;
    protected int sentenciaAcusado;
    protected String solicitudReduccionPena;
    protected String pagoFianza;

    public Problema_4_Acusado() {}
    public Problema_4_Acusado(String nombreAcusado, int edadAcusado, String solicitudReduccionPena, String pagoFianza) {
        this.nombreAcusado = nombreAcusado;
        this.edadAcusado = edadAcusado;
        this.solicitudReduccionPena = solicitudReduccionPena;
        this.pagoFianza = pagoFianza;
    }

    public void setColaboracionCaso(String colaboracionCaso) {
        this.colaboracionCaso = colaboracionCaso;
    }
    public void setSentenciaAcusado(int sentenciaAcusado) {
        this.sentenciaAcusado = sentenciaAcusado;
    }
    public void setSolicitudReduccionPena(String solicitudReduccionPena) {
        this.solicitudReduccionPena = solicitudReduccionPena;
    }
    public void setPagoFianza(String solicitudFianza) {
        this.pagoFianza = solicitudFianza;
    }
    public String getColaboracionCaso() {
        return colaboracionCaso;
    }
    public int getSentenciaAcusado() {
        return sentenciaAcusado;
    }

    public void verificarReduccionPena(){
        if (this.colaboracionCaso == "Existe Colaboracion"){
            this.solicitudReduccionPena = "Aceptada";
            if (this.sentenciaAcusado < 12) {
                this.pagoFianza = "Disponible";
            }
        }
    }
    
    @Override
    public String toString() {
        return "{" + "nombreAcusado=" + nombreAcusado + ", edadAcusado=" + edadAcusado + ", colaboracionCaso=" + colaboracionCaso + ", sentenciaAcusado=" + sentenciaAcusado + " meses , solicitudReduccionPena=" + solicitudReduccionPena + ", pagoFianza=" + pagoFianza + '}';
    }
}
