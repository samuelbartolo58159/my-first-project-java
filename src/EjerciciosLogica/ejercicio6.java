package ejerciciosLogica;
import java.util.Scanner;
/* Descripción: Un sensor mide la humedad de un suelo minuto a minuto. El usuario ingresa
el porcentaje de humedad actual (un valor de 0 a 100). El proceso simula un día completo
de 24 minutos (donde cada minuto es una lectura).
● Las condiciones: El nivel óptimo de humedad es entre 40% y 60%. Si la humedad
baja de 40%, el sistema activa el riego automático y la humedad aumentará un 5%
para el siguiente minuto. Si la humedad supera el 60%, el riego se apaga y la
humedad bajará un 3% en el siguiente minuto por evaporación. Al final de la
simulación, el programa debe reportar cuántos minutos totales estuvo el riego
encendido y si hubo algún momento de "estrés hídrico crítico" (humedad menor al
15% por más de 2 minutos seguidos).
 */


/* YO LO ENTENDI DE ESTA FORMA, PERO DE ESTA FORMA NUNCA VA A SUCEDER UN MOMENTO CRITICO
ENTONCES ABAJO EN UN COMENTARIO HICE QUE AUMENTARA 5% EN BASE A LA HUMEDAD DE CADA MINUTO 
Y DISMINUYESE 3% EN BASE A LA HUMEDAD DE CADA MINUTO. CON ESA SEGUNDA FORMA SI SE DAN MINUTOS CRITICOS. */
public class ejercicio6 {
    static Scanner teclado = new Scanner (System.in);
    static double humedad = 0;
    static int riegoEncendido = 0;
    static int minutosEstres = 0;
    static int estresCritico = 0;
    public static void main(String[] args) {
        System.out.println("ingrese el porcentaje de humedad actual (0-100): ");
            humedad = teclado.nextDouble();
            while (humedad < 0 || humedad > 100) {
                System.out.println("Error: el porcentaje de humedad debe estar entre 0 y 100.");
                humedad = teclado.nextDouble();
            }
        for (int i=1;i<=24; i++){
            if (humedad < 40){
                riegoEncendido++;
                humedad += 5;
            } else if (humedad > 60){
                humedad -= 3;
            }else if (humedad < 15){
                minutosEstres++;
                if (minutosEstres > 2){
                    System.out.println("Estrés hídrico crítico detectado por más de 2 minutos seguidos.");
                    estresCritico++;
                }
            }
        }System.out.println("Total de minutos con riego encendido: " + riegoEncendido);
        if (estresCritico == 0){
            System.out.println("No hubo momentos de estrés hídrico crítico.");
        }else {
            System.out.println("momentos de estres hidrico critico: " + estresCritico);
        }
        
    }
}
/* public class ejercicio6 {
    static Scanner teclado = new Scanner (System.in);
    static double humedad = 0;
    static int riegoEncendido = 0;
    static int minutosEstres = 0;
    static int estresCritico = 0;
    public static void main(String[] args) {
        System.out.println("ingrese el porcentaje de humedad actual (0-100): ");
            humedad = teclado.nextDouble();
            while (humedad < 0 || humedad > 100) {
                System.out.println("Error: el porcentaje de humedad debe estar entre 0 y 100.");
                humedad = teclado.nextDouble();
            }
        for (int i=1;i<=24; i++){
            if (humedad < 40){
                riegoEncendido++;
                humedad += humedad * 0.05;
            } else if (humedad > 60){
                humedad -= humedad * 0.03;
            }else if (humedad < 15){
                minutosEstres++;
                if (minutosEstres > 2){
                    System.out.println("Estrés hídrico crítico detectado por más de 2 minutos seguidos.");
                    estresCritico++;
                }
            }
        }System.out.println("Total de minutos con riego encendido: " + riegoEncendido);
        if (estresCritico == 0){
            System.out.println("No hubo momentos de estrés hídrico crítico.");
        }else {
            System.out.println("momentos de estres hidrico critico: " + estresCritico);
        }
        
    }
} */
