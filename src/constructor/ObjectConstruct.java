package constructor;

public class ObjectConstruct {
	String nombre;
	int edad;
	
	public ObjectConstruct(String _nombre, int _edad) {
		nombre = _nombre;
		edad = _edad;
	}
	
	public void mostrarDatos() {
		System.out.println("EL nombre es: "+nombre);
		System.out.println("La edad es : "+edad);
	}
}
