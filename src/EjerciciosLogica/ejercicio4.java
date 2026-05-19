package ejerciciosLogica;

import java.util.Scanner;

/* Descripción: Una tarjeta de transporte público inicia con un saldo que el usuario ingresa.
Luego, el programa simula el uso de la tarjeta simulando diferentes tipos de viaje. El usuario
ingresa un código para cada viaje: 1 para autobús (cuesta $2,500), 2 para metro (cuesta
$3,200) y 3 para transbordo (cuesta $1,000).
● Las condiciones: Si el usuario realiza dos viajes en metro seguidos, el segundo
viaje en metro tiene un descuento y cuesta solo $1,600. Si el saldo no es suficiente
para pagar un viaje, la tarjeta queda en "saldo negativo" (máximo permitido -$4,000)
y se bloquea; a partir de ese momento, el programa ya no debe permitir ingresar
más viajes hasta que el usuario ingrese un código 4 para recargar saldo. El
programa finaliza cuando se ingresa el código 0.
 */
public class ejercicio4 {
    static Scanner teclado = new Scanner(System.in);
    static int saldo = 0;
    static int codigo = 0;
    static int conteo = 0;

    public static void main(String[] args) {
        System.out.println("Ingrese el saldo inicial de la tarjeta:");
        saldo = teclado.nextInt();
        
        while (true) {
                System.out.println(
                        "\ncoloque el codigo del viaje a realizar, \n1 para autobus, 2 para metro, 3 para transbordo, 4 para recargar saldo, 0 para finalizar");
                codigo = teclado.nextInt();
                if (codigo == 1 && saldo >= -4000) {
                    System.out.println("\nviaje en autobus seleccionado");
                    saldo -= 2500;
                    System.out.println("\nsaldo actual: " + saldo);
                    conteo = 0;
                } else if (codigo == 2 && saldo >= -4000) {
                    if (conteo == 1) {
                        saldo -= 1600;
                        System.out.println("\nviaje en metro con descuento seleccionado");
                        System.out.println("\nsaldo actual: " + saldo);
                        conteo = 0;
                    } else {
                        saldo -= 3200;
                        conteo++;
                        System.out.println("\nviaje en metro seleccionado");
                        System.out.println("\nsaldo actual: " + saldo);
                    }
                } else if (codigo == 3 && saldo >= -4000) {
                    saldo -= 1000;
                    System.out.println("\nviaje en transbordo seleccionado");
                    System.out.println("\nsaldo actual: " + saldo);
                    conteo = 0;
                } else if (codigo == 4) {
                    System.out.println("\ningrese el monto a recargar:");
                    saldo += teclado.nextInt();
                    System.out.println("\nsaldo actual: " + saldo);

                } else if (codigo == 0) {
                    System.out.println("\nprograma finalizado");
                    break;
                }else {
                    if (codigo > 0 && codigo < 4) {
                        System.out.println("\nsaldo insuficiente, tarjeta bloqueada, seleccione 4 para rellenar");
                    } else {
                        System.out.println("\ncodigo no valido, intente de nuevo");   
                }
            }
        }
    }
}