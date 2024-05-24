public class Prob2_Estudiante {
    public String nombre;
    public int edad;
    public Prob2_Materia materia;
    public Prob2_Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.materia = null;
    }
    public void agregarMateria(Prob2_Materia materia) {
        this.materia = materia;
    }
    public void verificarAprobacion() {
        if (materia != null) {
            double totalPuntos = ((materia.getAcd()*3.5)/10) + ((materia.getApe()*3.5)/10) + ((materia.getAa()*3)/10);
            if (totalPuntos >= 7) {
                System.out.println("El estudiante " + nombre + " ha aprobado la materia " + materia.getNombre() + ".");
            } else {
                System.out.println("El estudiante " + nombre + " no ha aprobado la materia " + materia.getNombre() + ".");
                double puntosRecuperacionNecesarios = (7 - totalPuntos) / 0.4;
                System.out.println("Deberá rendir un examen de recuperación sobre " + String.format("%.2f", puntosRecuperacionNecesarios) + " puntos.");
            }
        } else {
            System.out.println("El estudiante " + nombre + " no tiene materia asignada.");
        }
    }
}
