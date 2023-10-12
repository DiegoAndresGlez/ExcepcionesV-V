import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        int[] calificaciones = new int[21];
        int[] calificaciones_diego = new int[7];
        int[] calificaciones_nora = new int[7];
        int[] calificaciones_mariano = new int[7];                
        
        calificaciones = getCalificaciones();

        for(int i = 0; i < 7; i++){
            calificaciones_diego[i] = calificaciones[i];
            calificaciones_nora[i] = calificaciones[i+7];
            calificaciones_mariano[i] = calificaciones[i+14];
        }

        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();          
        alumnos.add(new Alumno("Diego", "1287841", calificaciones_diego));
        alumnos.add(new Alumno("Nora", "1287744", calificaciones_nora));
        alumnos.add(new Alumno("Mariano", "1287845", calificaciones_mariano));
        
        for(Alumno alumno : alumnos){
            alumno.getPromedio();
            alumno.printInfo();
        }
    }

    public static int[] getCalificaciones(){
        int[] calificaciones = new int[21];
        String[] datos;
        BufferedReader in;

        try{
            in = new BufferedReader(new FileReader("practica11.csv"));
            String numeros = in.readLine();
            //System.out.println(numeros);
            datos = numeros.split(",");
            datos[0] = datos[0].substring(1); //Eliminar primer caracter '?'
            for(int i = 0; i < datos.length; i++){
                calificaciones[i] = Integer.parseInt(datos[i]);
                //System.out.println(calificaciones[i]);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return calificaciones;
    }
}