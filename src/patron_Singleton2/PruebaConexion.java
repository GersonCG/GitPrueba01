package patron_Singleton2;
public class PruebaConexion {
    public static void main(String[] args) {
        //CONSTRUCTOR NO ACCESIBLE POR SER "private"
        //Conexion c = new Conexion();
        //OBTENE INSTANCIA MEDIANTE MÉTODO
        Conexion c = Conexion.getInstancia();
        //INVOCA MÉTODOS FUNCIONALES
        System.out.println("**** Objeto c ****");
        c.conectar();
        c.desconectar();
        //VERIFICA PATRÓN
        boolean res = c instanceof Conexion;
        System.out.println("¿El objeto c es instancia de Clase Conectar?: "+res);
        System.out.println("Código Hash de objeto c creado: "+c.hashCode());
        
        System.out.println("**** Objeto c2 ****");
         //OBTENE INSTANCIA MEDIANTE MÉTODO
        Conexion c2 = Conexion.getInstancia();
        //INVOCA MÉTODOS FUNCIONALES
        c2.conectar();
        c2.desconectar();
        //VERIFICA PATRÓN
        res = c2 instanceof Conexion;
        System.out.println("¿El objeto c2 es instancia de Clase Conectar?: "+res);
        System.out.println("Código Hash de objeto c2 creado: "+c2.hashCode()); 
     
System.out.println("**** Objeto c3 ****");        
        //HILO DE EJECUCIÓN
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                //OBTIENE INSTANCIA
                Conexion c3 = Conexion.getInstancia();
                //INVOCA MÉTODOS FUNCIONALES
                c3.conectar();
                c3.desconectar();
                //VERIFICA NATURALEZA DE OBJETO Conexion
                boolean res = c3 instanceof Conexion;
                System.out.println("¿El objeto c3 es instancia de Clase Conectar?: "+res);
                System.out.println("Código Hash de objeto c3 creado en Thread t: "+c3.hashCode());
            }
        });
        t.start();
    }
}