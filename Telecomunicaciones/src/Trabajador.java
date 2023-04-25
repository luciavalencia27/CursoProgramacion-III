public abstract class Trabajador {
    private String nombre;
    private int edad;
    private String fechadeIngreso;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public Trabajador(double salario) {
        this.salario = salario;
    }

    private double salario;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechadeIngreso() {
        return fechadeIngreso;
    }

    public Trabajador(String nombre, int edad, String fechadeIngreso) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechadeIngreso = fechadeIngreso;
    }
}
