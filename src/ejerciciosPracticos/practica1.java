package ejerciciosPracticos;

import java.util.Scanner;

public class practica1 {

    static int contador_consecutivos = 0;
    static double temperatura = 0.0;

    public static void main(String[] args) {
        while (contador_consecutivos < 3) {
            System.out.println("coloque la temperatura");
            Scanner teclado = new Scanner(System.in);
            temperatura = teclado.nextDouble();
            if (temperatura > 100) {
                System.out.println("La temperatura ingresada es: " + temperatura);
                contador_consecutivos++;
                System.out.println("contador: " + contador_consecutivos);
            } else {
                System.out.println("La temperatura ingresada es: " + temperatura);
                contador_consecutivos = 0;
                System.out.println("contador reiniciado a: " + contador_consecutivos);
            }
            if (contador_consecutivos == 3) {
                System.out.println("Alerta: Se han registrado tres temperaturas consecutivas superiores a 100 grados.");
                break;
            }
        }
    }
}
