import java.util.Scanner;

public class EVA1_9_CONVERSIONES {
    /**
     * @param args
     */
    public static void main(String[] args) {
        double farenheit, centigrados, kelvin;

        Scanner captura = new Scanner (System.in);
        
        //FARENHEIT A CENITGRADOS
        System.out.println("Introduzca los grados en Farenheit:");
        farenheit = captura.nextDouble();
        // ºC = (ºF - 32) / 1.8
        centigrados = (farenheit - 32) / 1.8;
        System.out.println("ºC = " + centigrados);
        
        // CENTIGRADOS A FARENHEIT
        System.out.println("Introduzca los grados en Centigrados:");
        centigrados = captura.nextDouble();
        // ºF = ºC x 1.8 + 32
        farenheit = centigrados * 1.8 + 32;
        System.out.println("ºF = " + farenheit);

        // CENTIGRADOS A KELVIN
        System.out.println("Introduzca los grados en Centigrados:");
        kelvin = captura.nextDouble();
        // K = ºC + 273.15
        kelvin = centigrados + 273.15;
        System.out.println("K: " + kelvin);

    }
}
