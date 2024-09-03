import java.util.Scanner;

public class EVA1_6_PELICULA {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // DECLARACION DE VARIABLES
        String nombre;
        String genero;
        int duracion;
        String reparto;
        String clasificacion;

        // SCANNER
        Scanner captura;
        captura = new Scanner(System.in);
        
        //CAPTURA DE DATOS
        System.out.println("Captura el nombre de la pelicula:");
        nombre = captura.nextLine();
        System.out.println("Captura el genero de la pelicula:");
        genero = captura.nextLine();
        System.out.println("Captura la duracion en segundos de la pelicula:");
        duracion = captura.nextInt();
        captura.nextLine();
        System.out.println("Captura el reparto de la pelicula:");
        reparto = captura.nextLine();
        System.out.println("Captura la clasificacion de la pelicula:");
        clasificacion = captura.nextLine();

        // IMPRESION DE LA CAPTURA DE DATOS
        System.out.println(nombre);
        System.out.println(genero);
        System.out.println(duracion);
        System.out.println(reparto);
        System.out.println(clasificacion);
    }
}
