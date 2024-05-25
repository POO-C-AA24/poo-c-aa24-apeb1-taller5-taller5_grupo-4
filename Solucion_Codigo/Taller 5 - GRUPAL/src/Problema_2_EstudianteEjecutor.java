import java.util.Scanner;
public class Problema_2_EstudianteEjecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEstudiantes;
        System.out.println("Por favor Ingrese el numero de estudiantes");
        numEstudiantes = scanner.nextInt();
        Problema_2_Estudiante arrayEstudiantes[] = new Problema_2_Estudiante[numEstudiantes];
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Ingrese el nombre del estudiante: ");
            String nombreEstudiante = scanner.next();
            System.out.println("Ingrese la edad del estudiante: ");
            int edadEstudiante = scanner.nextInt();
            scanner.nextLine(); 
            arrayEstudiantes[i] = new Problema_2_Estudiante(nombreEstudiante, edadEstudiante);
            System.out.println("Ingrese el nombre de la materia: ");
            String nombreMateria = scanner.nextLine();
            System.out.println("Ingrese la calificacion ACD: ");
            double acd = scanner.nextDouble();
            System.out.println("Ingrese la calificacion APE: ");
            double ape = scanner.nextDouble();
            System.out.println("Ingrese la calificacion AA: ");
            double aa = scanner.nextDouble();
            Problema_2_Materia materia = new Problema_2_Materia(nombreMateria, acd, ape, aa);
            arrayEstudiantes[i].agregarMateria(materia);
            arrayEstudiantes[i].verificarAprobacion();
        }
    }  
}
