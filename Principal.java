
public class Principal 
{

	public static void main(String[] args) 
	{
		System.out.println("Creado instancias de Persona...");
		System.out.println();
		
		Persona p1 = new Persona("Chronos", 100);
		Persona p2 = new Persona("Zeus", 101);
		
		System.out.println("Instancias de Persona Creadas.");
		System.out.println();
		
		System.out.println("Persona 1: "+p1.getName());
		System.out.println("Persona 2: "+p2.getName());
	}

}
