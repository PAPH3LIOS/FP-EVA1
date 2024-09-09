public class EVA1_8_OPERACIONES2 {
    public static void main(String[] args) {
        
        String nombre = "Ruben";
        String apellido = "Hernandez";
        String nombreComp;
        // CADENAS DE TEXTO, LA OPERACION SE LLAMA CONCATENACION --> UNIR CADENAS DE TEXTO
        // EL OPERADOR DE CONCATENACION ES EL +
        // CUANDO UN SIMBOLO TIENE VARIAS FUNCIONES SE LE LLAMA SOBRECARGA (DE OPERADORES)
        nombreComp = nombre + " " + apellido;
        
        System.out.println("El nombre es: " + nombre);
        System.out.println("El apellido es: " + apellido);
        System.out.println("El nombre completo es: " + nombreComp);
    }
}
