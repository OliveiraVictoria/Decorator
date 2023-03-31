package Decorator;

public class HorasPlantao extends PlantaoDecorator {

    public HorasPlantao(Horas horas) {
        super(horas);
    }

    public float getPercentualCargaHoraria() {
        return 20.0f;
    }

    public String getNomeEstrutura() {
        return "Horas de Plantao";
    }
}
