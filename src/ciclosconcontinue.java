public class ciclosconcontinue {
    public static void main(String[] args) {
        for(int estudiantes = 1; estudiantes <= 16; estudiantes++){
            System.out.println("estudiante#" + estudiantes);
            if (estudiantes == 11){
                System.out.println("estudiante#" + estudiantes + "(andrew) perdio la materia xd");
                continue;
            }
            System.out.println("ALUMNO#" + estudiantes + " enviando material");
        }
        System.out.println("finalizado");
    }
}
