public class Main {
    public static void main(String[] args) {
        // Crear dos objetos de tipo MSZ_Persona
        MSZ_Persona persona1 = new MSZ_Persona(1, "Juan", 70.0, 1.75, 30);
        MSZ_Persona persona2 = new MSZ_Persona(2, "Ana", 60.0, 1.65, 28);

        // Crear tres objetos de tipo MSZ_GravedadPlaneta
        MSZ_GravedadPlaneta tierra = new MSZ_GravedadPlaneta("Tierra", 9.81);
        MSZ_GravedadPlaneta marte = new MSZ_GravedadPlaneta("Marte", 3.72);
        MSZ_GravedadPlaneta luna = new MSZ_GravedadPlaneta("Luna", 1.62);

        // Calcular IMC
        double imc1 = persona1.getMasa() / (persona1.getAltura() * persona1.getAltura());
        double imc2 = persona2.getMasa() / (persona2.getAltura() * persona2.getAltura());

        // Calcular peso en los planetas (masa × gravedad)
        double peso1Tierra = persona1.getMasa() * tierra.getGravedadPlaneta();
        double peso1Marte = persona1.getMasa() * marte.getGravedadPlaneta();
        double peso1Luna = persona1.getMasa() * luna.getGravedadPlaneta();

        double peso2Tierra = persona2.getMasa() * tierra.getGravedadPlaneta();
        double peso2Marte = persona2.getMasa() * marte.getGravedadPlaneta();
        double peso2Luna = persona2.getMasa() * luna.getGravedadPlaneta();

        // Mostrar resultados
        System.out.println("Información de " + persona1.getNombre() + ":");
        System.out.println("IMC: " + imc1);
        System.out.println("Peso en Tierra: " + peso1Tierra + " N");
        System.out.println("Peso en Marte: " + peso1Marte + " N");
        System.out.println("Peso en la Luna: " + peso1Luna + " N");

        System.out.println("\nInformación de " + persona2.getNombre() + ":");
        System.out.println("IMC: " + imc2);
        System.out.println("Peso en Tierra: " + peso2Tierra + " N");
        System.out.println("Peso en Marte: " + peso2Marte + " N");
        System.out.println("Peso en la Luna: " + peso2Luna + " N");
    }
}
