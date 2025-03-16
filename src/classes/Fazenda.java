package classes;

public class Fazenda extends Construcao{
    //Atributos:
    private AnimalLocal[] casaAnimais = new AnimalLocal[8];

    //Métodos especiais:

    public Fazenda(String nome) {
        super(nome);
    }

    public AnimalLocal[] getCasaAnimais() {
        return casaAnimais;
    }

    public void setCasaAnimais(AnimalLocal[] casaAnimais) {
        this.casaAnimais = casaAnimais;
    }
    //Métodos:
    public String listaConstrucoes(){
        String lista = casaAnimais[0].getNome();

        for (int i = 0; i < 8; i ++){
            lista = (lista + ("\n " + casaAnimais[i].getNome()));
        }
        return lista;
    }

    public void adicionarLocalAnimais(AnimalLocal animalLocal){
        int i = 0;
        while(this.casaAnimais[i] != null && i < 8){
            i ++;
        }
        if (i < 8){
            this.casaAnimais[i] = animalLocal;
        }
    }
}
