package Decorator;

public class Estagio extends PlantaoDecorator {

    public Estagio(Horas horas) {
        super(horas);
    }

    public float getPercentualCargaHoraria() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "Estágio";
    }
}
