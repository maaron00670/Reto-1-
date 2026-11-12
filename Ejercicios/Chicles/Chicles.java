import java.util.Scanner;

public class Chicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            Los datos que necesitaremos registrar, en el programa serán:
            Los de entrada:
        - Número de envoltorios necesarios para cumplir la oferta (integer)
        - Número de chicles que se regalan al cumplir la condición para recibir la oferta. (integer)
        - Número de chicles que comprar inicialmente (Es el número de envoltorios que tendrá el usuario) (integer)

            Los de salida:
        - Número de chicles que comemos (la suma de lo que compramos y obtenemos al recibir chicles adicionales) (integer)
        - Número de envoltorios finales (integer)

            Para que la oferta se arruine, únicamente se debe cumplir que:
            La cantidad de envoltorio necesarios para cumplir la oferta sea menor o igual que la cantidad de chicles que te dan.
         */

        System.out.println("Dime el número de envoltorios que se necesita para que te den los chicles; El número de " +
                "chicles que te dan al cumplir el número de envoltorios, y por último el número de chicles que vas a comprar:");

        int num_envoltorios_necesarios;
        int num_chicles_oferta;
        int num_chicles_comprados;

        do {
            num_envoltorios_necesarios = sc.nextInt();
            num_chicles_oferta = sc.nextInt();
            num_chicles_comprados = sc.nextInt();

            // Evitamos procesar si los tres son 0 en esta iteración
            if (num_envoltorios_necesarios != 0 || num_chicles_oferta != 0 || num_chicles_comprados != 0) {

                // Comprobamos la condición de RUINA
                if (num_chicles_oferta >= num_envoltorios_necesarios && num_chicles_comprados >= num_envoltorios_necesarios) {
                    System.out.println("RUINA");
                } else {
                    int total_chicles_comidos = num_chicles_comprados;
                    int numero_envoltorio_tengo = num_chicles_comprados;

                    // Lógica para calcular los chicles obtenidos y los envoltorios restantes
                    while (numero_envoltorio_tengo >= num_envoltorios_necesarios) {
                        int grupos = numero_envoltorio_tengo / num_envoltorios_necesarios;
                        int chicles_nuevos = grupos * num_chicles_oferta;

                        total_chicles_comidos += chicles_nuevos;
                        numero_envoltorio_tengo = (numero_envoltorio_tengo % num_envoltorios_necesarios) + chicles_nuevos;
                    }

                    // Imprimimos el total de chicles comidos y los envoltorios sobrantes separados por espacio
                    System.out.println(total_chicles_comidos + " " + numero_envoltorio_tengo);
                }
            }

        } while (num_envoltorios_necesarios != 0 && num_chicles_oferta != 0 && num_chicles_comprados != 0);

        System.out.println("Apagando ...");
    }
}