package EjerciciosLogica;

import java.util.Scanner;

/* Descripción: Para que una contraseña numérica sea segura en un sistema bancario, el
usuario debe ingresar un número entero largo (dígito por dígito). El programa debe analizar
la secuencia mientras los números entran. El proceso de lectura termina cuando se ingresa
un número negativo.
● Las condiciones: La contraseña será rechazada inmediatamente si el usuario
ingresa el mismo dígito tres veces seguidas (ej. 5, 5, 5) o si ingresa una
secuencia de tres números consecutivos ascendentes (ej. 2, 3, 4). Al terminar la
lectura, el programa debe mostrar un mensaje contundente: "Contraseña Segura" o
"Contraseña Insegura", detallando el motivo del rechazo. */
public class ejercicio3 {
    static Scanner teclado = new Scanner(System.in);
    static int numero = 0;
    static String contrasena = "";
    static int contenedor = -1;
    static int contador1 = 0;
    static int contador2 = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println(
                    "\ningrese unicamente un numero entero para añadir a su contraseña, \nsi desea terminarla coloque un numero negativo");
            numero = teclado.nextInt();
            System.out.println("numero ingresado: " + numero);
            if (numero < 0) {
                System.out.println("\ncontraseña finalizada: " + contrasena);
                break;
            } else if (numero < 9 && numero >= 0) {
                contrasena += numero;
                if (numero == contenedor) {
                    contador1++;
                    System.out.println("\ncontador de numeros iguales: " + contador1);
                    contador2 = 0;
                } else if (contenedor < numero && numero < contenedor + 2) {
                    contador2++;
                    System.out.println("\ncontador de secuencias consecutivas: " + contador2);
                    contador1 = 0;
                } else {
                    contador1 = 0;
                    contador2 = 0;
                }
                contenedor = numero;
                if (contador1 == 2 || contador2 == 2) {
                    System.out.println("\ncontraseña insegura");
                    break;

                }
            }else{
                System.out.println("\nnumero no valido, ingrese un numero entre 0 y 9");
            }
        }

        if (contador1 == 2 || contador2 == 2) {
            System.out.println("\ncontraseña interrumpida, intente otra vez");
        } else {
            System.out.println("\ncontraseña " + contrasena + " segura");
        }
    }
}
