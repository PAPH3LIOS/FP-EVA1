/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_variables;

/**
 *
 * @author invitado
 */
public class EVA1_2_VARIABLES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TIPOS DE DATOS EN JAVA
        System.out.println("HOLA MUNDO!!"); // CADENA DE TEXTO (LLEVA "")
        System.out.println(100); // NUMERO ENTERO (NO LLEVA NADA)
        System.out.println('c'); // CARACTER (LLEVA '')
        // VALORES LOGICOS (TRUE, FALSE)
        System.out.println(true);
        System.out.println(false);
        System.out.println(1000.52); // NUMEROS CON FRACCION (CON PUNTO FLOTANTE)
        
        // TIPOS DE DATOS (USO GENERAL EN LA MATERIA)(HAY MAS)
        // ENTEROS: int, long, byte, short
        // PUNTO FLOTANTE: double, float
        // TEXTO: String
        // CARACTER: char
        // LOGICOS (true, false): boolean
        
        // DECLARACION: tipo_de_dato <---- NOMBRE DE LA VARIABLE
        // QUE OPERACIONES DEBE O PUEDE HACER
        // CUANTA MEMORIA VA A UTILIZAR
        
        //CREACION Y USO DE VARIABLES
        int edad; // DECLARO UNA VARIABLE DE TIPO ENTERO LLAMADA EDAD
        // double edad; <---- NO PODEMOS TENER DOS VARIABLES CON EL MISMO NOMBRE
        // double edad2; <---- VALIDO PARA DECLARAR OTRA VARIABLE "EDAD"
        String nombre;
        String apellido;
        double promedio;
        
        // ASIGNACION: PONER UN VALOR A LA VARIABLE
        // nombre_de_la_variable = valor;
        
        edad = 18; //ASIGNO EL VALOR 18 DENTRO DE LA VARIABLE EDAD
        System.out.println(edad); // println TAMBIEN IMPRIME VARIABLES
    }
    
}
