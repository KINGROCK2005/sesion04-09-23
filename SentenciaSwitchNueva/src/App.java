import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Estructura switch
        //se usa una -> en lugar de :
        //Para no necesitar poner la sentencia break;
        Scanner lector = new Scanner(System.in);
        System.out.println("Color del semaforo: (r/a/v)");
        char color = lector.next().charAt(0);
        switch (color) {
            case 'r' ->{
                System.out.println("El semaforo esta en rojo.");
            }
            case 'a' ->{
                System.out.println("El semaforo esta en amarillo.");
            }
            case 'v' ->{
                System.out.println("El semaforo esta en verde.");
            }
            default->{

            }

        }
    }
}
