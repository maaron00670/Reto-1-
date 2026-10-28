import java.util.Scanner;
public class Chicles {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
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


    while (num_chicles_comprados !== 0 && num_chicles_oferta !== 0 && num_envoltorios !== 0) {
      System.out.println("Dime el número de envoltorios que se necesita para que te den los chicles; El número de " +
          "chicles que te dan al cumplir el núemro de envoltorios, y por último el número de chicles que vas a comprar");
      int num_envoltorios_necesarios = sc.nextInt();
      int num_chicles_oferta = sc.nextInt();
      int num_chicles_comprados = sc.nextInt();
      if(num_envoltorios_necesarios<=num_chicles_oferta){
       System.out.println("Ruina");
      }
      else{
        int numero_envoltorio_tengo = num_chicles_comprados;
        int total_chicles_comidos = num_chicles_comprados;
        int chicles_obtenidos = 0; // Los chiles que obtengo gracias a la oferta

        while (numero_envoltorio_tengo>=num_envoltorios_necesarios) {  //aqui aplicamos la operacion nc= env_teng/envol_nec chicles que obtengo
        }
      }
    }
  }
}
