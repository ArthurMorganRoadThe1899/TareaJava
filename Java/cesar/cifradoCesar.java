package Programacion.Java.cesar;
import java.util.Scanner;

public class cifradoCesar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] abecedario = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String rS;

        System.out.println("Dime una palabra, y la cifrare con el cifrado César de la magnitud de desplazamiento que busques.");

            do{
        rS = in.nextLine(); // Palabra a cifrar
            }while(rS.isEmpty());

        System.out.println("¿Que tipo de cifrado César quieres utilizar?");
        int rC = in.nextInt(); // Número de rotación

        char [] rCS = rS.toCharArray(); // array de carácteres basado en la palabra a cifrar

        // Cifrado
        for(int i = 0; i < abecedario.length; i++){
            if(rCS[i] == abecedario[i]){ // Corregir

            }
        }

    }
}

/*
// Storm IDEAS //
    usar un CharAt para almacenar el contenido del String en un array de letras

// URLs //
    http://puntocomnoesunlenguaje.blogspot.com/2016/02/cifrado-cesar-java.html
 */