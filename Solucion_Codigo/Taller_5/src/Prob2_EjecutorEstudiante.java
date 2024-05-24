import java.util.Scanner;
public class Prob2_EjecutorEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante = scanner.nextInt();
        scanner.nextLine(); 
        Prob2_Estudiante estudiante = new Prob2_Estudiante(nombreEstudiante, edadEstudiante);
        System.out.print("Ingrese el nombre de la materia: ");
        String nombreMateria = scanner.nextLine();
        System.out.print("Ingrese la calificación ACD: ");
        double acd = scanner.nextDouble();
        System.out.print("Ingrese la calificación APE: ");
        double ape = scanner.nextDouble();
        System.out.print("Ingrese la calificación AA: ");
        double aa = scanner.nextDouble();
        Prob2_Materia materia = new Prob2_Materia(nombreMateria, acd, ape, aa);
        estudiante.agregarMateria(materia);
        estudiante.verificarAprobacion();
    }
    
}
