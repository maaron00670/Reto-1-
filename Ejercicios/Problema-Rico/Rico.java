import java.util.Scanner;
public class Rico {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /*
    Datos que sabemos:
    Los compartimentos están escalonados, es decir que uno es más pequeño que el otro.
    Datos de entrada:
    - Número de pruebas (integer)
      - Son 3 datos: (en la misma línea se introducen
         · Numero de Compartimentos/Acuarios (integer)
         · Numero de Litros que tiene el Compartimento/Acuario más grande (double/float)
         · La diferencia de litros entre los Compartimentos/Acuarios (integer/double)
    Datos de salida
    - Número de Litors que tiene que comprar cada prueba (double)
    Ejemplo de entrada:
    4 // Son 4 pruebas
      4 400 100  // 400 300 200 100 => la suma es 1000
      3 600 200  // 600 400 200   => la suma es 1200
      3 300 100  // 300 200 100   => la suma es 600
      2 200 100  // 200 100       => la suma es 300

    Ejemplo de salida:
    1000
    1200
    600
    300
     */

    System.out.println("Dime el número de casos que quiere realizar");
    int casos = sc.nextInt();
    for (int i = 0; i < casos ; i++){
      System.out.println("Caso número" + (i+1) + ":");
      System.out.println("Dime el número de acuarios/compartimentos, los litros que tiene el acuario7compartimento" +
          " mas grande y la diferencia de litros quetiene los acuarios/compartimentos");
      long num_acuarios/compartimentos = sc.nextInt();
      long litros_mayor = sc.nextInt();
      long diferencia_litros = sc.nextInt();
    }
  }
}