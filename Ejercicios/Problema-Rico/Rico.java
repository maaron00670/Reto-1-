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

    /* COMENTARIOS MAZE - temporales

    Se tiene que tener en cuenta que el contenedor mas grande de la fila es EL PRIMERO
    Ningun numero puede ser mayor a 10000 NI >0
     */

    System.out.println("Dime el número de casos a realizar");
    int casos = sc.nextInt();
    for (int i = 0; i < casos ; i++){
      System.out.println("Caso " + (i+1) + ":");
      System.out.println("Dime el numero de compartimentos del acuario");
      int numAcuarios = sc.nextInt();
      System.out.println("Dime el la capazidad del litros del mas grande");
      int litros = sc.nextInt();
      System.out.println("Dime la diferencia de litros entre compartimientos adyacentes");
      int difLitros = sc.nextInt();
      int CantidadLitrosFila = 0;
      int sumaContenedor = 0;
      for (int c = 0; c < numAcuarios ; c++){
        int contenedor = litros - (difLitros * c);
        sumaContenedor = sumaContenedor + contenedor;
        CantidadLitrosFila = sumaContenedor;
      }

      System.out.println("en esta fila necesita " + CantidadLitrosFila);

    }
  }
}