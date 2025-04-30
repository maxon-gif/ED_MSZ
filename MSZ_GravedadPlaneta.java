public class MSZ_GravedadPlaneta {
    private String nombre;
    private double gravedadPlaneta;

    // Constructor por defecto
    public MSZ_GravedadPlaneta() {
        this.nombre = "";
        this.gravedadPlaneta = 0.0;
    }

    // Constructor con todos los argumentos
    public MSZ_GravedadPlaneta(String nombre, double gravedadPlaneta) {
        this.nombre = nombre;
        this.gravedadPlaneta = gravedadPlaneta;
    }

    // Métodos getter y setter
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
        return "GravedadPlaneta_MSZ{" +
                "nombre='" + nombre + '\'' +
                ", gravedadPlaneta=" + gravedadPlaneta +
                '}';
    }
}
