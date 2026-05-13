public class persona {
    static String nombre_persona = "samuel";
    static String apellidos_persona = "bartolo cospina";
    static char genero = 'M';
    static int edad = 17;
    static float promedio_semestre = 4.7f;
    static boolean vive_en_manizales = true;

    //crear metodos adicionales
    //metodo que imprime el nombre y el apellido de la persona
    static void nombre_persona() {
        System.out.println("informacion del estudiante: \nnombre completo " + nombre_persona + " " + apellidos_persona);
    }

    //metodo que imprime la edad de la persona
    static void edad_persona() {
        System.out.println("edad " + edad);
    }
    //metodo que imprime el promedio del semestre de la persona
    static void promedio_semestre() {
        System.out.println("promedio semestre " + promedio_semestre);
    }
    static void vive_en_manizales() {
        if (vive_en_manizales) {
            System.out.println("vive en manizales");
        }
        else{
            System.out.println("no vive en manizales");
        }
    }
    static void genero() {
        if (genero == 'M') {
            System.out.println("usted es hombre");
        }
        else if (genero == 'F') {
            System.out.println("usted es mujer");
        }
        else{
            System.out.println("usted es no binario xdxdxd");
        }
    }
    public static void main(String[] args) {
        nombre_persona();
        edad_persona();
        promedio_semestre();
        vive_en_manizales();
        genero();
    }
}
