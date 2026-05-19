package ejerciciosLogica;

import java.util.Scanner;

/* Descripción: Se requiere analizar el rendimiento de un equipo en un torneo de 20 partidos.
El usuario ingresa el resultado de cada partido uno por uno, usando letras: 'G' para
ganado, 'E' para empatado y 'P' para perdido.
● Las condiciones: El programa debe calcular los puntos totales (3 por ganar, 1 por
empatar, 0 por perder). Al mismo tiempo, debe identificar y mostrar al final cuál fue la
mayor racha de partidos invicto (partidos seguidos sin perder, es decir, ganados o
empatados) y cuál fue la peor racha de derrotas consecutivas.
 */
public class ejercicio7 {
    static Scanner teclado = new Scanner(System.in);
    static char resultado;
    static int puntos = 0;
    static int racha = 0;
    static int rachaDerrotas = 0;
    static int topRacha = 0;
    static int topRachaDerrotas = 0;

    public static void main(String[] args) {
        for (int i=1;i<=20;i++){
            resultado = teclado.next().charAt(0);
             resultado = Character.toLowerCase(resultado);
            if (resultado == 'g') {
                puntos += 3;
                racha++;
                rachaDerrotas = 0;

            }else if (resultado== 'e'){
                puntos++;
                racha++;
                rachaDerrotas = 0;
            }else if (resultado == 'p'){
                rachaDerrotas++;
                racha = 0;
            }else{
                System.out.println("Error: resultado no válido. Ingrese 'G', 'E' o 'P'.");
                i--;
            }
            if (racha > topRacha){
                topRacha = racha;
            }
            if (rachaDerrotas > topRachaDerrotas){
                topRachaDerrotas = rachaDerrotas;
            }
        }
        System.out.println("Puntos totales: " + puntos);
        System.out.println("Mayor racha invicta: " + topRacha);
        System.out.println("Peor racha de derrotas: " + topRachaDerrotas);
    }
}
