package classes;

public class Fazenda {
    private AnimalLocal[] casaAnimais = new AnimalLocal[8];

    public AnimalLocal[] getCasaAnimais() {
        return casaAnimais;
    }

    public void setCasaAnimais(AnimalLocal[] casaAnimais) {
        this.casaAnimais = casaAnimais;
    }
}
