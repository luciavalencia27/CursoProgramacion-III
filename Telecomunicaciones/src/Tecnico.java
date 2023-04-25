public class Tecnico extends Trabajador{
   private double salarioxhora= 121.30;

    public double getSalarioxhora() {
        return salarioxhora;
    }

    public Tecnico(String nombre, int edad, String fechadeIngreso, double salarioxhora) {
        super(nombre, edad, fechadeIngreso);
        this.salarioxhora = salarioxhora;
    }


}
