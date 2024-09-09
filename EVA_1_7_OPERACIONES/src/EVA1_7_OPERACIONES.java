public class EVA1_7_OPERACIONES {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //OPERACIONES ARITMETICAS
        
        int x = 10; // DECLARACION Y ASIGNACION;
        int y = 5;
        // DECLARACION DE MULTIPLES VARIABLES DEL MISMO TIPO
        int suma, resta, division, multiplicacion, potencia, raiz;

        // SUMA Y RESTA
        suma = x + y; // OPERADOR DE SUMA "+"
        System.out.println("Suma de x + y:");
        System.out.println(suma);

        resta = x - y; // OPERADOR DE DIFERENCIA "-"
        System.out.println("Resta de x - y:");
        System.out.println(resta);

        //MULTIPLICACION
        multiplicacion = x * y; //OPERADOR DE MULTIPLICACION "*"
        System.out.println("Multiplicacion de x * y:");
        System.out.println(multiplicacion);

        // DIVISION --> EL MANEJO DE TIPOS DE DATOS (ENTEROS O CON PUNTO DECIMAL)
        // SI DIVIDIMOS ENTEROS, JAVA DA COMO RESULTADO UN ENTERO
        division = x / y;
        System.out.println("Division de x(10) / y(5):");
        System.out.println(division);
        // CAMBIAMOS LOS VALORES DE X  Y
        // DIVISION DE NUMEROS CON PUNTO DECIMAL ERRONEA (CON VALORES ENTEROS "int")
        x = 11;
        x = 3;
        division = x / y;
        System.out.println("Division de x(11) / y(3):");
        System.out.println( division);
        // DIVISION DE NUMEROS CON PUNTO DECIMAL CORRECTA (CON VALORES PUNTO FLOTANTE "double")
        double val1 = 11;
        double val2 = 3;
        double divisionD;
        divisionD =val1 / val2;
        System.out.println("Division entre numeros decimales");
        System.out.println(divisionD);
    }
}
