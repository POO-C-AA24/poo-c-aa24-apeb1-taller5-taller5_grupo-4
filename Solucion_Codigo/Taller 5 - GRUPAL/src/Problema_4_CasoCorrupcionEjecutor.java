import java.util.ArrayList;
public class Problema_4_CasoCorrupcionEjecutor {
    public static void main(String[] args) {
        ArrayList <Problema_4_CasoCorrupcion> listCasosCorrupcion = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.println("---------CASO CORRUPCION---------");
            listCasosCorrupcion.add(new Problema_4_CasoCorrupcion("Caso Corrupcion"+(i+1), (int)(Math.random()*27+1)+" de febrero 2024", (int)(Math.random()*15+3),(int)(Math.random()*17+1) ,"Iniciado"));
            listCasosCorrupcion.get(i).verificarEstadoCaso();
            System.out.println(listCasosCorrupcion.get(i));
            ArrayList <Problema_4_PersonaImplicada> listPersonasImplicadas = new ArrayList<>();
            ArrayList <Problema_4_Acusado> listAcusados = new ArrayList<>();
            System.out.println("---------PERSONAS IMPLICADAS---------");
            for (int j = 0; j < listCasosCorrupcion.get(i).getNumPersonasImplicadas(); j++) {
                listPersonasImplicadas.add(new Problema_4_PersonaImplicada());
                listPersonasImplicadas.get(j).setNombrePersonaImplicada("Persona Implicada"+(j+1));
                listPersonasImplicadas.get(j).setEdadPersonaImplicada((int)(Math.random()*54+24));
                listPersonasImplicadas.get(j).setOcupacionPersonaImplicada(((int)(Math.random()*2+1) == 1)?("Juez"):(((int)(Math.random()*2+1) == 1)?("Banquero"):(((int)(Math.random()*2+1) == 1)?("Diputado"):("Contralor"))));
                listPersonasImplicadas.get(j).setNivelImplicacionPersona(((int)(Math.random()*2+1) == 1)?("Acusado"):(((int)(Math.random()*2+1) == 1)?("Testigo"):("Victima")));
                System.out.println(listPersonasImplicadas.get(j));
                if (listPersonasImplicadas.get(j).getNivelImplicacionPersona() == "Acusado") 
                    listAcusados.add(new Problema_4_Acusado(listPersonasImplicadas.get(j).getNombrePersonaImplicada(), listPersonasImplicadas.get(j).getEdadPersonaImplicada(), "Denegada", "No Disponible"));            
            }
            System.out.println("---------ACUSADOS---------");
            for (int j = 0; j < listAcusados.size(); j++){
                listAcusados.get(j).setColaboracionCaso(((int)(Math.random()*2+1) == 1)?("Existe Colaboracion"):("No existe Colaboracion"));
                listAcusados.get(j).setSentenciaAcusado((int)(Math.random()*96+8));
                listAcusados.get(j).verificarReduccionPena();
                System.out.println(listAcusados.get(j));
            }
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}