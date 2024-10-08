package patron_singleton;
public class ClaseSingleton {
  //CREA UNA INSTANCIA DE LA CLASE ClaseSingleton
   private static final ClaseSingleton instancia = new ClaseSingleton();

   //MÉTODO CONSTRUCTOR PRIVADO PARA EVITAR LA INSTANCIACIÓNDE OBJETOS
   private ClaseSingleton(){}

   //MÉTODO PARA OBTENER UNA SOLA INSTANCIA
   public static ClaseSingleton getInstancia(){
      return instancia;
   }
   //MÉTODO FUNCIONAL
   public void mostrarMensaje(){
      System.out.println("Mensaje creado por objeto Singleton!");
   }   
   //OTRO MÉTODO FUNCIONAL
   public void mostrarIdentidad(){
       System.out.println("Diseñado con patrón Singleton");
   }
}
