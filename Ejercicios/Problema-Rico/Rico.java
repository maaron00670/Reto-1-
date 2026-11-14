import java.util.Scanner;
public class Rico {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime el numero de casos a realizar");
    int casos = sc.nextInt();

    /*
    Falta verificar que tanto numAcuarios, litros y difLitros esten entre 0 y 10000
    Lo suyo seria hacer que si alguno de ellos no esta dentro de ese rango
    le hagamos repetir el introducir los valores desde el principio
    */

      for (int i = 0; i < casos; i++) {
        System.out.println("");
        System.out.println("Caso " + (i + 1) + ":");
        System.out.println("");
        int litros;
        int difLitros;
        int numAcuarios;
        do{
        System.out.println("Dime el numero de compartimentos del acuario");
        numAcuarios = sc.nextInt();
        System.out.println("");
        System.out.println("Dime el la capazidad del litros del mas grande");
        litros = sc.nextInt();
        System.out.println("");
        System.out.println("Dime la diferencia de litros entre compartimientos adyacentes");
        difLitros = sc.nextInt();
          if (!(0 <= numAcuarios) || !(numAcuarios <= 10000) ||
                  !(0 <= difLitros) || !(difLitros <= 10000) ||
                  !(0 <= litros) || !(litros <= 10000)){

            System.out.println("Vuelve a escribir los datos desde cero");
          }


        }while( 0 <= numAcuarios || numAcuarios <= 10000 ||
                0 <= difLitros|| difLitros <= 10000 ||
                0 <= litros || litros <= 10000 );
        int CantidadLitrosFila = 0;
        int sumaContenedor = 0;

        for (int c = 0; c < numAcuarios; c++) {
          int contenedor = litros - (difLitros * c);
          sumaContenedor = sumaContenedor + contenedor;
          CantidadLitrosFila = sumaContenedor;
        }

        System.out.println("");
        System.out.println("La fila " + (i + 1) + " necesita " + CantidadLitrosFila + " Litros");

      }
    } while( 0 < numAcuarios <= 10000 || 0 < difLitros <= 10000 || 0 < litros )
  }
}