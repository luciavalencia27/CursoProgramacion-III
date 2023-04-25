public class Mantenimiento extends Trabajador{
    private double salariodiario =189.60;
private double extra= 102.88;

    public double getSalariodiario() {
        return salariodiario;
    }

    public double getExtra() {
        return extra;
    }

    public Mantenimiento(String nombre, int edad, String fechadeIngreso, double salariodiario, double extra) {
        super(nombre, edad, fechadeIngreso);
        this.salariodiario = salariodiario;
        this.extra = extra;
    }


}
