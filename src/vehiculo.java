public class vehiculo {
    /*  */
    String marca = "toyota";
    static int velocidad = 80;
    static boolean encendido = false;

    static void encender() {
        /* el "!" indica la negacion de una variable booleana */
        if (!encendido) {
            System.out.println("el vehiculo esta encendido");
        } else {
            System.out.println("el vehiculo esta apagado");
        }
    }

    static void apagar() {
        if (!encendido) {
            System.out.println("el vehiculo ya esta apagado");
        } else if (velocidad > 0) {
            System.out.println("vehiculo en movimiento");
        } else if (velocidad < 0) {
            System.out.println("valor invalido");
        }
        else{
            System.out.println("vehiculo apagado correctamente");
        }
    }
    static void acelerar(){
        if (!encendido && velocidad > 0){
            velocidad = velocidad + 10;
        }
        else{
            velocidad = 0;
            System.out.println("esta apagado");
        }
        System.out.println(velocidad + "Km/h");
    }

    static void main() {
        encender();
        apagar();
    }
}
