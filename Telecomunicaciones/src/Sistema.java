import java.sql.SQLOutput;
import java.util.Scanner;

public class Sistema {
    static Trabajador[] trabajador = new Trabajador[100];
    static Scanner t = new Scanner(System.in);

    public static void registrarTrabajador() {
        int opcion = 0;
        System.out.println("REGISTRAR TRABAJADORES");
        System.out.println("pulse el numero correspondiente de la opcion a la que desea ingresar");
        System.out.println("(1) Registrar Representante \n(2) Registrar Vendedor \n(3) Registrar Tecnico \n(4) Registrar Empleado de mantenimiento");
        opcion = t.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("REGISTRO DE REPRESENTANTE");
                System.out.println("Nombre del Trabajador");
                String nombre = t.nextLine();
                t.nextLine();
                System.out.println("Edad del trabajador");
                int edad = t.nextInt();
                t.nextLine();
                System.out.println("Fecha de ingreso a la empresa");
                String fechaIngreso = t.nextLine();
                System.out.println("Salario de trabajador");
                double salarioRepresentante = t.nextDouble();
                System.out.println("El salario mensual que recbe el representante es" );
                System.out.println(salarioRepresentante * 30 );

                Trabajador R = new Representante(nombre, edad, fechaIngreso, salarioRepresentante);
                for (int i = 0; i < trabajador.length; i++) {

                    if (trabajador[i] == null) {
                        trabajador[i] = R;
                        System.out.println("REPRESENTANTE REGISTRADO");
                        break;


                    }

                }
                break;
            case 2:
                System.out.println("REGISTRO DE VENDEDOR");
                System.out.println("Nombre del Trabajador");
                String nombreVendedor = t.nextLine();
                t.nextLine();
                System.out.println("Edad del trabajador");
                int edadVendedor = t.nextInt();
                t.nextLine();
                System.out.println("Fecha de ingreso a la empresa | dd/mm/aa | ");
                String fechaIngresoVendedor = t.nextLine();
                t.nextLine();
                System.out.println("Salario de trabajador");
                double salarioVendedor = t.nextDouble();
                t.nextLine();
                System.out.println("Extra por venta");
                int extra = t.nextInt();
                System.out.println("Ventas que realizó el vendedor en el mes: ");
                int ventas = t.nextInt();
                System.out.println("El salario mensual que recbe el vendedor es" );
                System.out.println(salarioVendedor * 30 + (extra * ventas ));


                Trabajador V = new Vendedor(nombreVendedor, edadVendedor, fechaIngresoVendedor, salarioVendedor, extra);
                for (int i = 0; i < trabajador.length; i++) {

                    if (trabajador[i] == null) {
                        trabajador[i] = V;
                        System.out.println("VENDEDOR  REGISTRADO");
                        break;


                    }

                }
                break;
            case 3:
                System.out.println("REGISTRO DE TECNICO");
                System.out.println("Nombre del Trabajador");
                String nombreTecnico = t.nextLine();
                t.nextLine();
                System.out.println("Edad del trabajador");
                int edadTecnico = t.nextInt();
                System.out.println("Fecha de ingreso a la empresa");
                String fechaIngresoTecnico = t.nextLine();
                System.out.println("Salario de trabajador");
                double salarioTecnico = t.nextDouble();
                System.out.println("El salario diario que recibe el tecnico es" );
                System.out.println(salarioTecnico * 8 * 30);
                Trabajador T = new Tecnico(nombreTecnico, edadTecnico, fechaIngresoTecnico, salarioTecnico);
                for (int i = 0; i < trabajador.length; i++) {

                    if (trabajador[i] == null) {
                        trabajador[i] = T;
                        System.out.println("TECNICO REGISTRADO");
                        break;


                    }

                }

                break;

            case 4:
                System.out.println("REGISTRO DE EMPLEADO DE MANTENIMIENTO");
                System.out.println("Nombre del Trabajador");
                String nombreMantenimiento = t.nextLine();
                t.nextLine();
                System.out.println("Edad del trabajador");
                int edadMantenimiento = t.nextInt();
                System.out.println("Fecha de ingreso a la empresa");
                String fechaIngresoMantenimiento = t.nextLine();
                System.out.println("Salario de trabajador");
                double salarioMantenimiento = t.nextDouble();
                System.out.println("Extra por caso atendido");
                double extraMantenimiento = t.nextDouble();
                System.out.println("Numero de casos atendidos: ");
                int casosAtendidos=t.nextInt();

                System.out.println("El salario mensual que recbe el empleado de mantenimiento es" );
                System.out.println(salarioMantenimiento * 30 + (extraMantenimiento * casosAtendidos  ));
                Trabajador M = new Mantenimiento(nombreMantenimiento, edadMantenimiento, fechaIngresoMantenimiento, salarioMantenimiento, extraMantenimiento);
                for (int i = 0; i < trabajador.length; i++) {
                    if (trabajador[i] == null) {
                        trabajador[i] = M;
                        System.out.println("EMPLEADO DE MANTENIMIENTO REGISTRADO");
                        break;


                    }

                }
                break;
        }
    }


    public static void mostrarTrabajadores() {

        int opcion = 0;
        System.out.println("VER REGISTRO DE TRABAJADORES");
        System.out.println("(1) Ver Representante \n(2) Ver Vendedor \n(3) Ver Tecnico \n(4) Ver Empleado de mantenimiento");
        opcion = t.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese nombre del Representante que busca");
               String nombreRepresentante=t.nextLine();
                for (int i = 0; i < trabajador.length; i++) {
                    if (trabajador[i] != null) {
                        if (trabajador[i].getNombre().equals(nombreRepresentante)) {
                            System.out.println("Nombre completo:" + trabajador[i].getNombre());
                            System.out.println("Edad del trabajador:" + trabajador[i].getEdad());
                            System.out.println("Sexo del alumno: " + trabajador[i].getFechadeIngreso());
                            System.out.println("Salario del trabajador " + trabajador[i].getSalario());
                            break;
                        }
                    }

                        break;

                }
                break;


            case 2:
                System.out.println("Ingrese nombre del Vendedor que busca");
                String nombreVendedor = t.nextLine();
                for (int i = 0; i < trabajador.length; i++) {

                    if (trabajador[i] != null) {
                        if (trabajador[i].getNombre().equals(nombreVendedor)) {
                            System.out.println("Nombre completo:" + trabajador[i].getNombre());
                            System.out.println("Edad del trabajador:" + trabajador[i].getEdad());
                            System.out.println("Sexo del trabajador: " + trabajador[i].getFechadeIngreso());
                            System.out.println("Salario del trabajador " + trabajador[i].getSalario());

                            break;
                        }
                    } else {
                        System.out.println("Trabajador no existente");
                        break;
                    }
                }
                break;
            case 3:
                System.out.println("Ingrese nombre del tecnico que busca");
                String nombreTecnico = t.nextLine();
                for (int i = 0; i < trabajador.length; i++) {
                    if (trabajador[i] != null) {
                        if (trabajador[i].getNombre().equals(nombreTecnico)) {
                            System.out.println("Nombre completo:" + trabajador[i].getNombre());
                            System.out.println("Edad del trabajador:" + trabajador[i].getEdad());
                            System.out.println("Sexo del alumno: " + trabajador[i].getFechadeIngreso());
                            System.out.println("Salario del trabajador " + trabajador[i].getSalario());
                            break;
                        }
                    } else {
                        System.out.println("Trabajador no existente");
                        break;
                    }
                }
                break;
            case 4:
                System.out.println("Ingrese nombre del empleado de mantenimiento que busca");
                String nombreMantenimiento = t.nextLine();
                for (int i = 0; i < trabajador.length; i++) {
                    if (trabajador[i] != null) {
                        if (trabajador[i].getNombre().equals(nombreMantenimiento)) {
                            System.out.println("Nombre completo:" + trabajador[i].getNombre());
                            System.out.println("Edad del trabajador:" + trabajador[i].getEdad());
                            System.out.println("Sexo del alumno: " + trabajador[i].getFechadeIngreso());
                            System.out.println("Salario del trabajador " + trabajador[i].getSalario());
                            break;
                        }
                    } else {
                        System.out.println("Trabajador no existente");
                        break;
                    }
                }
                break;
        }

    }
}