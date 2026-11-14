import java.util.Scanner;
public class Descendente {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce los numero");

    // Leemos el primer número
    int numero = sc.nextInt();


    // Mientras no sea 0, procesamos el caso
    while (numero != 0) {
      int numero_orig = numero;
      int divisor = 1;
      int temporal = numero;



      // 1. Buscamos el divisor (ej. para 4578 -> 1000)
      while (temporal >= 10) {
        temporal /= 10;
        divisor *= 10;
      }

      int sumaTotal = 0;



//Pon tu lo de la suma descente sabiendo ya el divisor necesario para el numero. Danke!!



      // 3. Imprimimos el resultado en una línea
      System.out.println(sumaTotal);



      // 4. Leemos el siguiente número (o el 0 para salir)
      numero = sc.nextInt();
    }
  }
}