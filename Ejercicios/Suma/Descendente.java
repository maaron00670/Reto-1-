import java.util.Scanner;
public class Descendente {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce los numero");

    int numero = sc.nextInt();

    while (numero != 0) {
      int numero_orig = numero;
      int divisor = 1;
      int temporal = numero;

      while (temporal >= 10) {
        temporal /= 10;
        divisor *= 10;
      }

      int sumaTotal = 0;

      while (divisor > 0) {
        sumaTotal += numero;
        numero = numero % divisor;
        divisor /= 10;
      }

      System.out.println(sumaTotal);

      numero = sc.nextInt();
    }
  }
}