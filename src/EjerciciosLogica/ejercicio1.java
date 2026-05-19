package ejerciciosLogica;

import java.util.Scanner;

/* Descripción: Una máquina empaqueta dulces continuamente. El usuario debe ingresar el
peso de cada dulce que pasa por la banda transportadora (uno por uno). El peso ideal es de
exactamente 10 gramos. El flujo de datos se detiene cuando el usuario ingresa un peso de
0.
● Las condiciones: Si un dulce pesa menos de 8 gramos o más de 12 gramos, es un
"dulce defectuoso". Si la máquina detecta 3 dulces defectuosos seguidos, debe
emitir una alerta de "Detención de Emergencia" y el programa termina
inmediatamente. Al final del programa (ya sea por ingresar 0 o por la emergencia),
se debe mostrar el total de dulces aprobados y el porcentaje de dulces defectuosos
procesados. */
public class ejercicio1 {
    static int total = 0;
    static int dulce = 0;
    static int dulcesdefectuosos = 0;
    static double peso = 0;
    static int contador = 0;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nIngrese el peso del dulce: ");
            peso = teclado.nextDouble();
            if (peso >= 8 && peso <= 12) {
                System.out.println("\npeso ideal de dulce");
                dulce++;
                if (contador > 0){
                    contador = 0;
                    System.out.println("\ncontador reiniciado a: " + contador);
                }
            } else if (peso <= 0) {
                if (peso == 0) {
                    System.out.println("error detectado, peso = 0");
                    break;
                } else {
                    System.out.println("error detectado, peso negativo");
                    break;
                }
            } else {
                System.out.println("dulce defectuoso");
                contador++;
                dulcesdefectuosos++;
                System.out.println("defectuosos: " + contador + " de 3");
                if (contador == 3) {
                    System.out.println("\nemergencia, se han detectado 3 defectuosos consecutivos");
                    break;
                }
            }
        }
        total = dulce + dulcesdefectuosos;
        System.out.println("\ntotal de dulces aprobados: " + dulce);
        System.out.println("\nporcentage de dulces defectuosos " + ((dulcesdefectuosos * 100) / total) + "%");
    }
}
