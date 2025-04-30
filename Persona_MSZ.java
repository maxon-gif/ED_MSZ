public class Persona_MSZ {
    private int id;
    private String nombre;
    private double masa;
    private double altura;
    private int edad;

    // Constructor por defecto
    public Persona_MSZ() {
        this.id = 0;
        this.nombre = "";
        this.masa = 0.0;
        this.altura = 0.0;
        this.edad = 0;
    }

    // Constructor con todos los argumentos
    public Persona_MSZ(int id, String nombre, double masa, double altura, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.masa = masa;
        this.altura = altura;
        this.edad = edad;
    }

    // Métodos getter y setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para calcular IMC
    public double calcularIMC() {
        return masa / (altura * altura);
    }

    // Método para calcular el peso en un planeta
    public double calcularPesoEnPlaneta(MSZ_GravedadPlaneta planeta) {
        return masa * planeta.getGravedadPlaneta();
    }

    // Método toString
    @Override
    public String toString() {
        return "Persona_MSZ{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", altura=" + altura +
                ", edad=" + edad +
                '}';
    }
}
