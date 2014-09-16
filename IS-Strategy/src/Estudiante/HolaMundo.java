package Estudiante;
import java.util.Scanner;


public class HolaMundo {
	public static void main(String[] args) {
		Order Ordenacion = new Order();
		Ordenacion.Registrar("nombre", new ComparadorPorNombre());
		Ordenacion.Registrar("codigo", new ComparadorPorCodigo());
		Ordenacion.Registrar("nota", new ComparadorPorNota());
		
		Estudiante[] estudiantes = new Estudiante[4];
        estudiantes[0] = new Estudiante("Paulo", "CS-44", 12);
        estudiantes[1] = new Estudiante("Amanda","CS-222" , 15);
        estudiantes[2] = new Estudiante("Samuel", "CS-33", 18);
        estudiantes[3] = new Estudiante("Betsy", "CS-108", 20);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la columna: ");
        String campo = sc.nextLine();
        for(int i=0; i<estudiantes.length-1; i++){
        	for(int j=i+1; j<estudiantes.length; j++){
        		if(Ordenacion.Ejecutar(estudiantes[i], estudiantes[j], campo) < 0){
            		Estudiante t = estudiantes[i];
        			estudiantes[i] = estudiantes[j];
        			estudiantes[j] = t;
            	}
        	}
        	
        	
        }
        for(int i=0; i<estudiantes.length;i++){
        	System.out.println(estudiantes[i].toString());
        }
	}
}