import java.util.Scanner;

public class EVA1_11_IF {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // SOLICITAMOS LA EDAD
        int edad;
        Scanner captura = new Scanner (System.in);

        System.out.println("Captura la edad:");
        edad = captura.nextInt();

        // DETERMINAR SI ES ADULTO O NO
        // LAS OPERACIONES LOGICAS SOLO GENERAN COMO RESULTADO UN VERDADO O UN FALSO
        // SI SON VARIAS INSTRUCCIONES HAY QUE AGRUPARLAS CON LLAVES
        if(edad >= 18) { // BLOQUE PARA EL VERDADERO
            System.out.println("ES UN ADULTO");
        }else { // BLOQUE PARA EL FALSO (OPCIONAL)
            System.out.println("MENOR DE EDAD!!");
        }

    }
}
