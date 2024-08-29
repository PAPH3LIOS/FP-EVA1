import java.util.Scanner;

public class EVA1_5_DATOS_SCANNER {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // DECLARACION DE LAS VARIABLES
        String marca;
        String modelo;
        int year;
        double precio;

        // COMO SE CAPTURA? (SCANNER)
        // HERRAMIENTA --> CLASE: NOS PROPORCIONA MUCHAS HERRAMIENTAS
        Scanner captura; // DECLARAMOS LA HERRAMIENTA, PREVIAMENTE HAY QUE IMPORTARLA (HACER UN import)
        captura = new Scanner(System.in); // CREAMOS LA HERRAMIENTA
        
        // HAY QUE INDICAR AL USUARIO QUE CAPTURAR
        System.out.println("Introduzca la marca del vehiculo");
        // CAPTURAMOS UNA ASIGNACION
        marca = captura.nextLine(); // REGRESA TODO EL TEXTO QUE SE INTRODUZCA HASTA PRESIONAR LA TECLA "Enter"
        System.out.println("Introduzca el modelo del vehiculo");
        modelo = captura.nextLine();
        System.out.println("Introduzca el year del vehiculo");
        year = captura.nextInt();
        System.out.println("Introduzca el precio del vehiculo");
        precio = captura.nextDouble();

        System.out.println("Datos capturados---------");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio);

    }
}
