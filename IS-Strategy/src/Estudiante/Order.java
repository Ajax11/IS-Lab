package Estudiante;

import java.util.Scanner;

interface Comparador{
	
	//si a1 es menor a a2 da un numero negativo, iguales 0, mayor un numero positivo
	
	int Comparar(Estudiante a1, Estudiante a2);
}

class ComparadorPorNombre implements Comparador{
	public int Comparar(Estudiante a1, Estudiante a2){
		return a1.Nombre.compareTo(a2.Nombre);
	}
}

class ComparadorPorNota implements Comparador{
	public int Comparar(Estudiante a1, Estudiante a2){
		return a1.Nota-a2.Nota;
	}
}

class ComparadorPorCodigo implements Comparador{
	public int Comparar(Estudiante a1, Estudiante a2){
		return a1.Codigo.compareTo(a2.Codigo);
	}
}

public class Order {

    public static int comp(Estudiante a, Estudiante b, String campo){
        switch(campo){
        case "codigo":
            return a.Codigo.compareTo(b.Codigo);
        case "nombre":
            if(a.Nombre.compareTo(b.Nombre) < 0){
                return true;
            }
            return false;
        case "nota":
            return a.Nota < b.Nota;
        default:
            return false;
        }               
    }

    public static void ordenar(Estudiante[] estudiantes, String campo){
        for(int i=0; i<estudiantes.length; i++){
            for(int j=0; j<i; j++){
                if (comp(estudiantes[i], estudiantes[j], campo)){
                    Estudiante t = estudiantes[j];
                    estudiantes[j] = estudiantes[i];
                    estudiantes[i] = t;
                }
            }
        }
        print(estudiantes);
    }

	public static void main(String[] args) {
		Estudiante[] estudiantes = new Estudiante[4];
        estudiantes[0] = new Estudiante("Paulo", "CS-44", 20);
        estudiantes[1] = new Estudiante("Amanda","CS-222" , 15);
        estudiantes[2] = new Estudiante("Samuel", "CS-33", 18);
        estudiantes[3] = new Estudiante("Betsy", "CS-108", 10);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la columna: ");
        String campo = sc.nextLine();
        if(campo.equals("nota")){
        	for(int i=0; i < estudiantes.length-1; i++){
        		if(ComparadorPorNombre(estidiantes[i], estudiantes[i+1])>0){
        			Estudiante t = estudiante[i];
        			estudiante[i] = estudiante[i+1];
        			estudiante[i+1] = t;
        		}
        	}
        }
        
        for(int i=0;i<estudiantes.length;++i){
        	System.out.println(estudiantes[i].toString());
        }
                
//        ordenar(estudiantes, "nombre");
   }

}