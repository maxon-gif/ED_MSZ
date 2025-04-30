public class MSZ_GravedadPlaneta {
    // Atributos
    private int id;
    private String nombre;
    private double gravedadPlaneta;

    // Constructor por defecto
    public MSZ_GravedadPlaneta() {
        this.id = 0;
        this.nombre = "";
        this.gravedadPlaneta = 0.0;
    }

    // Constructor con todos los argumentos (sin incluir el id)
    public MSZ_GravedadPlaneta(String nombre, double gravedadPlaneta) {
        this.nombre = nombre;
        this.gravedadPlaneta = gravedadPlaneta;
    }

    // Getters y Setters
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

    public double getGravedadPlaneta() {
        return gravedadPlaneta;
    }

    public void setGravedadPlaneta(double gravedadPlaneta) {
        this.gravedadPlaneta = gravedadPlaneta;
    }

    // Método toString
    @Override
    public String toString() {
        return "Planeta: " + nombre + ", Gravedad: " + gravedadPlaneta + " m/s²";
    }
}