package EjerciciosLogica;

import java.util.Scanner;

/* Descripción: Un ascensor de carga en un edificio de 15 pisos tiene un límite de peso
máximo de 1000 kg y un límite de 8 personas. El programa debe pedir al usuario que
ingrese, uno a uno, el peso de las personas que van subiendo.
● Las condiciones: El programa debe dejar de pedir datos en el momento en que se
cumpla cualquiera de las siguientes tres condiciones: que se alcance el peso
máximo, que se llene el cupo de personas, o que el usuario ingrese un peso de -1
(que significa que ya no hay más personas en la fila). Si la última persona que
intentó subir hace que el peso supere los 1000 kg, el ascensor no debe permitirle
subir, debe ignorar su peso y cerrar las puertas de forma segura. Al final, indica
cuántas personas subieron y el peso total real.
 */
public class ejercicio2 {
    static int contador = 0;
    static double peso = 0;
    static double pesototal = 0;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        for (int sumapersonas = 1; sumapersonas <= 8; sumapersonas++) {
            contador++;
                System.out.println(
                        "\n-ingrese el peso de cada personas una por una, \n-si desea cerrar las puertas y que nadie mas entre al ascensor ingrese un valor de peso menor o igual a 0 ");
                peso = teclado.nextDouble();
                if (peso <= 0) {
                    System.out.println("\nse a indicado el cierre de puertas, no se permiten mas personas");
                    contador--;
                    break;
                } else {
                    pesototal += peso;
                    if (pesototal < 1000) {
                        System.out.println("\npersona #" + contador + " peso:" + peso + "kg, subio al ascensor");
                        System.out.println("peso total actual:" + pesototal + "kg");
                    } else {
                        System.out
                                .println("peso maximo alcanzado, el ascensor no permite que ingresen mas personas");
                        pesototal -= peso;
                        contador--;
                        break;
                    }
                }
            }
            System.out.println("\npeso total final:" + pesototal + "kg");
        
        System.out.println("total de personas que subieron: " + contador);

    }
}
