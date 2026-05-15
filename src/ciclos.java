public class ciclos {
//revisar archivos y salir del ciclo for cuando se encuentre el malicioso
public static void main(String[] args) {
    System.out.println("iniciando escaneo de seguridad");
    for(int archivo = 1; archivo <= 10; archivo++){
        if (archivo == 4){
            System.out.println("ALERTA:\n el archivo#" + archivo + " esta corrupto");
            break;
        }
        System.out.println("archivo#" + archivo + " analizado");
    }
    System.out.println("escaneo finalizado");
}
}
