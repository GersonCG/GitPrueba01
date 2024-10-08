package patron_singleton;

public class PruebaSingleton {
    public static void main(String[] args) {
      //CONSTRUCTOR NO PERMITIDO
      //ClaseSingleton objSingleton = new ClaseSingleton();

      //OBTIENE ÚNICA INSTANCIA CON MÉTODO
      ClaseSingleton objSingleton = ClaseSingleton.getInstancia();

      //MUESTRA UN MENSAJE
      objSingleton.mostrarMensaje();
      
      objSingleton.mostrarIdentidad();
      
   }    
}
