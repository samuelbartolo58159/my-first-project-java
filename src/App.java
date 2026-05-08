public class App {

    static String nombre_estudiante = "SAMUEL";
    static int edad = 17;
    static double peso = 68.9;
    static boolean pppp = true;
    //variables
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(nombre_estudiante + "" + edad + " " + peso);
        System.out.println(nombre_estudiante + "/" + edad + "/" + peso);
        System.out.println(nombre_estudiante + " - " + edad + " - " + peso);
        System.out.println("me llamo " + nombre_estudiante + " tengo " + edad + " años y peso " + peso);
        
        if (pppp) {
        System.out.println("a");
        }else{
            System.out.println("pirobo");
        }
    }
}

