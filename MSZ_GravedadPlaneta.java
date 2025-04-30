public class MSZ_GravedadPlaneta {

    private String nombrePlaneta;
    private double gravedad; 

    public MSZ_GravedadPlaneta() {
        this.nombrePlaneta = "";
        this.gravedad = 0.0;
    }

    public MSZ_GravedadPlaneta(String nombrePlaneta, double gravedad) {
        this.nombrePlaneta = nombrePlaneta;
        this.gravedad = gravedad;
    }

    // Getters y Setters
    public String getNombrePlaneta() {
        return nombrePlaneta;
    }

    public void setNombrePlaneta(String nombrePlaneta) {
        this.nombrePlaneta = nombrePlaneta;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    // Método toString
    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombrePlaneta + '\'' +
                ", gravedad=" + gravedad + " m/s²" +
                '}';
    }
}
