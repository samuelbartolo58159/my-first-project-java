package ejerciciosLogica;

import java.util.Scanner;

/* Descripción: Un explorador entra a una cueva con un tanque que contiene 100 unidades
de oxígeno. En cada turno, el explorador avanza una sala hacia adelante. Al entrar a una
sala, el usuario debe ingresar la dificultad del terreno (un número del 1 al 5).
● Las condiciones: El consumo de oxígeno en cada sala se calcula multiplicando la
dificultad por 3. Además, si la dificultad de la sala actual es mayor que la de la sala
anterior, el explorador se agita y consume 5 unidades de oxígeno adicionales. El
juego termina con éxito si el explorador logra atravesar 10 salas antes de quedarse
sin oxígeno, o termina en fracaso si el oxígeno llega a 0 o menos antes de completar
el camino. El programa debe reportar el estado final y el oxígeno restante. */
public class ejercicio10 {
    static Scanner teclado = new Scanner(System.in);
    static int oxigeno = 100;
    static int dificultad = 0;
    static int dificultadanterior = 5;
    static int contador = 0;
    public static void main(String[] args) {
        System.out.println("------bienvenido al juego del explorador----- \nsi logras pasar 10 salas con la menor cantidad de oxigenoo ganas \npero si llegas a 0 o menos de oxigeno pierdes");
        System.out.println("\ntu escojes la dificultad de cada sala de 1 a 5, cada difucltad se multiplica por 3 y eso se resta al oxigeno \ny si colocas una dificultad mayor que la sala anterior pierdes 5 de oxigeno adicional");
        for (int i = 1; i <= 10; i++){
            System.out.println("\ndificultad de la sala #" + i + "(0 a 5): " );
            dificultad = teclado.nextInt();
            if (dificultad > 0 && dificultad < 6){
                if (dificultadanterior < dificultad){
                    oxigeno -= 5;
                }
                oxigeno -= dificultad * 3;
                dificultadanterior = dificultad;
                contador = i;
                System.out.println("\noxígeno restante: " + oxigeno);
            }else {
                System.out.println("\ndificultad no válida, ingresa un número del 1 al 5");
                i--;
            }
            if (oxigeno <= 0){
                break;
            }
        }
        if (oxigeno <= 0){
            System.out.println("\ngame over, haz llegado a la sala #" + contador);
        } else {
            System.out.println("\nfelicidades, llegaste a la sala 10 con " + oxigeno + " de oxigeno restante");
        }
    }
}
