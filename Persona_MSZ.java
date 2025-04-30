public class Persona_MSZ {

    private int id;
    private int nombre; 
    private double masa; 
    private double altura;
    private int edad;

    public Persona_MSZ() {
        this.id = 0;
        this.nombre = 0;
        this.masa = 0.0;
        this.altura = 0.0;
        this.edad = 0;
    }

    public Persona_MSZ(int id, int nombre, double masa, double altura, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.masa = masa;
        this.altura = altura;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
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

    public double calcularPeso(double gravedad) {
        return this.masa * gravedad;
    }
    
    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre=" + nombre +
                ", masa=" + masa +
                ", altura=" + altura +
                ", edad=" + edad +
                ", peso(Tierra)= " + calcularPeso(9.81) + " N" +
                '}';
    }
}