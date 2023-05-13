
import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opc;

        System.out.println("Escoja una opción: \n 1.Cliente \n 2.Mesero");
        opc = sc.nextInt();

        switch (opc){
            case 1:
                String reserv;
                System.out.println("Eres cliente.");

                do {
                    System.out.println("Estas son las mesas las cuales estan disponibles: \nMesa 2 \nMesa 5 \ncual deseas reservar:");
                    reserv = sc.next();
                    if (reserv.contains("2") || reserv.contains("5")) {
                        System.out.println("Usted ha reservado la "+reserv+" con exito.");
                    } else {
                        System.out.println("Mesa no disponible, escoja otra...");
                    }
                }while (reserv.contains("1") || reserv.contains("3") || reserv.contains("4"));

                break;
            case 2:
                System.out.println("Eres mesero.");

                System.out.println("estas son las mesas reservadas:\n1.Mesa 1\n2.Mesa 3\n3.Mesa 4");
                break;
            default:
                System.out.println("no perteneces a ningun campo.");
        }
    }
}
