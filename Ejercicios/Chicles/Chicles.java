import  java.util.Scanner;
public class Chicles{
    public static void main(String[] args) {
    }        Scanner sc = new Scanner(System.in);
        /*
    Los datos que necesitaremos regitrar, en el programa serán:
    Los de entrada:
    - Número de envoltorios necesarios para cumplir la oferta (integer)
    - Número de chicles que se regalan al cumplir la condición para recibir la oferta. (integer)
    - Número de chicles que comprar inicialmente (Es el número de envoltorios que tendrá el usuario) (integer)

    Los de salidad:
    - Número de chicles que comemos ( la suma de lo que compramos y obtenemos al recibir chicles adicionales) (integer)
    - Número de envoltorio finales (integer)

    Para que la oferta se arruine, únicamente se debe cumplir que:

    La cantidad de envoltorio necesarios para cumplir la oferta sea menor que la cantidad de chicles que te dan al
    cumplir esa condición de oferta

    Ejemplo:

    2 envoltorio te den 5  -> compro 2 chicles -> medan 1 - tengo 7 chicles en total -> 7/2 = 1 y resto 1 (pierdo) ruina

    Ejemplo

    5 envoltorio -> 1
    compro 25 chicles -> me dan 5 chicles
    De eso cinco chicle que me han dado, me dan uno más
    Entonces 25 de lo que me compro, + 5 que me dan el la primera , y 1 en la segunda da un total de 31 chicles

    Entrada
    5 1 25
    2 5 2
    0 0 0 //para que acabe ya las pruebas lo tres números deben ser 0  (el usuario puede poner cuantas pruebas quiera)

    Salida
    31
    RUINA
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

            // Comporbamos si la entrada de los tres son 0
            if (num_envoltorios_necesarios != 0 || num_chicles_oferta != 0 || num_chicles_comprados != 0) {

                // Comprobamos la condición de RUINA
                if (num_chicles_oferta >= num_envoltorios_necesarios && num_chicles_comprados >= num_envoltorios_necesarios) {
                    System.out.println("RUINA");
                } else {
                    int total_chicles_comidos = num_chicles_comprados;
                    int numero_envoltorio_tengo = num_chicles_comprados;

                    // Lógica para calcular los chicles obtenidos y los envoltorios restantes
                    while (numero_envoltorio_tengo >= num_envoltorios_necesarios) {
                        int chicles_veces_oferta  = numero_envoltorio_tengo / num_envoltorios_necesarios;// Cuantas veces se podra aplicar la oferta.
                        int chicles_nuevos = chicles_veces_oferta * num_chicles_oferta;

                        total_chicles_comidos += chicles_nuevos;
                        numero_envoltorio_tengo = (numero_envoltorio_tengo % num_envoltorios_necesarios) + chicles_nuevos;
                    }

                    // Mostramos el total de chicles comidos y los envoltorios sobrantes separados por espacio
                    System.out.println(total_chicles_comidos + " " + numero_envoltorio_tengo);
                }
            }

        } while (num_envoltorios_necesarios != 0 && num_chicles_oferta != 0 && num_chicles_comprados != 0);

        System.out.println("Apagando ...");
    }
}