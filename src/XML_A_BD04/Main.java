package XML_A_BD04;

/**
 * @author Emersson
 */
public class Main {
    
    public static void main(String[] args) {
        LeerXML leer = new LeerXML();
        BD04 datos = new BD04();
        datos.crearBaseDeDatos();
        datos.verificarDocente(leer.leerXML());
        for(Docente d: datos.leerDocentes()){
            System.out.println(d.toString());
        }
    }
}
