import java.util.Scanner;

public class EVA1_12_CALIFAS {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // DECLARACION DE VARIABLES
        int calificacion;
        Scanner captura = new Scanner (System.in);

        // CAPTURA DE DATOS
        System.out.println("Capture la calificacion:");
        calificacion = captura.nextInt();

        // EVALUAR SI ACREDITAS (MAYOR O IGUAL A 70) O NO ACREDITAS (MENOR A 70)
        if (calificacion >= 70) {
            System.out.println("ACREDITAS");
        }else {
            System.out.println("NA");
        }
    }
}
