import java.util.ArrayList;
public class Problema_5_ConflictoEjecutor {
    public static void main(String[] args) {
        int numeroPaisesMundo = 190; //Existen 190 países en el Mundo.
        int bajasHumanasConflicto = 0;
        ArrayList <Problema_5_Conflicto> listConflictos = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            listConflictos.add(new Problema_5_Conflicto("Conflicto "+(i+1), (int)(Math.random()*55+2), (int)(Math.random()*29+1)+" de Enero", (int)(Math.random()*15+1), "Sin confirmar"));
            listConflictos.get(i).verificarEstadoActualConflicto(numeroPaisesMundo);
            ArrayList <Problema_5_Evento> listEventos = new ArrayList<>();
            ArrayList <Problema_5_Batalla> listBatallas = new ArrayList<>();
            for (int j = 0; j < listConflictos.get(i).getNumeroEventosConflicto(); j++) {
                listEventos.add(new Problema_5_Evento("Evento "+(j+1), "Fecha "+(j+1), "Ubicacion "+(j+1)));
                listEventos.get(j).setTipoEvento(((int)(Math.random()*2+1) == 1)?("Batalla"):(((int)(Math.random()*2+1) == 1)?("Tratado de Paz"):("Reunion Diplomatica")));
                listEventos.get(j).setNumeroPaisesEvento((int)(Math.random()*listConflictos.get(i).getNumeroPaisesInvolucrados()+1)); 
                if (listEventos.get(j).getTipoEvento() == "Batalla") 
                    listBatallas.add(new Problema_5_Batalla(listEventos.get(j).getNombreEvento(), listEventos.get(j).getFechaEvento(), listEventos.get(j).getUbicacionEvento(), listEventos.get(j).getNumeroPaisesEvento()));
            }
            for (int j = 0; j < listBatallas.size(); j++) {
                listBatallas.get(j).setTipoPaisesInvolucradosBatalla(((int)(Math.random()*2+1) == 1)?("Paises de primer mundo"):("Paises de segundo mundo"));
                if (listBatallas.get(j).getTipoPaisesInvolucradosBatalla() == "Paises de primer mundo"){
                    listConflictos.get(i).setPaisesPrimerMundoInvolucrados("Si");
                    listConflictos.get(i).setUsoArmasNuclearesConflicto(((int)(Math.random()*2+1) == 1)?("Si"):(listConflictos.get(i).getUsoArmasNuclearesConflicto()));
                }
                listBatallas.get(j).setBajasHumanasBatalla((int)(Math.random()*100000+1000));
                bajasHumanasConflicto += listBatallas.get(j).getBajasHumanasBatalla();
            }
            listConflictos.get(i).setBajasHumanasConflicto(bajasHumanasConflicto);
            listConflictos.get(i).verificarEstadoActualConflicto(numeroPaisesMundo);
            System.out.println("----------------CONFLICTO----------------");
            System.out.println(listConflictos.get(i));
            System.out.println("----------------EVENTOS----------------");
            for (int j = 0; j < listEventos.size(); j++) {
                System.out.println(listEventos.get(j)); 
            }
            System.out.println("----------------BATALLAS----------------");
            for (int j = 0; j < listBatallas.size(); j++) {
                System.out.println(listBatallas.get(j));
            }
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}
