package classes;

public class Vaca extends Animal{
    public Vaca(int id){
        super(id);
        this.nome = "Vaca";
        this.tipo = "Bovino";
        this.pesoMin = 30;
        this.pesoMax = 90;
        this.pesoAtual = pesoMin;
    }
}
