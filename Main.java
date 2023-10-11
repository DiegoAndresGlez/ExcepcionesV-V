import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        int[] calificaciones_diego = {100,100,80,90,70,100,90};
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();          
        alumnos.add(new Alumno("Diego", "1287841", calificaciones_diego));
    }
}