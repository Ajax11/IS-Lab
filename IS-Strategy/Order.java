package Estudiante;

public class Order {
    public static Boolean comp(Estudiante a, Estudiante b, String campo){
        switch(campo){
        case "codigo":
            return a.Codigo<b.Codigo;
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
    
    public static void print(Estudiante[] estudiantes){
        for(int i=0; i<estudiantes.length; i++){
            System.out.println(estudiantes[i].Nombre + '\t' + estudiantes[i].Codigo + '\t' + estudiantes[i].Nota);
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
        estudiantes[0] = new Estudiante("Paulo", 44444, 20);
        estudiantes[1] = new Estudiante("Amanda",22222 , 15);
        estudiantes[2] = new Estudiante("Samuel", 33333, 18);
        estudiantes[3] = new Estudiante("Betsy", 88888, 10);
        ordenar(estudiantes, "nombre");
   	}
}
