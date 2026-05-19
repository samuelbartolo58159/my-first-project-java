package ejerciciosLogica;

import java.util.Scanner;

/* Descripción: El usuario introduce un número entero positivo de cualquier cantidad de
dígitos (por ejemplo, 82451). El programa debe procesar este número matemáticamente
para construir un nuevo número que sea exactamente el inverso (en el ejemplo, el resultado
debe ser el número entero 15428).
● Las condiciones: No se permite mostrar los números uno a uno en la consola para
"simular" que se volteó; se debe calcular el valor numérico final en una variable y
mostrar esa única variable al terminar. Tampoco se pueden usar textos ni
conversiones. Al final, el programa debe decir si el número original era un
palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda).
 */
public class ejercicio5 {
    static Scanner teclado = new Scanner(System.in);
    static int numero = 0;
    static int inverso = 0;
    static int ultimoDigito = 0;
    static int backup = 0;

    public static void main(String[] args) {
        System.out.println("Ingrese un número entero positivo:");
        numero = teclado.nextInt();
        backup = numero;
        while (true) {
            if (numero > 0) {
                ultimoDigito = numero % 10;
                inverso = inverso * 10 + ultimoDigito;
                numero = numero / 10;
            } else if (numero == 0) {
                break;
            } else {
                System.out.println("Error: el número ingresado no es positivo.");
                numero = teclado.nextInt();
                backup = numero;
            }
        }

        if (backup != inverso) {
            System.out.println("El número invertido es: " + inverso);
        } else {
            System.out.println("El número es un palíndromo: " + inverso);
        }
    }
}
