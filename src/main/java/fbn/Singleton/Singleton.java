package fbn.Singleton;

public class Singleton 
{
    public static void main( String[] args )
    {
         /* 
           You can only see one instance of the Institution class
          
           */
      
		 
    	Institucion intitucion1 = Institucion.getSingletonInstitucion();
		Institucion intitucion2 = Institucion.getSingletonInstitucion();
		
		intitucion1.setNombre("ESCUELA SUPERIOR POLITÉCNICA DE CHIMBORAZO");
    	System.out.println(intitucion2.getNombre());
    	
    	
    }
}
