import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner lector = new Scanner(System.in);
        System.out.println("Hasta que tabla de multiplicar: ");
        byte tabla = lector.nextByte();
        //for afuera es para la cant. de tablas
        
        while (tabla > 50 ){
            System.out.println("Valor demasiado alto ");
            System.out.println("Hasta que tabla desea multiplicar? ");
            tabla = lector.nextByte();
        }
               for(int j = 1; j <= tabla; j++){
            for(int i = 1; i <= 12; i++){
            System.out.println(j + " x " + i + " = " + j*i);
            }
            System.out.println("::::::::::::::::::::::");
        }
        lector.close();

    }
}