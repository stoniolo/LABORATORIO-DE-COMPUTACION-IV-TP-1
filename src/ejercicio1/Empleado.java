package ejercicio1;

public class Empleado {

	//Attributes
	
	private int id;
	private String nombre;
	private int edad;
	
	
	//Constructors
	
	public Empleado() 
	{
		nombre = "Sin nombre";
		edad = 99;
	}
	
	public Empleado(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Getters & Setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
