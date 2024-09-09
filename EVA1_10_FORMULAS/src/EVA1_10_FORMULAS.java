import java.util.Scanner;

public class EVA1_10_FORMULAS {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // ASIGNACION DE VARIABLES
        double vI, a, d, t;

        Scanner captura = new Scanner (System.in);

        // CAPTURA DE DATOS
        System.out.println("Introduzca la velocidad inicial:");
        vI = captura.nextDouble();
        System.out.println("Introduzca la aceleracion:");
        a = captura.nextDouble();
        System.out.println("Introduzca el tiempo:");
        t = captura.nextDouble();

        // OPERACION PARA OBTENER EL RESULTADO
        d = vI * t + (a * t * t) / 2;

        // IMPRESION DE RESULTADO
        System.out.println("La distancia es igual a: " + d);
        

    }
}
