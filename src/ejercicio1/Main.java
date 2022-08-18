package ejercicio1;

public class Main {
	
	public static void main(String[] args) {
		
		Empleado empleado = new Empleado();
		
		System.out.println("Id: " + empleado.getId() + " Edad: " + empleado.getEdad() + " Nombre: " + empleado.getNombre());
		
		Empleado empleado1 = new Empleado();
		
		System.out.println("Id: " + empleado1.getId() + " Edad: " + empleado1.getEdad() + " Nombre: " + empleado1.getNombre());
	}
}
