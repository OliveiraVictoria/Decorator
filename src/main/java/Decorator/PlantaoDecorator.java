package Decorator;

public abstract class PlantaoDecorator implements Horas {

    private Horas horas;
    public String estrutura;

    public PlantaoDecorator(Horas horas) {
        this.horas = horas;
    }

    public Horas getHoras() {
        return horas;
    }

    public void setHoras(Horas curso) {
        this.horas = horas;
    }

    public abstract float getPercentualCargaHoraria();

    public float getCargaHoraria() {
        return this.horas.getCargaHoraria() * (1 + (this.getPercentualCargaHoraria() / 100));
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.horas.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}


