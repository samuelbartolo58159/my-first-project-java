package ejerciciosLogica;

import java.util.Scanner;

/* Descripción: Se está subastando un artículo valioso. El programa pide primero el "Precio
Base" del artículo. A partir de ahí, de forma indefinida, diferentes compradores van
ingresando sus ofertas económicas.
● Las condiciones: Una oferta solo es válida si es estrictamente mayor que la oferta
más alta registrada hasta ese momento. Si un comprador ingresa una oferta menor o
igual, el sistema la rechaza y muestra un mensaje de "Oferta insuficiente". El
proceso termina cuando se ingresa una oferta de 0. Al cerrar la subasta, el programa
debe mostrar el precio final de venta y el número total de ofertas válidas que se
hicieron durante todo el proceso. */
public class ejercicio8 {
    static Scanner teclado = new Scanner(System.in);
    static int precioBase = 0;
    static double oferta = 0;
    static int totalOfertas = 0;
    static double ofertaMayor = 0;

    public static void main(String[] args) {
        System.out.println("\ncoloque el precio base del articulo");
        precioBase = teclado.nextInt();
        while (true) {
            System.out.println("\nIngrese su oferta (0 para finalizar):");
            oferta = teclado.nextDouble();
            if (oferta == 0) {
                System.out.println("\nla subasta a finalizado");
                break;
            } else if (oferta > ofertaMayor && oferta > precioBase) {
                ofertaMayor = oferta;
                totalOfertas++;
                System.out
                        .println("\noferta numero: " + totalOfertas + " con valor de " + oferta + "pesos" + " aceptada");
            } else {
                System.out.println("\nOferta insuficiente \n debe ser mayor al precio mas alto del momento");
            }
        }
        System.out.println("\nPrecio final de venta: " + ofertaMayor);
        System.out.println("\nNúmero total de ofertas válidas: " + totalOfertas);
    }

}
