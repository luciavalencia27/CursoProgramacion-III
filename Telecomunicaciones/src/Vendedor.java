public class Vendedor extends Trabajador{
    private double salariodiario= 233.24;
    private int venta= 62;

    public double getSalariodiario() {
        return salariodiario;
    }

    public int getVenta() {
        return venta;
    }

    public Vendedor(String nombre, int edad, String fechadeIngreso, double salariodiario, int venta) {
        super(nombre, edad, fechadeIngreso);
        this.salariodiario = salariodiario;
        this.venta = venta;
    }

    public Vendedor(String nombre, int edad, String fechadeIngreso) {
        super(nombre, edad, fechadeIngreso);
    }
}
