package classes;

public class Galinha extends Animal{
    public Galinha(int id){
        super(id);
        this.nome = "Galinha";
        this.tipo = "Ave";
        this.pesoMin = 3;
        this.pesoMax = 9;
        this.pesoAtual = pesoMin;
    }

}
