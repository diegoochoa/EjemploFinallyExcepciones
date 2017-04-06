/**
 * Created by Alumnos on 06/04/2017.
 */
public class NuevasExcepciones {

    public static void main(String [] args){
        System.out.println("Ejemplo de Finally");
        try {
            Alumno a1= new Alumno(-123,"");
            Alumno a2= new Alumno(123,null);
            noLanzaExcepcion();
            lanzaExcepcion();
        }
        catch(MiExcepcion miExcepcion){
            System.out.println(miExcepcion);
        }
    }

    private static void lanzaExcepcion() {
        try{
            System.out.println("Metodo lanzaExcepcion");
            throw new MiExcepcion("Probando mi excepcion");
        }
        finally{
            System.out.println("Se ejecuta finally en lanzaExcepcion");
        }
    }

    private static void noLanzaExcepcion() {

        try{
            System.out.println("Hola");

        }
        catch(MiExcepcion miExcepcion)
        {
            System.out.println("No hay nada que atrapar");
        }
        finally{
            System.out.println("Se ejecuta finally en noLanzaExcepcion");
        }
    }

    private static void metodo1() throws MiExcepcion{

        throw new MiExcepcion("Aqui lanzando una excepcion");
    }
}
