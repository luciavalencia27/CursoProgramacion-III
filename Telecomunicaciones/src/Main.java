import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        int opcion=0;
        do {
            System.out.println("REGISTRO DE EMPLEADOS");
            System.out.println("(1) Registrar trabajador \n(2) Datos de los trabajadores \n(3) SALIR ");
            opcion=t.nextInt();
            switch (opcion){
                case 1:
                    Sistema.registrarTrabajador();
                    break;
                case 2:
                    Sistema.mostrarTrabajadores();
                    break;
                case 3:
                default:
                    break;
            }

        }while (opcion!=3);
    }
}
