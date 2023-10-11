import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int[] calificaciones_diego = {100,100,80,90,70,100,90};        
        
        

        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();          
        alumnos.add(new Alumno("Diego", "1287841", calificaciones_diego));
    
    }

    public int[] getCalificaciones(){
        String nombre_archivo = new String();
        nombre_archivo = "practica11.csv";

        File file = new File(nombre_archivo);
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                String[] datos = sc.next().split(",");
            }
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
        }

        return calificaciones;
    }
}