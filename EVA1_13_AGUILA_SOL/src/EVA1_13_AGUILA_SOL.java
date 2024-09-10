public class EVA1_13_AGUILA_SOL {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // ALEATORIDAD --> HERRAMIENTA DE JAVA GENERA NUMEROS ALEATORIOS
        double valor = Math.random(); // RANDOM GENERA VALORES >= 0 Y < a 1 ENTRE 0 Y .999999999999
        
        // PUEDE SER (< 0.5) O (>= 0.5)
        if(valor < 0.5) {
            System.out.println("AGUILA");
        }else {
            System.out.println("SOL");
        }
    }
}
