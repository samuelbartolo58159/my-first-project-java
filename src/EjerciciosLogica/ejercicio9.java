package ejerciciosLogica;

import java.util.Scanner;

/* Descripción: Un dispositivo médico registra la frecuencia cardíaca de un paciente durante
15 intervalos de tiempo. El usuario ingresa la frecuencia medida en cada intervalo (por
ejemplo: 70, 72, 75, 71, 80, 85, 82, ...).
● Las condiciones: Un "pico" se define como una medición que es estrictamente
mayor que la medición inmediatamente anterior Y TAMBIÉN estrictamente mayor
que la medición inmediatamente posterior. El programa debe analizar los datos en
tiempo real mientras entran y, al final, determinar cuántos picos reales se
presentaron en la secuencia.
 */
public class ejercicio9 {
    static Scanner teclado = new Scanner(System.in);
    static int frecuencia = 0;
    static int frecuenciaanterior = 0;
    static int frecuanciaanterioranterior = 0;
    static int pico = 0;

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            System.out.println("\nfrecuancia cardiaca numero: " + i);
            frecuencia = teclado.nextInt();
            if (frecuenciaanterior > frecuencia && frecuanciaanterioranterior < frecuenciaanterior) {
                System.out.println("\nPico detectado en el intervalo #" + i);
                pico++;
            }
            frecuanciaanterioranterior = frecuenciaanterior;
            frecuenciaanterior = frecuencia;
        }
        System.out.println("\nTotal de picos detectados: " + pico);
    }
}
