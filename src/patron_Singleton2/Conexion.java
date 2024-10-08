package patron_Singleton2;
public class Conexion {
    //DECLARACIÓN
    private static Conexion instancia;
    //CONSTRUCTOR PRIVADO, 
    //ANULA -> Conexion instancia = new Conexion();	
    private Conexion() {		
    }	
    //MÉTODOD PARA OBTENER UNA INSTANCIA
    //ES "static" PERMITE ACCESO Clase.metodo
    //ES "synchronized" PARA ESCENARIOS CON threads
    public synchronized static Conexion getInstancia() {
        if(instancia == null) {
            instancia = new Conexion();
	}
	return instancia;
    }	
    //MÉTODO FUNCIONAL
    public void conectar() {
	System.out.println("Conexión exitosa a la BD");
    }	
    //MÉTODO FUNCIONAL
    public void desconectar() {
	System.out.println("Desconexión exitosa de la BD");
         //Hola estas?? estoy bien sisiis
    }
}