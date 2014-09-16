package Estudiante;
import java.util.HashMap;
import java.util.Map;

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

	Map<String, Comparador> Comparacion;

	public Order(){
		Comparacion = new HashMap<String, Comparador>();
	}
	
	public void Registrar(String Tipo_comparador, Comparador comparador){
		Comparacion.put(Tipo_comparador, comparador);
	}
	
	public int Ejecutar(Estudiante a, Estudiante b, String Tipo_de_comparacion){
		Comparador comp = Comparacion.get(Tipo_de_comparacion);
		if(comp == null){
			System.out.println("No existe este metodo de comparacion: " + Tipo_de_comparacion);
			return 0;
		}
		return comp.Comparar(a, b);
	}

}
