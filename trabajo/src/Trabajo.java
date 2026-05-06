import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Trabajo {

    static ArrayList<String> mensajes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z"};
    public static void main(String[] args) {
        menu();
    }

    public Trabajo() {


    }

    public static void menu(){

        System.out.println("Cuantos mensajes quieres introducir?");
        int numMe = sc.nextInt();
        int contador = 1;sc.nextLine();
        for (int i = 0; i < numMe; i++) {

            System.out.println("Mensaje" + contador++ + ": ");
            String men = sc.nextLine();

            mensajes.add(men);

        }

        System.out.println("Salida del programa:");
        System.out.println("---MENSAJES ORIGINALES---");

        for (int k = 0; k < numMe; k++) {
            System.out.println(mensajes.get(k));
        }



    }



}
