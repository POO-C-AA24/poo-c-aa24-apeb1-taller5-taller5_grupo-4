public class Problema_5_Batalla {
    
    public String nombreBatalla;
    public String tipoPaisesInvolucradosBatalla;
    public String fechaBatalla;
    public String ubicacionBatalla;
    public int numeroPaisesBatalla;
    public int bajasHumanasBatalla;

    public Problema_5_Batalla(String nombreBatalla, String fechaBatalla, String ubicacionBatalla, int numeroPaisesBatalla) {
        this.nombreBatalla = nombreBatalla;
        this.fechaBatalla = fechaBatalla;
        this.ubicacionBatalla = ubicacionBatalla;
        this.numeroPaisesBatalla = numeroPaisesBatalla;
    }

    public void setTipoPaisesInvolucradosBatalla(String tipoPaisesInvolucradosBatalla) {
        this.tipoPaisesInvolucradosBatalla = tipoPaisesInvolucradosBatalla;
    }
    public void setBajasHumanasBatalla(int bajasHumanasBatalla) {
        this.bajasHumanasBatalla = bajasHumanasBatalla;
    }
    public String getTipoPaisesInvolucradosBatalla() {
        return tipoPaisesInvolucradosBatalla;
    }
    public int getBajasHumanasBatalla() {
        return bajasHumanasBatalla;
    }
    
    @Override
    public String toString() {
        return "{" + "nombreBatalla=" + nombreBatalla + ", tipoPaisesInvolucradosBatalla=" + tipoPaisesInvolucradosBatalla + ", fechaBatalla=" + fechaBatalla + ", ubicacionBatalla=" + ubicacionBatalla + ", numeroPaisesBatalla=" + numeroPaisesBatalla + ", bajasHumanasBatalla=" + bajasHumanasBatalla + '}';
    }
}
