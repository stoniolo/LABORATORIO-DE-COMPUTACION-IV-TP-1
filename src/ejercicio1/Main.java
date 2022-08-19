package ejercicio1;

public class Main {
	
	public static void main(String[] args) {
		
		Empleado empleado = new Empleado();
		
		System.out.println(empleado.toString());
		
		Empleado empleado1 = new Empleado();
		
		System.out.println(empleado1.toString());
		
		System.out.println(Empleado.devuelveProximoID());
	}
}
