public class Problema_5_Evento {
    
    public String nombreEvento;
    public String fechaEvento;
    public String ubicacionEvento;
    public String tipoEvento;
    public int numeroPaisesEvento;

    public Problema_5_Evento(String nombreEvento, String fechaEvento, String ubicacionEvento) {
        this.nombreEvento = nombreEvento;
        this.fechaEvento = fechaEvento;
        this.ubicacionEvento = ubicacionEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
    public void setNumeroPaisesEvento(int numeroPaisesEvento) {
        this.numeroPaisesEvento = numeroPaisesEvento;
    }
    public String getNombreEvento() {
        return nombreEvento;
    }
    public String getFechaEvento() {
        return fechaEvento;
    }
    public String getUbicacionEvento() {
        return ubicacionEvento;
    }
    public int getNumeroPaisesEvento() {
        return numeroPaisesEvento;
    }
    public String getTipoEvento() {
        return tipoEvento;
    }

    @Override
    public String toString() {
        return "{" + "nombreEvento=" + nombreEvento + ", fechaEvento=" + fechaEvento + ", ubicacionEvento=" + ubicacionEvento + ", tipoEvento=" + tipoEvento + ", numeroPaisesEvento=" + numeroPaisesEvento + '}';
    }
}
