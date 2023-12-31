public class Alumno {
    private String nombre;
    private String matricula;
    private int[] calificaciones;
    private float promedio;

    public Alumno(String nombre, String matricula, int[] calificaciones){
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificaciones = calificaciones;
    }

    public String getNombre(){
        return nombre;
    }

    public String getMatricula(){
        return matricula;
    }

    public int[] getCalificaciones(){
        return calificaciones;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setCalificaciones(int[] calificaciones){
        this.calificaciones = calificaciones;
    }

    public void printInfo(){
        System.out.println("Nombre del alumno: " + nombre + "\n"
        + "Matricula: " + matricula);
        for(int i = 0; i < calificaciones.length; i++){
            System.out.println("Calificacion " + (i+1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
    }

    public float getPromedio(){
        float suma = 0;
        for(int i = 0; i < calificaciones.length; i++){
            suma += calificaciones[i];
        }
        this.promedio = suma/calificaciones.length;
        return suma/calificaciones.length;
    }
}
