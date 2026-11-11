import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int envoltoriosNecesarios;
int chiclesGratis;
int chiclesIniciales;

while (true) {
System.out.print("Introduce los envoltorios necesarios : ");
envoltoriosNecesarios = sc.nextInt();

System.out.print("Introduce los chicles que te regalan: ");
chiclesGratis = sc.nextInt();

System.out.print("Introduce los chicles iniciales que compras: ");
chiclesIniciales = sc.nextInt();

if (envoltoriosNecesarios == 0 && chiclesGratis == 0 && chiclesIniciales == 0) {
break;
}

if (chiclesIniciales >= envoltoriosNecesarios && chiclesGratis >= envoltoriosNecesarios) {
System.out.println("RUINA");
} else {
int totalChicles = chiclesIniciales;
int envoltorios = chiclesIniciales;

while (envoltorios >= envoltoriosNecesarios) {
int intercambio = envoltorios / envoltoriosNecesarios;
int nuevosChicles = intercambio * chiclesGratis;
totalChicles = totalChicles + nuevosChicles;
envoltorios = envoltorios % envoltoriosNecesarios;
envoltorios = envoltorios + nuevosChicles;
}

System.out.println(totalChicles + " Chicles totales " + envoltorios + " Envoltorios");
}
System.out.println(); // Salto de línea para separar casos
}

sc.close();
}
}

