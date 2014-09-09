package Estudiante;

public class Estudiante {
	public String Nombre;
	public String Codigo;
	public Integer Nota;
	
	public Estudiante (String T_nombre, String T_codigo, Integer T_nota){
		this.Nombre=T_nombre;
		this.Codigo=T_codigo;
		this.Nota=T_nota;
	}
	
	public String toString(){
		return "{" + Nombre + ", " + Codigo + ", " + Nota + "}";
	}
}
