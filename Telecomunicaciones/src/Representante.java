public class Representante extends Trabajador {
    private double salarioR = 322.50;

    public double getSalarioR() {
        return salarioR;
    }

    public Representante(String nombre, int edad, String fechadeIngreso, double salarioR ) {
        super(nombre, edad, fechadeIngreso);
        this.salarioR = salarioR;
    }


}
