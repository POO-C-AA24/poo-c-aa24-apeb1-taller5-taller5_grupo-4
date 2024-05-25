public class Problema_5_Conflicto {
    
    public String nombreConflicto;
    public int numeroPaisesInvolucrados;
    public String fechaInicio;
    public int numeroEventosConflicto;
    public String estadoActualConflicto;
    public int bajasHumanasConflicto;
    public String paisesPrimerMundoInvolucrados;
    public String usoArmasNuclearesConflicto;

    public Problema_5_Conflicto() {}
    public Problema_5_Conflicto(String nombreConflicto, int numeroPaisesInvolucrados, String fechaInicio, int numeroEventosConflicto, String usoArmasNuclearesConflicto) {
        this.nombreConflicto = nombreConflicto;
        this.numeroPaisesInvolucrados = numeroPaisesInvolucrados;
        this.fechaInicio = fechaInicio;
        this.numeroEventosConflicto = numeroEventosConflicto;
        this.usoArmasNuclearesConflicto = usoArmasNuclearesConflicto;
    }

    public void setBajasHumanasConflicto(int bajasHumanasConflicto) {
        this.bajasHumanasConflicto = bajasHumanasConflicto;
    }
    public void setPaisesPrimerMundoInvolucrados(String paisesPrimerMundoInvolucrados) {
        this.paisesPrimerMundoInvolucrados = paisesPrimerMundoInvolucrados;
    }
    public void setUsoArmasNuclearesConflicto(String usoArmasNuclearesConflicto) {
        this.usoArmasNuclearesConflicto = usoArmasNuclearesConflicto;
    }
    public int getNumeroPaisesInvolucrados() {
        return numeroPaisesInvolucrados;
    }  
    public int getNumeroEventosConflicto() {
        return numeroEventosConflicto;
    }
    public String getUsoArmasNuclearesConflicto() {
        return usoArmasNuclearesConflicto;
    }
     
    public void verificarEstadoActualConflicto(int numeroPaisesMundo){
        if (this.numeroPaisesInvolucrados > numeroPaisesMundo*0.50){
            this.estadoActualConflicto = "Guerra Mundial";
        }else if (this.numeroPaisesInvolucrados < numeroPaisesMundo*0.50 && this.numeroPaisesInvolucrados > numeroPaisesMundo*0.30) {
            this.estadoActualConflicto = "Convocar a la ONU Reunión Urgente";
        }else
            this.estadoActualConflicto = "Sin confirmar";
        if (this.paisesPrimerMundoInvolucrados == "Si" && this.usoArmasNuclearesConflicto == "Si"){
            this.estadoActualConflicto = "Guerra Mundial";
        }
        if (this.bajasHumanasConflicto > 1000000 && this.estadoActualConflicto != "Convocar a la ONU Reunión Urgente"){   // 1000000 es una cifra hipotetica del 50% o mas de bajas en alguno de los países involucrados
            this.estadoActualConflicto = this.estadoActualConflicto+" (Convocar a la ONU Reunión Urgente)";
        }
    }

    @Override
    public String toString() {
        return "{" + "nombreConflicto=" + nombreConflicto + ", numeroPaisesInvolucrados=" + numeroPaisesInvolucrados + ", fechaInicio=" + fechaInicio + ", numeroEventosConflicto=" + numeroEventosConflicto + ", estadoActualConflicto=" + estadoActualConflicto + ", bajasHumanasConflicto=" + bajasHumanasConflicto + ", paisesPrimerMundoInvolucrados=" + paisesPrimerMundoInvolucrados + ", usoArmasNuclearesConflicto=" + usoArmasNuclearesConflicto + '}';
    }
}
