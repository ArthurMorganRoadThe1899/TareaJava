package Programacion.Java.Proyecto;
import java.util.Scanner;

public class proyecto_JAA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===\n" +
                "Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa Leia, Luke\n" +
                "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada\n" +
                "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio\n" +
                "está construyendo para destruirla.");

        System.out.println();
        System.out.println("PRESIONA ENTER PARA CONTINUAR...");
        String eR = in.nextLine();

        int b1 = 0;
        int S1 = (int) (Math.random() * (10 + 1));
        int S2 = (int) (Math.random() * (30 + 20));
        int total = 0;
        int r1 = 0;

            System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al\n" +
                    "sistema " + S1 + " en el sector "+ S2 + ", pero el sistema de navegación está estropeado y el\n" +
                    "computador tiene problemas para calcular parte de las coordenadas de salto.\n" +
                    "Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n" +
                    "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n" +
                    "calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n" +
                    "¿Qué debe introducir?");


            for (int i = S1; i <= S2; i++) {
                total += i; // La respuesta es esta variable
            }
        do {
            System.out.println(total);
            r1 = in.nextInt();
        }while(r1 != total);

    }
}