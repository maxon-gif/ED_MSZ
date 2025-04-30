public class Main {
    public static void main(String[] args) {
        // Instanciar dos objetos de la clase MSZ_Persona
        Persona_MSZ persona1 = new Persona_MSZ(1, "Juan", 70.0, 1.75, 30);
        Persona_MSZ persona2 = new Persona_MSZ(2, "Ana", 60.0, 1.65, 28);

        // Instanciar tres objetos de la clase MSZ_GravedadPlaneta
        MSZ_GravedadPlaneta tierra = new MSZ_GravedadPlaneta("Tierra", 9.81);
        MSZ_GravedadPlaneta marte = new MSZ_GravedadPlaneta("Marte", 3.72);
        MSZ_GravedadPlaneta luna = new MSZ_GravedadPlaneta("Luna", 1.62);

        // Calcular el IMC de ambas personas
        double imc1 = persona1.getMasa() / (persona1.getAltura() * persona1.getAltura());
        double imc2 = persona2.getMasa() / (persona2.getAltura() * persona2.getAltura());

        // Calcular el peso de cada persona en cada planeta
        double peso1Tierra = persona1.getMasa() * tierra.getGravedadPlaneta();
        double peso1Marte = persona1.getMasa() * marte.getGravedadPlaneta();
        double peso1Luna = persona1.getMasa() * luna.getGravedadPlaneta();

        double peso2Tierra = persona2.getMasa() * tierra.getGravedadPlaneta();
        double peso2Marte = persona2.getMasa() * marte.getGravedadPlaneta();
        double peso2Luna = persona2.getMasa() * luna.getGravedadPlaneta();

        // Mostrar información
        System.out.println("Información de " + persona1.getNombre());
        System.out.printf("IMC: %.2f\n", imc1);
        System.out.printf("Peso en Tierra: %.2f N\n", peso1Tierra);
        System.out.printf("Peso en Marte: %.2f N\n", peso1Marte);
        System.out.printf("Peso en Luna: %.2f N\n", peso1Luna);

        System.out.println("\nInformación de " + persona2.getNombre());
        System.out.printf("IMC: %.2f\n", imc2);
        System.out.printf("Peso en Tierra: %.2f N\n", peso2Tierra);
        System.out.printf("Peso en Marte: %.2f N\n", peso2Marte);
        System.out.printf("Peso en Luna: %.2f N\n", peso2Luna);
    }
}