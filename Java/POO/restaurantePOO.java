import java.util.Scanner;

public class restaurantePOO {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rol;

        System.out.println("Buenvenido a Restaurante gorditos\nPor favor escoja su rol:\n1.Cliente.\n2.Mesero.");
        rol = in.nextInt();

        switch (rol){
            case 1:
                cliente cliente = new cliente();
                String mesa;
                int precio;
                String pedido;

                System.out.println("Bienvenido apreciado Cliente\nPor favor escoja una mesa para reservar:");
                do {
                    System.out.println("A.Mesa 2\nB.Mesa 5");
                    mesa = in.next();

                    if(mesa.contains("2") || mesa.contains("5")){
                        System.out.println("Usted ha hecho una reserva exitosa de la "+mesa);
                    }else {
                        System.out.println("La mesa ya esta apartada, ecoja una valida.");
                    }
                }while(mesa.contains("1") || mesa.contains("3") || mesa.contains("4"));

                System.out.println("escoja su pedido:\n1.Hamburguesa: 12.300\n2. Hotdog: 11.500\n3.pizza: 7.200");
                pedido = in.next();
                precio = in.nextInt();

                System.out.println("Gracias por su interes en nuestros servicios.\nAcontinuacion encontrara las indicaciones de su pedido: " +mesa+" "+pedido+"\ntotal:"+precio);

                break;

            case 2:
                mesero mesero = new mesero();
                int mesas;
                System.out.println("Estas son las mesas que tienes que atender:\n1.Mesa 1\n2.Mesa 3\n3.Mesa 4");
                System.out.println("escoja la mesa que atendera: ");
                mesas = in.nextInt();

                switch (mesas){
                    case 1:
                        System.out.println("usted escogio la Mesa 1.");
                        System.out.println("Descripción de la reserva: Mesa 1\nPedido: Hamburguesa\nTotal: 12.300");
                        break;

                    case 2:
                        System.out.println("usted escogio la Mesa 3.");
                        System.out.println("Descripción de la reserva: Mesa 3\nPedido: Pizza\nTotal: 7.200");
                        break;

                    case 3:
                        System.out.println("Usted escogio la Mesa 4");
                        System.out.println("Descripción de la reserva: Mesa 1\nPedido: Hotdog\nTotal: 11.500");
                        break;

                    default:
                        System.out.println("La Mesa escogida no fue reservada");
                        break;
                }


                break;

            default:
                System.out.println("No perteneces a ningun rol\nGracias por tu interes.");
                break;
        }
    }
}
