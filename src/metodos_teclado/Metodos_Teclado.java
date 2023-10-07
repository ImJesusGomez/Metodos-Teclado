package metodos_teclado;

import java.io.*;
import java.util.*;

public class Metodos_Teclado {

    public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    //throws IOException es un comando que se coloca en cualquier metodo que queramos pedir datos de teclado
    //Lo que hacemos con las excepciones es controlar los errores que de el usuario
    public static void main(String[] args) throws IOException {

        System.out.println("Cuantos numeros quieres ingresar?>");
        int tam = Integer.parseInt(teclado.readLine());

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < tam; i++) {
            numeros.add(pedirInt());
        }

        System.out.println("Numeros almacenados correctamente");

        imprimirArrInt(numeros);

        System.out.println("Cuantos textos quieres ingresar?> ");
        int veces = Integer.parseInt(teclado.readLine());

        ArrayList<String> textos = new ArrayList<>();

        for (int k = 0; k < veces; k++) {
            textos.add(pedirString());
        }

        imprimirArrString(textos);

    }

    public static int pedirInt() throws IOException {
        System.out.println("Escribe un numero> ");
        int num = Integer.parseInt(teclado.readLine());
        
        return num;
    }

    public static void imprimirArrInt(ArrayList<Integer> arreglo) {
        //For each creado para recorrer arreglos numericos
        System.out.println("Los numeros son: ");
        for (int i : arreglo) {
            System.out.println(i);
        }
    }

    public static String pedirString() throws IOException {
        System.out.println("Escribe un texto> ");

        String texto = teclado.readLine();
        return texto;

    }

    public static void imprimirArrString(ArrayList<String> arr) {
        System.out.println("Los textos son: ");

        for (String palabra : arr) {
            System.out.println(palabra);
        }

    }
}
