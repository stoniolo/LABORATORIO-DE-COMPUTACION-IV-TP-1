package ejercicio1;

public class Empleado {

	//Attributes
	
	private final int id;
	private String nombre;
	private int edad;
	
	static int count=999;
	
	//Constructors
	
	public Empleado() 
	{
		count++;
		id = count;
		nombre = "Sin nombre";
		edad = 99;
	}
	
	public Empleado(String nombre, int edad)
	{
		count++;
		id = count;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Getters & Setters
	
	public int getId() {
		return id;
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
