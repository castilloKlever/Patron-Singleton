package fbn.Singleton;

public class Institucion {
       private String Nombre;
       private static Institucion singletonInstitucion;

	private  Institucion( ) {
		
		
	}

	public static  Institucion getSingletonInstitucion() {
		if (singletonInstitucion == null) {
			singletonInstitucion = new Institucion( );
			
			
		}
		return singletonInstitucion;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	
	
	
}
